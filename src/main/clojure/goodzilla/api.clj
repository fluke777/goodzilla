(ns goodzilla.api
  (:require [clj-http.client :as client]
            [cheshire.core :as json]
            [clojure.pprint :as pprint]
            [goodzilla.client :as gd-client]
            [goodzilla.parser :as gd-parser]
            [goodzilla.templates :as t]))

(defn attribute
  [name]
  (gd-client/get-md (get gd-parser/*map-of-attributes* name)))

(defn resolve-metrics
  [& metrics]
  (map (fn [met]
         (if (string? met)
           (gd-client/find-metric met)
           met))
       metrics))

(defn resolve-attributes
  [& attributes]
  (map (fn [attr]
         (if (string? attr)
           (attribute attr)
           attr))
       attributes))

(defn report-def
  [& {:keys [what how]}]

  (let [metrics (apply resolve-metrics (flatten [what]))
        attributes (apply resolve-attributes (flatten [how]))]
  {
   :what metrics
   :how attributes
   :type :report-def
   }))

(defn report
  [title report-def]
  {
   :title title
   :report-def report-def
   :type :report
   })

(defn saved?
  [obj]
  (contains? obj :uri))

(defn expanded?
  [obj]
  (contains? obj :expression))

(defn deprecate
  [obj]
  (gd-client/http-post (:uri obj) (t/template (:type obj) (merge obj {:deprecated 1}))))

(defn create-attribute-representation
  [attribute]
  {
   "attribute"
   {
    "alias" ""
    "totals" [[]]
    "uri" (:uri attribute)
    }
   })

(defn metric
  [& { :keys [title definition]}]
  (let [result (gd-parser/parse definition)]
    {
     :title title
     :definition definition
     :type :metric
     }))

(defn expand-maql
  ([definition]
     (expand-maql definition {}))
  ([definition translation-table]
     (let [parse-result (-> definition
                            gd-parser/parse)]
       (if (= 0 (parse-result :num-of-errors))
         (-> parse-result
             :parse-tree
             (gd-parser/visit translation-table))
         (-> parse-result
             :errors
             print)))))

(defmulti expand (fn [stuff & _]
                   (:type stuff)))

(defmethod expand nil
  ([definition]
     (expand definition {}))
  ([definition translation-table]
     (expand-maql definition translation-table)))

(defmethod expand :metric
  ([metric-definition]
     (expand metric-definition {}))
  ([metric-definition translation-table]
     (if (expanded? metric-definition)
       metric-definition
       (do (let [maql (expand (:definition metric-definition) translation-table)]
             (merge metric-definition {
                                       :expression maql
                                       }))))))

(defn df
  [attr]
  (gd-client/get-md (-> attr :content :displayForms first :meta :uri)))

(defmulti save :type)

(defmethod save :metric [metric]
  (if (saved? metric)
    metric
    (do
      (let [metric-response (gd-client/http-post (format "/gdc/md/%s/obj" gd-client/*PID*)
                                                 (t/template :metric (expand metric)))]
        (merge metric (gd-client/get-md (:uri metric-response)))))))



(defmethod save :report-def [report-def]
  [report-def]
   (if (saved? report-def)
    report-def
    (do
      (println "SAVE")
      (let [metrics (:what report-def)
            attributes (map df (:how report-def))
            saved-metrics (->> metrics
                               (map expand)
                               (map save))
            definition  (t/template :report-definition {
                                                        :attributes (map create-attribute-representation attributes)
                                                        :metrics (map (fn [metric] {:uri (-> metric :uri) :alias ""}) saved-metrics)
                                                        })
            report-response (gd-client/http-post (format "/gdc/md/%s/obj/" gd-client/*PID*) definition)]
        (merge report-def {
                           :uri (:uri report-response)
                           :what saved-metrics
                           })))))
  


(defmulti copy :type)

(defmethod copy :metric
  [obj]
  (apply metric (reduce concat [] obj)))

(defmethod copy :report-def
  [obj]
  (apply report-def (reduce concat [] obj)))

(defmulti execute :type)

(defmethod execute :report-def
  [report-obj]
  (let [metrics-copy (->> (:what report-obj)
                           (map copy)
                           (map expand)
                           (map save))
        report-copy (merge (copy report-obj) {:what metrics-copy})
        report (save report-copy)
        execution (gd-client/http-post (format "/gdc/app/projects/%s/execute" gd-client/*PID*)
                                    (t/template :report-definition-execution report))
        data-result-uri (-> execution :reportResult2 :content :dataResult)
        result (gd-client/poll data-result-uri)]
    (doseq [tbd metrics-copy]
      (deprecate tbd))
    (comment "TODO: return something that can be queried similar to execute :metric returns scalar")
    result))
  

(defmethod execute :metric
  [metric-obj]
  (let [report (report-def :what [metric-obj]
                       :how [])
        result (execute report)]
    (->> result
         :xtab_data
         :data
         first
         first
         str
         (new BigDecimal))))

(defmethod execute nil
  [definition]
  (let [metric (metric :title "Anonyomous" :definition definition)]
    (execute metric)))


(defn iter
  [node stack]
  (let [children (:children node)]
    (if (empty? (:index node))
      (concat stack [(:id node)])
      (reduce (fn [memo item]
                (conj memo
                      (iter item
                            (concat stack [(:id node)]))))
              [] children))))

(defn build-headers
  [direction r]
  (let [data (-> r :xtab_data direction)
        lookup (:lookups data)
        tree (:tree data)
        intermediate (iter tree [])
        paths (if (nil? (first (first intermediate)))
                intermediate
                (reduce concat intermediate))]
    (map
     (fn [n] (map-indexed (fn [index i]
                            ((nth lookup index) (keyword i)))
                          (rest n)))
     paths)))

(defn print-report-result
  [result report]
  (let [table (map concat (build-headers :rows result) (-> result :xtab_data :data))
        metrics (:what report)
        attributes (:how report)
        table-header (map :title (concat attributes metrics))
        table-data (map (fn [i] (apply hash-map (interleave table-header i))) table)]
    (pprint/print-table table-header table-data)))

(defn print-report
  [& {:keys [what how]}]
        (let [report-def (report
                         :what what
                         :how how)]
          (-> report
              execute
              (print-report-result report))))

(def date-dimension-attributes
  [
   {:id "date" :name "Date"}
   {:id "week-year-us" :name "Week (Sun-Sat)/Year"}
   {:id "week-year-eu" :name "Week (Mon-Sun)/Year"}
   {:id "month-year" :name "Month/Year"}
   {:id "quarter-year" :name "Quarter/Year"}
   {:id "year" :name "Year"}
   {:id "month" :name "Month"}
   {:id "week-eu" :name "Week (Mon-Sun)"}
   {:id "week-us" :name "Week (Sun-Sat)"}
   {:id "quarter" :name "Quarter"}
   {:id "week-eu-of-quarter" :name "Week (Mon-Sun) of Qtr"}
   {:id "week-us-of-quarter" :name "Week (Sun-Sat) of Qtr"}
   {:id "month-of-quarter" :name "Month of Quarter"}
   {:id "day-of-week-eu" :name "Day of Week (Mon-Sun"}
   {:id "day-of-week-us" :name "Day of Week (Sun-Sat)"}
   {:id "day-of-month" :name "Day of Month"}
   {:id "day-of-quarter" :name "Day of Quarter"}
   {:id "day-of-year" :name "Day of Year"}
   ])

(defn generate-vars-for-date-dimension
  [name]
  (doseq [x date-dimension-attributes]
    (let [id (str (:id x) "-" name)
          name (str (:name x) " (" (clojure.string/capitalize name) ")")]
      (intern *ns* (symbol id) name))))

(defn get-all-metric-def
  []
  (gd-client/list-of "metrics"))

(defn login
  [login password]
  (gd-client/connect login password)
  (gd-client/http-get "/gdc/account/token")
  (gd-parser/bootstrap))

(defn project
  [pid]
  (gd-client/set-project pid))

 
(defmacro with-project
  [pid & body]
  `(binding [gd-client/*PID* ~pid]
     ~@body))

(defmacro with-each-project
  [body]
  `(map (fn [p#]
          (-> p#
              :project
              :links
              :self
              (clojure.string/split  #"/")
              last
              (with-project (get-all-metric-definitions))
              ))
        (:projects (gd-client/http-get "/gdc/account/profile/4e1e8cacc4989228e0ae531b30853248/projects"))))

(defn get-all-metric-definitions
  []
  (pmap (fn [m]
         (-> m
             (:link m)
             (gd-client/http-get)
             :metric
             :content
             :expression))
       (get-all-metric-def)))
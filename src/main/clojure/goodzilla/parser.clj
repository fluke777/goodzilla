(ns goodzilla.parser)
(import '[org.antlr.v4.runtime ANTLRFileStream ANTLRInputStream CommonTokenStream BaseErrorListener])
(import '[org.fluke.tools GooddataLexer GooddataParser GooddataBaseListener GooddataBaseVisitor])

(require '[goodzilla.client :as gd-client])
(require '[clojure.pprint :as pprint])

(def ^:dynamic *map-of-facts* {
                               "hours" "translated-hours"})
                    
(def ^:dynamic *map-of-attributes* {
                                    "Billable" "transalted-billable"
                                    })

(defn bootstrap
  []
  (def ^:dynamic *map-of-facts* (into {}
                            (map (fn [m] [(:title m) (:link m)]) (gd-client/list-of "facts"))))
  (def ^:dynamic *map-of-attributes* (into {}
                            (map (fn [m] [(:title m) (:link m)]) (gd-client/list-of "attributes")))))

(defn error-listener
  [errors]
    (proxy [BaseErrorListener] []
      (syntaxError
        [recognizer offending-symbol line-pos char-pos msg exception]
        (let [error {
                     :message msg
                     :offending-symbol offending-symbol
                     }]
          (swap! errors (fn [x] (concat x [error])))))))
      
(defn print-parse-tree
  [tree parser]
  (comment(pprint (. tree toStringTree parser))))

(defn strip-quotas
  [identifier]
  (apply str (butlast (rest identifier))))

  (comment(apply str (butlast (rest identifier))))

(defn get-string
  [context]
  (let [name-node (. context String)
        double-quoted-node (. context Double_quoted_string)
        single-quoted-node (. context Single_quoted_string)]
    (cond
     (not (nil? single-quoted-node)) (strip-quotas (. single-quoted-node getText))
     (not (nil? double-quoted-node)) (strip-quotas (. double-quoted-node getText))
     :else (. name-node getText))))

(defn get-uri
  [context]
  (. (. context Uri) getText))

(defn parse
   [definition]
   (let [input (new ANTLRInputStream definition)
         lexer (new GooddataLexer input)
         tokens (new CommonTokenStream lexer)
         parser (new GooddataParser tokens)
         errors (atom [])]
     
     (. parser removeErrorListeners)
     (. parser addErrorListener (error-listener errors))
     (let [tree (. parser query)
           num-of-errors (. parser getNumberOfSyntaxErrors)]
       (comment(throw (new Exception "Error during parsing")))
       {
        :parse-tree tree
        :tokens tokens
        :parser parser
        :num-of-errors num-of-errors
        :errors (deref errors)
        })))

(defn parse?
  [definition]
  (= (:num-of-errors (parse definition)) 0))




(defmulti rewrite-attribute :type)

(defmethod rewrite-attribute :uri
  ([params]
     (rewrite-attribute params {}))
  ([{:keys [value]} translation-dict]
    (let [translated-value (or (get translation-dict value) value)]
      translated-value)))

(defmethod rewrite-attribute :name
  ([params]
     (rewrite-attribute params {}))
  ([{:keys [value]} translation-dict]
     (let [object-map *map-of-attributes*
           translated-value (or (get translation-dict value) value)]
       (if (contains? object-map translated-value)
         (object-map translated-value)
         (throw (new Exception (format "Attribute with name \"%s\" was not found in project with pid %s" translated-value gd-client/*PID*)))))))

(defn get-attribute-elements
  [attr-uri attribute-element]
  
  (let [label-uri (-> (gd-client/http-get attr-uri)
                      :attribute
                      :content
                      :displayForms
                      first
                      :meta
                      :uri)
        attribute-element-name (:value attribute-element) 
        elements (map (fn [x] (-> x :element :uri)) (-> (gd-client/http-post (format "%s/validElements?order=asc&filter=%s" label-uri attribute-element-name)
                                                                        {
                                                                         :validElementsRequest
                                                                         {
                                                                          :uris []
                                                                          }
                                                                         }) :validElements :items))]
    elements))

(defn rewrite-attribute-element
  ([attribute attribute-element]
     (rewrite-attribute-element attribute attribute-element {}))
  ([attribute attribute-element translation-table]
     (let [object-map *map-of-attributes*
           attr-uri (rewrite-attribute attribute translation-table)
           values (get-attribute-elements attr-uri attribute-element)]
       (if (= (count values) 1)
         (-> values first)
         (throw (new Exception (format "There are too many values (%s) for \"%s\" in project with pid %s. Please be more specific." (str values) attr-uri gd-client/*PID*)))))))

(defmulti rewrite-fact :type)

(defmethod rewrite-fact :uri
  ([params]
     (rewrite-fact params {}))
  ([{:keys [value]} translation-dict]
    (let [translated-value (or (get translation-dict value) value)]
      translated-value)))

(defmethod rewrite-fact :name
  ([params]
     (rewrite-fact params {}))
  ([{:keys [value]} translation-dict]
     (let [object-map *map-of-facts*
           translated-value (or (get translation-dict value) value)]
       (if (contains? object-map translated-value)
         (object-map translated-value)
         (throw (new Exception (format "Fact with name \"%s\" was not found in project with pid %s" translated-value gd-client/*PID*)))))))



(defn visit-for-dependencies
  [tree]
  (let [state (atom [])
        visitor (proxy [GooddataBaseVisitor] []
                  (visitAttribute_name
                    [context]
                    (let [attribute-name (. (. context String) getText)]
                      (swap! state (fn [x] (concat x [{:attribute attribute-name}])))))
                  (visitFact_name
                    [context]
                    (let [fact-name (. (. context String) getText)]
                      (swap! state (fn [x] (concat x [{:fact fact-name}]))))))]
    (. visitor visit tree)
    (deref state)))

  
(defn visit_for_return
  ([tree]
     (visit_for_return tree {}))
  ([tree translation-table]
     (let [state (atom {})
           visitor (proxy [GooddataBaseVisitor] []
                     (visitFact_name
                       [context]
                       (let [attr (get-string context)]
                         (swap! state (fn [x] (merge x {:type :name :value attr}))))) 
                     (visitFact_uri
                       [context]
                       (let [uri (. (. context Uri) getText)
                             stripped (apply str (rest (butlast uri)))]
                         (swap! state (fn [x] (merge x {:type :uri :value stripped}))))) 
                     (visitAttribute_element_uri
                       [context]
                       (let [attr (. (. context Uri) getText)]
                         (swap! state (fn [x] (merge x {:type :uri :value attr}))))) 
                     (visitAttribute_element_name
                       [context]
                       (let [attr (get-string context)]
                         (swap! state (fn [x] (merge x {:type :name :value attr})))))
                      (visitAttribute_uri
                       [context]
                        (let [attr (. (. context Uri) getText)
                              stripped (apply str (rest (butlast attr)))]

                         (swap! state (fn [x] (merge x {:type :uri :value stripped})))))
                     (visitAttribute_name
                       [context]
                       (let [attr (get-string context)]
                         (swap! state (fn [x] (merge x {:type :name :value attr}))))))]
       (. visitor visit tree)
       (deref state))))

(defn get-kids
  [context]
  (let [count (. context getChildCount)]
    (reduce (fn [memo x]
              (concat memo [(. context getChild x)]))
            []
            (range 0  count))))

(defn visit-kids-for-value
  [kids]
  (reduce (fn [memo kid]
            (if (empty? (visit_for_return kid))
              memo
              (concat memo [(visit_for_return kid)])))
          []
          kids))

(defmacro add-to
  [stream context & tokens]
  `(do
    ~@(map (fn [token]
             (if (symbol? token)
               `(add-token-to ~stream ~context ~token)
               `(swap! ~stream (fn [x#] (str x# ~token)))))
           tokens)))

(defmacro add-token-to
  [stream context symbol]
  `(let [t#  (. (. ~context ~symbol) getText)]
    (swap! ~stream (fn [x#] (str x# t#)))))

(defn visit
  ([tree]
     (visit tree {}))
  ([tree translation-table]
     (let [stream (atom "")
           visitor (proxy [GooddataBaseVisitor] []
                     (visitQuery
                       [context]
                       (add-to stream context Select)
                       (. this visitChildren context))
                     (visitAgg_form
                       [context]
                       (let [kids (visit-kids-for-value(get-kids context))
                             uris (map (fn [kid] (str "[" (rewrite-fact kid translation-table) "]")) kids)
                             facts (apply str (interpose ", " uris))]
                         (add-to stream context " " Agg "(" (str facts) ")")))
                     (visitValue_list
                       [context]
                       (let [kids (visit-kids-for-value (get-kids context))]
                         (add-to stream context (apply str (interpose ", " kids)))))
                     (visitAttribute_list
                       [context]
                       (let [kids (visit-kids-for-value(get-kids context))
                             uris (map (fn [kid] (str "[" (rewrite-attribute kid translation-table) "]")) kids)]
                         (add-to stream context (apply str (interpose ", " uris)))))
                     (visitBy_attribute
                       [context]
                       (add-to stream context " " By " ")
                       (. this visitChildren context))
                     (visitCount_form
                       [context]
                       (let [kids (visit-kids-for-value(get-kids context))
                             uris (map (fn [kid] (str "[" (rewrite-attribute kid translation-table) "]")) kids)
                             attrs (apply str (interpose ", " uris))]
                         (add-to stream context " " Count "(" (str attrs) ")")))
                     (visitAttribute_name
                       [context]
                       (let [kids (visit-kids-for-value(get-kids context))]
                         (add-to stream context (apply str (interpose ", " kids)))))
                     (visitAttribute_uri
                       [context]
                       (let [kids (visit-kids-for-value(get-kids context))]
                         (add-to stream context (apply str (interpose ", " kids)))))
                     (visitIn_condition
                       [context]
                       (let [attribute (. context attribute)
                             value-list (. context value_list)
                             attribute-value (visit_for_return attribute)
                             elements (visit-kids-for-value (get-kids value-list))
                             pairs (partition 2 (interleave (repeat (count elements) attribute-value)
                                                            elements))
                             element-values (map (fn [[attribute element]] (str "[" (rewrite-attribute-element attribute element translation-table) "]")) pairs)]
                         
                         (add-to stream context " [" (rewrite-attribute attribute-value translation-table) "] " In "(" (apply str (interpose ", " element-values)) ")")))
                     (visitFact_uri
                       [context]
                       (let [kids (visit-kids-for-value(get-kids context))]
                         (add-to stream context (apply str (interpose ", " kids)))))
                     (visitFact_name
                       [context]
                       (let [kids (visit-kids-for-value(get-kids context))]
                         (add-to stream context (apply str (interpose ", " kids)))))
                     (visitBy_all_in_all
                       [context]
                       (add-to stream context " BY ALL IN ALL OTHER DIMENSIONS"))
                     (visitWithout_pf_clause
                       [context]
                       (add-to stream context " WITHOUT PF"))
                     (visitWhere_clause
                       [context]
                       (add-to stream context " WHERE")
                       (. this visitChildren context))
                     (visitAttribute_condition
                       [context]
                       (let [attribute (. context attribute)
                             element (. context attribute_element)
                             attribute-value (visit_for_return attribute)
                             element-value  (visit_for_return element)]
                         (add-to stream context " [" (rewrite-attribute attribute-value translation-table) "] = [" (rewrite-attribute-element attribute-value element-value translation-table) "]"))))]
       (. visitor visit tree)
       (deref stream))))
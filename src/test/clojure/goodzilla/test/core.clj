(ns goodzilla.test.core
  (:use [clojure.test])
  (:require [goodzilla.parser :as parser]
            [goodzilla.api :as api]
            [goodzilla.packages :as packages]))


(defn stub-fn [return-value]
          (fn [& args]
            return-value))
(defmacro stubbing [stub-forms & body]
  (let [stub-pairs (partition 2 stub-forms)
        returns (map last stub-pairs)
        stub-fns (map #(list 'stub-fn %) returns)
        real-fns (map first stub-pairs)]
    `(binding [~@(interleave real-fns stub-fns)]
       ~@body)))


(deftest basic_aggregations
  (is (parser/parse? "SELECT SUM(hours)"))
  (is (parser/parse? "SELECT COUNT(Billable, Project)"))
  (is (parser/parse? "SELECT COUNT(Billable)")))

(deftest filtering
  (is (parser/parse? "SELECT SUM(hours) WHERE Billable=true"))
  (is (parser/parse? "SELECT SUM(hours) WHERE Billable=true AND Project=false OR User=Tomas"))
  (is (parser/parse? "SELECT SUM(hours) WHERE Billable IN(true, false)"))
  (is (parser/parse? "SELECT COUNT(User) WHERE NOT Employee NOT IN (false)")))

(comment (is (parser/parse? "SELECT SUM(hours) WHERE Billable BETWEEN true AND false")))
  
(deftest aggregations
  (is (parser/parse? "SELECT SUM(hours) BY Billable"))
  (is (parser/parse? "SELECT SUM(hours) BY Billable, Project"))
  (is (parser/parse? "SELECT SUM(hours) BY Billable, ALL Project"))
  (is (parser/parse? "SELECT SUM(hours) BY Billable, ALL Project, User"))
  (is (parser/parse? "SELECT SUM(hours) BY Billable, ALL Project, ALL User"))
  (is (parser/parse? "SELECT SUM(hours) BY Billable, ALL Project, ALL OTHER"))
  (is (parser/parse? "SELECT SUM(hours) BY ALL IN ALL OTHER DIMENSIONS")))

(deftest numbers
  (is (parser/parse? "SELECT 1000")))

(comment(deftest arithmetic_operations
  (is (parser/parse? "SELECT -1 * SUM(hours)"))
  (is (parser/parse? "SELECT -SUM(hours)"))
  (is (parser/parse? "SELECT -SUM(hours)"))))

(deftest naming_stuff
  (is (parser/parse? "SELECT SUM('Hey Dude')"))
  (is (parser/parse? "SELECT SUM(\"Hey Dude\")"))
  (is (parser/parse? "SELECT SUM(\"Hey\")"))
  (is (parser/parse? "SELECT SUM('Hey')"))
  (is (parser/parse? "SELECT SUM([/gdc/md/FoodmartDemo/obj/131])"))
  (is (parser/parse? "SELECT SUM('fact name') WHERE City='San Francisco'"))
  (is (parser/parse? "SELECT SUM(Id) WHERE [/gdc/md/FMP/obj/123]='Yes, Prime Minister'"))
  (is (parser/parse? "SELECT SUM('Hey') WHERE response=true")))

(deftest subselects
  (is (parser/parse? "SELECT AVG((SELECT SUM(Amount) BY Customer))")))

(deftest crazier_stuff
  (is (parser/parse? "SELECT AVG((SELECT SUM(\"The amount that sales guys promises\"))) BY Age, ALL \"Gender\", [/gdc/md/mujprojekt/obj/123], ALL OTHER WHERE Billable IN(true, false) AND (SELECT COUNT([/gdc/md/Projekt1/obj/232]) BY Other) = 1 WITHOUT PF"))
  (is (parser/parse? "SELECT COUNT(attr) WITHOUT PARENT FILTER")))

(deftest expand_fact
  (binding [parser/*map-of-facts*  {"a" "b"
                                    "c" "d"}]
    (is (=
         "SELECT SUM([b])"
         (api/expand-maql "SELECT SUM(a)")))
    (is (=
         "SELECT SUM([b])"
         (api/expand-maql "SELECT SUM('a')")))
    (is (=
         "SELECT SUM([b])"
         (api/expand-maql "SELECT SUM(\"a\")")))))

(deftest expand_fact_with_translation
   (binding [parser/*map-of-facts*  {"a" "b"
                                    "c" "d"}]
     (is (=
          "SELECT SUM([d])"
          (api/expand-maql "SELECT SUM(a)" {
                                            "a" "c"
                                            })))))

(deftest expand_count_metric
  (binding [parser/*map-of-attributes* {"a" "b"
                                        "c" "d"
                                        }]
    (is (=
         "SELECT COUNT([b])"
         (api/expand-maql "SELECT COUNT(a)")))
    (is (=
         "SELECT COUNT([b], [d])"
         (api/expand-maql "SELECT COUNT(a, c)")))
    (is (=
         "SELECT COUNT([/gdc/xyz])"
         (api/expand-maql "SELECT COUNT([/gdc/xyz])")))
    (is (=
         "SELECT COUNT([/gdc/xyz], [b])"
         (api/expand-maql "SELECT COUNT([/gdc/xyz], a)")))
    (is (=
         "SELECT COUNT([b])"
         (api/expand-maql "SELECT COUNT('a')")))
    (is (=
         "SELECT COUNT([b])"
         (api/expand-maql "SELECT COUNT(\"a\")")))))

(deftest expand_count_metric_with_translation
  (binding [parser/*map-of-attributes* {"a" "/asdasda/"
                                        "c" "d"
                                        }]
    (is (=
         "SELECT COUNT([d])"
         (api/expand-maql "SELECT COUNT(\"a\")" {
                                                 "a" "c"
                                                 })))
    (is (=
         "SELECT COUNT([d], [d])"
         (api/expand-maql "SELECT COUNT(\"a\", 'c')" {
                                                 "a" "c"
                                                 })))))

(deftest expand_by
  (binding [parser/*map-of-attributes* {"a" "b"
                                        "c" "d"
                                        "e" "f"
                                        }]
    (is (=
         "SELECT COUNT([b]) BY [d]"
         (api/expand-maql "SELECT COUNT(a) BY c")))
    (is (=
         "SELECT COUNT([b]) BY [d], [f]"
         (api/expand-maql "SELECT COUNT(a) BY c, e")))))


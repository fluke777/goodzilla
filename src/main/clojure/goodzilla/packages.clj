(ns goodzilla.packages
  (:require [goodzilla.api :as gd]
            [goodzilla.parser :as parser]))

(defmacro def-package
  [title & package]
  `(let [package-items# [~@package]
         doc# (if (string? (first package-items#))
                (first package-items#))
         metrics# (filter (fn [i#] (= (:type i#) :metric)) package-items#)]
     (def ~title {
                  :doc doc#
                  :description nil
                  :metrics metrics#
                  :reports nil
                  :name (name '~title)
                  })))

(defn execute-package
  ([stuff]
     (execute-package stuff {}))
  ([{:keys [metrics reports]} translation-table]
     (map (fn [metric]
            (-> metric
                (gd/expand translation-table)
                gd/save))
          metrics)))

(defn commit-package
  [package]
  (println "Would commit package")
  (comment (println (json/generate-string package)))
  (comment (client/post "nejakejserver" package)))

(defn get-dependencies
  [metric]
  (let [result (parser/parse (:definition metric))]
    (parser/visit-for-dependencies (:parse-tree result))))

(defn get-package-dependencies
  [{:keys [metrics]}]
  (reduce (fn [memo metric] (concat memo (get-dependencies metric))) [] metrics))

(defn print-package-info
  [package]
  (println "Package")
  (comment (println (:name package)))
  (println "This package depends on ....")
  (doseq [item (get-package-dependencies package)]
    (println item)))
(ns goodzilla.scrapers
  (:require [goodzilla.client :as gd-client]))

(defn get-report-type
  [report-spec]
  (let [grid? (= (-> report-spec :reportDefinition :content :format) "grid")]
    (if grid?
      :grid
      (-> report-spec :reportDefinition :content :chart :type keyword))))

(defn get-report
  [uri]
  (let [data (gd-client/http-get uri)]
    data))

(defn get-rid-off-chart
  [data]
  (dissoc-in data [:reportDefinition :content :chart]))
(ns goodzilla.templates)

(defn get-template
  [template-name]
  (ns-resolve 'goodzilla.templates (symbol (name template-name))))

(defn template
 [template-name params]
 ((get-template template-name) params))


(defn report-definition-execution
  [{:keys [uri]}]
  {
   "report_req"
   {
    "reportDefinition" uri
    }
   })

(defn metric
  [{:keys [title expression summary deprecated format] :or {summary "" deprecated 0 format "#,##0.00"}}]
  {
   :metric
   {
    :meta
    {
     :title title
     :summary summary
     :tags ""
     :deprecated deprecated
     }
    :content
    {
     :expression expression
     :format format
     :folders []
     }
    }
   })

(defn report-definition
  [{:keys [attributes metrics]}]
  {"reportDefinition"
   {
    "content"
    {
     "filters" []
     "format" "grid"
     "grid"
     {
      "rows" attributes
      "columns" ["metricGroup"]
      "sort"
      {
       "columns" []
       "rows" []
       }
      "columnWidths" []
      "metrics" metrics
      }
     }
    "meta"
    {
     "title" "Untitled report definition"
     "summary" ""
     "tags" ""
     }
    }
   })
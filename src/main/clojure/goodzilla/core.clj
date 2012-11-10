(ns goodzilla.core
  (:gen-class
    :name com.gooddata.Goodzilla))

(require 'clojure.main)
(require 'clojure.pprint)
(require 'reply.main)

(import '[org.antlr.v4.runtime ANTLRFileStream ANTLRInputStream CommonTokenStream BaseErrorListener])
(import '[org.fluke.tools GooddataLexer GooddataParser GooddataBaseListener GooddataBaseVisitor])
(import '[org.antlr.v4.runtime.tree ParseTreeWalker])
(import '[java.lang.reflect.*])

(defn bootstrap
  []
  (println "Bootstrapping")
  (use 'goodzilla.api)
  (use 'goodzilla.packages)
  (require '[goodzilla.client :as client])
  (require '[goodzilla.parser :as parser]))

(defn exit
  []
  (reply.exit/exit))

(defn -main
  []
  (println "GOODZILLA IS COMING")
  (reply.main/launch {}))

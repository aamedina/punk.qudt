(ns net.wikipunk.qudt
  "QUDT"
  (:require
   [clojure.string :as str]
   [com.stuartsierra.component :as com]
   [net.wikipunk.boot]
   [net.wikipunk.ext]
   [net.wikipunk.qudt.boot]
   [net.wikipunk.rdf :as rdf]
   [net.wikipunk.rdf.qudt :as qudt]
   [net.wikipunk.rdf.punk.qudt :as punk.qudt]
   [net.wikipunk.rdf.datatype]
   [net.wikipunk.rdf.qkdv]
   [net.wikipunk.rdf.soqk]
   [net.wikipunk.rdf.sou]
   [net.wikipunk.rdf.unit]
   [net.wikipunk.rdf.qudt.math]
   [net.wikipunk.rdf.qudt.type]
   [net.wikipunk.rdf.quantitykind]
   [net.wikipunk.rdf.prefix]
   [net.wikipunk.rdf.discipline]
   [net.wikipunk.rdf.constant]))

(defrecord QUDT [vocab]
  com/Lifecycle
  (start [this]
    (rdf/import-from 'net.wikipunk.rdf.datatype
                     'net.wikipunk.rdf.qudt)
    (rdf/import-from 'net.wikipunk.rdf.qudt.type
                     'net.wikipunk.rdf.qudt)
    (rdf/import-from 'net.wikipunk.rdf.qudt.math
                     'net.wikipunk.rdf.qudt)
    this)
  (stop [this]
    this)

  rdf/NamespaceSpitter
  (emit [_ arg-map]
    (rdf/emit (:boot vocab) arg-map)))

(ns net.wikipunk.qudt.boot
  {:rdf/type :jsonld/Context}
  (:require
   [net.wikipunk.rdf.rdf]
   [net.wikipunk.rdf.rdfs]
   [net.wikipunk.rdf.owl]
   [net.wikipunk.rdf.schema]
   [net.wikipunk.rdf.dc11]
   [net.wikipunk.rdf.dcterms]
   [net.wikipunk.rdf.dtype]
   [net.wikipunk.rdf.prov]
   [net.wikipunk.rdf.skos]
   [net.wikipunk.rdf.vaem]
   [net.wikipunk.rdf.voag]
   [net.wikipunk.rdf.xsd]
   [net.wikipunk.rdf.sh]))

(def punk.qudt
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "https://wikipunk.net/qudt/"
   :rdfa/prefix "punk.qudt"})

(def qudt
  {:dcat/downloadURL "https://qudt.org/2.1/schema/qudt.ttl"
   :rdfa/uri         "http://qudt.org/schema/qudt/"
   :rdfa/prefix      "qudt"
   :rdf/type         :rdfa/PrefixMapping})

(def constant
  {:dcat/downloadURL "https://qudt.org/2.1/vocab/constant.ttl"
   :rdfa/uri         "http://qudt.org/vocab/constant/"
   :rdfa/prefix      "constant"
   :rdf/type         :rdfa/PrefixMapping})

(def unit
  {:dcat/downloadURL "https://qudt.org/2.1/vocab/unit.ttl"
   :rdfa/uri         "http://qudt.org/vocab/unit/"
   :rdfa/prefix      "unit"
   :rdf/type         :rdfa/PrefixMapping})

(def quantitykind
  {:dcat/downloadURL "https://qudt.org/2.1/vocab/quantitykind.ttl"
   :rdfa/uri         "http://qudt.org/vocab/quantitykind/"
   :rdfa/prefix      "quantitykind"
   :rdf/type         :rdfa/PrefixMapping})

(def dimensionvector
  {:dcat/downloadURL "https://qudt.org/2.1/vocab/prefix.ttl"
   :rdfa/uri         "http://qudt.org/vocab/prefix/"
   :rdfa/prefix      "prefix"
   :rdf/type         :rdfa/PrefixMapping})

(def qkdv
  {:dcat/downloadURL "https://qudt.org/2.1/vocab/dimensionvector.ttl"
   :rdfa/uri         "http://qudt.org/vocab/dimensionvector/"
   :rdfa/prefix      "qkdv"
   :rdf/type         :rdfa/PrefixMapping})

(def soqk
  {:dcat/downloadURL "https://qudt.org/2.1/vocab/soqk.ttl"
   :rdfa/uri         "http://qudt.org/vocab/soqk/"
   :rdfa/prefix      "soqk"
   :rdf/type         :rdfa/PrefixMapping})

(def sou
  {:dcat/downloadURL "https://qudt.org/2.1/vocab/sou.ttl"
   :rdfa/uri         "http://qudt.org/vocab/sou/"
   :rdfa/prefix      "sou"
   :rdf/type         :rdfa/PrefixMapping})

(def qudt.type
  {:dcat/downloadURL "https://raw.githubusercontent.com/qudt/qudt-public-repo/main/vocab/types/VOCAB_QUDT-DATATYPES-v2.1.ttl"
   :rdfa/uri         "http://qudt.org/schema/type/"
   :rdfa/prefix      "qudt.type"
   :rdf/type         :rdfa/PrefixMapping})

(def datatype
  {:dcat/downloadURL "https://qudt.org/2.1/schema/datatype.ttl"
   :rdfa/uri         "http://qudt.org/schema/datatype/"
   :rdfa/prefix      "datatype"
   :rdf/type         :rdfa/PrefixMapping})

(def math
  {:dcat/downloadURL "https://raw.githubusercontent.com/qudt/qudt-public-repo/main/vocab/mathematics/VOCAB_QUDT-MATHEMATICS-v2.1.18.ttl"
   :rdfa/uri         "http://qudt.org/vocab/mathematics/"
   :rdfa/prefix      "qudt.math"
   :rdf/type         :rdfa/PrefixMapping})

(def discipline
  {:dcat/downloadURL "https://raw.githubusercontent.com/qudt/qudt-public-repo/main/vocab/disciplines/VOCAB_QUDT-DISCIPLINES-v2.1.ttl"
   :rdfa/uri         "http://qudt.org/vocab/discipline/"
   :rdfa/prefix      "discipline"
   :rdf/type         :rdfa/PrefixMapping})

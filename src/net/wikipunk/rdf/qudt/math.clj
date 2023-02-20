(ns net.wikipunk.rdf.qudt.math
  "QUDT Mathematics Vocabulary - v2.1.24"
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/qudt/qudt-public-repo/main/vocab/mathematics/VOCAB_QUDT-MATHEMATICS-v2.1.18.ttl",
   :owl/imports ["http://www.w3.org/2004/02/skos/core"
                 "http://qudt.org/2.1/schema/facade/qudt"
                 "http://www.linkedmodel.org/schema/vaem"
                 "http://www.linkedmodel.org/schema/dtype"],
   :owl/versionIRI "http://qudt.org/2.1/vocab/mathematics",
   :rdf/ns-prefix-map {"dc11" "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "dtype" "http://www.linkedmodel.org/schema/dtype#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "quantitykind" "http://qudt.org/vocab/quantitykind/",
                       "qudt" "http://qudt.org/schema/qudt/",
                       "qudt.math" "http://qudt.org/vocab/mathematics/",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "unit" "http://qudt.org/vocab/unit/",
                       "vaem" "http://www.linkedmodel.org/schema/vaem#",
                       "voag" "http://voag.linkedmodel.org/schema/voag#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "qudt.math",
   :rdfa/uri "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label "QUDT Mathematics Vocabulary - v2.1.24",
   :vaem/hasGraphMetadata :qudt/GMD_QUDT-VOCAB-MATHEMATICS})

(def ^{:private true} GMD_QUDT-VOCAB-MATHEMATICS
  "Mathematics vocabulary"
  {:db/ident :qudt/GMD_QUDT-VOCAB-MATHEMATICS,
   :dcterms/contributor ["David Price"
                         "Steve Ray"
                         "Irene Polikoff"
                         "James E. Masters"
                         "Daniel Mekonnen"],
   :dcterms/created #inst "2019-03-10T00:00:00.000-05:00",
   :dcterms/creator "Ralph Hodgson",
   :dcterms/description "Mathematics vocabulary",
   :dcterms/modified #inst "2022-06-02T00:00:00.000-04:00",
   :dcterms/rights
   "The QUDT Ontologies are issued under a Creative Commons Attribution 4.0 International License (CC BY 4.0), available at https://creativecommons.org/licenses/by/4.0/. Attribution should be made to QUDT.org",
   :dcterms/subject "Mathematics Schema",
   :dcterms/title "QUDT Vocabulary for Mathematics - Version 2.1.24",
   :owl/versionIRI "http://qudt.org/2.1/schema/qudt",
   :rdf/type :vaem/GraphMetaData,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label "QUDT Vocabulary for Mathematics - Version 2.1",
   :vaem/hasGraphRole :vaem/VocabGraph,
   :vaem/hasOwner :vaem/QUDT,
   :vaem/hasSteward :vaem/QUDT,
   :vaem/intent "Specifies the vocabulary for QUDT use of mathematics",
   :vaem/isMetadataFor "http://qudt.org/2.1/vocab/mathematics",
   :vaem/latestPublishedVersion "TBD",
   :vaem/logo
   "https://qudt.org/linkedmodels.org/assets/lib/lm/images/logos/qudt_logo-300x110.png",
   :vaem/name "qudt",
   :vaem/namespace "http://qudt.org/schema/qudt/",
   :vaem/namespacePrefix "qudt",
   :vaem/owner "QUDT.org",
   :vaem/previousPublishedVersion
   "http://www.qudt.org/doc/2021/12/DOC_SCHEMA-MATHEMATICS-v2.1.html",
   :vaem/revision "2.1",
   :vaem/title "QUDT Vocabulary for Mathematics - Version 2.1",
   :vaem/turtleFileURL "http://qudt.org/2.1/schema/mathematics.ttl",
   :vaem/usesNonImportedResource [:dcterms/modified
                                  :dcterms/contributor
                                  :dcterms/creator
                                  :skos/closeMatch
                                  :prov/wasInfluencedBy
                                  :dcterms/abstract
                                  :voag/QUDT-Attribution
                                  :dcterms/description
                                  :dcterms/source
                                  :dcterms/title
                                  :dcterms/created
                                  :dcterms/subject
                                  :skos/exactMatch
                                  :dcterms/rights],
   :vaem/withAttributionTo :voag/QUDT-Attribution})

(def ^{:private true} STATS_CHI-SQUARED
  "Chi-squared"
  {:db/ident         :qudt/STATS_CHI-SQUARED,
   :qudt/literal     "chi-squared",
   :rdf/type         :qudt/MathsFunctionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Chi-squared",
   :skos/prefLabel   "Chi-squared"})

(def ^{:private true} STATS_COEFFICIENT-OF-VARIATION
  "Coefficient of Variation"
  {:db/ident         :qudt/STATS_COEFFICIENT-OF-VARIATION,
   :qudt/literal     "coefficient-of-variation",
   :rdf/type         :qudt/MathsFunctionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Coefficient of Variation",
   :skos/prefLabel   "Coefficient of Variation"})

(def ^{:private true} STATS_CORRELATION
  "Correlation"
  {:db/ident         :qudt/STATS_CORRELATION,
   :qudt/literal     "correlation",
   :rdf/type         :qudt/MathsFunctionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Correlation",
   :skos/prefLabel   "Correlation"})

(def ^{:private true} STATS_GEOMETRIC-MEAN
  "Geometric Mean"
  {:db/ident         :qudt/STATS_GEOMETRIC-MEAN,
   :qudt/literal     "geometric-mean",
   :rdf/type         :qudt/MathsFunctionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Geometric Mean",
   :skos/prefLabel   "Geometric Mean"})

(def ^{:private true} STATS_HARMONIC-MEAN
  "Harmonic Mean"
  {:db/ident         :qudt/STATS_HARMONIC-MEAN,
   :qudt/literal     "harmonic-mean",
   :rdf/type         :qudt/MathsFunctionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Harmonic Mean",
   :skos/prefLabel   "Harmonic Mean"})

(def ^{:private true} STATS_LOGARITHMS
  "Logarithms"
  {:db/ident         :qudt/STATS_LOGARITHMS,
   :qudt/literal     "logarithms",
   :rdf/type         :qudt/MathsFunctionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Logarithms",
   :skos/prefLabel   "Logarithms"})

(def ^{:private true} STATS_MEAN
  "Mean"
  {:db/ident         :qudt/STATS_MEAN,
   :qudt/literal     "mean",
   :rdf/type         :qudt/MathsFunctionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Mean",
   :skos/prefLabel   "Mean"})

(def ^{:private true} STATS_MEDIAN
  "Median"
  {:db/ident         :qudt/STATS_MEDIAN,
   :qudt/literal     "median",
   :rdf/type         :qudt/MathsFunctionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Median",
   :skos/prefLabel   "Median"})

(def ^{:private true} STATS_MODE
  "Mode"
  {:db/ident         :qudt/STATS_MODE,
   :qudt/literal     "mode",
   :rdf/type         :qudt/MathsFunctionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Mode",
   :skos/prefLabel   "Mode"})

(def ^{:private true} STATS_ORDERED-SET
  "Ordered Set"
  {:db/ident         :qudt/STATS_ORDERED-SET,
   :qudt/literal     "ordered-set",
   :rdf/type         :qudt/MathsFunctionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Ordered Set",
   :skos/prefLabel   "Ordered Set"})

(def ^{:private true} STATS_PERCENTILE
  "Percentile"
  {:db/ident         :qudt/STATS_PERCENTILE,
   :qudt/literal     "percentile",
   :rdf/type         :qudt/MathsFunctionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Percentile",
   :skos/prefLabel   "Percentile"})

(def ^{:private true} STATS_REGRESSION
  "Regression"
  {:db/ident         :qudt/STATS_REGRESSION,
   :qudt/literal     "regression",
   :rdf/type         :qudt/MathsFunctionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Regression",
   :skos/prefLabel   "Regression"})

(def ^{:private true} STATS_STANDARD-DEVIATION
  "Standard Deviation"
  {:db/ident         :qudt/STATS_STANDARD-DEVIATION,
   :qudt/literal     "standard-deviation",
   :rdf/type         :qudt/MathsFunctionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Standard Deviation",
   :skos/prefLabel   "Standard Deviation"})

(def ^{:private true} STATS_VARIANCE-ANALYSIS
  "Variance Analysis"
  {:db/ident         :qudt/STATS_VARIANCE-ANALYSIS,
   :qudt/literal     "variance-analysis",
   :rdf/type         :qudt/MathsFunctionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Variance Analysis",
   :skos/prefLabel   "Variance Analysis"})

(def ^{:private true} TT_AFFINE
  "In geometry, an affine transformation or affine map[ or an affinity is a transformation which preserves straight lines (i.e., all points lying on a line initially still lie on a line after transformation) and ratios of distances between points lying on a straight line (e.g., the midpoint of a line segment remains the midpoint after transformation). It does not necessarily preserve angles or lengths."
  {:db/ident :qudt/TT_AFFINE,
   :dcterms/description
   "In geometry, an affine transformation or affine map[ or an affinity is a transformation which preserves straight lines (i.e., all points lying on a line initially still lie on a line after transformation) and ratios of distances between points lying on a straight line (e.g., the midpoint of a line segment remains the midpoint after transformation). It does not necessarily preserve angles or lengths.",
   :rdf/type :qudt/TransformType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/qudt/mathematics",
   :rdfs/label "Affine transformation",
   :skos/prefLabel "Affine transformation"})

(def ^{:private true} TT_EQUALITY
  "Equality"
  {:db/ident         :qudt/TT_EQUALITY,
   :rdf/type         :qudt/TransformType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Equality",
   :skos/prefLabel   "Equality"})

(def ^{:private true} TT_MONOTONIC-ORDER
  "Monotonic ordering"
  {:db/ident         :qudt/TT_MONOTONIC-ORDER,
   :rdf/type         :qudt/TransformType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Monotonic ordering",
   :skos/prefLabel   "Monotonic ordering"})

(def ^{:private true} TT_POSITIVE-SIMILARITIES
  "Positive Similarities"
  {:db/ident         :qudt/TT_POSITIVE-SIMILARITIES,
   :rdf/type         :qudt/TransformType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/mathematics",
   :rdfs/label       "Positive Similarities",
   :skos/prefLabel   "Positive Similarities"})
(ns net.wikipunk.rdf.datatype
  "QUDT SCHEMA - Datatypes"
  {:dcat/downloadURL "https://qudt.org/2.1/schema/datatype.ttl",
   :owl/imports ["http://www.linkedmodel.org/schema/dtype"
                 "http://www.w3.org/ns/shacl#"
                 "http://www.linkedmodel.org/schema/vaem"
                 "http://www.w3.org/2004/02/skos/core"
                 "http://qudt.org/2.1/schema/facade/qudt"],
   :rdf/ns-prefix-map {"datatype" "http://qudt.org/vocab/datatype/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "dtype" "http://www.linkedmodel.org/schema/dtype#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "qudt" "http://qudt.org/schema/qudt/",
                       "qudt-refdata" "http://qudt.org/vocab/refdata/",
                       "qudt.type" "http://qudt.org/vocab/type/",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sh" "http://www.w3.org/ns/shacl#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "vaem" "http://www.linkedmodel.org/schema/vaem#",
                       "voag" "http://voag.linkedmodel.org/schema/voag#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "datatype",
   :rdfa/uri "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "QUDT SCHEMA - Datatypes",
   :vaem/hasCatalogEntry :voag/QUDT-SchemaCatalogEntry,
   :vaem/hasGraphMetadata :datatype/GMD_datatype,
   :vaem/hasGraphRole :vaem/SchemaGraph,
   :vaem/intent
   "This ontology is to be used by other ontologies that need to reference type definitions.",
   :vaem/namespace "http://qudt.org/schema/dtype/",
   :vaem/namespacePrefix "qudt",
   :vaem/specificity 1,
   :vaem/url "http://qudt.org/2.0/schema/dtype"}
  (:refer-clojure :exclude [bytes type vector]))

(def GMD_datatype
  "The QUDT 'Datatype' ontology is a specification of scalar and structured data types. Scalar data types are defined for all the commonly encountered forms of numbers, characters and booleans, with their representations in a number of vendor and industry specific technologies. Structured data types cover arrays, lists, trees and many other forms of composite data elements. Specification of coordinate systems is also covered."
  {:db/ident :datatype/GMD_datatype,
   :dcterms/description
   "The QUDT 'Datatype' ontology is a specification of scalar and structured data types. Scalar data types are defined for all the commonly encountered forms of numbers, characters and booleans, with their representations in a number of vendor and industry specific technologies. Structured data types cover arrays, lists, trees and many other forms of composite data elements. Specification of coordinate systems is also covered.",
   :dcterms/modified #inst "2023-01-13T20:44:39.568-00:00",
   :dcterms/subject "Datatypes",
   :rdf/type :vaem/GraphMetaData,
   :rdfs/label "QUDT Schema for Datatypes - Version 2.1.24",
   :vaem/graphTitle "QUDT Schema for Datatypes - Version 2.1.24",
   :vaem/hasGraphRole :vaem/SchemaGraph,
   :vaem/isMetadataFor "http://qudt.org/2.1/schema/datatype",
   :vaem/latestPublishedVersion
   "https://qudt.org/doc/2023/01/DOC_SCHEMA-DATATYPES-v2.1.html",
   :vaem/logo
   "https://qudt.org/linkedmodels.org/assets/lib/lm/images/logos/qudt_logo-300x110.png",
   :vaem/name "QUDT",
   :vaem/namespace "http://qudt.org/schema/qudt/",
   :vaem/namespacePrefix "qudt",
   :vaem/owner "QUDT.ORG",
   :vaem/previousPublishedVersion
   "https://qudt.org/doc/2022/12/DOC_SCHEMA-DATATYPES-v2.1.html",
   :vaem/publishedDate #inst "2017-05-10T00:00:00.000-04:00",
   :vaem/releaseDate #inst "2016-05-09T00:00:00.000-04:00",
   :vaem/revision "2.1",
   :vaem/title "QUDT Schema for Datatypes - Version 2.1.24",
   :vaem/turtleFileURL "http://qudt.org/2.1/schema/datatype.ttl",
   :vaem/usesNonImportedResource [:dcterms/rights
                                  :dcterms/abstract
                                  :dcterms/creator
                                  :dcterms/title
                                  :dcterms/created
                                  :dcterms/modified
                                  :voag/QUDT-Attribution],
   :vaem/withAttributionTo :voag/QUDT-Attribution})

(def ^{:private true} GMD_DTYPE
  "The ontology \"dtype\" provides a specification of simple data types such as enumerations and codelists. These are needed in support of the conversion of XML Schemas and UML Models to OWL. The purpose of \"dtype\" is to provide a foundation for expressing rich data types. These data types are typically needed when dealing with OWL representations of data structures derived from XML Schema."
  {:db/ident :dtype/GMD_DTYPE,
   :dcterms/description
   "The ontology \"dtype\" provides a specification of simple data types such as enumerations and codelists. These are needed in support of the conversion of XML Schemas and UML Models to OWL. The purpose of \"dtype\" is to provide a foundation for expressing rich data types. These data types are typically needed when dealing with OWL representations of data structures derived from XML Schema."})

(def ^{:private true} AbstractDatatype
  "An \"Abstract Datatype\" (ADT) is a specification of a set of data and the set of operations that can be performed on the data. Such a data type is abstract in the sense that it is independent of various concrete implementations. The definition can be mathematical, or it can be programmed as an interface. A first class ADT supports the creation of multiple instances of the ADT, and the interface normally provides a constructor, which returns an abstract handle to new data, and several operations, which are functions accepting the abstract handle as an argument. <p class=\"lm-para\">An \"Abstract Datatype\" (ADT) is a specification of a set of data and the set of operations that can be performed on the data. Such a data type is abstract in the sense that it is independent of various concrete implementations. The definition can be mathematical, or it can be programmed as an interface. A first class ADT supports the creation of multiple instances of the ADT, and the interface normally provides a constructor, which returns an abstract handle to new data, and several operations, which are functions accepting the abstract handle as an argument.</p>"
  {:db/ident :qudt/AbstractDatatype,
   :dcterms/description
   ["An \"Abstract Datatype\" (ADT) is a specification of a set of data and the set of operations that can be performed on the data. Such a data type is abstract in the sense that it is independent of various concrete implementations. The definition can be mathematical, or it can be programmed as an interface. A first class ADT supports the creation of multiple instances of the ADT, and the interface normally provides a constructor, which returns an abstract handle to new data, and several operations, which are functions accepting the abstract handle as an argument."
    "<p class=\"lm-para\">An \"Abstract Datatype\" (ADT) is a specification of a set of data and the set of operations that can be performed on the data. Such a data type is abstract in the sense that it is independent of various concrete implementations. The definition can be mathematical, or it can be programmed as an interface. A first class ADT supports the creation of multiple instances of the ADT, and the interface normally provides a constructor, which returns an abstract handle to new data, and several operations, which are functions accepting the abstract handle as an argument.</p>"],
   :prov/wasInfluencedBy
   ["http://xlinux.nist.gov/dads/HTML/abstractDataType.html"
    "http://en.wikipedia.org/wiki/Abstract_data_type"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Abstract Datatype",
   :rdfs/subClassOf :qudt/StructuredDatatype})

(def ^{:private true} AerospaceCoordinateSystem
  "A sub-type of 'Coordinate system'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/AerospaceCoordinateSystem,
   :dcterms/description
   "A sub-type of 'Coordinate system'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Aerospace coordinate system",
   :rdfs/subClassOf :qudt/CoordinateSystem})

(def ^{:private true} AlgebraicDatatype
  "<p class=\"lm-para\">An \"Algebraic Datatype\" is a datatype each of whose values are data from other data types wrapped in one of the constructors of the data type. Any wrapped datum is an argument to the constructor. In contrast to other data types, the constructor is not executed and the only way to operate on the data is to unwrap the constructor using pattern matching.</p> <p class=\"lm-para\">The most common algebraic data type is a list with two constructors: Nil or [] for an empty list, and Cons (an abbreviation of constructor), ::, or : for the combination of a new element with a shorter list (for example (Cons 1 '(2 3 4)) or 1:[2,3,4]).</p> <p class=\"lm-para\">Special cases of algebraic types are product types i.e. records (only one constructor) and enumerated types (many constructors with no arguments). Algebraic types are one kind of composite type (i.e. a type formed by combining other types).</p> <p class=\"lm-para\">An algebraic data type may also be an abstract data type (ADT) if it is exported from a module without its constructors. Values of such a type can only be manipulated using functions defined in the same module as the type itself.</p>"
  {:db/ident :qudt/AlgebraicDatatype,
   :dcterms/description
   "<p class=\"lm-para\">An \"Algebraic Datatype\" is a datatype each of whose values are data from other data types wrapped in one of the constructors of the data type. Any wrapped datum is an argument to the constructor. In contrast to other data types, the constructor is not executed and the only way to operate on the data is to unwrap the constructor using pattern matching.</p>\n<p class=\"lm-para\">The most common algebraic data type is a list with two constructors: Nil or [] for an empty list, and Cons (an abbreviation of constructor), ::, or : for the combination of a new element with a shorter list (for example (Cons 1 '(2 3 4)) or 1:[2,3,4]).</p>\n<p class=\"lm-para\">Special cases of algebraic types are product types i.e. records (only one constructor) and enumerated types (many constructors with no arguments). Algebraic types are one kind of composite type (i.e. a type formed by combining other types).</p>\n<p class=\"lm-para\">An algebraic data type may also be an abstract data type (ADT) if it is exported from a module without its constructors. Values of such a type can only be manipulated using functions defined in the same module as the type itself.</p>",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Algebraic_data_type",
   :rdf/type :owl/Class,
   :rdfs/comment
   "<p>An \"Algebraic Datatype\" is a datatype each of whose values are data from other data types wrapped in one of the constructors of the data type. Any wrapped datum is an argument to the constructor. In contrast to other data types, the constructor is not executed and the only way to operate on the data is to unwrap the constructor using pattern matching.</p>\n\n<p>The most common algebraic data type is a list with two constructors: Nil or [] for an empty list, and Cons (an abbreviation of constructor), ::, or : for the combination of a new element with a shorter list (for example (Cons 1 '(2 3 4)) or 1:[2,3,4]).</p>\n\n<p>Special cases of algebraic types are product types i.e. records (only one constructor) and enumerated types (many constructors with no arguments). Algebraic types are one kind of composite type (i.e. a type formed by combining other types).</p>\n\n<p>An algebraic data type may also be an abstract data type (ADT) if it is exported from a module without its constructors. Values of such a type can only be manipulated using functions defined in the same module as the type itself.</p>",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Algebraic Datatype",
   :rdfs/seeAlso ["http://qudt.org/schema/qudt/AbstractDatatype"],
   :rdfs/subClassOf :qudt/StructuredDatatype})

(def ^{:private true} AlignmentType
  "Specifies how a physical data field is aligned. The alignment could be at a bit, byte or word boundary."
  {:db/ident :qudt/AlignmentType,
   :dcterms/description
   "Specifies how a physical data field is aligned. The alignment could be at a bit, byte or word boundary.",
   :owl/oneOf
   [:qudt.type/BitAligned :qudt.type/ByteAligned :qudt.type/WordAligned],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Alignment type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ^{:private true} Array
  "An array is represented as ordered entries of values arranged according to the dimensions given. The dimensions are given as a list of integers where each integer is the cardinality of each dimension. The number of dimensions is specified in the attribute 'dimensionality'. Optionally a reference can be made to a variable, whose values are the array entries. The data type of the array entries is an optional field, 'elementType', which points to a data type definition. If the data type is given, then it applies to all elements. If it is not given then the elements can be of different types for each position in the array. The property 'type:typeMatrix' must refer to a matrix of types. If a default value is given this can be used to place the appropriate value in a cell when an entry value is not known. If no dimensionality or dimension vector is specified the array is under-specified but still legitimate as a place-holder for a data type."
  {:db/ident :qudt/Array,
   :dcterms/description
   "An array is represented as ordered entries of values arranged according to the dimensions given. The dimensions are given as a list of integers where each integer is the cardinality of each dimension. The number of dimensions is specified in the attribute 'dimensionality'. Optionally a reference can be made to a variable, whose values are the array entries. The data type of the array entries is an optional field, 'elementType', which points to a data type definition. If the data type is given, then it applies to all elements.  If it is not given then the elements can be of different types for each position in the array. The property 'type:typeMatrix' must refer to a matrix of types.  If a default value is given this can be used to place the appropriate value in a cell when an entry value is not known. If no dimensionality or dimension vector is specified the array is under-specified but still legitimate as a place-holder for a data type.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Array Type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/DimensionVector,
                      :owl/onProperty    :qudt/dimensionVector,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/typeMatrix,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/dimensionVector,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom
                      "http://qudt.org/schema/type#TypeMatrix",
                      :owl/onProperty :qudt/typeMatrix,
                      :rdf/type :owl/Restriction}
                     :qudt/CompositeDatatype
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/dataOrder,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/ArrayDataOrderType,
                      :owl/onProperty    :qudt/dataOrder,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/dimensionality,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/byRow,
                      :rdf/type           :owl/Restriction}]})

(def ^{:private true} ArrayDataOrderType
  "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/ArrayDataOrderType,
   :dcterms/description
   "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version.",
   :owl/oneOf [:qudt/ByColumn :qudt/ByRow :qudt/ByLeftMostIndex],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Array data order type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ^{:private true} ArrayIndex
  "An Array Index Type is a data type that specifies the properties of data structures that hold array indexes."
  {:db/ident :qudt/ArrayIndex,
   :dcterms/description
   "An Array Index Type is a data type that specifies the properties of data structures that hold array indexes.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Array Index Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/UNSIGNED-INTEGER,
                      :owl/onProperty :qudt/elementType,
                      :rdf/type       :owl/Restriction}
                     :qudt/Vector]})

(def ^{:private true} ArrayIndex-elementType
  {:db/ident    :qudt/ArrayIndex-elementType,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/nonNegativeInteger,
   :sh/hasValue :qudt/UNSIGNED-INTEGER,
   :sh/path     :qudt/elementType})

(def ^{:private true} ArrayIndexType
  "An Array Index Type is a data type that specifies the properties of data structures that hold array indexes."
  {:db/ident :qudt/ArrayIndexType,
   :dcterms/description
   "An Array Index Type is a data type that specifies the properties of data structures that hold array indexes.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Array Index Type",
   :rdfs/subClassOf :qudt/VectorType,
   :sh/property :qudt/ArrayIndex-elementType})

(def ^{:private true} ArrayType
  "<p>An <em>array type</em> is a type specification for ordered entries of values arranged according to the dimensions given. The dimensions are given as a list of integers where each integer is the cardinality of each dimension. The number of dimensions is specified in the attribute 'dimensionality'.</p> <p>Optionally a reference can be made to a variable, whose values are the array entries. The data type of the array entries is an optional field, 'elementType', which points to a data type definition. If the data type is given, then it applies to all elements. If it is not given then the elements can be of different types for each position in the array.</p> <p>The property <em>qudt:typeMatrix</em> must refer to a matrix of types. If a default value is given this can be used to place the appropriate value in a cell when an entry value is not known. If no dimensionality or dimension vector is specified the array is under-specified but still legitimate as a place-holder for a data type.</p>"
  {:db/ident :qudt/ArrayType,
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/comment
   "<p>An <em>array type</em> is a type specification for ordered entries of values arranged according to the dimensions given. The dimensions are given as a list of integers where each integer is the cardinality of each dimension. The number of dimensions is specified in the attribute 'dimensionality'.</p>\n\n<p>Optionally a reference can be made to a variable, whose values are the array entries. The data type of the array entries is an optional field, 'elementType', which points to a data type definition. If the data type is given, then it applies to all elements.  If it is not given then the elements can be of different types for each position in the array.</p>\n\n<p>The property <em>qudt:typeMatrix</em> must refer to a matrix of types.  If a default value is given this can be used to place the appropriate value in a cell when an entry value is not known. If no dimensionality or dimension vector is specified the array is under-specified but still legitimate as a place-holder for a data type.</p>",
   :rdfs/label "Array Type",
   :rdfs/subClassOf :qudt/CompositeDatatype,
   :sh/property [:qudt/ArrayType-dimensionVector
                 :qudt/ArrayType-dimensionality
                 :qudt/ArrayType-dataOrder
                 :qudt/ArrayType-byRow
                 :qudt/ArrayType-typeMatrix]})

(def ^{:private true} ArrayType-byRow
  {:db/ident    :qudt/ArrayType-byRow,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/boolean,
   :sh/maxCount 1,
   :sh/path     :qudt/byRow})

(def ^{:private true} ArrayType-dataOrder
  {:db/ident    :qudt/ArrayType-dataOrder,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/ArrayDataOrderType,
   :sh/maxCount 1,
   :sh/path     :qudt/dataOrder})

(def ^{:private true} ArrayType-dimensionVector
  {:db/ident    :qudt/ArrayType-dimensionVector,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/DimensionVector,
   :sh/maxCount 1,
   :sh/path     :qudt/dimensionVector})

(def ^{:private true} ArrayType-dimensionality
  {:db/ident    :qudt/ArrayType-dimensionality,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/dimensionality})

(def ^{:private true} ArrayType-typeMatrix
  {:db/ident    :qudt/ArrayType-typeMatrix,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/typeMatrix,
   :sh/maxCount 1,
   :sh/path     :qudt/typeMatrix})

(def ^{:private true} Article
  "Pub article type"
  {:db/ident      :qudt/Article,
   :dtype/literal "article",
   :rdf/type      :qudt/PubEnumeratedType,
   :rdfs/label    "Pub article type"})

(def ^{:private true} AssociativeArray
  "An Associative Array (or Map) is an abstract data type composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding."
  {:db/ident         :qudt/AssociativeArray,
   :dcterms/description
   "An Associative Array (or Map) is an abstract data type composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding.",
   :owl/equivalentClass :qudt/Map,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Associative Array",
   :rdfs/subClassOf  :qudt/Collection})

(def ^{:private true} AssociativeArrayType
  "An Associative Array (or Map) is an abstract data type composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding."
  {:db/ident        :qudt/AssociativeArrayType,
   :dcterms/description
   "An Associative Array (or Map) is an abstract data type composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding.",
   :owl/equivalentClass :qudt/MapType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Associative Array Type",
   :rdfs/subClassOf :qudt/CollectionType})

(def ^{:private true} AuralCue
  "An aural cue is a sound produced by a device or a system that is used to alert personnel of of an advisory, cautionary, warning, or emergency state."
  {:db/ident :qudt/AuralCue,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An aural cue is a sound produced by a device or a system that is used to alert personnel of of an advisory, cautionary, warning, or emergency state.",
   :rdfs/label "Aural Cue",
   :rdfs/subClassOf :qudt/ModalCue,
   :sh/property :qudt/AuralCue-sound})

(def ^{:private true} AuralCue-sound
  {:db/ident    :qudt/AuralCue-sound,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/anyURI,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/sound})

(def ^{:private true} AuralCueEnumeration-defaultValue
  {:db/ident :qudt/AuralCueEnumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/AuralCue,
   :sh/path  :qudt/defaultValue})

(def ^{:private true} AxialOrientationType
  "The axial orientation of a coordinate system frame axis."
  {:db/ident :qudt/AxialOrientationType,
   :dcterms/description
   "The axial orientation of a coordinate system frame axis.",
   :owl/oneOf [:qudt.type/PositiveZ
               :qudt.type/PositiveY
               :qudt.type/NegativeY
               :qudt.type/NegativeZ
               :qudt.type/PositiveX
               :qudt.type/NegativeX],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Axial Orientation Type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ^{:private true} BOOLEAN
  "In computer science, the Boolean or logical data type is a data type, having two values (usually denoted true and false), intended to represent the truth values of logic and Boolean algebra. The Boolean data type is the primary result of conditional statements, which allow different actions and change control flow depending on whether a programmer-specified boolean condition evaluates to true or false."
  {:db/ident :qudt/BOOLEAN,
   :dcterms/description
   "In computer science, the Boolean or logical data type is a data type, having two values (usually denoted true and false), intended to represent the truth values of logic and Boolean algebra. The Boolean data type is the primary result of conditional statements, which allow different actions and change control flow depending on whether a programmer-specified boolean condition evaluates to true or false.",
   :dtype/literal "boolean",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/aa275635(v=sql.80).aspx"
    "http://en.wikipedia.org/wiki/Boolean%5Fdata%5Ftype"],
   :qudt/ansiSQLName "BOOLEAN",
   :qudt/encoding :qudt/BooleanEncoding,
   :qudt/javaName "boolean",
   :qudt/jsName "Boolean()",
   :qudt/microsoftSQLServerName "bit",
   :qudt/mySQLName ["BOOLEAN" "TINYINT(1)" "BOOL"],
   :qudt/odbcName "SQL_BIT",
   :qudt/oleDBName "DBTYPE_BOOL",
   :qudt/oracleSQLName "RAW(1)",
   :qudt/protocolBuffersName "bool",
   :qudt/pythonName "bool",
   :qudt/rdfsDatatype :xsd/boolean,
   :rdf/type :qudt/BooleanType,
   :rdfs/label "BOOLEAN"})

(def ^{:private true} BYTE
  "The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation."
  {:db/ident :qudt/BYTE,
   :dcterms/description
   "The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.",
   :dtype/literal "byte",
   :prov/wasInfluencedBy
   "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html",
   :qudt/abbreviation "SI8",
   :qudt/cName "Byte",
   :qudt/encoding :qudt/OctetEncoding,
   :qudt/maxInclusive 127,
   :qudt/minInclusive -128,
   :qudt/octets 1,
   :qudt/rdfsDatatype :xsd/byte,
   :qudt/signedness :qudt/SIGNED,
   :rdf/type :qudt/SignedShortIntegerType,
   :rdfs/label "Byte"})

(def ^{:private true} BalancedTree
  "A Balanced Tree Type is a data type that defines the properties of data structures that represent balanced trees. A balanced tree is a tree where no leaf is much farther away from the root than any other leaf. Different balancing schemes allow different definitions of \"much farther\" and different amounts of work to keep them balanced."
  {:db/ident :qudt/BalancedTree,
   :dcterms/description
   "A Balanced Tree Type is a data type that defines the properties of data structures that represent balanced trees. A balanced tree is a tree where no leaf is much farther away from the root than any other leaf. Different balancing schemes allow different definitions of \"much farther\" and different amounts of work to keep them balanced.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Balanced Tree Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/maxDepth,
                      :rdf/type           :owl/Restriction}
                     :qudt/Tree]})

(def ^{:private true} BalancedTree-maxDepth
  {:db/ident    :qudt/BalancedTree-maxDepth,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/maxDepth})

(def ^{:private true} BalancedTreeType
  "A Balanced Tree Type is a data type that defines the properties of data structures that represent balanced trees. A balanced tree is a tree where no leaf is much farther away from the root than any other leaf. Different balancing schemes allow different definitions of \"much farther\" and different amounts of work to keep them balanced."
  {:db/ident :qudt/BalancedTreeType,
   :dcterms/description
   "A Balanced Tree Type is a data type that defines the properties of data structures that represent balanced trees. A balanced tree is a tree where no leaf is much farther away from the root than any other leaf. Different balancing schemes allow different definitions of \"much farther\" and different amounts of work to keep them balanced.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Balanced Tree Type",
   :rdfs/subClassOf :qudt/TreeType,
   :sh/property :qudt/BalancedTree-maxDepth})

(def ^{:private true} BigEndian
  "Big Endian"
  {:db/ident      :qudt/BigEndian,
   :dtype/literal "big",
   :rdf/type      :qudt/EndianType,
   :rdfs/label    "Big Endian"})

(def ^{:private true} BigIntegerType
  "A Big Integer is an integer that can be represented in eight octets (64 bits) of machine memory. Big integers may be signed or unsigned."
  {:db/ident :qudt/BigIntegerType,
   :dcterms/description
   "A Big Integer is an integer that can be represented in eight octets (64 bits) of machine memory. Big integers may be signed or unsigned.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Big Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   {:xsd/long 8},
                      :owl/onProperty :qudt/octets,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   {:xsd/long 64},
                      :owl/onProperty :qudt/bits,
                      :rdf/type       :owl/Restriction}
                     :qudt/IntegerDatatype],
   :sh/property :qudt/BigIntegerType-octets})

(def ^{:private true} BigIntegerType-octets
  {:db/ident    :qudt/BigIntegerType-octets,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue 8,
   :sh/or       :qudt/IntegerUnionList,
   :sh/path     :qudt/octets})

(def ^{:private true} BinaryTree
  "A Binary Tree Type is a data type that defines the properties of data structures that represent binary trees. A binary tree is a tree in which each node has at most 2 children."
  {:db/ident :qudt/BinaryTree,
   :dcterms/description
   "A Binary Tree Type is a data type that defines the properties of data structures that represent binary trees. A binary tree is a tree in which each node has at most 2 children. ",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Binary Tree Type",
   :rdfs/subClassOf :qudt/Tree})

(def ^{:private true} BinaryTreeType
  "A Binary Tree Type is a data type that defines the properties of data structures that represent binary trees. A binary tree is a tree in which each node has at most 2 children."
  {:db/ident :qudt/BinaryTreeType,
   :dcterms/description
   "A Binary Tree Type is a data type that defines the properties of data structures that represent binary trees. A binary tree is a tree in which each node has at most 2 children. ",
   :rdf/type :owl/Class,
   :rdfs/label "Binary Tree Type",
   :rdfs/subClassOf :qudt/TreeType})

(def ^{:private true} BitAligned
  "Bit Aligned"
  {:db/ident      :qudt/BitAligned,
   :dtype/literal "bit",
   :rdf/type      :qudt/AlignmentType,
   :rdfs/label    "Bit Aligned"})

(def ^{:private true} BitEncodingType
  "A bit encoding is a correspondence between the two possible values of a bit, 0 or 1, and some interpretation. For example, in a boolean encoding, a bit denotes a truth value, where 0 corresponds to False and 1 corresponds to True."
  {:db/ident :qudt/BitEncodingType,
   :dcterms/description
   "A bit encoding is a correspondence between the two possible values of a bit, 0 or 1, and some interpretation. For example, in a boolean encoding, a bit denotes a truth value, where 0 corresponds to False and 1 corresponds to True.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Bit Encoding",
   :rdfs/subClassOf :qudt/Encoding})

(def ^{:private true} BitField
  "bitfield"
  {:db/ident         :qudt/BitField,
   :rdf/type         [:owl/DataRange :rdfs/Datatype],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "bitfield",
   :rdfs/subClassOf  :xsd/string})

(def ^{:private true} BitField01
  "Bit Field of 1 bit"
  {:db/ident             :qudt/BitField01,
   :dtype/literal        "B1",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 1}
                                                 {:xsd/pattern "[0-1]"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf1",
   :qudt/bits            1,
   :qudt/mySQLName       "BIT(1)",
   :rdf/type             [:qudt/BitFieldType :rdfs/Datatype],
   :rdfs/label           "Bit Field of 1 bit",
   :rdfs/subClassOf      :rdfs/Literal})

(def ^{:private true} BitField02
  "Bit Field of 2 bits"
  {:db/ident             :qudt/BitField02,
   :dtype/literal        "B2",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 2}
                                                 {:xsd/pattern "[0-1]{2}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf2",
   :qudt/bits            2,
   :qudt/mySQLName       "BIT(2)",
   :rdf/type             [:qudt/BitFieldType :rdfs/Datatype],
   :rdfs/label           "Bit Field of 2 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def ^{:private true} BitField03
  "Bit Field of 3 bits"
  {:db/ident             :qudt/BitField03,
   :dtype/literal        "B3",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 3}
                                                 {:xsd/pattern "[0-1]{3}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf3",
   :qudt/bits            3,
   :qudt/mySQLName       "BIT(3)",
   :rdf/type             [:rdfs/Datatype :qudt/BitFieldType],
   :rdfs/label           "Bit Field of 3 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def ^{:private true} BitField04
  "Bit Field of 4 bits"
  {:db/ident             :qudt/BitField04,
   :dtype/literal        "B4",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 4}
                                                 {:xsd/pattern "[0-1]{4}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf4",
   :qudt/bits            4,
   :qudt/mySQLName       "BIT(4)",
   :rdf/type             [:rdfs/Datatype :qudt/BitFieldType],
   :rdfs/label           "Bit Field of 4 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def ^{:private true} BitField05
  "Bit Field of 5 bits"
  {:db/ident             :qudt/BitField05,
   :dtype/literal        "B5",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 5}
                                                 {:xsd/pattern "[0-1]{5}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf5",
   :qudt/bits            5,
   :qudt/mySQLName       "BIT(5)",
   :rdf/type             [:rdfs/Datatype :qudt/BitFieldType],
   :rdfs/label           "Bit Field of 5 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def ^{:private true} BitField06
  "Bit Field of 6 bits"
  {:db/ident             :qudt/BitField06,
   :dtype/literal        "B6",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 6}
                                                 {:xsd/pattern "[0-1]{6}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf6",
   :qudt/bits            6,
   :qudt/mySQLName       "BIT(6)",
   :qudt/rdfsDatatype    :qudt/BitField06,
   :rdf/type             [:rdfs/Datatype :qudt/BitFieldType],
   :rdfs/label           "Bit Field of 6 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def ^{:private true} BitField07
  "Bit Field of 7 bits"
  {:db/ident             :qudt/BitField07,
   :dtype/literal        "B7",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 7}
                                                 {:xsd/pattern "[0-1]{7}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf7",
   :qudt/bits            7,
   :qudt/mySQLName       "BIT(7)",
   :qudt/rdfsDatatype    :qudt/BitField07,
   :rdf/type             [:rdfs/Datatype :qudt/BitFieldType],
   :rdfs/label           "Bit Field of 7 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def ^{:private true} BitField08
  "Bit Field of 8 bits"
  {:db/ident             :qudt/BitField08,
   :dtype/literal        "B8",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 8}
                                                 {:xsd/pattern "[0-1]{8}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf8",
   :qudt/bits            8,
   :qudt/mySQLName       "BIT(8)",
   :qudt/rdfsDatatype    :qudt/BitField08,
   :rdf/type             [:qudt/BitFieldType :rdfs/Datatype],
   :rdfs/label           "Bit Field of 8 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def ^{:private true} BitField09
  "Bit Field of 9 bits"
  {:db/ident             :qudt/BitField09,
   :dtype/literal        "B9",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 9}
                                                 {:xsd/pattern "[0-1]{9}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf9",
   :qudt/bits            9,
   :qudt/mySQLName       "BIT(9)",
   :qudt/rdfsDatatype    :qudt/BitField09,
   :rdf/type             [:rdfs/Datatype :qudt/BitFieldType],
   :rdfs/label           "Bit Field of 9 bits",
   :rdfs/subClassOf      :rdfs/Literal})

(def ^{:private true} BitField10
  "Bit Field Of 10 Bits"
  {:db/ident             :qudt/BitField10,
   :dtype/literal        "B10",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 10}
                                                 {:xsd/pattern "[0-1]{10}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf10",
   :qudt/bitOrder        :qudt/BigEndian,
   :qudt/bits            10,
   :qudt/byteOrder       :qudt/BigEndian,
   :qudt/mySQLName       "BIT(10)",
   :qudt/rdfsDatatype    :qudt/BitField10,
   :rdf/type             [:owl/DataRange :rdfs/Datatype :qudt/BitFieldType],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/schema/datatype",
   :rdfs/label           "Bit Field Of 10 Bits",
   :rdfs/subClassOf      [:rdfs/Literal :qudt/BitField]})

(def ^{:private true} BitField11
  "Bit Field Of 11 Bits"
  {:db/ident             :qudt/BitField11,
   :dtype/literal        "B11",
   :owl/equivalentClass  {:owl/onDatatype :xsd/string,
                          :owl/withRestrictions [{:xsd/length 11}
                                                 {:xsd/pattern "[0-1]{11}"}],
                          :rdf/type       :rdfs/Datatype},
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf11",
   :qudt/bits            11,
   :qudt/mySQLName       "BIT(11)",
   :rdf/type             [:rdfs/Datatype :qudt/BitFieldType :owl/DataRange],
   :rdfs/isDefinedBy     "http://qudt.org/2.1/schema/datatype",
   :rdfs/label           "Bit Field Of 11 Bits",
   :rdfs/subClassOf      [:qudt/BitField :rdfs/Literal]})

(def ^{:private true} BitField12
  "Bit Field of 12 bits"
  {:db/ident            :qudt/BitField12,
   :dtype/literal       "B12",
   :owl/equivalentClass {:owl/onDatatype :xsd/string,
                         :owl/withRestrictions [{:xsd/length 12}
                                                {:xsd/pattern "[0-1]{12}"}],
                         :rdf/type       :rdfs/Datatype},
   :qudt/abbreviation   "bf12",
   :qudt/bits           12,
   :qudt/mySQLName      "BIT(12)",
   :qudt/rdfsDatatype   :qudt/BitField12,
   :rdf/type            [:owl/DataRange :qudt/BitFieldType :rdfs/Datatype],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Bit Field of 12 bits",
   :rdfs/subClassOf     [:rdfs/Literal :qudt/BitField]})

(def ^{:private true} BitFieldType
  "A bit field is a common idiom used in computer programming to store a set of Boolean datatype flags compactly, as a series of bits. The bit field is stored in an integral type of known, fixed bit-width. Each Boolean flag is stored in a separate bit. Usually the source code will define a set of constants, each a power of two, that semantically associate each individual bit with its respective Boolean flag. The bitwise operators and, or, and not are used in combination to set, reset and test the flags."
  {:db/ident :qudt/BitFieldType,
   :dcterms/description
   "A bit field is a common idiom used in computer programming to store a set of Boolean datatype flags compactly, as a series of bits. The bit field is stored in an integral type of known, fixed bit-width. Each Boolean flag is stored in a separate bit. Usually the source code will define a set of constants, each a power of two, that semantically associate each individual bit with its respective Boolean flag. The bitwise operators and, or, and not are used in combination to set, reset and test the flags.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Bit Field Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/encodedValue,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/BitField,
                      :owl/onProperty    :qudt/encodedValue,
                      :rdf/type          :owl/Restriction}
                     :qudt/ScalarDatatype],
   :sh/property :qudt/BitFieldType-encodedValue})

(def ^{:private true} BitFieldType-encodedValue
  {:db/ident    :qudt/BitFieldType-encodedValue,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/BitField,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/encodedValue})

(def ^{:private true} Book
  "Pub book type"
  {:db/ident      :qudt/Book,
   :dtype/literal "book",
   :rdf/type      :qudt/PubEnumeratedType,
   :rdfs/label    "Pub book type"})

(def ^{:private true} Booklet
  "Pub booklet type"
  {:db/ident      :qudt/Booklet,
   :dtype/literal "booklet",
   :rdf/type      :qudt/PubEnumeratedType,
   :rdfs/label    "Pub booklet type"})

(def ^{:private true} BooleanEncoding
  "Boolean Encoding"
  {:db/ident   :qudt/BooleanEncoding,
   :rdf/type   :qudt/BooleanEncodingType,
   :rdfs/label "Boolean Encoding"})

(def ^{:private true} BooleanEncodingType
  "Boolean encoding type"
  {:db/ident         :qudt/BooleanEncodingType,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Boolean encoding type",
   :rdfs/subClassOf  :qudt/Encoding})

(def ^{:private true} BooleanType
  "A boolean data type can take on only two values."
  {:db/ident            :qudt/BooleanType,
   :dcterms/description "A boolean data type can take on only two values.",
   :rdf/type            [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Boolean Type",
   :rdfs/subClassOf     [{:owl/allValuesFrom :qudt/BooleanEncodingType,
                          :owl/onProperty    :qudt/encoding,
                          :rdf/type          :owl/Restriction}
                         :qudt/OrdinalType],
   :sh/property         :qudt/BooleanType-encoding})

(def ^{:private true} BooleanType-encoding
  {:db/ident :qudt/BooleanType-encoding,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/BooleanEncodingType,
   :sh/path  :qudt/encoding})

(def ^{:private true} BooleanTypeEnumeratedValue
  "Specifies how a boolean value is expressed"
  {:db/ident            :qudt/BooleanTypeEnumeratedValue,
   :dcterms/description "Specifies how a boolean value is expressed",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "boolean value",
   :rdfs/subClassOf     :qudt/EnumeratedValue})

(def ^{:private true} ByColumn
  "By Column"
  {:db/ident         :qudt/ByColumn,
   :dtype/literal    "byColumn",
   :rdf/type         :qudt/ArrayDataOrderType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "By Column"})

(def ^{:private true} ByLeftMostIndex
  "By Left Most Index"
  {:db/ident         :qudt/ByLeftMostIndex,
   :dtype/literal    "byLeftMostIndex",
   :rdf/type         :qudt/ArrayDataOrderType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "By Left Most Index"})

(def ^{:private true} ByRow
  "By Row"
  {:db/ident         :qudt/ByRow,
   :dtype/literal    "byRow",
   :rdf/type         :qudt/ArrayDataOrderType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "By Row"})

(def ^{:private true} ByteAligned
  "Byte Aligned"
  {:db/ident      :qudt/ByteAligned,
   :dtype/literal "byte",
   :rdf/type      :qudt/AlignmentType,
   :rdfs/label    "Byte Aligned"})

(def ^{:private true} ByteEncodingType
  "This class contains the various ways that information may be encoded into bytes."
  {:db/ident :qudt/ByteEncodingType,
   :dcterms/description
   "This class contains the various ways that information may be encoded into bytes.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Byte Encoding",
   :rdfs/subClassOf :qudt/Encoding})

(def ^{:private true} CCT_EarthCentered
  "Earth-centered Coordinate System Type"
  {:db/ident   :qudt/CCT_EarthCentered,
   :rdf/type   :qudt/CoordinateCenterType,
   :rdfs/label "Earth-centered Coordinate System Type"})

(def ^{:private true} CCT_MarsCentered
  "Mars-centered Coordinate System Type"
  {:db/ident   :qudt/CCT_MarsCentered,
   :rdf/type   :qudt/CoordinateCenterType,
   :rdfs/label "Mars-centered Coordinate System Type"})

(def ^{:private true} CCT_MoonCentered
  "Moon-centered Coordinate System Type"
  {:db/ident   :qudt/CCT_MoonCentered,
   :rdf/type   :qudt/CoordinateCenterType,
   :rdfs/label "Moon-centered Coordinate System Type"})

(def ^{:private true} CCT_SunCentered
  "Sun-centered Coordinate System Type"
  {:db/ident   :qudt/CCT_SunCentered,
   :rdf/type   :qudt/CoordinateCenterType,
   :rdfs/label "Sun-centered Coordinate System Type"})

(def ^{:private true} CCT_VehicleCentered
  "Vehicle-centered Coordinate System Type"
  {:db/ident   :qudt/CCT_VehicleCentered,
   :rdf/type   :qudt/CoordinateCenterType,
   :rdfs/label "Vehicle-centered Coordinate System Type"})

(def ^{:private true} CFN_ConcatenateMatrixRows
  "Concatenate matrix rows"
  {:db/ident   :qudt/CFN_ConcatenateMatrixRows,
   :rdf/type   :qudt/CompositionFunction,
   :rdfs/label "Concatenate matrix rows"})

(def ^{:private true} COLOR_AMBER
  "Amber Color"
  {:db/ident     :qudt/COLOR_AMBER,
   :qudt/literal "amber",
   :qudt/rgbCode "#FFBF00",
   :rdf/type     :qudt/ColorCue,
   :rdfs/label   "Amber Color"})

(def ^{:private true} COLOR_GREEN
  "Green color"
  {:db/ident     :qudt/COLOR_GREEN,
   :qudt/literal "green",
   :qudt/rgbCode "#008000",
   :rdf/type     :qudt/ColorCue,
   :rdfs/label   "Green color"})

(def ^{:private true} COLOR_ORANGE
  "Orange color"
  {:db/ident     :qudt/COLOR_ORANGE,
   :qudt/literal "orange",
   :qudt/rgbCode "#FFA500",
   :rdf/type     :qudt/ColorCue,
   :rdfs/label   "Orange color"})

(def ^{:private true} COLOR_RED
  "Red color"
  {:db/ident     :qudt/COLOR_RED,
   :qudt/literal "red",
   :qudt/rgbCode "#FF0000",
   :rdf/type     :qudt/ColorCue,
   :rdfs/label   "Red color"})

(def ^{:private true} COLOR_YELLOW
  "Yellow color"
  {:db/ident     :qudt/COLOR_YELLOW,
   :qudt/literal "yellow",
   :qudt/rgbCode "#FFFF00",
   :rdf/type     :qudt/ColorCue,
   :rdfs/label   "Yellow color"})

(def ^{:private true} CRC32
  "CRC-32"
  {:db/ident            :qudt/CRC32,
   :owl/equivalentClass {:owl/onDatatype :xsd/integer,
                         :owl/withRestrictions [{:xsd/minInclusive 0.0}
                                                {:xsd/maxInclusive
                                                 4.294967295E9}],
                         :rdf/type       :rdfs/Datatype},
   :rdf/type            [:owl/DataRange :rdfs/Datatype],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "CRC-32",
   :rdfs/subClassOf     :xsd/integer})

(def ^{:private true} CardinalityType
  "<p class=\"lm-para\">In mathematics, the cardinality of a set is a measure of the number of elements of the set. For example, the set \\(A = {2, 4, 6}\\) contains 3 elements, and therefore \\(A\\) has a cardinality of 3. There are two approaches to cardinality – one which compares sets directly using bijections and injections, and another which uses cardinal numbers.</p>"
  {:db/ident :qudt/CardinalityType,
   :dcterms/description
   "<p class=\"lm-para\">In mathematics, the cardinality of a set is a measure of the number of elements of the set.  For example, the set \\(A = {2, 4, 6}\\) contains 3 elements, and therefore \\(A\\) has a cardinality of 3. There are two approaches to cardinality – one which compares sets directly using bijections and injections, and another which uses cardinal numbers.</p>",
   :owl/oneOf [:qudt/CT_COUNTABLY-INFINITE :qudt/CT_FINITE],
   :prov/wasInfluencedBy ["http://en.wikipedia.org/wiki/Cardinality"
                          "http://en.wikipedia.org/wiki/Cardinal_number"],
   :rdf/type :owl/Class,
   :rdfs/label "Cardinality Type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ^{:private true} CartesianCoordinates
  "A set of variables which fix a geometric object. If the coordinates are distances measured along perpendicular axes, they are known as Cartesian coordinates."
  {:db/ident :qudt/CartesianCoordinates,
   :dcterms/description
   "A set of  variables which fix a geometric object. If the coordinates are distances measured along perpendicular axes, they are known as Cartesian coordinates.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Cartesian Coordinate Type",
   :rdfs/subClassOf :qudt/Coordinates})

(def ^{:private true} CartesianCoordinatesType
  "A set of variables which fix a geometric object. If the coordinates are distances measured along perpendicular axes, they are known as Cartesian coordinates."
  {:db/ident :qudt/CartesianCoordinatesType,
   :dcterms/description
   "A set of  variables which fix a geometric object. If the coordinates are distances measured along perpendicular axes, they are known as Cartesian coordinates.",
   :rdf/type :owl/Class,
   :rdfs/label "Cartesian Coordinate Type",
   :rdfs/subClassOf :qudt/CompositeDatatype})

(def ^{:private true} CharEncoding
  "Char Encoding"
  {:db/ident         :qudt/CharEncoding,
   :dc11/description "7 bits of 1 octet",
   :qudt/bytes       1,
   :rdf/type         [:qudt/CharEncodingType :qudt/BooleanEncodingType],
   :rdfs/label       "Char Encoding"})

(def ^{:private true} CharEncodingType
  "The class of all character encoding schemes, each of which defines a rule or algorithm for encoding character data as a sequence of bits or bytes."
  {:db/ident :qudt/CharEncodingType,
   :dcterms/description
   "The class of all character encoding schemes, each of which defines a rule or algorithm for encoding character data as a sequence of bits or bytes.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Char Encoding Type",
   :rdfs/subClassOf :qudt/Encoding})

(def ^{:private true} CharacterType
  "A Character Type is a data type that defines the type and encoding of single characters."
  {:db/ident :qudt/CharacterType,
   :dcterms/description
   "A Character Type is a data type that defines the type and encoding of single characters.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Character Type",
   :rdfs/subClassOf :qudt/OrdinalType})

(def ^{:private true} Collection
  "A collection is a grouping of some variable number of zero or more data items that need to be operated upon together in some controlled fashion. Generally, the data items will all share the same data type or are derived from some common ancestor data type."
  {:db/ident :qudt/Collection,
   :dcterms/description
   "A collection is a grouping of some variable number of zero or more data items that need to be operated upon together in some controlled fashion. Generally, the data items will all share the same data type or are derived from some common ancestor data type.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Collection Type",
   :rdfs/subClassOf :qudt/AbstractDatatype})

(def ^{:private true} CollectionType
  "A collection is a grouping of some variable number of zero or more data items that need to be operated upon together in some controlled fashion. Generally, the data items will all share the same data type or are derived from some common ancestor data type."
  {:db/ident :qudt/CollectionType,
   :dcterms/description
   "A collection is a grouping of some variable number of zero or more data items that need to be operated upon together in some controlled fashion. Generally, the data items will all share the same data type or are derived from some common ancestor data type.",
   :rdf/type :owl/Class,
   :rdfs/label "Collection Type",
   :rdfs/subClassOf :qudt/AbstractDatatype})

(def ^{:private true} ColorCue
  "A visual cue that uses color to distinguish it from other cues. Each color cue has exactly one corresponding coordinate point in the RGB space."
  {:db/ident :qudt/ColorCue,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A visual cue that uses color to distinguish it from other cues. Each color cue has exactly one corresponding coordinate point in the RGB space.",
   :rdfs/label "Color Cue",
   :rdfs/subClassOf :qudt/VisualCue,
   :sh/property :qudt/ColorCue-rgbCode})

(def ^{:private true} ColorCue-rgbCode
  {:db/ident    :qudt/ColorCue-rgbCode,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/rgbCode})

(def ^{:private true} CompositeDataStructure
  "'Composite Data Structure', also referred to as 'Data Record' is a datatype that aggregates element of possibly different types. The aggregated items are called fields or members and are usually identified or indexed by field labels."
  {:db/ident :qudt/CompositeDataStructure,
   :prov/wasInfluencedBy
   ["https://en.wikipedia.org/wiki/Record_(computer_science)"
    "https://en.wikipedia.org/wiki/List_of_data_structures"],
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "'Composite Data Structure', also referred to as 'Data Record' is a datatype that aggregates element of possibly different types. The aggregated items are called fields or members and are usually identified or indexed by field labels.",
   :rdfs/label "Composite Data Structure",
   :rdfs/subClassOf :qudt/CompositeDatatype,
   :sh/property :qudt/CompositeDataStructure-dataElement})

(def ^{:private true} CompositeDataStructure-dataElement
  {:db/ident :qudt/CompositeDataStructure-dataElement,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/DataSetElement,
   :sh/path  :qudt/field})

(def ^{:private true} CompositeDatatype
  "Composite types are datatypes which can be constructed in a programming language out of that language's basic primitive types and other composite types. The act of constructing a composite type is known as composition."
  {:db/ident :qudt/CompositeDatatype,
   :dcterms/description
   "Composite types are datatypes which can be constructed in a programming language out of that language's basic primitive types and other composite types. The act of constructing a composite type is known as composition.",
   :prov/wasInfluencedBy
   "https://en.wikipedia.org/wiki/List_of_data_structures",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Composite Data Type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/TypeList,
                      :owl/onProperty    :qudt/elementTypeList,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/AlignmentType,
                      :owl/onProperty    :qudt/alignment,
                      :rdf/type          :owl/Restriction}
                     :qudt/StructuredDatatype
                     {:owl/allValuesFrom :qudt/PaddingType,
                      :owl/onProperty    :qudt/padding,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/padding,
                      :rdf/type           :owl/Restriction}],
   :sh/property [:qudt/CompositeDatatype-alignment
                 :qudt/CompositeDatatype-padding
                 :qudt/CompositeDatatype-elementType]})

(def ^{:private true} CompositeDatatype-alignment
  {:db/ident :qudt/CompositeDatatype-alignment,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/AlignmentType,
   :sh/path  :qudt/alignment})

(def ^{:private true} CompositeDatatype-elementType
  {:db/ident :qudt/CompositeDatatype-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/Datatype,
   :sh/path  :qudt/elementType})

(def ^{:private true} CompositeDatatype-padding
  {:db/ident    :qudt/CompositeDatatype-padding,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/PaddingType,
   :sh/maxCount 1,
   :sh/path     :qudt/padding})

(def ^{:private true} CompositeTable
  "A sub-type of 'Table Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/CompositeTable,
   :dcterms/description
   "A sub-type of 'Table Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Composite Table Type",
   :rdfs/subClassOf :qudt/Table})

(def ^{:private true} CompositionFunction
  "Composition function"
  {:db/ident        :qudt/CompositionFunction,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Composition function",
   :rdfs/subClassOf :qudt/Function})

(def ^{:private true} CompositionTreeType
  {:db/ident        :qudt/CompositionTreeType,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/subClassOf :qudt/TreeType,
   :sh/property     :qudt/CompositionTreeType-compositionFunction})

(def ^{:private true} CompositionTreeType-compositionFunction
  {:db/ident    :qudt/CompositionTreeType-compositionFunction,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/CompositionFunction,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/function})

(def ^{:private true} Concept
  "QUDT Concept"
  {:db/ident        :qudt/Concept,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "QUDT Concept",
   :rdfs/subClassOf :owl/Thing})

(def ^{:private true} Conference
  "Pub techreport type"
  {:db/ident      :qudt/Conference,
   :dtype/literal "conference",
   :rdf/type      :qudt/PubEnumeratedType,
   :rdfs/label    "Pub techreport type"})

(def ^{:private true} Container
  "A container is a class, a data structure, or an abstract data type (ADT) whose instances are collections of other objects. They are used to store objects in an organized way following specific access rules."
  {:db/ident :qudt/Container,
   :dcterms/description
   "A container is a class, a data structure, or an abstract data type (ADT) whose instances are collections of other objects. They are used to store objects in an organized way following specific access rules.",
   :owl/equivalentClass [:qudt/Collection :qudt/CollectionType],
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Container",
   :rdfs/subClassOf [:qudt/AbstractDatatype
                     {:owl/hasValue   {:xsd/long 1},
                      :owl/onProperty :qudt/elementTypeCount,
                      :rdf/type       :owl/Restriction}],
   :sh/property :qudt/Container-elementTypeCount})

(def ^{:private true} Container-elementTypeCount
  {:db/ident    :qudt/Container-elementTypeCount,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/hasValue 1,
   :sh/path     :qudt/elementTypeCount})

(def ^{:private true} CoordinateCenterType
  "An enumeration of coordinate centers for coordinate systems, such as \"Earth centered\", \"Mars centered\", \"Moon centered\", \"Sun centered\", and \"Vehicle centered\"."
  {:db/ident :qudt/CoordinateCenterType,
   :dcterms/description
   "An enumeration of coordinate centers for coordinate systems, such as \"Earth centered\", \"Mars centered\", \"Moon centered\", \"Sun centered\",  and \"Vehicle centered\".",
   :owl/oneOf [:qudt.type/CC_MarsCentered
               :qudt.type/CC_EarthCentered
               :qudt.type/CC_MoonCentered
               :qudt.type/CC_VehicleCentered
               :qudt.type/CC_SunCentered],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Coordinate Center Type",
   :rdfs/subClassOf [:qudt/NominalScale :qudt/EnumeratedValue],
   :skos/prefLabel ["Coordinate center" "Coordinate center type"]})

(def ^{:private true} CoordinateMember
  "A Coordinate Member Type is a data type that defines the properties of a coordinate in a coordinate system."
  {:db/ident :qudt/CoordinateMember,
   :dcterms/description
   "A Coordinate Member Type is a data type that defines the properties of a coordinate in a coordinate system.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Coordinate Member Type",
   :rdfs/subClassOf [:qudt/TupleMemberType :qudt/TupleMember]})

(def ^{:private true} CoordinateSystem
  "In geometry, a coordinate system is a system which uses one or more numbers, or coordinates, to uniquely determine the position of a point or other geometric element on a manifold such as Euclidean space. The order of the coordinates is significant and they are sometimes identified by their position in an ordered tuple and sometimes by a letter, as in 'the x-coordinate'. In elementary mathematics the coordinates are taken to be real numbers, but may be complex numbers or elements of a more abstract system such as a commutative ring. The use of a coordinate system allows problems in geometry to be translated into problems about numbers and vice versa; this is the basis of analytic geometry. In astronomy, a celestial coordinate system is a system for specifying positions of celestial objects: satellites, planets, stars, galaxies, and so on. Coordinate systems can specify a position in 3-dimensional space, or merely the direction of the object on the celestial sphere, if its distance is not known or not important. The coordinate systems are implemented in either spherical coordinates or rectangular coordinates. Spherical coordinates, projected on the celestial sphere, are analogous to the geographic coordinate system used on the surface of the Earth. These differ in their choice of fundamental plane, which divides the celestial sphere into two equal hemispheres along a great circle. Rectangular coordinates, in appropriate units, are simply the cartesian equivalent of the spherical coordinates, with the same fundamental (x,y) plane and primary (x-axis) direction. Each coordinate system is named for its choice of fundamental plane."
  {:db/ident :qudt/CoordinateSystem,
   :dcterms/description
   "In geometry, a coordinate system is a system which uses one or more numbers, or coordinates, to uniquely determine the position of a point or other geometric element on a manifold such as Euclidean space. The order of the coordinates is significant and they are sometimes identified by their position in an ordered tuple and sometimes by a letter, as in 'the x-coordinate'. \n\n\n\nIn elementary mathematics the coordinates are taken to be real numbers, but may be complex numbers or elements of a more abstract system such as a commutative ring. The use of a coordinate system allows problems in geometry to be translated into problems about numbers and vice versa; this is the basis of analytic geometry. \n\n\n\nIn astronomy, a celestial coordinate system is a system for specifying positions of celestial objects: satellites, planets, stars, galaxies, and so on. Coordinate systems can specify a position in 3-dimensional space, or merely the direction of the object on the celestial sphere, if its distance is not known or not important.\n\n\n\nThe coordinate systems are implemented in either spherical coordinates or rectangular coordinates. Spherical coordinates, projected on the celestial sphere, are analogous to the geographic coordinate system used on the surface of the Earth. These differ in their choice of fundamental plane, which divides the celestial sphere into two equal hemispheres along a great circle. Rectangular coordinates, in appropriate units, are simply the cartesian equivalent of the spherical coordinates, with the same fundamental (x,y) plane and primary (x-axis) direction. Each coordinate system is named for its choice of fundamental plane.",
   :owl/sameAs :dbr/Coordinate_system,
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Coordinate system",
   :rdfs/seeAlso
   ["http://mathworld.wolfram.com/CoordinateSystem.html"
    "http://mathworld.wolfram.com/Coordinates.html"
    "http://en.wikipedia.org/wiki/Coordinate_system"
    "http://en.wikipedia.org/wiki/Astronomical_coordinate_systems"],
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/ReferenceFrame,
                      :owl/onProperty    :qudt/referenceFrame,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/acronym,
                      :rdf/type           :owl/Restriction}
                     :skos/Concept
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/referenceFrame,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/coordinateCenter,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/abbreviation,
                      :rdf/type        :owl/Restriction}
                     :qudt/Concept],
   :sh/property [:qudt/CoordinateSystem-coordinateCenter
                 :qudt/CoordinateSystem-referenceFrame
                 :qudt/CoordinateSystem-acronym
                 :qudt/CoordinateSystem-abbreviation]})

(def ^{:private true} CoordinateSystem-abbreviation
  {:db/ident    :qudt/CoordinateSystem-abbreviation,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/abbreviation})

(def ^{:private true} CoordinateSystem-acronym
  {:db/ident    :qudt/CoordinateSystem-acronym,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :vaem/acronym})

(def ^{:private true} CoordinateSystem-coordinateCenter
  {:db/ident    :qudt/CoordinateSystem-coordinateCenter,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/CoordinateCenterType,
   :sh/maxCount 1,
   :sh/path     :qudt/coordinateCenter})

(def ^{:private true} CoordinateSystem-referenceFrame
  {:db/ident    :qudt/CoordinateSystem-referenceFrame,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/ReferenceFrame,
   :sh/maxCount 1,
   :sh/path     :qudt/referenceFrame})

(def ^{:private true} CoordinateSystemFrame
  "Coordinate system frame"
  {:db/ident         :qudt/CoordinateSystemFrame,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Coordinate system frame",
   :rdfs/subClassOf  :skos/Concept})

(def ^{:private true} CoordinateSystemType
  "The primary attributes of any coordinate system are the coordinate frame or orientation of the axes of the coordinate system and the coordinate center or origin of the coordinate system. The coordinate center is the easier of the two attributes to define and in trajectory-related coordinate systems is often taken to be the center of mass of natural solar system bodies such as the Earth, the Moon, or Mars. Precise definition of the coordinate frame, however, usually takes much more effort. As a result, the primary purpose of this section is to provide a detailed description of a number of different coordinate frames commonly used in lunar and Mars mission analysis. All of the coordinate frames described in this section are standard, right-handed coordinate frames with orthogonal axes at the origin. In general, the coordinate frame and the coordinate center are independent quantities. In other words, multiple coordinate systems can be defined using the same coordinate center (with different frames) or the same coordinate frame (with different centers)."
  {:db/ident :qudt/CoordinateSystemType,
   :dcterms/description
   "The primary attributes of any coordinate system are the coordinate frame or orientation of the axes of the coordinate system and the coordinate center or origin of the coordinate system. The coordinate center is the easier of the two attributes to define and in trajectory-related coordinate systems is often taken to be the center of mass of natural solar system bodies such as the Earth, the Moon, or Mars. Precise definition of the coordinate frame, however, usually takes much more effort. As a result, the primary purpose of this section is to provide a detailed description of a number of different coordinate frames commonly used in lunar and Mars mission analysis. All of the coordinate frames described in this section are standard, right-handed coordinate frames with orthogonal axes at the origin. In general, the coordinate frame and the coordinate center are independent quantities. In other words, multiple coordinate systems can be defined using the same coordinate center (with different frames) or the same coordinate frame (with different centers). ",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/comment
   "<p>A coordinate system is a mathematical structure for assigning a unique n-tuple of numbers or scalars to each point in an n-dimensional space. A Coordinate System Type is a data type that defines the properties of data structures that represent coordinate systems.</p>\n\n<p>The primary attributes of any coordinate system are the coordinate frame or orientation of the axes of the coordinate system and the coordinate center or origin of the coordinate system. The coordinate center is the easier of the two attributes to define and in trajectory-related coordinate systems is often taken to be the center of mass of natural solar system bodies such as the Earth, the Moon, or Mars. Precise definition of the coordinate frame, however, usually takes much more effort. As a result, the primary purpose of this section is to provide a detailed description of a number of different coordinate frames commonly used in lunar and Mars mission analysis. </p>",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label ["Coordinate System Type" "Coordinate system type"],
   :rdfs/subClassOf [:qudt/TupleType
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/originDefinition,
                      :rdf/type        :owl/Restriction}
                     :qudt/EnumeratedValue],
   :sh/property [:qudt/Coordinates-elementType
                 :qudt/CoordinateSystemType-originDefinition]})

(def ^{:private true} CoordinateSystemType-originDefinition
  {:db/ident    :qudt/CoordinateSystemType-originDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/originDefinition})

(def ^{:private true} Coordinates
  "A coordinate system is a mathematical structure for assigning a unique n-tuple of numbers or scalars to each point in an n-dimensional space. A Coordinate System Type is a data type that defines the properties of data structures that represent coordinate systems."
  {:db/ident :qudt/Coordinates,
   :dcterms/description
   "A coordinate system is a mathematical structure for assigning a unique n-tuple of numbers or scalars to each point in an n-dimensional space. A Coordinate System Type is a data type that defines the properties of data structures that represent coordinate systems.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Coordinate System Type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/CoordinateMember,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt/Tuple]})

(def ^{:private true} Coordinates-2D
  "A 2D coordinate system is a system for assigning a two-tuple of numbers or scalars to each point in an 2-dimensional space. A 2D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 2D coordinate system."
  {:db/ident :qudt/Coordinates-2D,
   :dcterms/description
   "A 2D coordinate system is a system for assigning a two-tuple of numbers or scalars to each point in an 2-dimensional space. A 2D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 2D coordinate system.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "2D Coordinate Type",
   :rdfs/subClassOf [:qudt/Two-Tuple :qudt/CartesianCoordinates]})

(def ^{:private true} Coordinates-2D-DoublePrecision
  "2D coordinates in double floating point precision for locating a point in physical space"
  {:db/ident :qudt/Coordinates-2D-DoublePrecision,
   :dcterms/description
   "2D coordinates in double floating point precision for locating a point in physical space",
   :qudt/elementTypeCount 2,
   :rdf/type [:owl/Class :qudt/Coordinates-2D-Type],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Coordinates-2D-Double precision",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  "http://qudt.org/schema/type#Double_X",
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :xsd/double,
                      :owl/onProperty    "http://qudt.org/schema/type#Double_Y",
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  "http://qudt.org/schema/type#Double_Y",
                      :rdf/type        :owl/Restriction}
                     :qudt/Coordinates-2D
                     {:owl/allValuesFrom :xsd/double,
                      :owl/onProperty    "http://qudt.org/schema/type#Double_X",
                      :rdf/type          :owl/Restriction}]})

(def ^{:private true} Coordinates-2D-DoublePrecision-Double_X
  {:db/ident    :qudt/Coordinates-2D-DoublePrecision-Double_X,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/Double_X})

(def ^{:private true} Coordinates-2D-DoublePrecision-Double_Y
  {:db/ident    :qudt/Coordinates-2D-DoublePrecision-Double_Y,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/Double_Y})

(def ^{:private true} Coordinates-2D-SinglePrecision
  "2D coordinates in single floating point precision for locating a point in physical space"
  {:db/ident :qudt/Coordinates-2D-SinglePrecision,
   :dcterms/description
   "2D coordinates in single floating point precision for locating a point in physical space",
   :qudt/elementTypeCount 2,
   :rdf/type [:owl/Class :qudt/Coordinates-2D-Type],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Cartesian Coordinates 2D Single Precision",
   :rdfs/subClassOf [{:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt/float_X,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt/float_Y,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/float_Y,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/float_X,
                      :rdf/type        :owl/Restriction}
                     :qudt/Coordinates-2D]})

(def ^{:private true} Coordinates-2D-SinglePrecision-float_X
  {:db/ident    :qudt/Coordinates-2D-SinglePrecision-float_X,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/float,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/float_X})

(def ^{:private true} Coordinates-2D-SinglePrecision-float_Y
  {:db/ident    :qudt/Coordinates-2D-SinglePrecision-float_Y,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/float,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/float_Y})

(def ^{:private true} Coordinates-2D-Type
  "A 2D coordinate system is a system for assigning a two-tuple of numbers or scalars to each point in an 2-dimensional space. A 2D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 2D coordinate system."
  {:db/ident :qudt/Coordinates-2D-Type,
   :dcterms/description
   "A 2D coordinate system is a system for assigning a two-tuple of numbers or scalars to each point in an 2-dimensional space. A 2D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 2D coordinate system.",
   :rdf/type :owl/Class,
   :rdfs/label "2D Coordinate Type",
   :rdfs/subClassOf [:qudt/TwoTupleType :qudt/CartesianCoordinatesType]})

(def ^{:private true} Coordinates-3D
  "A 3D coordinate system is a system for assigning a three-tuple of numbers or scalars to each point in an 3-dimensional space. A 3D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 3D coordinate system."
  {:db/ident :qudt/Coordinates-3D,
   :dcterms/description
   "A 3D coordinate system is a system for assigning a three-tuple of numbers or scalars to each point in an 3-dimensional space. A 3D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 3D coordinate system.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "3D Coordinate Type",
   :rdfs/subClassOf [:qudt/Three-Tuple :qudt/CartesianCoordinates]})

(def ^{:private true} Coordinates-3D-DoublePrecision
  "3D coordinates in double floating point precision for locating a point in physical space"
  {:db/ident :qudt/Coordinates-3D-DoublePrecision,
   :dcterms/description
   "3D coordinates in double floating point precision for locating a point in physical space",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "3D Coordinates (Double Precision)",
   :rdfs/subClassOf [{:owl/allValuesFrom :xsd/double,
                      :owl/onProperty    "http://qudt.org/schema/type#Double_Y",
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/double,
                      :owl/onProperty    "http://qudt.org/schema/type#Double_Z",
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  "http://qudt.org/schema/type#Double_Y",
                      :rdf/type        :owl/Restriction}
                     :qudt/Coordinates-3D
                     {:owl/cardinality 1,
                      :owl/onProperty  "http://qudt.org/schema/type#Double_X",
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  "http://qudt.org/schema/type#Double_Z",
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :xsd/double,
                      :owl/onProperty    "http://qudt.org/schema/type#Double_X",
                      :rdf/type          :owl/Restriction}]})

(def ^{:private true} Coordinates-3D-DoublePrecision-Double_X
  {:db/ident    :qudt/Coordinates-3D-DoublePrecision-Double_X,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/Double_X})

(def ^{:private true} Coordinates-3D-DoublePrecision-Double_Y
  {:db/ident    :qudt/Coordinates-3D-DoublePrecision-Double_Y,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/Double_Y})

(def ^{:private true} Coordinates-3D-DoublePrecision-Double_Z
  {:db/ident    :qudt/Coordinates-3D-DoublePrecision-Double_Z,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/Double_Z})

(def ^{:private true} Coordinates-3D-DoublePrecision-Type
  "3D coordinates in double floating point precision for locating a point in physical space"
  {:db/ident   :qudt/Coordinates-3D-DoublePrecision-Type,
   :dcterms/description
   "3D coordinates in double floating point precision for locating a point in physical space",
   :qudt/elementTypeCount 3,
   :rdf/type   :qudt/Coordinates-3D-Type,
   :rdfs/label "3D Coordinates (Double Precision) type"})

(def ^{:private true} Coordinates-3D-SinglePrecision
  "3D coordinates in single floating point precision for locating a point in physical space"
  {:db/ident :qudt/Coordinates-3D-SinglePrecision,
   :dcterms/description
   "3D coordinates in single floating point precision for locating a point in physical space",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "3D Coordinates (Single Precision)",
   :rdfs/subClassOf [{:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt/float_Y,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt/float_Z,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/float_Y,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/float_X,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :xsd/float,
                      :owl/onProperty    :qudt/float_X,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/float_Z,
                      :rdf/type        :owl/Restriction}
                     :qudt/Coordinates-3D]})

(def ^{:private true} Coordinates-3D-SinglePrecision-Type
  "3D coordinates in single floating point precision for locating a point in physical space"
  {:db/ident   :qudt/Coordinates-3D-SinglePrecision-Type,
   :dcterms/description
   "3D coordinates in single floating point precision for locating a point in physical space",
   :qudt/elementTypeCount 3,
   :rdf/type   :qudt/Coordinates-3D-Type,
   :rdfs/label "3D Coordinates (Single Precision)"})

(def ^{:private true} Coordinates-3D-SinglePrecision-float_X
  {:db/ident    :qudt/Coordinates-3D-SinglePrecision-float_X,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/float,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/float_X})

(def ^{:private true} Coordinates-3D-SinglePrecision-float_Y
  {:db/ident    :qudt/Coordinates-3D-SinglePrecision-float_Y,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/float,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/float_Y})

(def ^{:private true} Coordinates-3D-SinglePrecision-float_Z
  {:db/ident    :qudt/Coordinates-3D-SinglePrecision-float_Z,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/float,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/float_Z})

(def ^{:private true} Coordinates-3D-Type
  "A 3D coordinate system is a system for assigning a three-tuple of numbers or scalars to each point in an 3-dimensional space. A 3D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 3D coordinate system."
  {:db/ident :qudt/Coordinates-3D-Type,
   :dcterms/description
   "A 3D coordinate system is a system for assigning a three-tuple of numbers or scalars to each point in an 3-dimensional space. A 3D Coordinate Type is a data type that defines the data type for each coordinate (tuple member) in a 3D coordinate system.",
   :rdf/type :owl/Class,
   :rdfs/label "3D Coordinate Type",
   :rdfs/subClassOf [:qudt/ThreeTupleType :qudt/CartesianCoordinatesType]})

(def ^{:private true} Coordinates-elementType
  {:db/ident :qudt/Coordinates-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/CoordinateMember,
   :sh/path  :qudt/elementType})

(def ^{:private true} DATE
  "Provides the date expressed in year, month and day."
  {:db/ident          :qudt/DATE,
   :dcterms/description "Provides the date expressed in year, month and day.",
   :dtype/literal     "date",
   :qudt/dimensionality 1,
   :qudt/encodingDescription
   "YYYY:MM:DD, where YYYY is a 4 digit year, MM is a 2 digit month and DD is a 2 digit day.",
   :qudt/rdfsDatatype :xsd/date,
   :rdf/type          :qudt/DateStringType,
   :rdfs/label        "Date"})

(def ^{:private true} DATETIME
  "A time stamp encoded as a string 'YYYY-MM-DDThh:mm:ss[.dd]' or 'YYYY-DDDThh:mm:ss[.dd]', where 'YYYY' is the year, 'MM' is the two-digit month, 'DD' is the two-digit day, 'DDD' is the three digit day of year, 'T' is constant, 'hh:mm:ss[.dd]' is the UTC time in hours, minutes, seconds, and optional fractional seconds. As many 'd' characters to the right of the period as required may be used to obtain the required precision. All fields require leading zeros."
  {:db/ident :qudt/DATETIME,
   :dcterms/description
   "A time stamp encoded as a string 'YYYY-MM-DDThh:mm:ss[.dd]' or 'YYYY-DDDThh:mm:ss[.dd]', where 'YYYY' is the year, 'MM' is the two-digit month, 'DD' is the two-digit day, 'DDD' is the three digit day of year, 'T' is constant, 'hh:mm:ss[.dd]' is the UTC time in hours, minutes, seconds, and optional fractional seconds. As many 'd' characters to the right of the period as required may be used to obtain the required precision. All fields require leading zeros.",
   :dtype/literal "datetime",
   :owl/sameAs :qudt/UTC-DATETIME,
   :qudt/dimensionality 1,
   :qudt/rdfsDatatype :xsd/dateTime,
   :rdf/type :qudt/DateStringType,
   :rdfs/label "Date Time"})

(def ^{:private true} DECIMAL
  "Decimal"
  {:db/ident           :qudt/DECIMAL,
   :dtype/literal      "numeric",
   :qudt/ansiSQLName   "DECIMAL(p,s)",
   :qudt/odbcName      "SQL_DECIMAL(p,s)",
   :qudt/oracleSQLName "NUMBER(p,s)",
   :qudt/rdfsDatatype  :xsd/decimal,
   :rdf/type           :qudt/NumericType,
   :rdfs/label         "Decimal"})

(def ^{:private true} DataElement-type
  {:db/ident    :qudt/DataElement-type,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Datatype,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/dataType})

(def ^{:private true} DataSetElement
  "A field is a tuple that carries a name, a type and optionally other properties that characterize a member element of a composite data strucuture."
  {:db/ident :qudt/DataSetElement,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A field is a tuple that carries a name, a type and optionally other properties that characterize a member element of a composite data strucuture.",
   :rdfs/label "QUDT DataSet Element",
   :rdfs/subClassOf [:qudt/Tuple :qudt/DataElement],
   :sh/property [:qudt/DataSetElement-quantityKind
                 :qudt/DataSetElement-optional
                 :qudt/DataSetElement-elementLabel]})

(def ^{:private true} DataSetElement-elementLabel
  {:db/ident    :qudt/DataSetElement-elementLabel,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/elementLabel})

(def ^{:private true} DataSetElement-optional
  {:db/ident    :qudt/DataSetElement-optional,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/boolean,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/optional})

(def ^{:private true} DataSetElement-quantityKind
  {:db/ident    :qudt/DataSetElement-quantityKind,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/QuantityKind,
   :sh/maxCount 1,
   :sh/path     :qudt/hasQuantityKind})

(def ^{:private true} Datatype-ansiSQLName
  {:db/ident    :qudt/Datatype-ansiSQLName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/ansiSQLName})

(def ^{:private true} Datatype-basis
  {:db/ident    :qudt/Datatype-basis,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Datatype,
   :sh/maxCount 1,
   :sh/path     :qudt/basis})

(def ^{:private true} Datatype-bounded
  {:db/ident    :qudt/Datatype-bounded,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :xsd/boolean,
   :sh/maxCount 1,
   :sh/path     :qudt/bounded})

(def ^{:private true} Datatype-cName
  {:db/ident    :qudt/Datatype-cName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/cName})

(def ^{:private true} Datatype-cardinality
  {:db/ident    :qudt/Datatype-cardinality,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/CardinalityType,
   :sh/maxCount 1,
   :sh/path     :qudt/cardinality})

(def ^{:private true} Datatype-description
  {:db/ident       :qudt/Datatype-description,
   :rdf/type       :sh/PropertyShape,
   :sh/deactivated true,
   :sh/maxCount    1,
   :sh/path        :vaem/description})

(def ^{:private true} Datatype-id
  {:db/ident       :qudt/Datatype-id,
   :rdf/type       :sh/PropertyShape,
   :sh/datatype    :xsd/string,
   :sh/deactivated true,
   :sh/path        :qudt/id})

(def ^{:private true} Datatype-javaName
  {:db/ident    :qudt/Datatype-javaName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/javaName})

(def ^{:private true} Datatype-jsName
  {:db/ident    :qudt/Datatype-jsName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/jsName})

(def ^{:private true} Datatype-matlabName
  {:db/ident    :qudt/Datatype-matlabName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/matlabName})

(def ^{:private true} Datatype-microsoftSQLServerName
  {:db/ident    :qudt/Datatype-microsoftSQLServerName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/microsoftSQLServerName})

(def ^{:private true} Datatype-mySQLName
  {:db/ident    :qudt/Datatype-mySQLName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/mySQLName})

(def ^{:private true} Datatype-odbcName
  {:db/ident    :qudt/Datatype-odbcName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/odbcName})

(def ^{:private true} Datatype-oleDBName
  {:db/ident    :qudt/Datatype-oleDBName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/oleDBName})

(def ^{:private true} Datatype-oracleSQLName
  {:db/ident    :qudt/Datatype-oracleSQLName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/oracleSQLName})

(def ^{:private true} Datatype-protocolBuffersName
  {:db/ident    :qudt/Datatype-protocolBuffersName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/protocolBuffersName})

(def ^{:private true} Datatype-pythonName
  {:db/ident    :qudt/Datatype-pythonName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/pythonName})

(def ^{:private true} Datatype-vbName
  {:db/ident    :qudt/Datatype-vbName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/minCount 0,
   :sh/path     :qudt/vbName})

(def ^{:private true} DateStringType
  "Date String Types are scalar data types that define the properties of strings that represent calendar dates."
  {:db/ident :qudt/DateStringType,
   :dcterms/description
   "Date String Types are scalar data types that define the properties of strings that represent calendar dates.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Date String Type",
   :rdfs/subClassOf :qudt/DateTimeStringType})

(def ^{:private true} DateTimeStringEncodingType
  "Date Time encodings are logical encodings for expressing date/time quantities as strings by applying unambiguous formatting and parsing rules."
  {:db/ident :qudt/DateTimeStringEncodingType,
   :dcterms/description
   "Date Time encodings are logical encodings for expressing date/time quantities as strings by applying unambiguous formatting and parsing rules.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Date Time String Encoding Type",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 1,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :qudt/allowedPattern,
                      :rdf/type        :owl/Restriction}
                     :qudt/StringEncodingType],
   :sh/property [{:sh/path :qudt/allowedPattern,
                  :sh/qualifiedMinCount 1,
                  :sh/qualifiedValueShape {:sh/datatype :xsd/string}}
                 :qudt/DateTimeStringEncodingType-allowedPattern]})

(def ^{:private true} DateTimeStringEncodingType-allowedPattern
  {:db/ident    :qudt/DateTimeStringEncodingType-allowedPattern,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :qudt/allowedPattern})

(def ^{:private true} DateTimeStringType
  "A class of data types for structures that represent temporal quantities. I.e. calendar dates, times, duration of time since a given epoch, etc."
  {:db/ident :qudt/DateTimeStringType,
   :dcterms/description
   "A class of data types for structures that represent temporal quantities. I.e. calendar dates, times, duration of time since a given epoch, etc.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Temporal Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/encoding,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/DateTimeStringEncodingType,
                      :owl/onProperty    :qudt/encoding,
                      :rdf/type          :owl/Restriction}
                     :qudt/StringType],
   :sh/property :qudt/DateTimeStringType-encoding})

(def ^{:private true} DateTimeStringType-encoding
  {:db/ident    :qudt/DateTimeStringType-encoding,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/DateTimeStringEncodingType,
   :sh/maxCount 1,
   :sh/path     :qudt/encoding})

(def ^{:private true} DecimalScaledUnit
  "A sub-type of 'Scaled unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/DecimalScaledUnit,
   :dcterms/description
   "A sub-type of 'Scaled unit'. Detailed desciption to be provided in a future version."})

(def ^{:private true} DerivedCoherentUnit
  "A sub-type of 'Derived Unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/DerivedCoherentUnit,
   :dcterms/description
   "A sub-type of 'Derived Unit'. Detailed desciption to be provided in a future version."})

(def ^{:private true} DerivedNonCoherentUnit
  "A sub-type of 'Derived Unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/DerivedNonCoherentUnit,
   :dcterms/description
   "A sub-type of 'Derived Unit'. Detailed desciption to be provided in a future version."})

(def ^{:private true} Dictionary
  "A \"Map\"."
  {:db/ident            :qudt/Dictionary,
   :dcterms/description "A \"Map\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Dictionary Type",
   :rdfs/subClassOf     :qudt/Map})

(def ^{:private true} DictionaryType
  "A kind of \"Map\"."
  {:db/ident            :qudt/DictionaryType,
   :dcterms/description "A kind of \"Map\".",
   :rdf/type            :owl/Class,
   :rdfs/label          "Dictionary Type",
   :rdfs/subClassOf     :qudt/MapType})

(def ^{:private true} DimensionVector
  "Dimension Vector"
  {:db/ident         :qudt/DimensionVector,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Dimension Vector",
   :rdfs/subClassOf  :skos/Concept})

(def ^{:private true} DimensionalDatatype
  "A dimensional data type is a data type that specifies a physical quantity or unit of measure. Information about the physical dimensions of the quantities and units is embedded in their types."
  {:db/ident :qudt/DimensionalDatatype,
   :dcterms/description
   "A dimensional data type is a data type that specifies a physical quantity or unit of measure. Information about the physical dimensions of the quantities and units is embedded in their types.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Dimensional Data Type",
   :rdfs/subClassOf :qudt/StructuredDatatype})

(def ^{:private true} DiscreteState
  {:db/ident         :qudt/DiscreteState,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/subClassOf  :qudt/EnumeratedValue})

(def ^{:private true} DoublePrecisionEncoding
  "Single Precision Real Encoding"
  {:db/ident   :qudt/DoublePrecisionEncoding,
   :qudt/bytes 64,
   :rdf/type   :qudt/FloatingPointEncodingType,
   :rdfs/label "Single Precision Real Encoding"})

(def ^{:private true} DoublePrecisionType
  "A double precision data type specifies how a numeric value, such as an integer or real number, is stored in memory that occupies two words in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes, and so double precision data value on a 32-bit machine architecture occupies eight bytes of memory."
  {:db/ident :qudt/DoublePrecisionType,
   :dcterms/description
   "A double precision data type specifies how a numeric value, such as an integer or real number, is stored in memory that occupies two words in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes, and so double precision data value on a 32-bit machine architecture occupies eight bytes of memory.",
   :owl/disjointWith :qudt/SinglePrecisionType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Double Precision Type",
   :rdfs/subClassOf :qudt/NumericType})

(def ^{:private true} EarthCoordinateSystem
  "A\"Trajectory Coordinate System\" for all earth-centered coordinates, such as \"Earth mean equator and prime meridian coordinate system\", \"Earth true equator and prime meridian of epoch coordinate system\", \"International celestial reference system\", \"International terrestrial reference system\", \"Sun centered international celestial reference system\", \"Vehicle centered international celestial reference system\"."
  {:db/ident :qudt/EarthCoordinateSystem,
   :dcterms/description
   "A\"Trajectory Coordinate System\" for all earth-centered coordinates, such as \"Earth mean equator and prime meridian coordinate system\", \"Earth true equator and prime meridian of epoch coordinate system\", \"International celestial reference system\", \"International terrestrial reference system\", \"Sun centered international celestial reference system\", \"Vehicle centered international celestial reference system\".",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Earth Coordinate System Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/CC_EarthCentered,
                      :owl/onProperty :qudt/coordinateCenter,
                      :rdf/type       :owl/Restriction}
                     :qudt/TrajectoryCoordinateSystem],
   :sh/property :qudt/EarthCoordinateSystem-coordinateCenter})

(def ^{:private true} EarthCoordinateSystem-coordinateCenter
  {:db/ident    :qudt/EarthCoordinateSystem-coordinateCenter,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/CoordinateCenterType,
   :sh/hasValue :qudt.type/CC_EarthCentered,
   :sh/path     :qudt/coordinateCenter})

(def ^{:private true} Encoding
  "An encoding is a rule or algorithm that is used to convert data from a native, or unspecified form into a specific form that satisfies the encoding rules. Examples of encodings include character encodings, such as UTF-8."
  {:db/ident :qudt/Encoding,
   :dcterms/description
   "An encoding is a rule or algorithm that is used to convert data from a native, or unspecified form into a specific form that satisfies the encoding rules. Examples of encodings include character encodings, such as UTF-8.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Encoding",
   :rdfs/subClassOf [:skos/Concept
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/bytes,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/bits,
                      :rdf/type           :owl/Restriction}],
   :sh/property [:qudt/Encoding-bytes :qudt/Encoding-bits]})

(def ^{:private true} Encoding-bits
  {:db/ident    :qudt/Encoding-bits,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/bits})

(def ^{:private true} Encoding-bytes
  {:db/ident    :qudt/Encoding-bytes,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/bytes})

(def ^{:private true} EngineeringValueTupleMember
  "A sub-type of 'Tuple Member Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/EngineeringValueTupleMember,
   :dcterms/description
   "A sub-type of 'Tuple Member Type'. Detailed desciption to be provided in a future version.",
   :owl/disjointWith [:qudt/RawValueTupleMemberType :qudt/RawValueTupleMember],
   :owl/equivalentClass {:owl/intersectionOf
                         [:qudt/TupleMemberType
                          {:owl/allValuesFrom :qudt/RealSinglePrecisionType,
                           :owl/onProperty    :qudt/elementType,
                           :rdf/type          :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Engineering Value Tuple Member",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/RealSinglePrecisionType,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt/TupleMember
                     :qudt/TupleMemberType],
   :sh/property :qudt/EngineeringValueTupleMember-elementType})

(def ^{:private true} EngineeringValueTupleMember-elementType
  {:db/ident :qudt/EngineeringValueTupleMember-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/RealSinglePrecisionType,
   :sh/path  :qudt/elementType})

(def ^{:private true} Enumeration
  "QUDT Enumeration"
  {:db/ident :qudt/Enumeration,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "QUDT Enumeration",
   :rdfs/subClassOf
   [{:owl/allValuesFrom :qudt/EnumeratedValue,
     :owl/onProperty    :dtype/value,
     :rdf/type          :owl/Restriction}
    {:dcterms/description
     "The number of bits allocated to the field for encoding any tags associated with elements.",
     :owl/maxCardinality 1,
     :owl/onProperty :qudt/bits,
     :rdf/type :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     :qudt/encoding,
     :rdf/type           :owl/Restriction}
    :dtype/Enumeration
    :qudt/StructuredDatatype
    {:owl/allValuesFrom :qudt/EnumeratedValue,
     :owl/onProperty    :qudt/defaultValue,
     :rdf/type          :owl/Restriction}],
   :sh/property [:qudt/Enumeration-encoding
                 :qudt/Enumeration-bits
                 :qudt/Enumeration-defaultValue
                 :qudt/Enumeration-value]})

(def ^{:private true} Enumeration-bits
  {:db/ident    :qudt/Enumeration-bits,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/bits})

(def ^{:private true} Enumeration-defaultValue
  {:db/ident :qudt/Enumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/EnumeratedValue,
   :sh/path  :qudt/defaultValue})

(def ^{:private true} Enumeration-encoding
  {:db/ident    :qudt/Enumeration-encoding,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/encoding})

(def ^{:private true} Enumeration-value
  {:db/ident :qudt/Enumeration-value,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/EnumeratedValue,
   :sh/path  :dtype/value})

(def ^{:private true} EnumerationScale
  "A sub-type of 'Scale'. Detailed desciption to be provided in a future version. A sub-type of 'DTYPE Enumeration'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/EnumerationScale,
   :dcterms/description
   ["A sub-type of 'Scale'. Detailed desciption to be provided in a future version."
    "A sub-type of 'DTYPE Enumeration'. Detailed desciption to be provided in a future version."]})

(def ^{:private true} FALSE
  "False"
  {:db/ident         :qudt/FALSE,
   :dtype/literal    "false",
   :rdf/type         :qudt/BooleanTypeEnumeratedValue,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "False"})

(def ^{:private true} FLAG
  "FLAG"
  {:db/ident          :qudt/FLAG,
   :dtype/literal     "flag",
   :qudt/rdfsDatatype :xsd/boolean,
   :rdf/type          :qudt/BooleanType,
   :rdfs/label        "FLAG"})

(def ^{:private true} FT_INERTIAL
  "Inertial Frame Type"
  {:db/ident   :qudt/FT_INERTIAL,
   :rdf/type   :qudt/FrameType,
   :rdfs/label "Inertial Frame Type"})

(def ^{:private true} FT_NON-ROTATING
  "Non-rotating Frame Type"
  {:db/ident   :qudt/FT_NON-ROTATING,
   :rdf/type   :qudt/FrameType,
   :rdfs/label "Non-rotating Frame Type"})

(def ^{:private true} FT_ROTATING
  "Rotating Frame Type"
  {:db/ident   :qudt/FT_ROTATING,
   :rdf/type   :qudt/FrameType,
   :rdfs/label "Rotating Frame Type"})

(def ^{:private true} FieldType
  "A sub-type of 'Composite Data Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/FieldType,
   :dcterms/description
   "A sub-type of 'Composite Data Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Field Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/fieldName,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Datatype,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt/CompositeDatatype]})

(def ^{:private true} FieldType-elementName
  {:db/ident    :qudt/FieldType-elementName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/elementName})

(def ^{:private true} FieldType-elementType
  {:db/ident :qudt/FieldType-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/Datatype,
   :sh/path  :qudt/elementType})

(def ^{:private true} FieldType-fieldLabel
  {:db/ident    :qudt/FieldType-fieldLabel,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/fieldLabel})

(def ^{:private true} FieldType-fieldType
  {:db/ident    :qudt/FieldType-fieldType,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Datatype,
   :sh/minCount 1,
   :sh/path     :qudt/fieldType})

(def ^{:private true} FieldType-optional
  {:db/ident    :qudt/FieldType-optional,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/boolean,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/optional})

(def ^{:private true} Figure
  "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/Figure,
   :dcterms/description
   "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version."})

(def ^{:private true} FileFormat
  "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/FileFormat,
   :dcterms/description
   "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "File format",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ^{:private true} FixedIntervalTimeSeriesArray
  "A Fixed Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals."
  {:db/ident :qudt/FixedIntervalTimeSeriesArray,
   :dcterms/description
   "A Fixed Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Fixed Interval Time Series Array Type",
   :rdfs/subClassOf :qudt/TimeSeriesArray})

(def ^{:private true} FixedIntervalTimeSeriesArrayType
  "A Fixed Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals."
  {:db/ident :qudt/FixedIntervalTimeSeriesArrayType,
   :dcterms/description
   "A Fixed Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals.",
   :rdf/type :owl/Class,
   :rdfs/label "Fixed Interval Time Series Array Type",
   :rdfs/subClassOf :qudt/TimeSeriesArrayType})

(def ^{:private true} FloatingPointEncodingType
  "A \"Encoding\" with the following instance(s): \"Double Precision Encoding\", \"Single Precision Real Encoding\"."
  {:db/ident :qudt/FloatingPointEncodingType,
   :dcterms/description
   "A \"Encoding\" with the following instance(s): \"Double Precision Encoding\", \"Single Precision Real Encoding\".",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Floating Point Encoding",
   :rdfs/subClassOf :qudt/Encoding})

(def ^{:private true} FrameType
  "This class contains elements which specify the intertial type of a coordinate frame as either inertial, rotating, or non-rotating."
  {:db/ident :qudt/FrameType,
   :dcterms/description
   "This class contains elements which specify the intertial type of a coordinate frame as either inertial, rotating, or non-rotating.",
   :owl/oneOf [:qudt/FT_ROTATING :qudt/FT_NON-ROTATING :qudt/FT_INERTIAL],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Frame Type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ^{:private true} Function
  "Function"
  {:db/ident        :qudt/Function,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Function",
   :rdfs/subClassOf :qudt/Concept})

(def ^{:private true} FunctionDatatype
  "A function data type defines the inputs and outputs for a function or method. It includes at least the function name and the number of its parameters. In some programming languages, it may also specify the function's return type or the types of its arguments. [Wikipedia] A function data type defines the input and output data type for a function or method. It includes at least the function name and the number of its parameters. In some programming languages, it may also specify the function's return type or the types of its arguments."
  {:db/ident :qudt/FunctionDatatype,
   :dcterms/description
   ["A function data type defines the inputs and outputs for a function or method. It includes at least the function name and the number of its parameters. In some programming languages, it may also specify the function's return type or the types of its arguments. [Wikipedia]"
    "A function data type defines the input and output data type for a function or method. It includes at least the function name and the number of its parameters. In some programming languages, it may also specify the function's return type or the types of its arguments."],
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Function Data Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/returnType,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/functionArity,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Datatype,
                      :owl/onProperty    :qudt/returnType,
                      :rdf/type          :owl/Restriction}
                     :qudt/StructuredDatatype
                     {:owl/allValuesFrom :qudt/Datatype,
                      :owl/onProperty    :qudt/argType,
                      :rdf/type          :owl/Restriction}],
   :sh/property [:qudt/FunctionDatatype-returnType
                 :qudt/FunctionDatatype-functionArity
                 :qudt/FunctionDatatype-argType]})

(def ^{:private true} FunctionDatatype-argType
  {:db/ident :qudt/FunctionDatatype-argType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/Datatype,
   :sh/path  :qudt/argType})

(def ^{:private true} FunctionDatatype-functionArity
  {:db/ident    :qudt/FunctionDatatype-functionArity,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/functionArity})

(def ^{:private true} FunctionDatatype-returnType
  {:db/ident    :qudt/FunctionDatatype-returnType,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Datatype,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/returnType})

(def ^{:private true} Graph
  "A graph is a kind of abstract data type, that consists of a set of nodes (also called vertices) and a set of edges that establish relationships (connections) between the nodes. A Graph Type is a data type that defines the properties of data structures that represent graphs and their members (nodes and edges)."
  {:db/ident :qudt/Graph,
   :dcterms/description
   "A graph is a kind of abstract data type, that consists of a set of nodes (also called vertices) and a set of edges that establish relationships (connections) between the nodes. A Graph Type is a data type that defines the properties of data structures that represent graphs and their members (nodes and edges).",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Graph Type",
   :rdfs/subClassOf :qudt/Collection})

(def ^{:private true} GraphType
  "A graph is a kind of abstract data type, that consists of a set of nodes (also called vertices) and a set of edges that establish relationships (connections) between the nodes. A Graph Type is a data type that defines the properties of data structures that represent graphs and their members (nodes and edges)."
  {:db/ident :qudt/GraphType,
   :dcterms/description
   "A graph is a kind of abstract data type, that consists of a set of nodes (also called vertices) and a set of edges that establish relationships (connections) between the nodes. A Graph Type is a data type that defines the properties of data structures that represent graphs and their members (nodes and edges).",
   :rdf/type :owl/Class,
   :rdfs/label "Graph Type",
   :rdfs/subClassOf :qudt/CollectionType})

(def ^{:private true} GreekCharacter
  "A sub-type of 'Symbol'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/GreekCharacter,
   :dcterms/description
   "A sub-type of 'Symbol'. Detailed desciption to be provided in a future version."})

(def ^{:private true} GroundCoordinateSystem
  "A sub-type of 'Aerospace coordinate system'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/GroundCoordinateSystem,
   :dcterms/description
   "A sub-type of 'Aerospace coordinate system'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Ground coordinate system",
   :rdfs/subClassOf :qudt/AerospaceCoordinateSystem})

(def ^{:private true} HEAP
  "HEAP"
  {:db/ident   :qudt/HEAP,
   :rdf/type   :qudt/HeapType,
   :rdfs/label "HEAP"})

(def ^{:private true} HEXBINARY
  "HEXBINARY"
  {:db/ident            :qudt/HEXBINARY,
   :dtype/literal       "hexbinary",
   :qudt/dimensionality 1,
   :qudt/rdfsDatatype   :qudt/hexbinary,
   :rdf/type            :qudt/HexBinaryType,
   :rdfs/label          "HEXBINARY"})

(def ^{:private true} HashTable
  "A hash table is a kind of map that utilizes a hash function to perform efficient lookup: given a key (e.g., a person's name), find the corresponding value (e.g., that person's telephone number). Hash tables support the efficient lookup, insertion and deletion of elements in constant time on average. A Hash Table Type is a data type that defines the types of a hash table's key-value pairs."
  {:db/ident :qudt/HashTable,
   :dcterms/description
   "A hash table is a kind of map that utilizes a hash function to perform efficient lookup: given a key (e.g., a person's name), find the corresponding value (e.g., that person's telephone number). Hash tables support the efficient lookup, insertion and deletion of elements in constant time on average. A Hash Table Type is a data type that defines the types of a hash table's key-value pairs.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Hash Table Type",
   :rdfs/subClassOf [:qudt/TableType :qudt/Map]})

(def ^{:private true} HashTableType
  "A hash table is a kind of map that utilizes a hash function to perform efficient lookup: given a key (e.g., a person's name), find the corresponding value (e.g., that person's telephone number). Hash tables support the efficient lookup, insertion and deletion of elements in constant time on average. A Hash Table Type is a data type that defines the types of a hash table's key-value pairs."
  {:db/ident :qudt/HashTableType,
   :dcterms/description
   "A hash table is a kind of map that utilizes a hash function to perform efficient lookup: given a key (e.g., a person's name), find the corresponding value (e.g., that person's telephone number). Hash tables support the efficient lookup, insertion and deletion of elements in constant time on average. A Hash Table Type is a data type that defines the types of a hash table's key-value pairs.",
   :rdf/type :owl/Class,
   :rdfs/label "Hash Table Type",
   :rdfs/subClassOf :qudt/MapType})

(def ^{:private true} Heap
  "<p class=\"lm-para\">A heap is a specialized tree-based data structure that satisfies the condition: if B is a child node of A, then \\(key(A) \\ge key(B)\\). This implies that an element with the greatest key is always in the root node, and so such a heap is sometimes called a max heap. Alternatively, if the comparison is reversed, the smallest element is always in the root node, which results in a min heap. The function or method that implements the key() operator is specified by the heap type.</p>"
  {:db/ident :qudt/Heap,
   :dcterms/description
   "<p class=\"lm-para\">A heap is a specialized tree-based data structure that satisfies the condition: if B is a child node of A, then \\(key(A) \\ge key(B)\\). This implies that an element with the greatest key is always in the root node, and so such a heap is sometimes called a max heap. Alternatively, if the comparison is reversed, the smallest element is always in the root node, which results in a min heap. The function or method that implements the key() operator is specified by the heap type.</p>",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Heap_(data_structure)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Heap Type",
   :rdfs/subClassOf :qudt/OrderedTree})

(def ^{:private true} HeapType
  "A heap is a specialized tree-based data structure that satisfies the condition: if B is a child node of A, then <em>key(A) &gt; key(B)</em>. This implies that an element with the greatest key is always in the root node, and so such a heap is sometimes called a max heap. Alternatively, if the comparison is reversed, the smallest element is always in the root node, which results in a min heap. The function or method that implements the key() operator is specified by the heap type."
  {:db/ident :qudt/HeapType,
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Heap_(data_structure)",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A heap is a specialized tree-based data structure that satisfies the condition: if B is a child node of A, then <em>key(A) &gt; key(B)</em>. This implies that an element with the greatest key is always in the root node, and so such a heap is sometimes called a max heap. Alternatively, if the comparison is reversed, the smallest element is always in the root node, which results in a min heap. The function or method that implements the key() operator is specified by the heap type.",
   :rdfs/label "Heap Type",
   :rdfs/subClassOf :qudt/OrderedTreeType})

(def ^{:private true} HexBinaryType
  "A string composed of hex characters."
  {:db/ident            :qudt/HexBinaryType,
   :dcterms/description "A string composed of hex characters.",
   :rdf/type            [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Hexidecimal Binary Type",
   :rdfs/subClassOf     [{:owl/maxCardinality 1,
                          :owl/onProperty     :qudt/maxLength,
                          :rdf/type           :owl/Restriction}
                         {:owl/maxCardinality 1,
                          :owl/onProperty     :qudt/length,
                          :rdf/type           :owl/Restriction}
                         {:owl/maxCardinality 1,
                          :owl/onProperty     :qudt/pattern,
                          :rdf/type           :owl/Restriction}
                         :qudt/TextStringType
                         {:owl/maxCardinality 1,
                          :owl/onProperty     :qudt/minLength,
                          :rdf/type           :owl/Restriction}],
   :sh/property         [:qudt/HexBinaryType-length
                         :qudt/HexBinaryType-minLength
                         :qudt/HexBinaryType-maxLength
                         :qudt/HexBinaryType-pattern]})

(def ^{:private true} HexBinaryType-length
  {:db/ident    :qudt/HexBinaryType-length,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/length})

(def ^{:private true} HexBinaryType-maxLength
  {:db/ident    :qudt/HexBinaryType-maxLength,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/maxLength})

(def ^{:private true} HexBinaryType-minLength
  {:db/ident    :qudt/HexBinaryType-minLength,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/minLength})

(def ^{:private true} HexBinaryType-pattern
  {:db/ident    :qudt/HexBinaryType-pattern,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/pattern})

(def ^{:private true} HighToLow
  "High To Low"
  {:db/ident      :qudt/HighToLow,
   :dtype/literal "high",
   :rdf/type      :qudt/MemoryOrderType,
   :rdfs/label    "High To Low"})

(def ^{:private true} IEEE754_1985RealEncoding
  "IEEE 754 1985 Real Encoding"
  {:db/ident   :qudt/IEEE754_1985RealEncoding,
   :qudt/bytes 32,
   :rdf/type   :qudt/FloatingPointEncodingType,
   :rdfs/label "IEEE 754 1985 Real Encoding"})

(def ^{:private true} IERS-TN-32-2004
  "IERS Conventions (2003), D. D. McCarthy and Gérard Petit (eds.), IERS Technical Note No. 32, 2004; http://www.iers.org/iers/publications/tn/tn32."
  {:db/ident :qudt/IERS-TN-32-2004,
   :dcterms/description
   "IERS Conventions (2003), D. D. McCarthy and Gérard Petit (eds.), IERS Technical Note No. 32, 2004; http://www.iers.org/iers/publications/tn/tn32.",
   :qudt/url "http://www.iers.org/iers/publications/tn/tn32.",
   :rdf/type :qudt/Citation,
   :rdfs/label "IERS-TN-32-2004",
   :skos/prefLabel "IERS-TN-32-2004"})

(def ^{:private true} IMPERIAL-DimensionVector
  "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/IMPERIAL-DimensionVector,
   :dcterms/description
   "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."})

(def ^{:private true} ISO-DimensionVector
  "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/ISO-DimensionVector,
   :dcterms/description
   "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."})

(def ^{:private true} ISO8601-UTCDateTime-BasicFormat
  "ISO 8601 UTC Date Time - Basic Format"
  {:db/ident   :qudt/ISO8601-UTCDateTime-BasicFormat,
   :qudt/allowedPattern
   ["[0-9]{4}[0-9]{2}[0-9]{2}T[0-9]{2}[0-9]{2}[0-9]{2}Z"
    "[0-9]{4}[0-9]{2}[0-9]{2}T[0-9]{2}[0-9]{2}[0-9]{2}.[0-9]+Z"],
   :rdf/type   :qudt/DateTimeStringEncodingType,
   :rdfs/label "ISO 8601 UTC Date Time - Basic Format"})

(def ^{:private true} IconicCue
  "Iconic enumeration literal"
  {:db/ident         :qudt/IconicCue,
   :owl/disjointWith [:qudt/VisualCue :qudt/KinestheticCue :qudt/AuralCue],
   :rdf/type         [:sh/NodeShape :owl/Class],
   :rdfs/label       "Iconic enumeration literal",
   :rdfs/subClassOf  :qudt/ModalCue,
   :sh/property      :qudt/IconicCue-image})

(def ^{:private true} IconicCue-image
  {:db/ident    :qudt/IconicCue-image,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/image})

(def ^{:private true} IconicCueEnumeration-defaultValue
  {:db/ident :qudt/IconicCueEnumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/IconicCue,
   :sh/path  :qudt/defaultValue})

(def ^{:private true} ImperialUnit
  "A sub-type of 'Standards unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/ImperialUnit,
   :dcterms/description
   "A sub-type of 'Standards unit'. Detailed desciption to be provided in a future version."})

(def ^{:private true} InBook
  "Pub inbook type"
  {:db/ident      :qudt/InBook,
   :dtype/literal "inbook",
   :rdf/type      :qudt/PubEnumeratedType,
   :rdfs/label    "Pub inbook type"})

(def ^{:private true} InCollection
  "Pub incollection type"
  {:db/ident      :qudt/InCollection,
   :dtype/literal "incollection",
   :rdf/type      :qudt/PubEnumeratedType,
   :rdfs/label    "Pub incollection type"})

(def ^{:private true} InProceedings
  "Pub inproceedings type"
  {:db/ident      :qudt/InProceedings,
   :dtype/literal "inproceedings",
   :rdf/type      :qudt/PubEnumeratedType,
   :rdfs/label    "Pub inproceedings type"})

(def ^{:private true} InertialCoordinateFrame
  "A \"Coordinate Frame\"."
  {:db/ident            :qudt/InertialCoordinateFrame,
   :dcterms/description "A \"Coordinate Frame\".",
   :owl/equivalentClass :qudt/NonRotatingInertialFrame,
   :rdf/type            [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Inertial Coordinate Frame",
   :rdfs/subClassOf     [{:owl/hasValue   :qudt.type/FT_NON-ROTATING,
                          :owl/onProperty :qudt/frameType,
                          :rdf/type       :owl/Restriction}
                         :qudt/InertialReferenceFrame],
   :sh/property         :qudt/InertialCoordinateFrame-frameType})

(def ^{:private true} InertialCoordinateFrame-frameType
  {:db/ident    :qudt/InertialCoordinateFrame-frameType,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue :qudt.type/FT_NON-ROTATING,
   :sh/path     :qudt/frameType})

(def ^{:private true} InertialReferenceFrame
  "A sub-type of 'Reference Frame'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/InertialReferenceFrame,
   :dcterms/description
   "A sub-type of 'Reference Frame'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Inertial reference frame",
   :rdfs/subClassOf :qudt/ReferenceFrame})

(def ^{:private true} IntegerDatatype
  "An Integer Type is a data type that specifies how integer numbers are represented and stored in machine memory."
  {:db/ident :qudt/IntegerDatatype,
   :dcterms/description
   "An Integer Type is a data type that specifies how integer numbers are represented and stored in machine memory.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Integer Datatype",
   :rdfs/subClassOf [:qudt/OrdinalType :qudt/NumericType]})

(def ^{:private true} IntegerEncodingType
  "The encoding scheme for integer types"
  {:db/ident            :qudt/IntegerEncodingType,
   :dcterms/description "The encoding scheme for integer types",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Integer Encoding",
   :rdfs/subClassOf     :qudt/Encoding})

(def ^{:private true} IntegerList
  "Integer list"
  {:db/ident        :qudt/IntegerList,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Integer list",
   :rdfs/subClassOf :qudt/List,
   :sh/property     [:qudt/IntegerList-rest :qudt/IntegerList-first]})

(def ^{:private true} IntegerList-first
  {:db/ident    :qudt/IntegerList-first,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/path     :rdf/first})

(def ^{:private true} IntegerList-rest
  {:db/ident :qudt/IntegerList-rest,
   :rdf/type :sh/PropertyShape,
   :sh/path  :rdf/rest})

(def ^{:private true} IntegerVector
  "Integer vector"
  {:db/ident        :qudt/IntegerVector,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Integer vector",
   :rdfs/subClassOf :qudt/Vector,
   :sh/property     [:qudt/IntegerList-rest :qudt/IntegerList-first]})

(def ^{:private true} InterpolatedTable
  "A sub-type of 'Table Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/InterpolatedTable,
   :dcterms/description
   "A sub-type of 'Table Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Interpolated Table Type",
   :rdfs/subClassOf [:qudt/TableType :qudt/Table]})

(def ^{:private true} KinestheticCue
  "Kinesthetic Cue"
  {:db/ident        :qudt/KinestheticCue,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Kinesthetic Cue",
   :rdfs/subClassOf :qudt/ModalCue,
   :sh/property     :qudt/KinestheticCue-code})

(def ^{:private true} KinestheticCue-code
  {:db/ident    :qudt/KinestheticCue-code,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/code})

(def ^{:private true} KinestheticCueEnumeration-defaultValue
  {:db/ident :qudt/KinestheticCueEnumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/KinestheticCue,
   :sh/path  :qudt/defaultValue})

(def ^{:private true} LIST
  "LIST"
  {:db/ident   :qudt/LIST,
   :rdf/type   :qudt/List,
   :rdfs/label "LIST"})

(def ^{:private true} LargeObject
  "A 'LargeObject' datatype is used to store blocks of unstructured data (such as text, graphic images, video clips, and sound waveforms). They often are used to allow efficient, random, piece-wise access to the data."
  {:db/ident :qudt/LargeObject,
   :dcterms/description
   "A 'LargeObject' datatype is used to store blocks of unstructured data (such as text, graphic images, video clips, and sound waveforms). They often are used to allow efficient, random, piece-wise access to the data.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Large object",
   :rdfs/subClassOf :qudt/CompositeDatatype})

(def ^{:private true} LargeObjectType
  "A 'LargeObject' datatype is used to store blocks of unstructured data (such as text, graphic images, video clips, and sound waveforms). They often are used to allow efficient, random, piece-wise access to the data."
  {:db/ident :qudt/LargeObjectType,
   :dcterms/description
   "A 'LargeObject' datatype is used to store blocks of unstructured data (such as text, graphic images, video clips, and sound waveforms). They often are used to allow efficient, random, piece-wise access to the data.",
   :rdf/type :owl/Class,
   :rdfs/label "Large object",
   :rdfs/subClassOf :qudt/CompositeDatatype})

(def ^{:private true} LimitType
  "Limit type"
  {:db/ident        :qudt/LimitType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Limit type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ^{:private true} List
  "A sub-type of 'Collection Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/List,
   :dcterms/description
   "A sub-type of 'Collection Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "List",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/List,
                      :owl/onProperty    :rdf/rest,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Datatype,
                      :owl/onProperty    :rdf/first,
                      :rdf/type          :owl/Restriction}
                     :qudt/Collection]})

(def ^{:private true} List-first
  {:db/ident :qudt/List-first,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/Datatype,
   :sh/path  :rdf/first})

(def ^{:private true} List-rest
  {:db/ident :qudt/List-rest,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/List,
   :sh/path  :rdf/rest})

(def ^{:private true} ListType
  "List type"
  {:db/ident        :qudt/ListType,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "List type",
   :rdfs/subClassOf :qudt/CollectionType,
   :sh/property     [:qudt/List-rest :qudt/List-first]})

(def ^{:private true} LittleEndian
  "Little Endian"
  {:db/ident      :qudt/LittleEndian,
   :dtype/literal "little",
   :rdf/type      :qudt/EndianType,
   :rdfs/label    "Little Endian"})

(def ^{:private true} LocalCoordinateSystem
  "A \"Trajectory Coordinate System\" with the following instance(s): \"Local vertical curvilinear coordinate system\", \"Local vertical local horizontal coordinate system\", \"Vehicle centered local vertical curvilinear coordinate system\"."
  {:db/ident :qudt/LocalCoordinateSystem,
   :dcterms/description
   "A \"Trajectory Coordinate System\" with the following instance(s): \"Local vertical curvilinear coordinate system\", \"Local vertical local horizontal coordinate system\", \"Vehicle centered local vertical curvilinear coordinate system\".",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Local Coordinate System Type",
   :rdfs/subClassOf :qudt/TrajectoryCoordinateSystem})

(def ^{:private true} LongIntegerType
  "A Long Integer is an integer that can be represented in four octets (32 bits) of machine memory. Long integers may be signed or unsigned."
  {:db/ident :qudt/LongIntegerType,
   :dcterms/description
   "A Long Integer is an integer that can be represented in four octets (32 bits) of machine memory. Long integers may be signed or unsigned.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Long Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   {:xsd/long 4},
                      :owl/onProperty :qudt/octets,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   {:xsd/long 32},
                      :owl/onProperty :qudt/bits,
                      :rdf/type       :owl/Restriction}
                     :qudt/IntegerDatatype],
   :sh/property :qudt/LongIntegerType-octets})

(def ^{:private true} LongIntegerType-octets
  {:db/ident    :qudt/LongIntegerType-octets,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue 4,
   :sh/or       :qudt/IntegerUnionList,
   :sh/path     :qudt/octets})

(def ^{:private true} LongUnsignedIntegerEncoding
  "Long Unsigned Integer Encoding"
  {:db/ident   :qudt/LongUnsignedIntegerEncoding,
   :qudt/bytes 8,
   :rdf/type   :qudt/IntegerEncodingType,
   :rdfs/label "Long Unsigned Integer Encoding"})

(def ^{:private true} LowToHigh
  "Low To High"
  {:db/ident      :qudt/LowToHigh,
   :dtype/literal "low",
   :rdf/type      :qudt/MemoryOrderType,
   :rdfs/label    "Low To High"})

(def ^{:private true} LunarCoordinateSystem
  "Two slightly different coordinate frames are commonly used to define the orientation of the axes of a lunar body-fixed coordinate system: a mean Earth/rotation frame and a principal axis coordinate frame. The mean Earth/rotation frame (sometimes called the \"Mean Earth/polar axis\" frame) is a lunar body-fixed coordinate frame with the X-axis aligned with the mean direction from the Moon to the Earth and the Z-axis aligned with the mean axis of rotation of the Moon. The principal axis frame is a lunar body-fixed coordinate frame aligned with the principal axes of the Moon. Due to the fact that the Moon is synchronously rotating but is not exactly symmetric, the principal axes and the mean Earth/rotation axes of the Moon do not coincide."
  {:db/ident :qudt/LunarCoordinateSystem,
   :dcterms/description
   "Two slightly different coordinate frames are commonly used to define the orientation of the axes of a lunar body-fixed coordinate system: a mean Earth/rotation frame and a principal axis coordinate frame. The mean Earth/rotation frame (sometimes called the \"Mean Earth/polar axis\" frame) is a lunar body-fixed coordinate frame with the X-axis aligned with the mean direction from the Moon to the Earth and the Z-axis aligned with the mean axis of rotation of the Moon. The principal axis frame is a lunar body-fixed coordinate frame aligned with the principal axes of the Moon. Due to the fact that the Moon is synchronously rotating but is not exactly symmetric, the principal axes and the mean Earth/rotation axes of the Moon do not coincide.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Lunar Coordinate System",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/xAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/yAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/realization,
                      :rdf/type        :owl/Restriction}
                     {:owl/hasValue   :qudt.type/CC_MoonCentered,
                      :owl/onProperty :qudt/coordinateCenter,
                      :rdf/type       :owl/Restriction}
                     :qudt/TrajectoryCoordinateSystem
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/zAxisDefinition,
                      :rdf/type        :owl/Restriction}],
   :sh/property [:qudt/LunarCoordinateSystem-yAxisDefinition
                 :qudt/LunarCoordinateSystem-xAxisDefinition
                 :qudt/LunarCoordinateSystem-zAxisDefinition
                 :qudt/LunarCoordinateSystem-realization
                 :qudt/LunarCoordinateSystem-coordinateCenter]})

(def ^{:private true} LunarCoordinateSystem-coordinateCenter
  {:db/ident    :qudt/LunarCoordinateSystem-coordinateCenter,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/CoordinateCenterType,
   :sh/hasValue :qudt.type/CC_MoonCentered,
   :sh/path     :qudt/coordinateCenter})

(def ^{:private true} LunarCoordinateSystem-realization
  {:db/ident    :qudt/LunarCoordinateSystem-realization,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/realization})

(def ^{:private true} LunarCoordinateSystem-xAxisDefinition
  {:db/ident    :qudt/LunarCoordinateSystem-xAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/xAxisDefinition})

(def ^{:private true} LunarCoordinateSystem-yAxisDefinition
  {:db/ident    :qudt/LunarCoordinateSystem-yAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/yAxisDefinition})

(def ^{:private true} LunarCoordinateSystem-zAxisDefinition
  {:db/ident    :qudt/LunarCoordinateSystem-zAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/zAxisDefinition})

(def ^{:private true} MASS-PROPERTIES-ARRAY
  "MASS PROPERTIES ARRAY"
  {:db/ident   :qudt/MASS-PROPERTIES-ARRAY,
   :rdf/type   :qudt/MassPropertiesArrayType,
   :rdfs/label "MASS PROPERTIES ARRAY"})

(def ^{:private true} MATRIX
  "MATRIX"
  {:db/ident   :qudt/MATRIX,
   :rdf/type   :qudt/MatrixType,
   :rdfs/label "MATRIX"})

(def ^{:private true} MATRIX-TYPE_2x4
  "Matrix type 2x4"
  {:db/ident            :qudt/MATRIX-TYPE_2x4,
   :qudt/byRow          true,
   :qudt/columns        4,
   :qudt/dimensionVector :qudt/DV_2x4,
   :qudt/dimensionality 2,
   :qudt/rows           [4 2],
   :rdf/type            :qudt/MatrixType,
   :rdfs/label          "Matrix type  2x4"})

(def ^{:private true} MKS-Unit
  "A sub-type of 'Standards unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/MKS-Unit,
   :dcterms/description
   "A sub-type of 'Standards unit'. Detailed desciption to be provided in a future version."})

(def ^{:private true} MULTi-DIMENSIONAL-ARRAY
  "MULTI-DIMENSIONAL ARRAY"
  {:db/ident   :qudt/MULTi-DIMENSIONAL-ARRAY,
   :rdf/type   :qudt/MultiDimensionalArrayType,
   :rdfs/label "MULTI-DIMENSIONAL ARRAY"})

(def ^{:private true} MajorMinorType
  "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/MajorMinorType,
   :dcterms/description
   "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version.",
   :owl/oneOf [:qudt.type/Minor :qudt.type/Major],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Major minor type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ^{:private true} Manual
  "Pub manual type"
  {:db/ident      :qudt/Manual,
   :dtype/literal "manual",
   :rdf/type      :qudt/PubEnumeratedType,
   :rdfs/label    "Pub manual type"})

(def ^{:private true} Map
  "A Map Type is an abstract data type that defines the properties of map data structures. A Map (or Associative Array) is an abstract data structure composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding."
  {:db/ident         :qudt/Map,
   :dcterms/description
   "A Map Type is an abstract data type that defines the properties of map data structures. A Map (or Associative Array) is an abstract data structure composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding.",
   :owl/equivalentClass :qudt/AssociativeArray,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Map Type",
   :rdfs/subClassOf  :qudt/Collection})

(def ^{:private true} MapType
  "A Map Type is an abstract data type that defines the properties of map data structures. A Map (or Associative Array) is an abstract data structure composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding."
  {:db/ident        :qudt/MapType,
   :dcterms/description
   "A Map Type is an abstract data type that defines the properties of map data structures. A Map (or Associative Array) is an abstract data structure composed of a collection of keys and a collection of values, where each key is associated with one value. The operation of finding the value associated with a key is called a lookup or indexing, and this is the most important operation supported by an associative array. The relationship between a key and its value is sometimes called a mapping or binding.",
   :owl/equivalentClass :qudt/AssociativeArrayType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Map Type",
   :rdfs/subClassOf :qudt/CollectionType})

(def ^{:private true} MarsCoordinateSystem
  "A \"Trajectory Coordinate System\" with the following instance(s): \"Mars mean equator and IAU-Node of epoch\", \"Mars mean equator and prime meridian body-fixed\"."
  {:db/ident :qudt/MarsCoordinateSystem,
   :dcterms/description
   "A \"Trajectory Coordinate System\" with the following instance(s): \"Mars mean equator and IAU-Node of epoch\", \"Mars mean equator and prime meridian body-fixed\".",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Mars Coordinate System Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/CC_MarsCentered,
                      :owl/onProperty :qudt/coordinateCenter,
                      :rdf/type       :owl/Restriction}
                     :qudt/TrajectoryCoordinateSystem],
   :sh/property :qudt/MarsCoordinateSystem-coordinateCenter})

(def ^{:private true} MarsCoordinateSystem-coordinateCenter
  {:db/ident    :qudt/MarsCoordinateSystem-coordinateCenter,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/CoordinateCenterType,
   :sh/hasValue :qudt.type/CC_MarsCentered,
   :sh/path     :qudt/coordinateCenter})

(def ^{:private true} MassPropertiesArray
  "The Mass Properties of an object are its: Center of Gravity, Mass, Moment of Inertia, and Product of Inertia. A mass properties array is an array whose elements contain these measured quantities for some object. A mass properties array data type provides the type specification for a class of arrays in which the data types of the elements are constrained to be one of these four properties."
  {:db/ident :qudt/MassPropertiesArray,
   :dcterms/description
   "The Mass Properties of an object are its: Center of Gravity, Mass, Moment of Inertia, and Product of Inertia. A mass properties array is an array whose elements contain these measured quantities for some object. A mass properties array data type provides the type specification for a class of arrays in which the data types of the elements are constrained to be one of these four properties.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Mass Properties Array Type",
   :rdfs/subClassOf :qudt/Array})

(def ^{:private true} MassPropertiesArrayType
  "The Mass Properties of an object are its: Center of Gravity, Mass, Moment of Inertia, and Product of Inertia. A mass properties array is an array whose elements contain these measured quantities for some object. A mass properties array data type provides the type specification for a class of arrays in which the data types of the elements are constrained to be one of these four properties."
  {:db/ident :qudt/MassPropertiesArrayType,
   :dcterms/description
   "The Mass Properties of an object are its: Center of Gravity, Mass, Moment of Inertia, and Product of Inertia. A mass properties array is an array whose elements contain these measured quantities for some object. A mass properties array data type provides the type specification for a class of arrays in which the data types of the elements are constrained to be one of these four properties.",
   :rdf/type :owl/Class,
   :rdfs/label "Mass Properties Array Type",
   :rdfs/subClassOf :qudt/ArrayType})

(def ^{:private true} MathsFunctionType
  "A sub-type of 'QUDT Concept'. Detailed description to be provided in a future version."
  {:db/ident :qudt/MathsFunctionType,
   :dcterms/description
   "A sub-type of 'QUDT Concept'. Detailed description to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Maths Function Type",
   :rdfs/subClassOf :qudt/Concept})

(def ^{:private true} Matrix
  "A Matrix Type is a data type that specifies the properties of data structures that hold matricies."
  {:db/ident :qudt/Matrix,
   :dcterms/description
   "A Matrix Type is a data type that specifies the properties of data structures that hold matricies.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Matrix Type",
   :rdfs/subClassOf :qudt/MultiDimensionalArray})

(def ^{:private true} MatrixType
  "Matrix Type"
  {:db/ident        :qudt/MatrixType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Matrix Type",
   :rdfs/subClassOf :qudt/MultiDimensionalArrayType})

(def ^{:private true} MemoryOrderType
  "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/MemoryOrderType,
   :dcterms/description
   "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version.",
   :owl/oneOf [:qudt.type/HighToLow :qudt.type/LowToHigh],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Memory order type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ^{:private true} Misc
  "Pub misc type"
  {:db/ident      :qudt/Misc,
   :dtype/literal "misc",
   :rdf/type      :qudt/PubEnumeratedType,
   :rdfs/label    "Pub misc type"})

(def ^{:private true} ModalCue
  "Modal Cue"
  {:db/ident        :qudt/ModalCue,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "Modal Cue",
   :rdfs/subClassOf :qudt/EnumeratedValue,
   :sh/property     :qudt/ModalCue-duration})

(def ^{:private true} ModalCue-duration
  {:db/ident    :qudt/ModalCue-duration,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/duration})

(def ^{:private true} ModalEnumeration
  "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/ModalEnumeration,
   :dcterms/description
   "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Modal Enumeration",
   :rdfs/subClassOf [{:owl/allValuesFrom "http://qudt.org/schema/type#ModalCue",
                      :owl/onProperty    :qudt/defaultValue,
                      :rdf/type          :owl/Restriction}
                     :qudt/Enumeration],
   :sh/property :qudt/ModalEnumeration-defaultValue})

(def ^{:private true} ModalEnumeration-defaultValue
  {:db/ident :qudt/ModalEnumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/ModalCue,
   :sh/path  :qudt/defaultValue})

(def ^{:private true} MultiDimensionalArray
  "Ordinary or one-dimensional arrays are indexed by a single integer. For a multi-dimensional array, the index into the array uses an ordered list of integers, such as in a[3,1,5]. The length of the list of integers used to index into the multi-dimensional array is always the same and is referred to as the array's dimensionality. The bounds on each of these are called the array's dimensions."
  {:db/ident :qudt/MultiDimensionalArray,
   :dcterms/description
   "Ordinary or one-dimensional arrays are indexed by a single integer. For a multi-dimensional array, the index into the array uses an ordered list of integers, such as in a[3,1,5]. The length of the list of integers used to index into the multi-dimensional array is always the same and is referred to as the array's dimensionality. The bounds on each of these are called the array's dimensions.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Multi Dimensional Array Type",
   :rdfs/subClassOf :qudt/Array})

(def ^{:private true} MultiDimensionalArrayType
  "Ordinary or one-dimensional arrays are indexed by a single integer. For a multi-dimensional array, the index into the array uses an ordered list of integers, such as in a[3,1,5]. The length of the list of integers used to index into the multi-dimensional array is always the same and is referred to as the array's dimensionality. The bounds on each of these are called the array's dimensions."
  {:db/ident :qudt/MultiDimensionalArrayType,
   :dcterms/description
   "Ordinary or one-dimensional arrays are indexed by a single integer. For a multi-dimensional array, the index into the array uses an ordered list of integers, such as in a[3,1,5]. The length of the list of integers used to index into the multi-dimensional array is always the same and is referred to as the array's dimensionality. The bounds on each of these are called the array's dimensions.",
   :rdf/type :owl/Class,
   :rdfs/label "Multi Dimensional Array Type",
   :rdfs/subClassOf :qudt/ArrayType})

(def ^{:private true} MultiDimensionalDataFormat
  "Data formats for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, for example HDF, CDF and netCDF."
  {:db/ident :qudt/MultiDimensionalDataFormat,
   :dcterms/description
   "Data formats for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, for example HDF, CDF and netCDF.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Multi dimensional data format",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  "http://qudt.org/schema/type#descriptor",
                      :rdf/type        :owl/Restriction}
                     :qudt/CompositeDatatype]})

(def ^{:private true} MultiDimensionalDataFormat-descriptor
  {:db/ident    :qudt/MultiDimensionalDataFormat-descriptor,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/descriptor})

(def ^{:private true} MultiDimensionalDataFormatType
  "Data formats for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, for example HDF, CDF and netCDF."
  {:db/ident :qudt/MultiDimensionalDataFormatType,
   :dcterms/description
   "Data formats for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, for example HDF, CDF and netCDF.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Multi Dimensional Data Format Type",
   :rdfs/subClassOf :qudt/CompositeDatatype,
   :sh/property :qudt/MultiDimensionalDataFormat-descriptor})

(def ^{:private true} MultiModalEnumeration
  "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/MultiModalEnumeration,
   :dcterms/description
   "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Multi modal enumeration",
   :rdfs/subClassOf
   [{:owl/maxCardinality 1,
     :owl/onProperty     "http://qudt.org/schema/type#visualCueEnumeration",
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :qudt/ModalEnumeration,
     :owl/onProperty    "http://qudt.org/schema/type#modalCueEnumeration",
     :rdf/type          :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     "http://qudt.org/schema/type#iconicCueEnumeration",
     :rdf/type           :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     "http://qudt.org/schema/type#auralCueEnumeration",
     :rdf/type           :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty "http://qudt.org/schema/type#kinestheticCueEnumeration",
     :rdf/type :owl/Restriction}
    :qudt/Enumeration],
   :sh/property [:qudt/MultiModalEnumeration-kinestheticCueEnumeration
                 :qudt/MultiModalEnumeration-iconicCueEnumeration
                 :qudt/MultiModalEnumeration-visualCueEnumeration
                 :qudt/MultiModalEnumeration-modalCueEnumeration
                 :qudt/MultiModalEnumeration-auralCueEnumeration]})

(def ^{:private true} MultiModalEnumeration-auralCueEnumeration
  {:db/ident    :qudt/MultiModalEnumeration-auralCueEnumeration,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/auralCueEnumeration})

(def ^{:private true} MultiModalEnumeration-iconicCueEnumeration
  {:db/ident    :qudt/MultiModalEnumeration-iconicCueEnumeration,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/iconicCueEnumeration})

(def ^{:private true} MultiModalEnumeration-kinestheticCueEnumeration
  {:db/ident    :qudt/MultiModalEnumeration-kinestheticCueEnumeration,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/kinestheticCueEnumeration})

(def ^{:private true} MultiModalEnumeration-modalCueEnumeration
  {:db/ident :qudt/MultiModalEnumeration-modalCueEnumeration,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/ModalEnumeration,
   :sh/path  :qudt/modalCueEnumeration})

(def ^{:private true} MultiModalEnumeration-visualCueEnumeration
  {:db/ident    :qudt/MultiModalEnumeration-visualCueEnumeration,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/visualCueEnumeration})

(def ^{:private true} MultiModalType
  "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/MultiModalType,
   :dcterms/description
   "A sub-type of 'Enumerated Value'. Detailed desciption to be provided in a future version.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Multi Modal Type",
   :rdfs/subClassOf
   [{:owl/maxCardinality 1,
     :owl/onProperty     "http://qudt.org/schema/type#kinestheticCue",
     :rdf/type           :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     "http://qudt.org/schema/type#auralCue",
     :rdf/type           :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     "http://qudt.org/schema/type#visualCue",
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom "http://qudt.org/schema/type#ModalCue",
     :owl/onProperty    "http://qudt.org/schema/type#modalCue",
     :rdf/type          :owl/Restriction}
    :qudt/EnumeratedValue
    {:owl/onProperty     "http://qudt.org/schema/type#modalCue",
     :owl/someValuesFrom "http://qudt.org/schema/type#ModalCue",
     :rdf/type           :owl/Restriction}
    {:owl/maxCardinality 1,
     :owl/onProperty     "http://qudt.org/schema/type#iconicCue",
     :rdf/type           :owl/Restriction}],
   :sh/property [:qudt/MultiModalType-visualCue
                 :qudt/MultiModalType-kinestheticCue
                 :qudt/MultiModalType-modalCue
                 :qudt/MultiModalType-auralCue
                 :qudt/MultiModalType-iconicCue]})

(def ^{:private true} MultiModalType-auralCue
  {:db/ident    :qudt/MultiModalType-auralCue,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/auralCue})

(def ^{:private true} MultiModalType-iconicCue
  {:db/ident    :qudt/MultiModalType-iconicCue,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/iconicCue})

(def ^{:private true} MultiModalType-kinestheticCue
  {:db/ident    :qudt/MultiModalType-kinestheticCue,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/kinestheticCue})

(def ^{:private true} MultiModalType-modalCue
  {:db/ident :qudt/MultiModalType-modalCue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/ModalCue,
   :sh/path  :qudt/modalCue})

(def ^{:private true} MultiModalType-visualCue
  {:db/ident    :qudt/MultiModalType-visualCue,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/visualCue})

(def ^{:private true} MultiSet
  "A bag is a set in which elements may be repeated."
  {:db/ident        :qudt/MultiSet,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A bag is a set in which elements may be repeated.",
   :rdfs/label      "Bag",
   :rdfs/subClassOf :qudt/Collection})

(def ^{:private true} N-Tuple
  "A tuple containing n objects is known as an \"n-tuple\". For example the 4-tuple (or \"quadruple\"), with components of respective types PERSON, DAY, MONTH and YEAR, could be used to record that a certain person was born on a certain day of a certain month of a certain year."
  {:db/ident :qudt/N-Tuple,
   :dcterms/description
   "A tuple containing n objects is known as an \"n-tuple\". For example the 4-tuple (or \"quadruple\"), with components of respective types PERSON, DAY, MONTH and YEAR, could be used to record that a certain person was born on a certain day of a certain month of a certain year.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "N-Tuple Type",
   :rdfs/subClassOf [{:owl/minCardinality 1,
                      :owl/onProperty     :qudt/elementType,
                      :rdf/type           :owl/Restriction}
                     :qudt/Tuple]})

(def ^{:private true} N-Tuple-elementType
  {:db/ident    :qudt/N-Tuple-elementType,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Datatype,
   :sh/minCount 0,
   :sh/path     :qudt/elementType})

(def ^{:private true} N-TupleType
  "A tuple containing n objects is known as an \"n-tuple\". For example the 4-tuple (or \"quadruple\"), with components of respective types PERSON, DAY, MONTH and YEAR, could be used to record that a certain person was born on a certain day of a certain month of a certain year."
  {:db/ident :qudt/N-TupleType,
   :dcterms/description
   "A tuple containing n objects is known as an \"n-tuple\". For example the 4-tuple (or \"quadruple\"), with components of respective types PERSON, DAY, MONTH and YEAR, could be used to record that a certain person was born on a certain day of a certain month of a certain year.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "N-Tuple Type",
   :rdfs/subClassOf :qudt/TupleType,
   :sh/property :qudt/N-Tuple-elementType})

(def ^{:private true} NUMERIC
  "Numeric"
  {:db/ident           :qudt/NUMERIC,
   :dtype/literal      "numeric",
   :qudt/ansiSQLName   "DECIMAL(p,s)",
   :qudt/odbcName      "SQL_DECIMAL(p,s)",
   :qudt/oracleSQLName "NUMBER(p,s)",
   :rdf/type           :qudt/NumericType,
   :rdfs/label         "Numeric"})

(def ^{:private true} No
  "No"
  {:db/ident     :qudt/No,
   :qudt/literal "N",
   :rdf/type     :qudt/YesNoType,
   :rdfs/label   "No"})

(def ^{:private true} NonModifiableParameter
  "Parameter is fixed, not modifiable."
  {:db/ident     :qudt/NonModifiableParameter,
   :qudt/code    "0",
   :qudt/literal "fixed",
   :rdf/type     :qudt/ParameterModifiabilityType,
   :rdfs/comment "Parameter is fixed, not modifiable.",
   :rdfs/label   "Non modifiable parameter"})

(def ^{:private true} NonRotatingInertialFrame
  "The non-rotating (or \"inertial\") coordinate frames are defined by taking a \"snapshot\" of the orientation of a particular set of right-handed, orthogonal axes at a specific epoch or time. In other words, the non-rotating coordinate frame, however it is defined, is frozen or fixed at a specific time - for all time. These non-rotating coordinate frames are referred to as \"of Epoch\" coordinate frames."
  {:db/ident :qudt/NonRotatingInertialFrame,
   :dcterms/description
   "The non-rotating (or \"inertial\") coordinate frames are defined by taking a \"snapshot\" of the orientation of a particular set of right-handed, orthogonal axes at a specific epoch or time. In other words, the non-rotating coordinate frame, however it is defined, is frozen or fixed at a specific time - for all time. These non-rotating coordinate frames are referred to as \"of Epoch\" coordinate frames.",
   :owl/equivalentClass :qudt/InertialCoordinateFrame,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Non Rotating Coordinate Frame",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/FT_NON-ROTATING,
                      :owl/onProperty :qudt/frameType,
                      :rdf/type       :owl/Restriction}
                     :qudt/InertialReferenceFrame],
   :sh/property :qudt/NonRotatingInertialFrame-frameType})

(def ^{:private true} NonRotatingInertialFrame-frameType
  {:db/ident    :qudt/NonRotatingInertialFrame-frameType,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue :qudt.type/FT_NON-ROTATING,
   :sh/path     :qudt/frameType})

(def ^{:private true} NumericType
  "Numeric data types are data types whose values denote quantities as defined by a mathematical number system. Numeric data types are data types whose values denote quantities (in some mathematical number system)."
  {:db/ident :qudt/NumericType,
   :dcterms/description
   ["Numeric data types are data types whose values denote quantities as defined by a mathematical number system."
    "Numeric data types are data types whose values denote quantities (in some mathematical number system)."],
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Numeric Type",
   :rdfs/subClassOf [:qudt/ScalarDatatype
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/accuracy,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/signedness,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/SignednessType,
                      :owl/onProperty    :qudt/signedness,
                      :rdf/type          :owl/Restriction}],
   :sh/property [:qudt/NumericType-accuracy :qudt/NumericType-signedness]})

(def ^{:private true} NumericType-accuracy
  {:db/ident    :qudt/NumericType-accuracy,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/accuracy})

(def ^{:private true} NumericType-signedness
  {:db/ident    :qudt/NumericType-signedness,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/SignednessType,
   :sh/maxCount 1,
   :sh/path     :qudt/signedness})

(def ^{:private true} OOST_OFF
  "Off"
  {:db/ident         :qudt/OOST_OFF,
   :qudt/code        "0",
   :qudt/literal     "off",
   :rdf/type         :qudt/OnOffStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Off"})

(def ^{:private true} OOST_ON
  "On"
  {:db/ident         :qudt/OOST_ON,
   :qudt/code        "0",
   :qudt/literal     "on",
   :rdf/type         :qudt/OnOffStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "On"})

(def ^{:private true} OOST_ZERO-MEANS-OFF
  "Zero means off"
  {:db/ident         :qudt/OOST_ZERO-MEANS-OFF,
   :dtype/literal    "zero-means-off",
   :qudt/inverted    true,
   :rdf/type         :qudt/OnOffStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Zero means off"})

(def ^{:private true} OOST_ZERO-MEANS-ON
  "Zero means on"
  {:db/ident         :qudt/OOST_ZERO-MEANS-ON,
   :dtype/literal    "zero-means-on",
   :qudt/inverted    true,
   :rdf/type         :qudt/OnOffStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Zero means on"})

(def ^{:private true} OctetEncoding
  "OCTET Encoding"
  {:db/ident   :qudt/OctetEncoding,
   :qudt/bytes 1,
   :rdf/type   [:qudt/ByteEncodingType :qudt/BooleanEncodingType],
   :rdfs/label "OCTET Encoding"})

(def ^{:private true} OctetType
  "An 8 bit unsigned integer"
  {:db/ident            :qudt/OctetType,
   :dcterms/description "An 8 bit unsigned integer",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Octet Type",
   :rdfs/subClassOf     :qudt/UnsignedIntegerType})

(def ^{:private true} OffOnStateTypeEnumeration
  "A discrete state enumeration whose values are 'off' and 'on'. The 'off' value is encoded as a zero (0) and the 'on' value as a one (1)."
  {:db/ident :qudt/OffOnStateTypeEnumeration,
   :rdfs/comment
   "A discrete state enumeration whose values are 'off' and 'on'. The 'off' value is encoded as a zero (0) and the 'on' value as a one (1)."})

(def ^{:private true} On
  "On"
  {:db/ident         :qudt/On,
   :qudt/code        "1",
   :qudt/literal     "on",
   :rdf/type         :qudt/OnOffStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "On"})

(def ^{:private true} OnOffStateType
  "On off state type"
  {:db/ident         :qudt/OnOffStateType,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "On off state type",
   :rdfs/subClassOf  :qudt/DiscreteState})

(def ^{:private true} OnOffStateTypeEnumeration
  "A discrete state enumeration whose values are 'off' and 'on'. The 'on' value is encoded as a zero (0) and the 'off' value as a one (1)."
  {:db/ident :qudt/OnOffStateTypeEnumeration,
   :qudt/inverted true,
   :rdfs/comment
   "A discrete state enumeration whose values are 'off' and 'on'. The 'on' value is encoded as a zero (0) and the 'off' value as a one (1)."})

(def ^{:private true} OneMeansOff
  "One means off"
  {:db/ident         :qudt/OneMeansOff,
   :qudt/inverted    true,
   :qudt/literal     "off",
   :rdf/type         :qudt/OnOffStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "One means off"})

(def ^{:private true} Open
  "Open"
  {:db/ident     :qudt/Open,
   :qudt/code    "1",
   :qudt/literal "open",
   :rdf/type     :qudt/OpenCloseStateType,
   :rdfs/label   "Open"})

(def ^{:private true} OpenCloseStateType
  "Open Close State Type"
  {:db/ident        :qudt/OpenCloseStateType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Open Close State Type",
   :rdfs/subClassOf :qudt/DiscreteState})

(def ^{:private true} OrderedCollection
  "An Ordered Collection Type is an abstract data type that defines the properties of collection data structures whose members can be linearly ordered. An ordered collection is a collection together with an ordering relation (such as greater than) that linearly orders the collection elements."
  {:db/ident :qudt/OrderedCollection,
   :dcterms/description
   "An Ordered Collection Type is an abstract data type that defines the properties of collection data structures whose members can be linearly ordered. An ordered collection is a collection together with an ordering relation (such as greater than) that linearly orders the collection elements.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Ordered Collection Type",
   :rdfs/subClassOf [{:owl/allValuesFrom :dtype/ComparisonOperator,
                      :owl/onProperty    :qudt/orderingRelation,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/OrderedCollection,
                      :owl/onProperty    :rdf/rest,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Datatype,
                      :owl/onProperty    :rdf/first,
                      :rdf/type          :owl/Restriction}
                     :qudt/Collection]})

(def ^{:private true} OrderedCollection-first
  {:db/ident :qudt/OrderedCollection-first,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/Datatype,
   :sh/path  :rdf/first})

(def ^{:private true} OrderedCollection-orderingRelation
  {:db/ident    :qudt/OrderedCollection-orderingRelation,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :dtype/ComparisonOperator,
   :sh/maxCount 1,
   :sh/path     :qudt/orderingRelation})

(def ^{:private true} OrderedCollection-rest
  {:db/ident :qudt/OrderedCollection-rest,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/OrderedCollectionType,
   :sh/path  :rdf/rest})

(def ^{:private true} OrderedCollectionType
  "An Ordered Collection Type is an abstract data type that defines the properties of collection data structures whose members can be linearly ordered. An ordered collection is a collection together with an ordering relation (such as greater than) that linearly orders the collection elements."
  {:db/ident :qudt/OrderedCollectionType,
   :dcterms/description
   "An Ordered Collection Type is an abstract data type that defines the properties of collection data structures whose members can be linearly ordered. An ordered collection is a collection together with an ordering relation (such as greater than) that linearly orders the collection elements.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Ordered Collection Type",
   :rdfs/subClassOf :qudt/CollectionType,
   :sh/property [:qudt/OrderedCollection-rest
                 :qudt/OrderedCollection-orderingRelation
                 :qudt/OrderedCollection-first]})

(def ^{:private true} OrderedTree
  "<p class=\"lm-para\">An \"Ordered Tree Type\" is a data type that defines the properties of data structures that represent ordered trees. An ordered tree is a tree where the children of every node are ordered, that is, there is a first child, second child, third child, etc. Typically a type specification for an ordered tree will include the comparison operator (such as \\(\\lt\\) or \\(\\gt\\)) that is used to order the nodes.</p>"
  {:db/ident :qudt/OrderedTree,
   :dcterms/description
   "<p class=\"lm-para\">An \"Ordered Tree Type\" is a data type that defines the properties of data structures that represent ordered trees. An ordered tree is a tree where the children of every node are ordered, that is, there is a first child, second child, third child, etc. Typically a type specification for an ordered tree will include the comparison operator (such as \\(\\lt\\) or \\(\\gt\\)) that is used to order the nodes.</p>",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Ordered Tree Type",
   :rdfs/subClassOf [:qudt/Tree :qudt/OrderedCollection]})

(def ^{:private true} OrderedTreeType
  "An \"Ordered Tree Type\" is a data type that defines the properties of data structures that represent ordered trees. An ordered tree is a tree where the children of every node are ordered, that is, there is a first child, second child, third child, etc. Typically a type specification for an ordered tree will include the comparison operator (such as $\\lt$ or $\\gt$) that is used to order the nodes."
  {:db/ident :qudt/OrderedTreeType,
   :dcterms/description
   "An \"Ordered Tree Type\" is a data type that defines the properties of data structures that represent ordered trees. An ordered tree is a tree where the children of every node are ordered, that is, there is a first child, second child, third child, etc. Typically a type specification for an ordered tree will include the comparison operator (such as $\\lt$ or $\\gt$) that is used to order the nodes.",
   :rdf/type :owl/Class,
   :rdfs/label "Ordered Tree Type",
   :rdfs/subClassOf [:qudt/TreeType :qudt/OrderedCollectionType]})

(def ^{:private true} OrdinalType
  "An ordinal data type is a data type that specifies the properties of values that can easily be put in a one to one correspondence with a subset of the natural numbers. Examples include boolean, character, and integer data types."
  {:db/ident :qudt/OrdinalType,
   :dcterms/description
   "An ordinal data type is a data type that specifies the properties of values that can easily be put in a one to one correspondence with a subset of the natural numbers. Examples include boolean, character, and integer data types.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Ordinal Data Type",
   :rdfs/subClassOf :qudt/ScalarDatatype})

(def ^{:private true} Organization
  "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/Organization,
   :dcterms/description
   "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version."})

(def ^{:private true} PARTIAL-ARRAY
  "PARTIAL ARRAY"
  {:db/ident   :qudt/PARTIAL-ARRAY,
   :rdf/type   :qudt/ArrayType,
   :rdfs/label "PARTIAL ARRAY"})

(def ^{:private true} PaddingType
  "This describes how unused bits of a field are filled. Unused bits could be set to one or zero. A third option is \"don't care\"."
  {:db/ident :qudt/PaddingType,
   :dcterms/description
   "This describes how unused bits of a field are filled. Unused bits could be set to one or zero. A third option is \"don't care\".",
   :owl/oneOf
   [:qudt.type/PadWithOnes :qudt.type/PadWithZeros :qudt.type/PadWithAny],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Padding type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ^{:private true} ParameterModifiabilityType
  "An enumeration of literals that signify whether a parameter is modifiable and if so, by whom."
  {:db/ident :qudt/ParameterModifiabilityType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "An enumeration of literals that signify whether a parameter is modifiable and if so, by whom.",
   :rdfs/label "Parameter modifiability type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ^{:private true} Percentage
  "A Scalar Datatype for expressing a dimensionless ratio."
  {:db/ident :qudt/Percentage,
   :dcterms/description
   "A Scalar Datatype for expressing a dimensionless ratio.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Percentage Type",
   :rdfs/subClassOf :qudt/NumericType})

(def ^{:private true} PhysicalAddress
  "A physical address is a pointer to a memory location. A \"Structured Datatype\"."
  {:db/ident            :qudt/PhysicalAddress,
   :dcterms/description ["A physical address is a pointer to a memory location."
                         "A \"Structured Datatype\"."],
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Physical Address Type",
   :rdfs/subClassOf     :qudt/CompositeDatatype})

(def ^{:private true} PolarCoordinates
  "A set of variables which fix a geometric object. If the coordinates of a point P are determined by the distance from P to the origin and the angle subtended by the radial vector at P and a fixed axis, they are known as polar coordinates. Typically, the angle is measured with respect to the x-axis."
  {:db/ident :qudt/PolarCoordinates,
   :dcterms/description
   "A set of  variables which fix a geometric object. If the coordinates of a point P are determined by the distance from P to the origin and the angle subtended by the radial vector at P and a fixed axis, they are known as polar coordinates. Typically, the angle is measured with respect to the x-axis.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Polar Coordinate System Type",
   :rdfs/subClassOf :qudt/Coordinates})

(def ^{:private true} PolarCoordinatesType
  "A set of variables which fix a geometric object. If the coordinates of a point P are determined by the distance from P to the origin and the angle subtended by the radial vector at P and a fixed axis, they are known as polar coordinates. Typically, the angle is measured with respect to the x-axis."
  {:db/ident :qudt/PolarCoordinatesType,
   :dcterms/description
   "A set of  variables which fix a geometric object. If the coordinates of a point P are determined by the distance from P to the origin and the angle subtended by the radial vector at P and a fixed axis, they are known as polar coordinates. Typically, the angle is measured with respect to the x-axis.",
   :rdf/type :owl/Class,
   :rdfs/label "Polar Coordinate System Type",
   :rdfs/subClassOf :qudt/CoordinateSystemType})

(def ^{:private true} Polarity
  "A \"Tagged Enumeration\" with the following instance(s): \"negative\", \"positive\"."
  {:db/ident :qudt/Polarity,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A \"Tagged Enumeration\" with the following instance(s): \"negative\", \"positive\".",
   :rdfs/label "Polarity",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ^{:private true} PositiveIntegerType
  "Positive Integers are integers that are either non-zero and non-negative."
  {:db/ident         :qudt/PositiveIntegerType,
   :dcterms/description
   "Positive Integers are integers that are either non-zero and non-negative.",
   :owl/disjointWith :qudt/SignedIntegerType,
   :owl/equivalentClass {:owl/intersectionOf [:qudt/IntegerDatatype
                                              :qudt/UnsignedType],
                         :rdf/type :owl/Class},
   :rdf/type         :owl/Class,
   :rdfs/label       "Positive Integer Type",
   :rdfs/subClassOf  [:qudt/UnsignedType :qudt/IntegerDatatype]})

(def ^{:private true} PrefixUnit
  "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/PrefixUnit,
   :dcterms/description
   "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."})

(def ^{:private true} Proceedings
  "Pub proceedings type"
  {:db/ident      :qudt/Proceedings,
   :dtype/literal "proceedings",
   :rdf/type      :qudt/PubEnumeratedType,
   :rdfs/label    "Pub proceedings type"})

(def ^{:private true} PubEnumeratedType
  "Pub enumerated type"
  {:db/ident        :qudt/PubEnumeratedType,
   :owl/oneOf       [:qudt/Article
                     :qudt/Book
                     :qudt/InBook
                     :qudt/InProceedings
                     :qudt/Proceedings
                     :qudt/Unpublished
                     :qudt/TechReport
                     :qudt/Manual
                     :qudt/InCollection
                     :qudt/Conference
                     :qudt/Booklet
                     :qudt/Misc],
   :rdf/type        :owl/Class,
   :rdfs/label      "Pub enumerated type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ^{:private true} QuantityKindDimensionVector_SI
  "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/QuantityKindDimensionVector_SI,
   :dcterms/description
   "A sub-type of 'Quantity Dimension Vector'. Detailed desciption to be provided in a future version."})

(def ^{:private true} QuantityValueType
  "A sub-type of 'Dimensional Data Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/QuantityValueType,
   :dcterms/description
   "A sub-type of 'Dimensional Data Type'. Detailed desciption to be provided in a future version.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Quantity value type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/QuantityType,
                      :owl/onProperty    :qudt/basis,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :qudt/NumericType,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt/DimensionalDatatype
                     {:owl/allValuesFrom :qudt/Unit,
                      :owl/onProperty    :qudt/elementUnit,
                      :rdf/type          :owl/Restriction}],
   :sh/property [:qudt/QuantityValueType-elementUnit
                 :qudt/QuantityValueType-basis
                 :qudt/QuantityValueType-elementType]})

(def ^{:private true} QuantityValueType-basis
  {:db/ident :qudt/QuantityValueType-basis,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/QuantityType,
   :sh/path  :qudt/basis})

(def ^{:private true} QuantityValueType-elementType
  {:db/ident :qudt/QuantityValueType-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/NumericType,
   :sh/path  :qudt/elementType})

(def ^{:private true} QuantityValueType-elementUnit
  {:db/ident    :qudt/QuantityValueType-elementUnit,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Unit,
   :sh/maxCount 1,
   :sh/path     :qudt/elementUnit})

(def ^{:private true} RELATIVE-DATETIME
  "Days and time relative to some Epoch"
  {:db/ident      :qudt/RELATIVE-DATETIME,
   :dcterms/description "Days and time relative to some Epoch",
   :dtype/literal "reldate",
   :qudt/dimensionality 1,
   :qudt/encodingDescription "TBD",
   :rdf/type      :qudt/DateStringType,
   :rdfs/label    "Relative Date And Time"})

(def ^{:private true} RN_BINARY-BASE
  "A rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. In this case b is chosen to be 2, and then the values of m and e are determined given this choice of base."
  {:db/ident :qudt/RN_BINARY-BASE,
   :rdf/type :qudt/RealNumberType,
   :rdfs/comment
   "A rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. In this case b is chosen to be 2, and then the values of m and e are determined given this choice of base.",
   :rdfs/label "Real number binary base"})

(def ^{:private true} RN_DECIMAL-BASE
  "A rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. In this case b is chosen to be 10, and then the values of m and e are determined given this choice of base."
  {:db/ident :qudt/RN_DECIMAL-BASE,
   :rdf/type :qudt/RealNumberType,
   :rdfs/comment
   "A rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. In this case b is chosen to be 10, and then the values of m and e are determined given this choice of base.",
   :rdfs/label "Real number decminal base"})

(def ^{:private true} RawValueTupleMember
  "A sub-type of 'Tuple Member Type'. Detailed desciption to be provided in a future version."
  {:db/ident         :qudt/RawValueTupleMember,
   :dcterms/description
   "A sub-type of 'Tuple Member Type'. Detailed desciption to be provided in a future version.",
   :owl/equivalentClass
   {:owl/intersectionOf [:qudt/TupleMember
                         {:owl/allValuesFrom :qudt/UnsignedIntegerType,
                          :owl/onProperty    :qudt/elementType,
                          :rdf/type          :owl/Restriction}],
    :rdf/type :owl/Class},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Raw value tuple member",
   :rdfs/subClassOf  [{:owl/allValuesFrom :qudt/UnsignedIntegerType,
                       :owl/onProperty    :qudt/elementType,
                       :rdf/type          :owl/Restriction}
                      :qudt/TupleMember]})

(def ^{:private true} RawValueTupleMember-elementType
  {:db/ident :qudt/RawValueTupleMember-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/UnsignedIntegerType,
   :sh/path  :qudt/elementType})

(def ^{:private true} RawValueTupleMemberType
  "Raw value tuple member type"
  {:db/ident            :qudt/RawValueTupleMemberType,
   :owl/equivalentClass {:owl/intersectionOf [:qudt/TupleMemberType
                                              {:owl/allValuesFrom
                                               :qudt/UnsignedIntegerType,
                                               :owl/onProperty
                                               :qudt/elementType,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type            [:sh/NodeShape :owl/Class],
   :rdfs/label          "Raw value tuple member type",
   :rdfs/subClassOf     :qudt/TupleMemberType,
   :sh/property         :qudt/RawValueTupleMember-elementType})

(def ^{:private true} RealDatatype
  "A real number is represented as a factor, called the mantissa, multiplied by a power (the exponent) of a base. Different bases yield different approximations to real numbers, and conversion between them is limited in accuracy. Four floating-point types are defined in 'IEEE-754 Standard for Binary Floating-Point'. These types are 'single', 'extended single', 'double', and 'extended double'."
  {:db/ident :qudt/RealDatatype,
   :dcterms/description
   "A real number is represented as a factor, called the mantissa, multiplied by a power (the exponent) of a base. Different bases yield different approximations to real numbers, and conversion between them is limited in accuracy.  Four floating-point types are defined in 'IEEE-754 Standard for Binary Floating-Point'. These types are 'single', 'extended single', 'double', and 'extended double'.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Real Datatype",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/maxExponent,
                      :rdf/type           :owl/Restriction}
                     :qudt/NumericType
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/precision,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/base,
                      :rdf/type           :owl/Restriction}],
   :sh/property [:qudt/RealDatatype-maxExponent
                 :qudt/RealDatatype-base
                 :qudt/RealDatatype-precision]})

(def ^{:private true} RealDatatype-base
  {:db/ident    :qudt/RealDatatype-base,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/base})

(def ^{:private true} RealDatatype-maxExponent
  {:db/ident    :qudt/RealDatatype-maxExponent,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/maxExponent})

(def ^{:private true} RealDatatype-precision
  {:db/ident    :qudt/RealDatatype-precision,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/precision})

(def ^{:private true} RealDoublePrecisionType
  "A real double precision data type specifies how a real number, or an approximation of a real number is stored in memory that occupies two words in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes. An example of a real double precision data type specification is the IEEE 754 standard for encoding binary or decimal floating point numbers in 8 bytes for storage on 32-bit machine architectures."
  {:db/ident         :qudt/RealDoublePrecisionType,
   :dcterms/description
   "A real double precision data type specifies how a real number, or an approximation of a real number is stored in memory that occupies two words in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes.\n\nAn example of a real double precision data type specification is the IEEE 754 standard for encoding binary or decimal floating point numbers in 8 bytes for storage on 32-bit machine architectures.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt/RealDatatype
                                              :qudt/DoublePrecisionType],
                         :rdf/type :owl/Class},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Real Double Precision Type",
   :rdfs/subClassOf  [:qudt/RealDatatype :qudt/DoublePrecisionType]})

(def ^{:private true} RealNumberType
  "This is the class of data values that approximate real numbers in finite precision. Often, such values are expressed in \"mantissa, base, exponent\" form. Any rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. Typically, b is chosen to be either 2 or 10, and then the values of m and e are determined given the choice of base."
  {:db/ident :qudt/RealNumberType,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "This is the class of data values that approximate real numbers in finite precision. Often, such values are expressed in \"mantissa, base, exponent\" form. Any rational number can be expressed in the form m*b^e, where m (the mantissa), b (the base), and e (the exponent) are integers. Typically, b is chosen to be either 2 or 10, and then the values of m and e are determined given the choice of base.",
   :rdfs/label "Real number type",
   :rdfs/subClassOf :qudt/RealDatatype})

(def ^{:private true} RealSinglePrecisionType
  "A real single precision data type specifies how a real number, or an approximation of a real number is stored in memory that occupies one word in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes. An example of a real single precisoin data type specification is the IEEE 754 standard for encoding binary or decimal floating point numbers in 4 bytes for storage on 32-bit machine architectures."
  {:db/ident         :qudt/RealSinglePrecisionType,
   :dcterms/description
   "A real single precision data type specifies how a real number, or an approximation of a real number is stored in memory that occupies one word in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes. An example of a real single precisoin data type specification is the IEEE 754 standard for encoding binary or decimal floating point numbers in 4 bytes for storage on 32-bit machine architectures.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt/RealDatatype
                                              :qudt/SinglePrecisionType],
                         :rdf/type :owl/Class},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Real Single Precision Type",
   :rdfs/subClassOf  [:qudt/SinglePrecisionType :qudt/RealDatatype]})

(def ^{:private true} Record
  "A Record Type is a type whose values are records, i.e. aggregates of several items of possibly different types. The aggregated items are called fields or members and are usually identified or indexed by field labels."
  {:db/ident :qudt/Record,
   :dcterms/description
   "A Record Type is a type whose values are records, i.e. aggregates of several items of possibly different types. The aggregated items are called fields or members and are usually identified or indexed by field labels.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Record Type",
   :rdfs/subClassOf [{:owl/allValuesFrom
                      "http://qudt.org/schema/type#FieldTypeList",
                      :owl/onProperty :qudt/elementTypeList,
                      :rdf/type :owl/Restriction}
                     :qudt/CompositeDatatype]})

(def ^{:private true} ReferenceDatatype
  "A reference is an object containing information which refers to data stored elsewhere, as opposed to containing the data itself. A reference data type is a data type that specifies how a reference is represented and stored in memory, as well as the operations that can be performed on reference values. The most common example of a reference data type is a pointer. A reference is an object containing information which refers to data stored elsewhere, as opposed to containing the data itself. A reference data type is a data type that specifies how a reference is represented and stored in memory, as well as the operations that can be performed on reference values. The most common example of a reference data type is a pointer. [Wikipedia]"
  {:db/ident :qudt/ReferenceDatatype,
   :dcterms/description
   ["A reference is an object containing information which refers to data stored elsewhere, as opposed to containing the data itself. A reference data type is a data type that specifies how a reference is represented and stored in memory, as well as the operations that can be performed on reference values. The most common example of a reference data type is a pointer."
    "A reference is an object containing information which refers to data stored elsewhere, as opposed to containing the data itself. A reference data type is a data type that specifies how a reference is represented and stored in memory, as well as the operations that can be performed on reference values. The most common example of a reference data type is a pointer. [Wikipedia]"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Reference Data Type",
   :rdfs/subClassOf :qudt/StructuredDatatype})

(def ^{:private true} ReferenceFrame
  "A reference frame (or frame of reference) in physics, may refer to a coordinate system or set of axes. The frame serves as the datum to measure the position, orientation, and other properties of objects in it. Reference frame may refer to an observational reference frame tied to the state of motion of an observer. Reference frame may also refer to both an observational reference frame and an attached coordinate system as a unit."
  {:db/ident :qudt/ReferenceFrame,
   :dcterms/description
   "A reference frame (or frame of reference) in physics, may refer to a coordinate system or set of axes.\nThe frame serves as the datum to measure the position, orientation, and other properties of objects in it.\nReference frame may refer to an observational reference frame tied to the state of motion of an observer. \nReference frame may also refer to both an observational reference frame and an attached coordinate system as a unit.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Reference Frame",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/zCoordinateDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/realization,
                      :rdf/type        :owl/Restriction}
                     :skos/Concept
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/zAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/xCoordinateDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/xAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/comment,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/yCoordinateDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/yAxisDefinition,
                      :rdf/type        :owl/Restriction}
                     :qudt/Concept
                     {:owl/allValuesFrom :qudt/FrameType,
                      :owl/onProperty    :qudt/frameType,
                      :rdf/type          :owl/Restriction}],
   :sh/property [:qudt/ReferenceFrame-realization
                 :qudt/ReferenceFrame-xAxisDefinition
                 :qudt/ReferenceFrame-frameType
                 :qudt/ReferenceFrame-comment
                 :qudt/ReferenceFrame-zAxisDefinition
                 :qudt/ReferenceFrame-xCoordinateDefinition
                 :qudt/ReferenceFrame-zCoordinateDefinition
                 :qudt/ReferenceFrame-description
                 :qudt/ReferenceFrame-yAxisDefinition
                 :qudt/ReferenceFrame-yCoordinateDefinition]})

(def ^{:private true} ReferenceFrame-comment
  {:db/ident    :qudt/ReferenceFrame-comment,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :vaem/comment})

(def ^{:private true} ReferenceFrame-description
  {:db/ident    :qudt/ReferenceFrame-description,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :vaem/description})

(def ^{:private true} ReferenceFrame-frameType
  {:db/ident :qudt/ReferenceFrame-frameType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/FrameType,
   :sh/path  :qudt/frameType})

(def ^{:private true} ReferenceFrame-realization
  {:db/ident    :qudt/ReferenceFrame-realization,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/realization})

(def ^{:private true} ReferenceFrame-xAxisDefinition
  {:db/ident    :qudt/ReferenceFrame-xAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/xAxisDefinition})

(def ^{:private true} ReferenceFrame-xCoordinateDefinition
  {:db/ident    :qudt/ReferenceFrame-xCoordinateDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/xCoordinateDefinition})

(def ^{:private true} ReferenceFrame-yAxisDefinition
  {:db/ident    :qudt/ReferenceFrame-yAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/yAxisDefinition})

(def ^{:private true} ReferenceFrame-yCoordinateDefinition
  {:db/ident    :qudt/ReferenceFrame-yCoordinateDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/yCoordinateDefinition})

(def ^{:private true} ReferenceFrame-zAxisDefinition
  {:db/ident    :qudt/ReferenceFrame-zAxisDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/zAxisDefinition})

(def ^{:private true} ReferenceFrame-zCoordinateDefinition
  {:db/ident    :qudt/ReferenceFrame-zCoordinateDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :qudt/zCoordinateDefinition})

(def ^{:private true} RotatingReferenceFrame
  "A sub-type of 'Reference Frame'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/RotatingReferenceFrame,
   :dcterms/description
   "A sub-type of 'Reference Frame'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Rotating reference frame",
   :rdfs/subClassOf :qudt/ReferenceFrame})

(def ^{:private true} STATE-SPACE-MATRIX
  "STATE SPACE MATRIX"
  {:db/ident   :qudt/STATE-SPACE-MATRIX,
   :rdf/type   :qudt/StateSpaceMatrixType,
   :rdfs/label "STATE SPACE MATRIX"})

(def ^{:private true} STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-1
  "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"
  {:db/ident      :qudt/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-1,
   :qudt/index    1,
   :qudt/next     :qudt/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-2,
   :qudt/order    1,
   :qudt/previous :rdf/nil,
   :qudt/type     :qudt/FLOAT-DP,
   :rdf/type      :qudt/IndexedCollectionMember,
   :rdfs/label    "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"})

(def ^{:private true} STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-2
  "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"
  {:db/ident   :qudt/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-2,
   :qudt/next  :qudt/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-3,
   :qudt/order 2,
   :qudt/type  :qudt/FLOAT-DP,
   :rdf/type   :qudt/IndexedCollectionMember,
   :rdfs/label "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"})

(def ^{:private true} STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-3
  "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"
  {:db/ident   :qudt/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-3,
   :qudt/next  :qudt/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-4,
   :qudt/order 3,
   :qudt/type  :qudt/FLOAT-DP,
   :rdf/type   :qudt/IndexedCollectionMember,
   :rdfs/label "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"})

(def ^{:private true} STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-4
  "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"
  {:db/ident   :qudt/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-4,
   :qudt/next  :rdf/nil,
   :qudt/order 4,
   :qudt/type  :qudt/FLOAT-DP,
   :rdf/type   :qudt/IndexedCollectionMember,
   :rdfs/label "STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES"})

(def ^{:private true} STATE-VECTOR-TYPE-LIST_MASS-PROPERTIES
  "STATE-VECTOR-TYPE-LIST_MASS-PROPERTIES"
  {:db/ident :qudt/STATE-VECTOR-TYPE-LIST_MASS-PROPERTIES,
   :qudt/element
   [:qudt/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-4
    :qudt/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-3
    :qudt/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-2
    :qudt/STATE-VECTOR-TYPE-LIST-MEMBER_MASS-PROPERTIES-ELEMENT-1],
   :rdf/type :qudt/IndexedList,
   :rdfs/label "STATE-VECTOR-TYPE-LIST_MASS-PROPERTIES"})

(def ^{:private true} STATE-VECTOR_MASS-PROPERTIES
  "STATE-VECTOR-MASS-PROPERTIES"
  {:db/ident         :qudt/STATE-VECTOR_MASS-PROPERTIES,
   :qudt/objectValue :qudt/STATE-VECTOR-TYPE-LIST_MASS-PROPERTIES,
   :qudt/type        :qudt/StateSpaceVectorType,
   :rdf/type         :qudt/StateSpaceVectorType,
   :rdfs/label       "STATE-VECTOR-MASS-PROPERTIES"})

(def ^{:private true} ScalarDatatype
  {:db/ident        :qudt/ScalarDatatype,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/bytes,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/bitOrder,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/minInclusive,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/byteOrder,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/maxExclusive,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :rdfs/Datatype,
                      :owl/onProperty    :qudt/rdfsDatatype,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/encoding,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/rdfsDatatype,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/bits,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/length,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/minExclusive,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/maxInclusive,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Encoding,
                      :owl/onProperty    :qudt/encoding,
                      :rdf/type          :owl/Restriction}],
   :sh/property     [:qudt/ScalarDatatype-rdfsDatatype
                     :qudt/ScalarDatatype-maxInclusive
                     :qudt/ScalarDatatype-maxExclusive
                     :qudt/ScalarDatatype-bitOrder
                     :qudt/ScalarDatatype-length
                     :qudt/ScalarDatatype-encoding
                     :qudt/ScalarDatatype-minExclusive
                     :qudt/ScalarDatatype-byteOrder
                     :qudt/ScalarDatatype-bits
                     :qudt/ScalarDatatype-minInclusive
                     :qudt/ScalarDatatype-bytes]})

(def ^{:private true} ScalarDatatype-bitOrder
  {:db/ident    :qudt/ScalarDatatype-bitOrder,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/EndianType,
   :sh/maxCount 1,
   :sh/path     :qudt/bitOrder})

(def ^{:private true} ScalarDatatype-bits
  {:db/ident    :qudt/ScalarDatatype-bits,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       :qudt/IntegerUnionList,
   :sh/path     :qudt/bits})

(def ^{:private true} ScalarDatatype-byteOrder
  {:db/ident    :qudt/ScalarDatatype-byteOrder,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/EndianType,
   :sh/maxCount 1,
   :sh/path     :qudt/byteOrder})

(def ^{:private true} ScalarDatatype-bytes
  {:db/ident    :qudt/ScalarDatatype-bytes,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       :qudt/IntegerUnionList,
   :sh/path     :qudt/bytes})

(def ^{:private true} ScalarDatatype-encoding
  {:db/ident    :qudt/ScalarDatatype-encoding,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Encoding,
   :sh/maxCount 1,
   :sh/path     :qudt/encoding})

(def ^{:private true} ScalarDatatype-length
  {:db/ident    :qudt/ScalarDatatype-length,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/length})

(def ^{:private true} ScalarDatatype-maxExclusive
  {:db/ident         :qudt/ScalarDatatype-maxExclusive,
   :rdf/type         :sh/PropertyShape,
   :rdfs/isDefinedBy "http://edg.topbraid.solutions/1.0/schema/qudt",
   :sh/maxCount      1,
   :sh/or            :qudt/NumericUnionList,
   :sh/path          :qudt/maxExclusive})

(def ^{:private true} ScalarDatatype-maxInclusive
  {:db/ident         :qudt/ScalarDatatype-maxInclusive,
   :rdf/type         :sh/PropertyShape,
   :rdfs/isDefinedBy "http://edg.topbraid.solutions/1.0/schema/qudt",
   :sh/maxCount      1,
   :sh/or            :qudt/NumericUnionList,
   :sh/path          :qudt/maxInclusive})

(def ^{:private true} ScalarDatatype-minExclusive
  {:db/ident    :qudt/ScalarDatatype-minExclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       :qudt/NumericUnionList,
   :sh/path     :qudt/minExclusive})

(def ^{:private true} ScalarDatatype-minInclusive
  {:db/ident    :qudt/ScalarDatatype-minInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       :qudt/NumericUnionList,
   :sh/path     :qudt/minInclusive})

(def ^{:private true} ScalarDatatype-rdfsDatatype
  {:db/ident    :qudt/ScalarDatatype-rdfsDatatype,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/path     :qudt/rdfsDatatype})

(def ^{:private true} ScaledUnit
  "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/ScaledUnit,
   :dcterms/description
   "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."})

(def ^{:private true} Sequence
  "A \"Structured Datatype\"."
  {:db/ident            :qudt/Sequence,
   :dcterms/description "A \"Structured Datatype\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Sequence",
   :rdfs/subClassOf     [{:owl/allValuesFrom :qudt/Sequence,
                          :owl/onProperty    :rdf/rest,
                          :rdf/type          :owl/Restriction}
                         {:owl/allValuesFrom :qudt/Datatype,
                          :owl/onProperty    :rdf/first,
                          :rdf/type          :owl/Restriction}
                         :qudt/Collection]})

(def ^{:private true} Sequence-first
  {:db/ident :qudt/Sequence-first,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/Datatype,
   :sh/path  :rdf/first})

(def ^{:private true} Sequence-rest
  {:db/ident :qudt/Sequence-rest,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/SequenceType,
   :sh/path  :rdf/rest})

(def ^{:private true} SequenceType
  "A sequence is an enumerated collection of objects in which repetitions are allowed. Like a set, it contains members (also called elements, or terms). The number of elements (possibly infinite) is called the length of the sequence. Unlike a set, order matters, and exactly the same elements can appear multiple times at different positions in the sequence. Formally, a sequence can be defined as a function whose domain is either the set of the natural numbers (for infinite sequences) or the set of the first n natural numbers (for a sequence of finite length n). The position of an element in a sequence is its rank or index; it is the integer from which the element is the image. It depends on the context or of a specific convention, if the first element has index 0 or 1. [Wikipedia]"
  {:db/ident :qudt/SequenceType,
   :dcterms/description
   "A sequence is an enumerated collection of objects in which repetitions are allowed. Like a set, it contains members (also called elements, or terms). The number of elements (possibly infinite) is called the length of the sequence. Unlike a set, order matters, and exactly the same elements can appear multiple times at different positions in the sequence. Formally, a sequence can be defined as a function whose domain is either the set of the natural numbers (for infinite sequences) or the set of the first n natural numbers (for a sequence of finite length n). The position of an element in a sequence is its rank or index; it is the integer from which the element is the image. It depends on the context or of a specific convention, if the first element has index 0 or 1. [Wikipedia]",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Sequence",
   :rdfs/subClassOf :qudt/CollectionType,
   :sh/property [:qudt/Sequence-rest :qudt/Sequence-first]})

(def ^{:private true} Set
  "A Set Type is an abstract data type that defines the properties of sets. A set is a collection (container) of certain values, without any particular order, and no repeated values. It corresponds with a finite set in mathematics."
  {:db/ident :qudt/Set,
   :dcterms/description
   "A Set Type is an abstract data type that defines the properties of sets. A set is a collection (container) of certain values, without any particular order, and no repeated values. It corresponds with a finite set in mathematics.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Set Type",
   :rdfs/subClassOf :qudt/Collection})

(def ^{:private true} SetType
  "A Set Type is an abstract data type that defines the properties of sets. A set is a collection (container) of certain values, without any particular order, and no repeated values. It corresponds with a finite set in mathematics."
  {:db/ident :qudt/SetType,
   :dcterms/description
   "A Set Type is an abstract data type that defines the properties of sets. A set is a collection (container) of certain values, without any particular order, and no repeated values. It corresponds with a finite set in mathematics.",
   :rdf/type :owl/Class,
   :rdfs/label "Set Type",
   :rdfs/subClassOf :qudt/CollectionType})

(def ^{:private true} ShortIntegerType
  "A Short Integer is an integer that can be represented in two octets (16 bits) of machine memory. Short integers may be signed or unsigned."
  {:db/ident :qudt/ShortIntegerType,
   :dcterms/description
   "A Short Integer is an integer that can be represented in two octets (16 bits) of machine memory. Short integers may be signed or unsigned.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Short Integer Type",
   :rdfs/subClassOf :qudt/IntegerDatatype})

(def ^{:private true} ShortSignedIntegerEncoding
  "Short Signed Integer Encoding"
  {:db/ident   :qudt/ShortSignedIntegerEncoding,
   :qudt/bytes 2,
   :rdf/type   :qudt/IntegerEncodingType,
   :rdfs/label "Short Signed Integer Encoding"})

(def ^{:private true} ShortUnsignedIntegerEncoding
  "Short Unsigned Integer Encoding"
  {:db/ident   :qudt/ShortUnsignedIntegerEncoding,
   :qudt/bytes 2,
   :rdf/type   [:qudt/IntegerEncodingType :qudt/BooleanEncodingType],
   :rdfs/label "Short Unsigned Integer Encoding"})

(def ^{:private true} SignedBigIntegerType
  "A Signed Big Integer is a signed integer that can be represented in eight octets (64 bits) of machine memory."
  {:db/ident :qudt/SignedBigIntegerType,
   :dcterms/description
   "A Signed Big Integer is a signed integer that can be represented in eight octets (64 bits) of machine memory.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Signed Big Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   {:xsd/string "2^{63}-1"},
                      :owl/onProperty :qudt/maxInclusive,
                      :rdf/type       :owl/Restriction}
                     :qudt/BigIntegerType
                     :qudt/SignedIntegerType
                     {:owl/hasValue   {:xsd/string "SI64"},
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   {:xsd/string "-2^{63}"},
                      :owl/onProperty :qudt/minInclusive,
                      :rdf/type       :owl/Restriction}],
   :sh/property [:qudt/SignedBigIntegerType-minInclusive
                 :qudt/SignedBigIntegerType-maxInclusive
                 :qudt/SignedBigIntegerType-literal]})

(def ^{:private true} SignedBigIntegerType-literal
  {:db/ident :qudt/SignedBigIntegerType-literal,
   :rdf/type :sh/PropertyShape,
   :sh/path  :dtype/literal})

(def ^{:private true} SignedBigIntegerType-maxInclusive
  {:db/ident :qudt/SignedBigIntegerType-maxInclusive,
   :rdf/type :sh/PropertyShape,
   :sh/or    :qudt/NumericUnionList,
   :sh/path  :qudt/maxInclusive})

(def ^{:private true} SignedBigIntegerType-minInclusive
  {:db/ident :qudt/SignedBigIntegerType-minInclusive,
   :rdf/type :sh/PropertyShape,
   :sh/or    [{:sh/datatype :xsd/string}
              {:sh/datatype :xsd/integer}
              {:sh/datatype :xsd/float}
              {:sh/datatype :xsd/decimal}],
   :sh/path  :qudt/minInclusive})

(def ^{:private true} SignedIntegerEncoding
  "Signed Integer Encoding"
  {:db/ident   :qudt/SignedIntegerEncoding,
   :qudt/bytes 4,
   :rdf/type   :qudt/IntegerEncodingType,
   :rdfs/label "Signed Integer Encoding"})

(def ^{:private true} SignedIntegerType
  "Signed Integers are integers can take on both positive and negative values."
  {:db/ident         :qudt/SignedIntegerType,
   :dcterms/description
   "Signed Integers are integers can take on both positive and negative values.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt/IntegerDatatype
                                              :qudt/SignedType],
                         :rdf/type :owl/Class},
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Signed Integer Type",
   :rdfs/subClassOf  [:qudt/SignedType :qudt/IntegerDatatype]})

(def ^{:private true} SignedLongIntegerType
  "A Signed Long Integer is a signed integer that can be represented in four octets (32 bits) of machine memory."
  {:db/ident :qudt/SignedLongIntegerType,
   :dcterms/description
   "A Signed Long Integer is a signed integer that can be represented in four octets (32 bits) of machine memory.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Signed Long Integer Type",
   :rdfs/subClassOf [:qudt/LongIntegerType
                     :qudt/SignedIntegerType
                     {:owl/hasValue   {:xsd/string "-2^{31}"},
                      :owl/onProperty :qudt/minInclusive,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   {:xsd/string "2^{31}-1"},
                      :owl/onProperty :qudt/maxInclusive,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   {:xsd/string "UI32"},
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}],
   :sh/property [:qudt/SignedLongIntegerType-abbreviation
                 :qudt/SignedLongIntegerType-minInclusive
                 :qudt/SignedLongIntegerType-maxInclusive]})

(def ^{:private true} SignedLongIntegerType-abbreviation
  {:db/ident    :qudt/SignedLongIntegerType-abbreviation,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/hasValue "SI32",
   :sh/path     :qudt/abbreviation})

(def ^{:private true} SignedLongIntegerType-maxInclusive
  {:db/ident :qudt/SignedLongIntegerType-maxInclusive,
   :rdf/type :sh/PropertyShape,
   :sh/or    :qudt/NumericUnionList,
   :sh/path  :qudt/maxInclusive})

(def ^{:private true} SignedLongIntegerType-minInclusive
  {:db/ident :qudt/SignedLongIntegerType-minInclusive,
   :rdf/type :sh/PropertyShape,
   :sh/or    [{:sh/datatype :xsd/string}
              {:sh/datatype :xsd/integer}
              {:sh/datatype :xsd/float}
              {:sh/datatype :xsd/decimal}],
   :sh/path  :qudt/minInclusive})

(def ^{:private true} SignedMediumIntegerType
  "A \"Signed Medium Integers\" is an integer of 24 bits that can take on both positive and negative values."
  {:db/ident         :qudt/SignedMediumIntegerType,
   :dcterms/description
   "A \"Signed Medium Integers\" is an integer of 24 bits that can take on both positive and negative values.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt/IntegerDatatype
                                              :qudt/SignedType
                                              {:owl/hasValue {:xsd/long 3},
                                               :owl/onProperty :qudt/bytes,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type         [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Signed Integer Type",
   :rdfs/subClassOf  [{:owl/hasValue   {:xsd/long 3},
                       :owl/onProperty :qudt/bytes,
                       :rdf/type       :owl/Restriction}
                      :qudt/SignedIntegerType]})

(def ^{:private true} SignedShortIntegerType
  "A Signed Short Integer is a signed integer that can be represented in four octets (32 bits) of machine memory."
  {:db/ident :qudt/SignedShortIntegerType,
   :dcterms/description
   "A Signed Short Integer is a signed integer that can be represented in four octets (32 bits) of machine memory.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Signed Short Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   {:xsd/string "SI16"},
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}
                     :qudt/SignedIntegerType
                     :qudt/ShortIntegerType],
   :sh/property :qudt/SignedShortIntegerType-abbreviation})

(def ^{:private true} SignedShortIntegerType-abbreviation
  {:db/ident :qudt/SignedShortIntegerType-abbreviation,
   :rdf/type :sh/PropertyShape,
   :sh/path  :qudt/abbreviation})

(def ^{:private true} SignedType
  "A signed type is a numeric type that distinguishes between positive and negative numbers using an encoding scheme, such as sign and magnitude, one's compliment, and two's compliment to represent negative numbers."
  {:db/ident :qudt/SignedType,
   :dcterms/description
   "A signed type is a numeric type that distinguishes between positive and negative numbers using an encoding scheme, such as sign and magnitude, one's compliment, and two's compliment to represent negative numbers.",
   :owl/disjointWith :qudt/UnsignedType,
   :owl/equivalentClass {:owl/intersectionOf [:qudt/NumericType
                                              {:owl/hasValue :qudt.type/Signed,
                                               :owl/onProperty :qudt/signedness,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Signed Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/Signed,
                      :owl/onProperty :qudt/signedness,
                      :rdf/type       :owl/Restriction}
                     :qudt/NumericType],
   :sh/property :qudt/SignedType-signedness})

(def ^{:private true} SignedType-signedness
  {:db/ident :qudt/SignedType-signedness,
   :rdf/type :sh/PropertyShape,
   :sh/path  :qudt/signedness})

(def ^{:private true} SignedVariableLengthIntegerType
  "A Signed Variable Length Integer data type defines a data structure for representing signed integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length."
  {:db/ident :qudt/SignedVariableLengthIntegerType,
   :dcterms/description
   "A Signed Variable Length Integer data type defines a data structure for representing signed integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Signed Variable Length Integer Type",
   :rdfs/subClassOf [:qudt/VariableLengthIntegerType :qudt/SignedIntegerType]})

(def ^{:private true} SinglePrecisionRealEncoding
  "Single Precision Real Encoding"
  {:db/ident   :qudt/SinglePrecisionRealEncoding,
   :qudt/bytes 32,
   :rdf/type   :qudt/FloatingPointEncodingType,
   :rdfs/label "Single Precision Real Encoding"})

(def ^{:private true} SinglePrecisionType
  "A single precision data type specifies how a numeric value, such as an integer or real number, is stored in memory that occupies one word in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes, and so a single precision data value on a 32-bit machine architecture occupies four bytes of memory."
  {:db/ident :qudt/SinglePrecisionType,
   :dcterms/description
   "A single precision data type specifies how a numeric value, such as an integer or real number, is stored in memory that occupies one word in computer memory, where the byte length of a word depends on machine address size of the computer processor. For example, on 32-bit machine architectures, a word is four bytes, and so a single precision data value on a 32-bit machine architecture occupies four bytes of memory.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Single Precision Type",
   :rdfs/subClassOf :qudt/NumericType})

(def ^{:private true} SplineCalibrator
  "A sub-type of 'Map Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/SplineCalibrator,
   :dcterms/description
   "A sub-type of 'Map Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Spline calibrator",
   :rdfs/subClassOf :qudt/Map})

(def ^{:private true} SplineCalibratorType
  "Spline calibrator type"
  {:db/ident        :qudt/SplineCalibratorType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Spline calibrator type",
   :rdfs/subClassOf :qudt/MapType})

(def ^{:private true} SplinePoint
  "A sub-type of 'Tuple Type'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/SplinePoint,
   :dcterms/description
   "A sub-type of 'Tuple Type'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Spline point",
   :rdfs/subClassOf :qudt/Tuple})

(def ^{:private true} SplinePointType
  "Spline point type"
  {:db/ident        :qudt/SplinePointType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Spline point type",
   :rdfs/subClassOf :qudt/TupleType})

(def ^{:private true} StandardsUnit
  "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/StandardsUnit,
   :dcterms/description
   "A sub-type of 'Unit'. Detailed desciption to be provided in a future version."})

(def ^{:private true} StateSpaceMatrix
  "In control engineering, a state space representation is a mathematical model of a physical system as a set of input, output and state variables related by first-order differential equations. To abstract from the number of inputs, outputs and states, the variables are expressed as vectors and the differential and algebraic equations are written in matrix form (the last one can be done when the dynamical system is linear and time invariant)."
  {:db/ident :qudt/StateSpaceMatrix,
   :dcterms/description
   "In control engineering, a state space representation is a mathematical model of a physical system as a set of input, output and state variables related by first-order differential equations. To abstract from the number of inputs, outputs and states, the variables are expressed as vectors and the differential and algebraic equations are written in matrix form (the last one can be done when the dynamical system is linear and time invariant). ",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "State Space Matrix Type",
   :rdfs/subClassOf :qudt/Matrix})

(def ^{:private true} StateSpaceMatrixType
  "In control engineering, a state space representation is a mathematical model of a physical system as a set of input, output and state variables related by first-order differential equations. To abstract from the number of inputs, outputs and states, the variables are expressed as vectors and the differential and algebraic equations are written in matrix form (the last one can be done when the dynamical system is linear and time invariant)."
  {:db/ident :qudt/StateSpaceMatrixType,
   :dcterms/description
   "In control engineering, a state space representation is a mathematical model of a physical system as a set of input, output and state variables related by first-order differential equations. To abstract from the number of inputs, outputs and states, the variables are expressed as vectors and the differential and algebraic equations are written in matrix form (the last one can be done when the dynamical system is linear and time invariant). ",
   :rdf/type :owl/Class,
   :rdfs/label "State Space Matrix Type",
   :rdfs/subClassOf :qudt/MatrixType})

(def ^{:private true} StateSpaceVector
  "A state vector in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded."
  {:db/ident :qudt/StateSpaceVector,
   :dcterms/description
   "A state vector in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "State Space Vector Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/coordinateSystem,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/CoordinateSystem,
                      :owl/onProperty    :qudt/coordinateSystem,
                      :rdf/type          :owl/Restriction}
                     :qudt/Vector]})

(def ^{:private true} StateSpaceVector-coordinateSystem
  {:db/ident    :qudt/StateSpaceVector-coordinateSystem,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/CoordinateSystem,
   :sh/maxCount 1,
   :sh/path     :qudt/coordinateSystem})

(def ^{:private true} StateSpaceVectorType
  "A state-space vector type in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded."
  {:db/ident :qudt/StateSpaceVectorType,
   :dcterms/description
   "A state-space vector type in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "State Space Vector Type",
   :rdfs/subClassOf :qudt/VectorType,
   :sh/property :qudt/StateSpaceVector-coordinateSystem})

(def ^{:private true} StateVectorType
  "A state-space vector type in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded."
  {:db/ident :qudt/StateVectorType,
   :dcterms/description
   "A state-space vector type in general control systems describes the observed states of an object in state space, e.g. in variables of the degrees of freedom for motion. As data types, state vector types are used to specify the structure of state vectors, such as how the observed state is encoded.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "State Vector Type",
   :rdfs/subClassOf :qudt/VectorType})

(def ^{:private true} StringEncodingType
  "A \"Encoding\" with the following instance(s): \"UTF-16 String\", \"UTF-8 Encoding\"."
  {:db/ident :qudt/StringEncodingType,
   :dcterms/description
   "A \"Encoding\" with the following instance(s): \"UTF-16 String\", \"UTF-8 Encoding\".",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "String Encoding Type",
   :rdfs/subClassOf :qudt/Encoding})

(def ^{:private true} StringList
  "String list"
  {:db/ident        :qudt/StringList,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/label      "String list",
   :rdfs/subClassOf :qudt/List,
   :sh/property     [:qudt/StringList-rest :qudt/StringList-first]})

(def ^{:private true} StringList-first
  {:db/ident    :qudt/StringList-first,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :rdf/first})

(def ^{:private true} StringList-rest
  {:db/ident :qudt/StringList-rest,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/StringList,
   :sh/path  :rdf/rest})

(def ^{:private true} StringType
  "A String Type is a data type that specifies the properties of data structures that hold strings."
  {:db/ident :qudt/StringType,
   :dcterms/description
   "A String Type is a data type that specifies the properties of data structures that hold strings. ",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "String Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/isByteString,
                      :rdf/type           :owl/Restriction}
                     :qudt/ScalarDatatype
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/maxLength,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/CharacterType,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 0,
                      :owl/onProperty  :qudt/typeMatrix,
                      :rdf/type        :owl/Restriction}
                     {:owl/hasValue   {:xsd/long 1},
                      :owl/onProperty :qudt/dimensionality,
                      :rdf/type       :owl/Restriction}
                     :qudt/Array
                     :qudt/ArrayType],
   :sh/property [:qudt/StringType-elementType
                 :qudt/StringType-dimensionality
                 :qudt/StringType-maxLength
                 :qudt/StringType-typeMatrix
                 :qudt/StringType-isByteString]})

(def ^{:private true} StringType-dimensionality
  {:db/ident    :qudt/StringType-dimensionality,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/path     :qudt/dimensionality})

(def ^{:private true} StringType-elementType
  {:db/ident :qudt/StringType-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/CharacterType,
   :sh/path  :qudt/elementType})

(def ^{:private true} StringType-isByteString
  {:db/ident    :qudt/StringType-isByteString,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :xsd/boolean,
   :sh/maxCount 1,
   :sh/path     :qudt/isByteString})

(def ^{:private true} StringType-maxLength
  {:db/ident    :qudt/StringType-maxLength,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/maxLength})

(def ^{:private true} StringType-typeMatrix
  {:db/ident    :qudt/StringType-typeMatrix,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 0,
   :sh/minCount 0,
   :sh/path     :qudt/typeMatrix})

(def ^{:private true} StringUTF16
  "String UTF-16 Type is a string data type that specifies the properties of string data structures which encode strings using the UTF-16 encoding. UTF-16 is the native internal representation of text in the Microsoft Windows NT/Windows 2000/Windows XP/Windows CE, Qualcomm BREW, and Symbian operating systems; the Java and .NET byte code environments; Mac OS X's Cocoa and Core Foundation frameworks; and the Qt cross-platform graphical widget toolkit."
  {:db/ident :qudt/StringUTF16,
   :dcterms/description
   "String UTF-16 Type is a string data type that specifies the properties of string data structures which encode strings using the UTF-16 encoding. UTF-16 is the native internal representation of text in the Microsoft Windows NT/Windows 2000/Windows XP/Windows CE, Qualcomm BREW, and Symbian operating systems; the Java and .NET byte code environments; Mac OS X's Cocoa and Core Foundation frameworks; and the Qt cross-platform graphical widget toolkit.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "String UTF16 Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt/UTF16-CHAR,
                      :owl/onProperty :qudt/elementType,
                      :rdf/type       :owl/Restriction}
                     :qudt/TextStringType
                     :qudt/StringType],
   :sh/property :qudt/StringUTF16-elementType})

(def ^{:private true} StringUTF16-elementType
  {:db/ident :qudt/StringUTF16-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/CharacterType,
   :sh/path  :qudt/elementType})

(def ^{:private true} StringUTF8
  "String UTF-8 Type is a string data type that specifies the properties of string data structures which encode strings using the UTF-8 encoding. UTF-8 includes ASCII, otherwise referred to as IA-5 (International Alphabet 5, as standardized by International Organization for Standardization [ISO]) as the first 128 values. The Internet Engineering Task Force (IETF) requires all Internet protocols to identify the encoding used for character data with UTF-8 as at least one supported encoding. The Internet Mail Consortium (IMC) recommends that all e-mail programs must be able to display and create mail using UTF-8."
  {:db/ident :qudt/StringUTF8,
   :dcterms/description
   "String UTF-8 Type is a string data type that specifies the properties of string data structures which encode strings using the UTF-8 encoding. UTF-8 includes ASCII, otherwise referred to as IA-5 (International Alphabet 5, as standardized by International Organization for Standardization [ISO]) as the first 128 values. The Internet Engineering Task Force (IETF) requires all Internet protocols to identify the encoding used for character data with UTF-8 as at least one supported encoding. The Internet Mail Consortium (IMC) recommends that all e-mail programs must be able to display and create mail using UTF-8.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "String UTF8 Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt/UTF8-CHAR,
                      :owl/onProperty :qudt/elementType,
                      :rdf/type       :owl/Restriction}
                     :qudt/TextStringType
                     :qudt/StringType],
   :sh/property :qudt/StringUTF8-elementType})

(def ^{:private true} StringUTF8-elementType
  {:db/ident :qudt/StringUTF8-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/CharacterType,
   :sh/path  :qudt/elementType})

(def ^{:private true} StructuredDatatype
  {:db/ident        :qudt/StructuredDatatype,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/elementType,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/Datatype,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}],
   :sh/property     :qudt/StructuredDatatype-elementType})

(def ^{:private true} StructuredDatatype-elementType
  {:db/ident    :qudt/StructuredDatatype-elementType,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Datatype,
   :sh/maxCount 1,
   :sh/path     :qudt/elementType})

(def ^{:private true} SubjectArea
  "A \"Enumeration Literal\"."
  {:db/ident        :qudt/SubjectArea,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A \"Enumeration Literal\".",
   :rdfs/label      "Subject Area",
   :rdfs/subClassOf :owl/Thing})

(def ^{:private true} Symbol
  "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/Symbol,
   :dcterms/description
   "A sub-type of 'QUDT Concept'. Detailed desciption to be provided in a future version."})

(def ^{:private true} SystemModifiableParameter
  "Parameter is modifiable by a (computer) system."
  {:db/ident     :qudt/SystemModifiableParameter,
   :qudt/code    "1",
   :qudt/literal "system",
   :rdf/type     :qudt/ParameterModifiabilityType,
   :rdfs/comment "Parameter is modifiable by a (computer) system.",
   :rdfs/label   "System modifiable parameter"})

(def ^{:private true} TABLE-COMPOSITION-EXAMPLE-SUBTREE_1
  "TABLE-COMPOSITION-EXAMPLE-SUBTREE_1"
  {:db/ident   :qudt/TABLE-COMPOSITION-EXAMPLE-SUBTREE_1,
   :qudt/node  :qudt/TIME-SERIES-TABLE-A-2x4,
   :rdf/type   :qudt/Tree,
   :rdfs/label "TABLE-COMPOSITION-EXAMPLE-SUBTREE_1"})

(def ^{:private true} TABLE-COMPOSITION-EXAMPLE-SUBTREE_2
  "TABLE-COMPOSITION-EXAMPLE-SUBTREE_2"
  {:db/ident   :qudt/TABLE-COMPOSITION-EXAMPLE-SUBTREE_2,
   :qudt/node  :qudt/TIME-SERIES-TABLE-B-2x4,
   :rdf/type   :qudt/Tree,
   :rdfs/label "TABLE-COMPOSITION-EXAMPLE-SUBTREE_2"})

(def ^{:private true} TABLE-COMPOSITION-SUBTREE-LIST-MEMBER_1
  "TABLE-COMPOSITION-SUBTREE-1"
  {:db/ident   :qudt/TABLE-COMPOSITION-SUBTREE-LIST-MEMBER_1,
   :qudt/order 1,
   :qudt/value :qudt/TABLE-COMPOSITION-EXAMPLE-SUBTREE_1,
   :rdf/type   :qudt/TreeListMember,
   :rdfs/label "TABLE-COMPOSITION-SUBTREE-1"})

(def ^{:private true} TABLE-COMPOSITION-SUBTREE-LIST-MEMBER_2
  "TABLE-COMPOSITION-SUBTREE_2"
  {:db/ident   :qudt/TABLE-COMPOSITION-SUBTREE-LIST-MEMBER_2,
   :qudt/order 2,
   :qudt/value :qudt/TABLE-COMPOSITION-EXAMPLE-SUBTREE_2,
   :rdf/type   :qudt/IndexedCollectionMember,
   :rdfs/label "TABLE-COMPOSITION-SUBTREE_2"})

(def ^{:private true} TABLE-COMPOSTION-SUBTREE-LIST-EXAMPLE_1
  "TABLE-COMPOSTION-SUBTREES-EXAMPLE_1"
  {:db/ident     :qudt/TABLE-COMPOSTION-SUBTREE-LIST-EXAMPLE_1,
   :qudt/element [:qudt/TABLE-COMPOSITION-SUBTREE-LIST-MEMBER_2
                  :qudt/TABLE-COMPOSITION-SUBTREE-LIST-MEMBER_1],
   :rdf/type     :qudt/TreeListMember,
   :rdfs/label   "TABLE-COMPOSTION-SUBTREES-EXAMPLE_1"})

(def ^{:private true} TABLE-TYPE_2x4
  "Table type 2x4"
  {:db/ident            :qudt/TABLE-TYPE_2x4,
   :qudt/byRow          true,
   :qudt/columns        4,
   :qudt/dimensionVector :qudt/DV_2x4,
   :qudt/dimensionality 2,
   :qudt/rows           2,
   :rdf/type            :qudt/TableType,
   :rdfs/label          "Table type  2x4"})

(def ^{:private true} TIME
  "TIME"
  {:db/ident            :qudt/TIME,
   :dc11/description    "Time in hh:mm:ss[Z|(+|-)hh:mm]format.",
   :dtype/literal       "time",
   :qudt/dimensionality 1,
   :qudt/rdfsDatatype   :xsd/time,
   :rdf/type            :qudt/TimeStringType,
   :rdfs/label          "TIME"})

(def ^{:private true} TRUE
  "True"
  {:db/ident         :qudt/TRUE,
   :dtype/literal    "true",
   :rdf/type         :qudt/BooleanTypeEnumeratedValue,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "True"})

(def ^{:private true} Table
  "A Table Type is a data type that specifies the properties of table data structures. A table is both a mode of visual communication and a means of arranging data. The use of tables is pervasive throughout NASA The precise conventions and terminology for describing tables varies depending on the context. Moreover, tables differ significantly in variety, structure, flexibility, notation, representation and use."
  {:db/ident :qudt/Table,
   :dcterms/description
   "A Table Type is a data type that specifies the properties of table data structures. A table is both a mode of visual communication and a means of arranging data. The use of tables is pervasive throughout NASA The precise conventions and terminology for describing tables varies depending on the context. Moreover, tables differ significantly in variety, structure, flexibility, notation, representation and use.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Table Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/byRow,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue   {:xsd/long 2},
                      :owl/onProperty :qudt/dimensionality,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/rows,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/columns,
                      :rdf/type        :owl/Restriction}
                     :qudt/Array]})

(def ^{:private true} Table-byRow
  {:db/ident    :qudt/Table-byRow,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/boolean,
   :sh/maxCount 1,
   :sh/path     :qudt/byRow})

(def ^{:private true} Table-columns
  {:db/ident    :qudt/Table-columns,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/columns})

(def ^{:private true} Table-dimensionality
  {:db/ident    :qudt/Table-dimensionality,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/dimensionality})

(def ^{:private true} Table-rows
  {:db/ident    :qudt/Table-rows,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/rows})

(def ^{:private true} TableType
  "A Table Type is a data type that specifies the properties of table data structures. A table is both a mode of visual communication and a means of arranging data. The use of tables is pervasive throughout NASA The precise conventions and terminology for describing tables varies depending on the context. Moreover, tables differ significantly in variety, structure, flexibility, notation, representation and use."
  {:db/ident :qudt/TableType,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A Table Type is a data type that specifies the properties of table data structures. A table is both a mode of visual communication and a means of arranging data. The use of tables is pervasive throughout NASA The precise conventions and terminology for describing tables varies depending on the context. Moreover, tables differ significantly in variety, structure, flexibility, notation, representation and use.",
   :rdfs/label "Table Type",
   :rdfs/subClassOf :qudt/ArrayType,
   :sh/property [:qudt/Table-rows
                 :qudt/Table-dimensionality
                 :qudt/Table-columns
                 :qudt/Table-byRow]})

(def ^{:private true} TaggedEnumeration
  "An enumeration where each literal has a tag that is a non-negative integer. These enumerations are likely to have their literals encoded - hence the need for the tag."
  {:db/ident :qudt/TaggedEnumeration,
   :dcterms/description
   "An enumeration where each literal  has a tag that is a non-negative integer. These enumerations are likely to have their literals encoded - hence the need for the tag.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt/Enumeration
                                              {:owl/cardinality 1,
                                               :owl/onProperty :dtype/code,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Tagged Enumeration",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :dtype/code,
                      :rdf/type        :owl/Restriction}
                     :qudt/Enumeration],
   :sh/property :qudt/TaggedEnumeration-code})

(def ^{:private true} TaggedEnumeration-code
  {:db/ident    :qudt/TaggedEnumeration-code,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :dtype/code})

(def ^{:private true} TechReport
  "Pub techreport type"
  {:db/ident      :qudt/TechReport,
   :dtype/literal "techreport",
   :rdf/type      :qudt/PubEnumeratedType,
   :rdfs/label    "Pub techreport type"})

(def ^{:private true} Term
  {:db/ident        :qudt/Term,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :owl/Thing})

(def ^{:private true} TextStringType
  "A text string. Encodings can be specified as subclass or in connection to character arrays in Structured Datatypes."
  {:db/ident :qudt/TextStringType,
   :dcterms/description
   "A text string. Encodings can be specified as subclass or in connection to character arrays in Structured Datatypes.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Text String Type",
   :rdfs/subClassOf :qudt/StringType})

(def ^{:private true} Three-Tuple
  "A three-tuple is a tuple with exactly three members. A Three-Tuple Type is a data type that defines the type properties of a class of three-tuples and their members."
  {:db/ident :qudt/Three-Tuple,
   :dcterms/description
   "A three-tuple is a tuple with exactly three members. A Three-Tuple Type is a data type that defines the type properties of a class of three-tuples and their members.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Three-Tuple Type",
   :rdfs/subClassOf [{:owl/hasValue   {:xsd/long 3},
                      :owl/onProperty :qudt/elementTypeCount,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 3,
                      :owl/onProperty  :qudt/elementType,
                      :rdf/type        :owl/Restriction}
                     :qudt/N-Tuple]})

(def ^{:private true} Three-Tuple-elementType
  {:db/ident    :qudt/Three-Tuple-elementType,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/TupleMemberType,
   :sh/minCount 0,
   :sh/path     :qudt/elementType})

(def ^{:private true} Three-Tuple-elementTypeCount
  {:db/ident    :qudt/Three-Tuple-elementTypeCount,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/hasValue 3,
   :sh/path     :qudt/elementTypeCount})

(def ^{:private true} ThreeBodyRotatingCoordinateSystem
  "The lunar coordinate systems are primarily used when operating in close proximity to the Moon. There are, however, a few additional coordinate systems that are also useful when analyzing (and depicting) trajectories in the vicinity of the Earth-Moon system. They are rotating coordinate systems associated with two different three-body systems: the Sun-Earth-spacecraft system and the Earth-Moon-spacecraft system. The Sun-Earth and Earth-Moon rotating coordinate frames are defined as follows. The pole vector or Z-axis of the coordinate frame is set equal to the instantaneous orbit normal of the secondary (smaller) body about the primary (larger) body and the X-axis is set equal to the vector from the primary body center of mass (CM) to the secondary body CM. The X-axis rotates at a rate equal to the instantaneous rotation rate of the secondary body about the primary body."
  {:db/ident :qudt/ThreeBodyRotatingCoordinateSystem,
   :dcterms/description
   "The lunar coordinate systems are primarily used when operating in close proximity to the Moon. There are, however, a few additional coordinate systems that are also useful when analyzing (and depicting) trajectories in the vicinity of the Earth-Moon system. They are rotating coordinate systems associated with two different three-body systems: the Sun-Earth-spacecraft system and the Earth-Moon-spacecraft system. The Sun-Earth and Earth-Moon rotating coordinate frames are defined as follows. The pole vector or Z-axis of the coordinate frame is set equal to the instantaneous orbit normal of the secondary (smaller) body about the primary (larger) body and the X-axis is set equal to the vector from the primary body center of mass (CM) to the secondary body CM. The X-axis rotates at a rate equal to the instantaneous rotation rate of the secondary body about the primary body.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Three Body Rotating Coordinate System Type",
   :rdfs/subClassOf :qudt/AerospaceCoordinateSystem})

(def ^{:private true} ThreeTupleType
  "A three-tuple is a tuple with exactly three members. A Three-Tuple Type is a data type that defines the type properties of a class of three-tuples and their members."
  {:db/ident :qudt/ThreeTupleType,
   :dcterms/description
   "A three-tuple is a tuple with exactly three members. A Three-Tuple Type is a data type that defines the type properties of a class of three-tuples and their members.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Three-Tuple Type",
   :rdfs/subClassOf :qudt/N-TupleType,
   :sh/property [:qudt/Three-Tuple-elementTypeCount
                 :qudt/Three-Tuple-elementType]})

(def ^{:private true} Time
  "The class of data values that denote a point in time. Time values may be encoded in a 12-hour clock or a 24-hour clock, such as 1:35 AM, or 13:35."
  {:db/ident :qudt/Time,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "The class of data values that denote a point in time. Time values may be encoded in a 12-hour clock or a 24-hour clock, such as 1:35 AM, or 13:35.",
   :rdfs/label "Time",
   :rdfs/subClassOf :qudt/Scalar,
   :sh/property :qudt/Time-type})

(def ^{:private true} Time-type
  {:db/ident :qudt/Time-type,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/TimeStringType,
   :sh/path  :qudt/type})

(def ^{:private true} TimeDataType
  "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/TimeDataType,
   :dcterms/description
   "A sub-type of 'QUDT Enumeration'. Detailed desciption to be provided in a future version.",
   :dtype/value :qudt/TIME,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Time data type",
   :rdfs/subClassOf [:qudt/ScalarDatatype :qudt/Enumeration]})

(def ^{:private true} TimeInterval
  "A relative interval that is an increment in time. For example, this is used in time series arrays to express the time point of a vector of values."
  {:db/ident :qudt/TimeInterval,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A relative interval that is an increment in time. For example, this is used in time series arrays to express the time point of a vector of values.",
   :rdfs/label "Time interval",
   :rdfs/subClassOf :qudt/Parameter,
   :sh/property :qudt/TimeInterval-type})

(def ^{:private true} TimeInterval-type
  {:db/ident :qudt/TimeInterval-type,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/TimeStringType,
   :sh/path  :qudt/type})

(def ^{:private true} TimeSeriesArray
  "A Time Series Array Type is a data type that specifies the properties of arrays that hold time series data. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals. A Time Series Array Type is a data type that specifies the properties of arrays that hold time series data. A time series is a sequence of data points, measured at successive time intervals. The time intervals may be uniformly or non-uniformly spaced."
  {:db/ident :qudt/TimeSeriesArray,
   :dcterms/description
   ["A Time Series Array Type is a data type that specifies the properties of arrays that hold time series data. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals."
    "A Time Series Array Type is a data type that specifies the properties of arrays that hold time series data. A time series is a sequence of data points, measured at successive time intervals. The time intervals may be uniformly or non-uniformly spaced."],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Time Series Array Type",
   :rdfs/subClassOf
   [{:owl/allValuesFrom :qudt/StateSpaceVector,
     :owl/onProperty    "http://qudt.org/schema/type#vector",
     :rdf/type          :owl/Restriction}
    {:owl/cardinality 1,
     :owl/onProperty  "http://qudt.org/schema/type#vector",
     :rdf/type        :owl/Restriction}
    {:owl/cardinality 1,
     :owl/onProperty  :qudt/dimensionVector,
     :rdf/type        :owl/Restriction}
    {:owl/cardinality 1,
     :owl/onProperty  "http://qudt.org/schema/type#incrementDatatype",
     :rdf/type        :owl/Restriction}
    {:owl/allValuesFrom :qudt/TimeStringType,
     :owl/onProperty    "http://qudt.org/schema/type#incrementDatatype",
     :rdf/type          :owl/Restriction}
    :qudt/Array]})

(def ^{:private true} TimeSeriesArray-dimensionVector
  {:db/ident    :qudt/TimeSeriesArray-dimensionVector,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/IntegerList,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/dimensionVector})

(def ^{:private true} TimeSeriesArray-incrementDatatype
  {:db/ident    :qudt/TimeSeriesArray-incrementDatatype,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/TimeStringType,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/incrementDatatype})

(def ^{:private true} TimeSeriesArray-vector
  {:db/ident    :qudt/TimeSeriesArray-vector,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/StateSpaceVectorType,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/vector})

(def ^{:private true} TimeSeriesArrayType
  "Time Series Array Type"
  {:db/ident :qudt/TimeSeriesArrayType,
   :rdf/comment
   "A Time Series Array Type is a data type that specifies the properties of arrays that hold time series data. A time series is a sequence of data points, measured at successive time intervals. The time intervals may be uniformly or non-uniformly spaced.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Time Series Array Type",
   :rdfs/subClassOf :qudt/ArrayType,
   :sh/property [:qudt/TimeSeriesArray-vector
                 :qudt/TimeSeriesArray-incrementDatatype
                 :qudt/TimeSeriesArray-dimensionVector]})

(def ^{:private true} TimeStringType
  "Time takes a number of forms, depending on the units used (e.g., year, day, minute, millisecond, or combinations thereof) and the origin (i.e., time zero) to which the time value is related."
  {:db/ident :qudt/TimeStringType,
   :dcterms/description
   "Time takes a number of forms, depending on the units used (e.g., year, day, minute, millisecond, or combinations thereof) and the origin (i.e., time zero) to which the time value is related.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Time Type",
   :rdfs/subClassOf [:qudt/TextStringType :qudt/DateTimeStringType]})

(def ^{:private true} TrajectoryCoordinateSystem
  "A \"Coordinate System\"."
  {:db/ident            :qudt/TrajectoryCoordinateSystem,
   :dcterms/description "A \"Coordinate System\".",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "Trajectory Coordinate System",
   :rdfs/subClassOf     :qudt/AerospaceCoordinateSystem})

(def ^{:private true} Tree
  "A \"Tree\" is a data type that defines the properties of data structures that represent trees. A tree is a graph data structure accessed beginning at the root node. Each node is either a leaf or an internal node. An internal node has one or more child nodes and is called the parent of its child nodes. Leaf nodes have no chidren. Nodes that share the same parent are siblings. In graph theoretic terminology, a tree is a connected, undirected, acyclic graph."
  {:db/ident :qudt/Tree,
   :dcterms/description
   "A \"Tree\" is a data type that defines the properties of data structures that represent trees. A tree is a graph data structure accessed beginning at the root node. Each node is either a leaf or an internal node. An internal node has one or more child nodes and is called the parent of its child nodes. Leaf nodes have no chidren. Nodes that share the same parent are siblings. In graph theoretic terminology, a tree is a connected, undirected, acyclic graph.",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Tree_(data_structure)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Tree Type",
   :rdfs/subClassOf :qudt/Graph})

(def ^{:private true} TreeType
  "A \"Tree\" is a data type that defines the properties of data structures that represent trees. A tree is a graph data structure accessed beginning at the root node. Each node is either a leaf or an internal node. An internal node has one or more child nodes and is called the parent of its child nodes. Leaf nodes have no chidren. Nodes that share the same parent are siblings. In graph theoretic terminology, a tree is a connected, undirected, acyclic graph."
  {:db/ident :qudt/TreeType,
   :dcterms/description
   "A \"Tree\" is a data type that defines the properties of data structures that represent trees. A tree is a graph data structure accessed beginning at the root node. Each node is either a leaf or an internal node. An internal node has one or more child nodes and is called the parent of its child nodes. Leaf nodes have no chidren. Nodes that share the same parent are siblings. In graph theoretic terminology, a tree is a connected, undirected, acyclic graph.",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Tree_(data_structure)",
   :rdf/type :owl/Class,
   :rdfs/label "Tree Type",
   :rdfs/subClassOf :qudt/GraphType})

(def ^{:private true} Triplet
  "A \"Tuple\"."
  {:db/ident         :qudt/Triplet,
   :dcterms/description "A \"Tuple\".",
   :owl/equivalentClass [:qudt/ThreeTupleType :qudt/Three-Tuple],
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Triplet",
   :rdfs/subClassOf  [:qudt/ThreeTupleType :qudt/Three-Tuple]})

(def ^{:private true} True
  "true"
  {:db/ident     :qudt/True,
   :qudt/code    "1",
   :qudt/literal "true",
   :rdf/type     :qudt/BooleanStateType,
   :rdfs/label   "true"})

(def ^{:private true} Tuple
  "<p>The term <em>Tuple</em> originated as an abstraction of the sequence: single, double, triple, quadruple, quintuple, n-tuple. In mathematics, a tuple is a finite sequence (also known as an <em>Ordered List</em> of objects, each of a specified type. The <em>n</em> can be any non-negative integer.</p>"
  {:db/ident :qudt/Tuple,
   :dcterms/description
   "<p>The term <em>Tuple</em> originated as an abstraction of the sequence: single, double, triple, quadruple, quintuple, n-tuple.  In mathematics, a tuple is a finite sequence (also known as an <em>Ordered List</em> of objects, each of a specified type. The <em>n</em> can be any non-negative integer.</p>",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Tuple Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/length,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/elementTypeCount,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/TupleMember,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt/CompositeDatatype]})

(def ^{:private true} Tuple-elementType
  {:db/ident :qudt/Tuple-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/TupleMemberType,
   :sh/path  :qudt/elementType})

(def ^{:private true} Tuple-elementTypeCount
  {:db/ident    :qudt/Tuple-elementTypeCount,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/minCount 0,
   :sh/path     :qudt/elementTypeCount})

(def ^{:private true} Tuple-length
  {:db/ident    :qudt/Tuple-length,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/length})

(def ^{:private true} TupleMember
  "A Tuple Member Type is a data type that defines the properties of a member of a tuple. It is used to provide fine grained type specification to the elements of tuples."
  {:db/ident :qudt/TupleMember,
   :dcterms/description
   "A Tuple Member Type is a data type that defines the properties of a member of a tuple. It is used to provide fine grained type specification to the elements of tuples.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Tuple Member Type",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :qudt/orderInStructure,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/ScalarDatatype,
                      :owl/onProperty    :qudt/elementType,
                      :rdf/type          :owl/Restriction}
                     :qudt/CompositeDatatype]})

(def ^{:private true} TupleMember-elementType
  {:db/ident :qudt/TupleMember-elementType,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/ScalarDatatype,
   :sh/path  :qudt/elementType})

(def ^{:private true} TupleMember-orderInStructure
  {:db/ident    :qudt/TupleMember-orderInStructure,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/minCount 1,
   :sh/path     :qudt/orderInStructure})

(def ^{:private true} TupleMemberType
  "A Tuple Member Type is a data type that defines the properties of a member of a tuple. It is used to provide fine grained type specification to the elements of tuples."
  {:db/ident :qudt/TupleMemberType,
   :dcterms/description
   "A Tuple Member Type is a data type that defines the properties of a member of a tuple. It is used to provide fine grained type specification to the elements of tuples.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Tuple Member Type",
   :rdfs/subClassOf :qudt/CompositeDatatype,
   :sh/property [:qudt/TupleMember-orderInStructure
                 :qudt/TupleMember-elementType]})

(def ^{:private true} TupleType
  "<p>The term <em>Tuple</em> originated as an abstraction of the sequence: single, double, triple, quadruple, quintuple, n-tuple. In mathematics, a tuple is a finite sequence (also known as an <em>Ordered List</em> of objects, each of a specified type. The <em>n</em> can be any non-negative integer.</p>"
  {:db/ident :qudt/TupleType,
   :dcterms/description
   "<p>The term <em>Tuple</em> originated as an abstraction of the sequence: single, double, triple, quadruple, quintuple, n-tuple.  In mathematics, a tuple is a finite sequence (also known as an <em>Ordered List</em> of objects, each of a specified type. The <em>n</em> can be any non-negative integer.</p>",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Tuple Type",
   :rdfs/subClassOf :qudt/CompositeDatatype,
   :sh/property
   [:qudt/Tuple-length :qudt/Tuple-elementTypeCount :qudt/Tuple-elementType]})

(def ^{:private true} Two-Tuple
  "A 2-tuple is called a pair. For example, a complex number can be represented as a 2-tuple, and 2D coordinates are sometimes represented as 2-tuples."
  {:db/ident :qudt/Two-Tuple,
   :dcterms/description
   "A 2-tuple is called a pair. For example, a complex number can be represented as a 2-tuple, and 2D coordinates are sometimes represented as 2-tuples.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Two-Tuple Type",
   :rdfs/subClassOf [{:owl/hasValue   {:xsd/long 2},
                      :owl/onProperty :qudt/elementTypeCount,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 2,
                      :owl/onProperty  :qudt/elementType,
                      :rdf/type        :owl/Restriction}
                     :qudt/N-Tuple]})

(def ^{:private true} Two-Tuple-elementType
  {:db/ident    :qudt/Two-Tuple-elementType,
   :rdf/type    :sh/PropertyShape,
   :sh/minCount 0,
   :sh/path     :qudt/elementType})

(def ^{:private true} Two-Tuple-elementTypeCount
  {:db/ident    :qudt/Two-Tuple-elementTypeCount,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/hasValue 2,
   :sh/path     :qudt/elementTypeCount})

(def ^{:private true} TwoTupleType
  "A 2-tuple is called a pair. For example, a complex number can be represented as a 2-tuple, and 2D coordinates are sometimes represented as 2-tuples."
  {:db/ident :qudt/TwoTupleType,
   :dcterms/description
   "A 2-tuple is called a pair. For example, a complex number can be represented as a 2-tuple, and 2D coordinates are sometimes represented as 2-tuples.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Two-Tuple Type",
   :rdfs/subClassOf :qudt/N-TupleType,
   :sh/property [:qudt/Two-Tuple-elementTypeCount :qudt/Two-Tuple-elementType]})

(def ^{:private true} TypeList
  "A sub-type of 'QUDT Datatype'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/TypeList,
   :dcterms/description
   "A sub-type of 'QUDT Datatype'. Detailed desciption to be provided in a future version.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Type list",
   :rdfs/subClassOf :qudt/Datatype})

(def ^{:private true} TypeMatrix
  "Members of this class are matrix data structures that describe the datatypes of a class of matrices. That is, the members of this class are matrices with cells that contain datatypes (c.f. type:Datatype) and are used to describe the datatype structure of other matrices."
  {:db/ident :qudt/TypeMatrix,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "Members of this class are matrix data structures that describe the datatypes of a class of matrices. That is, the members of this class are matrices with cells that contain datatypes (c.f. type:Datatype) and are used to describe the datatype structure of other matrices.",
   :rdfs/label "Type matrix",
   :rdfs/subClassOf :qudt/MatrixType})

(def ^{:private true} TypeVector
  "A Type Vector is a vector whose elements are data types. They are used, for instance, to specify the type of each component of a vector or class of vectors. A Type Vector Type is a further abstraction that specifies the structure of Type Vectors."
  {:db/ident :qudt/TypeVector,
   :dcterms/description
   "A Type Vector is a vector whose elements are data types. They are used, for instance, to specify the type of each component of a vector or class of vectors. A Type Vector Type is a further abstraction that specifies the structure of Type Vectors.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/comment
   "A Type Vector is a vector whose elements are data types. They are used, for instance, to specify the type of each component of a vector or class of vectors. A <em>Type Vector Type</em> is a further abstraction that specifies the structure of Type Vectors.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label ["Type vector" "Type Vector Type"],
   :rdfs/subClassOf [:qudt/Vector
                     :qudt/VectorType
                     :qudt/DatatypeStructuredData
                     {:owl/cardinality 1,
                      :owl/onClass     :qudt/TypeVector,
                      :owl/onProperty  :qudt/typeVector,
                      :rdf/type        :owl/Restriction}],
   :sh/property [:qudt/TypeVector-typeVector
                 :qudt/TypeVector-type
                 :qudt/TypeVector-objectValue]})

(def ^{:private true} TypeVector-objectValue
  {:db/ident :qudt/TypeVector-objectValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/IndexedList,
   :sh/path  :qudt/objectValue})

(def ^{:private true} TypeVector-type
  {:db/ident :qudt/TypeVector-type,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/TypeVector,
   :sh/path  :qudt/type})

(def ^{:private true} TypeVector-typeVector
  {:db/ident    :qudt/TypeVector-typeVector,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/Datatype,
   :sh/maxCount 1,
   :sh/path     :qudt/typeVector})

(def ^{:private true} UNARY-FUNCTION
  "This type identifies functions that have exactly one argument."
  {:db/ident           :qudt/UNARY-FUNCTION,
   :dcterms/description
   "This type identifies functions that have exactly one argument.",
   :qudt/functionArity 1,
   :rdf/type           :qudt/FunctionDatatype,
   :rdfs/label         "UNARY-FUNCTION"})

(def ^{:private true} UTC-DATETIME
  "UTC is the time-scale maintained by the BIPM, with assistance from the IERS, which forms the basis of a coordinated dissemination of standard frequencies and time signals. It corresponds exactly in rate with the international reference scale of atomic time (TAI) but differs from it by an integer number of seconds. TAI, based on the second (SI), as realized on the rotating geoid, is formed by the BIPM on the basis of clock data supplied by cooperating establishments. It is in the form of a continuous scale, e.g. in days, hours, minutes and seconds from the origin 1 January, 1958 (adopted by the CGPM 1971)."
  {:db/ident :qudt/UTC-DATETIME,
   :dcterms/description
   "UTC is the time-scale maintained by the BIPM, with assistance from the IERS, which forms the basis of a coordinated dissemination of standard frequencies and time signals. It corresponds exactly in rate with  the international reference scale of atomic time (TAI) but differs from it by an integer number of seconds.  TAI, based on the second (SI), as realized on the rotating geoid, is formed by the BIPM on the basis of clock data supplied by cooperating establishments. It is in the form of a continuous scale, e.g. in days, hours, minutes and seconds from the origin 1 January, 1958 (adopted by the CGPM 1971). ",
   :dtype/literal "utc-date",
   :owl/sameAs :qudt/DATETIME,
   :qudt/dimensionality 1,
   :qudt/encodingDescription
   "YYYY-MM-DDThh:mm:ss[.dd] or YYYY-DDDThh:mm:ss[.dd], where 'YYYY' is the year, 'MM' is the two-digit month, 'DD' is the two-digit day, 'DDD' is the three digit day of year, 'T' is constant, 'hh:mm:ss[.dd]' is the UTC time in hours, minutes, seconds, and optional fractional seconds. As many 'd' characters to the right of the period as required may be used to obtain the required precision. All fields require leading zeros.",
   :qudt/rdfsDatatype :xsd/dateTime,
   :rdf/type :qudt/DateStringType,
   :rdfs/label "UTC Date Time"})

(def ^{:private true} UTC-DAYTIME
  "UTC DAY TIME"
  {:db/ident            :qudt/UTC-DAYTIME,
   :dtype/literal       "utc-dayTime",
   :qudt/dimensionality 1,
   :qudt/encodingDescription
   "YYYY-DDDThh:mm:ss.ddZ, where each character is an ASCII character using one octet with the following meanings: YYYY = Year in four-character subfield with values 0001-9999, DDD = Day of year in three-character subfield with values 001-365 or -366, T =  Calendar-Time separator, hh = Hour in two-character subfield with values 00-23,  mm = Minute in two-character subfield with values 00-59, ss = Second in two-character subfield with values 00-59 (-58 or -60 during leap seconds), dd = Decimal fraction of second in one- to n-character subfield, each d has values 0-9, and Z = time code terminator (optional)",
   :qudt/rdfsDatatype   :qudt/UTC-DayTime,
   :rdf/type            :qudt/DateStringType,
   :rdfs/label          "UTC DAY TIME"})

(def ^{:private true} UTC-DayTime
  "YYYY-DDDThh:mm:ss.ddZ, where each character is an ASCII character using one octet with the following meanings: YYYY = Year in four-character subfield with values 0001-9999, DDD = Day of year in three-character subfield with values 001-365 or -366, T = Calendar-Time separator, hh = Hour in two-character subfield with values 00-23, mm = Minute in two-character subfield with values 00-59, ss = Second in two-character subfield with values 00-59 (-58 or -60 during leap seconds), dd = Decimal fraction of second in one- to n-character subfield, each d has values 0-9, and Z = time code terminator (optional)"
  {:db/ident         :qudt/UTC-DayTime,
   :dcterms/description
   "YYYY-DDDThh:mm:ss.ddZ, where each character is an ASCII character using one octet with the following meanings: YYYY = Year in four-character subfield with values 0001-9999, DDD = Day of year in three-character subfield with values 001-365 or -366, T =  Calendar-Time separator, hh = Hour in two-character subfield with values 00-23,  mm = Minute in two-character subfield with values 00-59, ss = Second in two-character subfield with values 00-59 (-58 or -60 during leap seconds), dd = Decimal fraction of second in one- to n-character subfield, each d has values 0-9, and Z = time code terminator (optional)",
   :owl/equivalentClass
   {:owl/onDatatype :xsd/string,
    :owl/withRestrictions
    [{:xsd/length 22}
     {:xsd/pattern
      "[0-9]{4}\\\\-[0-9]{3}T[0-9]{2}:[0-9]{2}:[0-9]{2}\\\\.[0-9]{2}Z?"}],
    :rdf/type       :rdfs/Datatype},
   :rdf/type         [:owl/DataRange :rdfs/Datatype],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "UTC Day time",
   :rdfs/subClassOf  :xsd/string})

(def ^{:private true} UTF16-STRING
  "UTF16 String"
  {:db/ident            :qudt/UTF16-STRING,
   :dtype/literal       "utf16",
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt/UTF16-CHAR,
   :qudt/encoding       :qudt/UTF16-StringEncoding,
   :rdf/type            :qudt/StringUTF16,
   :rdfs/label          "UTF16 String"})

(def ^{:private true} UTF16-StringEncoding
  "UTF-16 String"
  {:db/ident   :qudt/UTF16-StringEncoding,
   :rdf/type   :qudt/StringEncodingType,
   :rdfs/label "UTF-16 String"})

(def ^{:private true} UTF8-STRING
  "String consisting of UTF-8 characters"
  {:db/ident            :qudt/UTF8-STRING,
   :dcterms/description "String consisting of UTF-8 characters",
   :dtype/literal       "utf8",
   :owl/sameAs          :qudt/STRING,
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt/UTF8-CHAR,
   :qudt/encoding       :qudt/UTF8-StringEncoding,
   :rdf/type            :qudt/StringUTF8,
   :rdfs/label          "UTF8 String"})

(def ^{:private true} UTF8-StringEncoding
  "UTF-8 Encoding"
  {:db/ident   :qudt/UTF8-StringEncoding,
   :qudt/bytes 8,
   :rdf/type   :qudt/StringEncodingType,
   :rdfs/label "UTF-8 Encoding"})

(def ^{:private true} Unpublished
  "Pub unpublished type"
  {:db/ident      :qudt/Unpublished,
   :dtype/literal "unpublished",
   :rdf/type      :qudt/PubEnumeratedType,
   :rdfs/label    "Pub unpublished type"})

(def ^{:private true} UnsignedBigIntegerType
  "An Unsgned Big Integer is an unsigned integer that can be represented in eight octets (64 bits) of machine memory."
  {:db/ident :qudt/UnsignedBigIntegerType,
   :dcterms/description
   "An Unsgned Big Integer is an unsigned integer that can be represented in eight octets (64 bits) of machine memory.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Big Integer Type",
   :rdfs/subClassOf [:qudt/UnsignedIntegerType
                     {:owl/hasValue   {:xsd/string "2^{64}-1"},
                      :owl/onProperty :qudt/maxInclusive,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   {:xsd/string "0"},
                      :owl/onProperty :qudt/minInclusive,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   {:xsd/string "UI64"},
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}
                     :qudt/BigIntegerType],
   :sh/property [:qudt/UnsignedBigIntegerType-maxInclusive
                 :qudt/UnsignedBigIntegerType-abbreviation
                 :qudt/UnsignedBigIntegerType-minInclusive]})

(def ^{:private true} UnsignedBigIntegerType-abbreviation
  {:db/ident    :qudt/UnsignedBigIntegerType-abbreviation,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "UI64",
   :sh/path     :qudt/abbreviation})

(def ^{:private true} UnsignedBigIntegerType-maxInclusive
  {:db/ident    :qudt/UnsignedBigIntegerType-maxInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "2^{64}-1",
   :sh/or       :qudt/NumericUnionList,
   :sh/path     :qudt/maxInclusive})

(def ^{:private true} UnsignedBigIntegerType-minInclusive
  {:db/ident    :qudt/UnsignedBigIntegerType-minInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "0",
   :sh/or       [{:sh/datatype :xsd/string}
                 {:sh/datatype :xsd/integer}
                 {:sh/datatype :xsd/float}
                 {:sh/datatype :xsd/decimal}],
   :sh/path     :qudt/minInclusive})

(def ^{:private true} UnsignedIntegerEncoding
  "Unsigned Integer Encoding"
  {:db/ident   :qudt/UnsignedIntegerEncoding,
   :qudt/bytes 4,
   :rdf/type   :qudt/IntegerEncodingType,
   :rdfs/label "Unsigned Integer Encoding"})

(def ^{:private true} UnsignedIntegerType
  "Unsgned Integers are integers that are either strictly non-negative or non-positive."
  {:db/ident :qudt/UnsignedIntegerType,
   :dcterms/description
   "Unsgned Integers are integers that are either strictly non-negative or non-positive.",
   :owl/disjointWith :qudt/SignedIntegerType,
   :owl/equivalentClass {:owl/intersectionOf [:qudt/IntegerDatatype
                                              :qudt/UnsignedType],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Integer Type",
   :rdfs/subClassOf [:qudt/UnsignedType :qudt/IntegerDatatype]})

(def ^{:private true} UnsignedLongIntegerType
  "An Unsigned Long Integer is an unsigned integer that can be represented in four octets (32 bits) of machine memory."
  {:db/ident :qudt/UnsignedLongIntegerType,
   :dcterms/description
   "An Unsigned Long Integer is an unsigned integer that can be represented in four octets (32 bits) of machine memory.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Long Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   {:xsd/string "2^{32}-1"},
                      :owl/onProperty :qudt/maxInclusive,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   {:xsd/string "UI32"},
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   {:xsd/string "0"},
                      :owl/onProperty :qudt/minInclusive,
                      :rdf/type       :owl/Restriction}
                     :qudt/UnsignedIntegerType
                     :qudt/LongIntegerType],
   :sh/property [:qudt/UnsignedLongIntegerType-minInclusive
                 :qudt/UnsignedLongIntegerType-maxInclusive
                 :qudt/UnsignedLongIntegerType-literal]})

(def ^{:private true} UnsignedLongIntegerType-maxInclusive
  {:db/ident    :qudt/UnsignedLongIntegerType-maxInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "2^{32}-1",
   :sh/or       :qudt/NumericUnionList,
   :sh/path     :qudt/maxInclusive})

(def ^{:private true} UnsignedLongIntegerType-minInclusive
  {:db/ident    :qudt/UnsignedLongIntegerType-minInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "0",
   :sh/or       [{:sh/datatype :xsd/string}
                 {:sh/datatype :xsd/integer}
                 {:sh/datatype :xsd/float}
                 {:sh/datatype :xsd/decimal}],
   :sh/path     :qudt/minInclusive})

(def ^{:private true} UnsignedMediumIntegerType
  "An \"Unsigned Medium Integers\" is an integer of 24 bits that only takes on both positive values."
  {:db/ident         :qudt/UnsignedMediumIntegerType,
   :dcterms/description
   "An \"Unsigned Medium Integers\" is an integer of 24 bits that only takes on both positive values.",
   :owl/equivalentClass {:owl/intersectionOf [:qudt/IntegerDatatype
                                              :qudt/SignedType],
                         :rdf/type :owl/Class},
   :rdf/type         [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Signed Integer Type",
   :rdfs/subClassOf  [{:owl/hasValue   {:xsd/long 3},
                       :owl/onProperty :qudt/bytes,
                       :rdf/type       :owl/Restriction}
                      :qudt/UnsignedIntegerType]})

(def ^{:private true} UnsignedShortIntegerType
  "An Unsigned Short Integer is an unsigned integer that can be represented in four octets (32 bits) of machine memory."
  {:db/ident :qudt/UnsignedShortIntegerType,
   :dcterms/description
   "An Unsigned Short Integer is an unsigned integer that can be represented in four octets (32 bits) of machine memory.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Short Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   {:xsd/string "UI16"},
                      :owl/onProperty :dtype/literal,
                      :rdf/type       :owl/Restriction}
                     :qudt/ShortIntegerType
                     {:owl/hasValue   {:xsd/string "2^{16}-1"},
                      :owl/onProperty :qudt/maxInclusive,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   {:xsd/string "0"},
                      :owl/onProperty :qudt/minInclusive,
                      :rdf/type       :owl/Restriction}
                     :qudt/UnsignedIntegerType],
   :sh/property [:qudt/UnsignedShortIntegerType-maxInclusive
                 :qudt/UnsignedShortIntegerType-minInclusive
                 :qudt/UnsignedShortIntegerType-abbreviation]})

(def ^{:private true} UnsignedShortIntegerType-abbreviation
  {:db/ident    :qudt/UnsignedShortIntegerType-abbreviation,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "UI16",
   :sh/path     :qudt/abbreviation})

(def ^{:private true} UnsignedShortIntegerType-maxInclusive
  {:db/ident    :qudt/UnsignedShortIntegerType-maxInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "2^{16}-1",
   :sh/path     :qudt/maxInclusive})

(def ^{:private true} UnsignedShortIntegerType-minInclusive
  {:db/ident    :qudt/UnsignedShortIntegerType-minInclusive,
   :rdf/type    :sh/PropertyShape,
   :sh/hasValue "0",
   :sh/path     :qudt/minInclusive})

(def ^{:private true} UnsignedType
  "An unsigned data type is a numeric type that does not distinguish between positive and negative values."
  {:db/ident :qudt/UnsignedType,
   :dcterms/description
   "An unsigned data type is a numeric type that does not distinguish between positive and negative values.",
   :owl/disjointWith :qudt/SignedType,
   :owl/equivalentClass {:owl/intersectionOf [:qudt/NumericType
                                              {:owl/hasValue
                                               :qudt.type/Unsigned,
                                               :owl/onProperty :qudt/signedness,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Type",
   :rdfs/subClassOf [{:owl/hasValue   :qudt.type/Unsigned,
                      :owl/onProperty :qudt/signedness,
                      :rdf/type       :owl/Restriction}
                     :qudt/NumericType],
   :sh/property :qudt/UnsignedType-signedness})

(def ^{:private true} UnsignedType-signedness
  {:db/ident    :qudt/UnsignedType-signedness,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/SignednessType,
   :sh/hasValue :qudt/UNSIGNED,
   :sh/path     :qudt/signedness})

(def ^{:private true} UnsignedVariableLengthIntegerType
  "An Unsigned Variable Length Integer data type defines a data structure for representing unsigned integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length."
  {:db/ident :qudt/UnsignedVariableLengthIntegerType,
   :dcterms/description
   "An Unsigned Variable Length Integer data type defines a data structure for representing unsigned integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Unsigned Variable Length Integer Type",
   :rdfs/subClassOf [:qudt/VariableLengthIntegerType
                     :qudt/UnsignedIntegerType]})

(def ^{:private true} UserModifiableParameter
  "Parameter is modifiable by a user."
  {:db/ident     :qudt/UserModifiableParameter,
   :qudt/code    "2",
   :qudt/literal "user",
   :rdf/type     :qudt/ParameterModifiabilityType,
   :rdfs/comment "Parameter is modifiable by a user.",
   :rdfs/label   "User modifiable parameter"})

(def ^{:private true} VECTOR
  "VECTOR"
  {:db/ident   :qudt/VECTOR,
   :qudt/dimensionality 1,
   :rdf/type   :qudt/VectorType,
   :rdfs/label "VECTOR"})

(def ^{:private true} VECTOR_3D
  "VECTOR 3D"
  {:db/ident   :qudt/VECTOR_3D,
   :qudt/dimensionality 1,
   :qudt/protocolBuffersName "Vector3D",
   :rdf/type   :qudt/VectorType,
   :rdfs/label "VECTOR 3D"})

(def ^{:private true} VariableIntervalTimeSeriesArray
  "A Variable Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over non-uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals. For variable interval time series, the successive time intervals may follow a repeating pattern, or may be completely random."
  {:db/ident :qudt/VariableIntervalTimeSeriesArray,
   :dcterms/description
   "A Variable Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over non-uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals. For variable interval time series, the successive time intervals may follow a repeating pattern, or may be completely random.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Variable Interval Time Series Array Type",
   :rdfs/subClassOf :qudt/TimeSeriesArray})

(def ^{:private true} VariableIntervalTimeSeriesArrayType
  "A Variable Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over non-uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals. For variable interval time series, the successive time intervals may follow a repeating pattern, or may be completely random."
  {:db/ident :qudt/VariableIntervalTimeSeriesArrayType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Variable Interval Time Series Array Type is a data type that specifies the properties of arrays that hold time series data that has been sampled over non-uniformly spaced time intervals. A time series is a sequence of data points, measured typically at successive times, spaced at uniform or non-uniform time intervals. For variable interval time series, the successive time intervals may follow a repeating pattern, or may be completely random.",
   :rdfs/label "Variable Interval Time Series Array Type",
   :rdfs/subClassOf :qudt/TimeSeriesArrayType})

(def ^{:private true} VariableLengthIntegerType
  "A Variable Length Integer data type defines a data structure for representing integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length."
  {:db/ident :qudt/VariableLengthIntegerType,
   :dcterms/description
   "A Variable Length Integer data type defines a data structure for representing integers that uses a variable number of bits depending on the magnitude of the integer. Typically, variable length integer data types are between one and 64 bits in length.",
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Variable Length Integer Type",
   :rdfs/subClassOf [{:owl/hasValue   {:xsd/long 1},
                      :owl/onProperty :qudt/minBits,
                      :rdf/type       :owl/Restriction}
                     :qudt/IntegerDatatype
                     {:owl/hasValue   {:xsd/long 64},
                      :owl/onProperty :qudt/maxBits,
                      :rdf/type       :owl/Restriction}],
   :sh/property [:qudt/VariableLengthIntegerType-maxBits
                 :qudt/VariableLengthIntegerType-minBits]})

(def ^{:private true} VariableLengthIntegerType-maxBits
  {:db/ident    :qudt/VariableLengthIntegerType-maxBits,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/hasValue 64,
   :sh/path     :qudt/maxBits})

(def ^{:private true} VariableLengthIntegerType-minBits
  {:db/ident    :qudt/VariableLengthIntegerType-minBits,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/hasValue 1,
   :sh/path     :qudt/minBits})

(def ^{:private true} Vector
  "A Vector Type is a data type that specifies the properties of data structures that hold vectors."
  {:db/ident :qudt/Vector,
   :dcterms/description
   "A Vector Type is a data type that specifies the properties of data structures that hold vectors.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Vector Type",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/dimensionality,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue   {:xsd/long 1},
                      :owl/onProperty :qudt/dimensionality,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/dimension,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :qudt/referenceFrame,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :qudt/ReferenceFrame,
                      :owl/onProperty    :qudt/referenceFrame,
                      :rdf/type          :owl/Restriction}
                     :qudt/CompositeDatatype]})

(def ^{:private true} Vector-dimension
  {:db/ident    :qudt/Vector-dimension,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/dimension})

(def ^{:private true} Vector-dimensionality
  {:db/ident    :qudt/Vector-dimensionality,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :qudt/dimensionality})

(def ^{:private true} Vector-referenceFrame
  {:db/ident    :qudt/Vector-referenceFrame,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/ReferenceFrame,
   :sh/maxCount 1,
   :sh/path     :qudt/referenceFrame})

(def ^{:private true} VectorArray
  "A vector array is an array whose elements are all state vectors. As a data type, a vector array type is used to describe the structure of vector array valued quantities by specifying the types of the array's elements."
  {:db/ident :qudt/VectorArray,
   :dcterms/description
   "A vector array is an array whose elements are all state vectors. As a data type, a vector array type is used to describe the structure of vector array valued quantities by specifying the types of the array's elements.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Vector Array Type",
   :rdfs/subClassOf [{:owl/allValuesFrom :qudt/StateSpaceVector,
                      :owl/onProperty    "http://qudt.org/schema/type#vector",
                      :rdf/type          :owl/Restriction}
                     :qudt/Array]})

(def ^{:private true} VectorArray-vector
  {:db/ident :qudt/VectorArray-vector,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/StateSpaceVectorType,
   :sh/path  :qudt/vector})

(def ^{:private true} VectorArrayType
  "A vector array is an array whose elements are all state vectors. As a data type, a vector array type is used to describe the structure of vector array valued quantities by specifying the types of the array's elements."
  {:db/ident :qudt/VectorArrayType,
   :dcterms/description
   "A vector array is an array whose elements are all state vectors. As a data type, a vector array type is used to describe the structure of vector array valued quantities by specifying the types of the array's elements.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Vector Array Type",
   :rdfs/subClassOf :qudt/ArrayType,
   :sh/property :qudt/VectorArray-vector})

(def ^{:private true} VectorType
  "A Vector Type is a data type that specifies the properties of data structures that hold vectors."
  {:db/ident :qudt/VectorType,
   :dcterms/description
   "A Vector Type is a data type that specifies the properties of data structures that hold vectors.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/label "Vector Type",
   :rdfs/subClassOf :qudt/CompositeDatatype,
   :sh/property [:qudt/Vector-referenceFrame
                 :qudt/Vector-dimensionality
                 :qudt/Vector-dimension]})

(def ^{:private true} VehicleCoordinateSystem
  "A sub-type of 'Aerospace coordinate system'. Detailed desciption to be provided in a future version."
  {:db/ident :qudt/VehicleCoordinateSystem,
   :dcterms/description
   "A sub-type of 'Aerospace coordinate system'. Detailed desciption to be provided in a future version.",
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Vehicle coordinate system",
   :rdfs/subClassOf [:qudt/AerospaceCoordinateSystem
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/pitchRotationDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/AxialOrientationType,
                      :owl/onProperty    :qudt/rollRotationDefinition,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/rollRotationDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/AxialOrientationType,
                      :owl/onProperty    :qudt/yawRotationDefinition,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :qudt/yawRotationDefinition,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :qudt/AxialOrientationType,
                      :owl/onProperty    :qudt/pitchRotationDefinition,
                      :rdf/type          :owl/Restriction}],
   :sh/property [:qudt/VehicleCoordinateSystem-pitchRotationDefinition
                 :qudt/VehicleCoordinateSystem-yawRotationDefinition
                 :qudt/VehicleCoordinateSystem-rollRotationDefinition]})

(def ^{:private true} VehicleCoordinateSystem-pitchRotationDefinition
  {:db/ident    :qudt/VehicleCoordinateSystem-pitchRotationDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/AxialOrientationType,
   :sh/maxCount 1,
   :sh/path     :qudt/pitchRotationDefinition})

(def ^{:private true} VehicleCoordinateSystem-rollRotationDefinition
  {:db/ident    :qudt/VehicleCoordinateSystem-rollRotationDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/AxialOrientationType,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/rollRotationDefinition})

(def ^{:private true} VehicleCoordinateSystem-yawRotationDefinition
  {:db/ident    :qudt/VehicleCoordinateSystem-yawRotationDefinition,
   :rdf/type    :sh/PropertyShape,
   :sh/class    :qudt/AxialOrientationType,
   :sh/maxCount 1,
   :sh/minCount 0,
   :sh/path     :qudt/yawRotationDefinition})

(def ^{:private true} VisualCue
  "Visual Cue"
  {:db/ident        :qudt/VisualCue,
   :rdf/type        :owl/Class,
   :rdfs/label      "Visual Cue",
   :rdfs/subClassOf :qudt/ModalCue})

(def ^{:private true} VisualCueEnumeration-defaultValue
  {:db/ident :qudt/VisualCueEnumeration-defaultValue,
   :rdf/type :sh/PropertyShape,
   :sh/class :qudt/VisualCue,
   :sh/path  :qudt/defaultValue})

(def ^{:private true} WDST_DRY
  "Dry"
  {:db/ident         :qudt/WDST_DRY,
   :dtype/literal    "dry",
   :qudt/code        "2",
   :rdf/type         :qudt/WetDryStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Dry"})

(def ^{:private true} WDST_WET
  "Wet"
  {:db/ident         :qudt/WDST_WET,
   :dtype/literal    "wet",
   :qudt/code        "1",
   :rdf/type         :qudt/WetDryStateType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Wet"})

(def ^{:private true} WetDryStateType
  "Wet dry state type"
  {:db/ident         :qudt/WetDryStateType,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Wet dry state type",
   :rdfs/subClassOf  [:qudt/EnumeratedValue :qudt/DiscreteState]})

(def ^{:private true} WordAligned
  "Word Aligned"
  {:db/ident      :qudt/WordAligned,
   :dtype/literal "word",
   :rdf/type      :qudt/AlignmentType,
   :rdfs/label    "Word Aligned"})

(def ^{:private true} YDT
  "Year Day Time"
  {:db/ident            :qudt/YDT,
   :dtype/literal       "YDT",
   :qudt/dimensionality 1,
   :qudt/encodingDescription "TBD",
   :qudt/rdfsDatatype   :xsd/string,
   :rdf/type            :qudt/DateStringType,
   :rdfs/label          "Year Day Time"})

(def ^{:private true} Yes
  "Yes"
  {:db/ident     :qudt/Yes,
   :qudt/literal "Y",
   :rdf/type     :qudt/YesNoType,
   :rdfs/label   "Yes"})

(def ^{:private true} YesNoType
  "Yes no type"
  {:db/ident        :qudt/YesNoType,
   :rdf/type        :owl/Class,
   :rdfs/label      "Yes no type",
   :rdfs/subClassOf :qudt/EnumeratedValue})

(def ^{:private true} abbreviation
  "abbreviation"
  {:db/ident         :qudt/abbreviation,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "abbreviation"})

(def ^{:private true} accuracy
  "Accuracy is the degree to which a given quantity is correct and free from error. For example, a quantity specified as 100+/-1 has an (absolute) accuracy of +/-1 (meaning its true value can fall in the range 99-101), while a quantity specified as 100+/-2% has a (relative) accuracy of +/-2% (meaning its true value can fall in the range 98-102). The concepts of accuracy and precision are both closely related and often confused. While the accuracy of a number x is given by the number of significant decimal (or other) digits to the right of the decimal point in x, the precision of x is the total number of significant decimal (or other) digits."
  {:db/ident :qudt/accuracy,
   :dcterms/description
   "Accuracy is the degree to which a given quantity is correct and free from error. For example, a quantity specified as 100+/-1 has an (absolute) accuracy of +/-1 (meaning its true value can fall in the range 99-101), while a quantity specified as 100+/-2% has a (relative) accuracy of +/-2% (meaning its true value can fall in the range 98-102).\n\nThe concepts of accuracy and precision are both closely related and often confused. While the accuracy of a number x is given by the number of significant decimal (or other) digits to the right of the decimal point in x, the precision of x is the total number of significant decimal (or other) digits. ",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "accuracy",
   :rdfs/range :xsd/integer})

(def ^{:private true} alignment
  "alignment"
  {:db/ident         :qudt/alignment,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "alignment"})

(def ^{:private true} allowedPattern
  "This property relates a date string encoding (c.f. type:DateStringEncodingType) to one or more XML Schema compliant regular expressions that together determine the allowed lexical expressions that can be unambiguously parsed to determine a temporal quantity."
  {:db/ident :qudt/allowedPattern,
   :dcterms/description
   "This property relates a date string encoding (c.f. type:DateStringEncodingType) to one or more XML Schema compliant regular expressions that together determine the allowed lexical expressions that can be unambiguously parsed to determine a temporal quantity.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "allowed pattern",
   :rdfs/range :xsd/string})

(def ^{:private true} ansiSQLName
  "ANSI SQL name"
  {:db/ident           :qudt/ansiSQLName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "ANSI SQL name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def ^{:private true} arg1Type
  "This property relates a funciton data type with the type of its arg1."
  {:db/ident           :qudt/arg1Type,
   :dcterms/description
   "This property relates a funciton data type with the type of its arg1.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "arg1Type",
   :rdfs/subPropertyOf :qudt/argType})

(def ^{:private true} arg2Type
  "This property relates a funciton data type with the type of its arg2."
  {:db/ident           :qudt/arg2Type,
   :dcterms/description
   "This property relates a funciton data type with the type of its arg2.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "arg2Type",
   :rdfs/subPropertyOf :qudt/argType})

(def ^{:private true} arg3Type
  "This property relates a funciton data type with the type of its arg3."
  {:db/ident           :qudt/arg3Type,
   :dcterms/description
   "This property relates a funciton data type with the type of its arg3.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "arg3Type",
   :rdfs/subPropertyOf :qudt/argType})

(def ^{:private true} argType
  "This property relates a function data type with the type of one of its arguments."
  {:db/ident           :qudt/argType,
   :dcterms/description
   "This property relates a function data type with the type of one of its arguments.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "argType",
   :rdfs/subPropertyOf :qudt/elementType})

(def ^{:private true} auralCue
  "aural cue"
  {:db/ident           :qudt/auralCue,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "aural cue",
   :rdfs/subPropertyOf :qudt/modalCue})

(def ^{:private true} auralCueEnumeration
  "aural cue enumeration"
  {:db/ident           :qudt/auralCueEnumeration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "aural cue enumeration",
   :rdfs/subPropertyOf :qudt/modalCueEnumeration})

(def ^{:private true} base
  "base"
  {:db/ident         :qudt/base,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "base",
   :rdfs/range       :xsd/integer})

(def ^{:private true} basis
  "basis"
  {:db/ident         :qudt/basis,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "basis"})

(def ^{:private true} bitOrder
  "bit order"
  {:db/ident         :qudt/bitOrder,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "bit order",
   :rdfs/range       :qudt/EndianType})

(def ^{:private true} bits
  "bits"
  {:db/ident         :qudt/bits,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "bits",
   :rdfs/range       :xsd/integer})

(def ^{:private true} bounded
  "A datatype is bounded if its value space has either a finite upper and lower bound. Either bound may be inclusive or exclusive."
  {:db/ident :qudt/bounded,
   :dcterms/description
   "A datatype is bounded if its value space has either a finite upper and lower bound. Either bound may be inclusive or exclusive. ",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "bounded",
   :rdfs/range :xsd/boolean})

(def ^{:private true} byRow
  "A boolean to specify whether an array is presented row by row or column by column."
  {:db/ident :qudt/byRow,
   :dcterms/description
   "A boolean to specify whether an array is presented row by row or column by column.",
   :rdf/type [:owl/DeprecatedProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "by row",
   :rdfs/range :xsd/boolean,
   :vaem/rationale "Replaced with an enumeration. See type:ArrayDataOrderType"})

(def ^{:private true} byteOrder
  "Byte order is an enumeration of two values: 'Big Endian' and 'Little Endian' and is used to denote whether the most signiticant byte is either first or last, respectively."
  {:db/ident :qudt/byteOrder,
   :dcterms/description
   "Byte order is an enumeration of two values: 'Big Endian' and 'Little Endian' and is used to denote whether the most signiticant byte is either first or last, respectively.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "byte order",
   :rdfs/range :qudt/EndianType})

(def ^{:private true} bytes
  "bytes"
  {:db/ident         :qudt/bytes,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "bytes",
   :rdfs/range       :xsd/integer})

(def ^{:private true} cName
  {:db/ident :qudt/cName,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :qudt/id})

(def ^{:private true} cardinality
  "cardinality"
  {:db/ident         :qudt/cardinality,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "cardinality"})

(def ^{:private true} columns
  "columns"
  {:db/ident         :qudt/columns,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "columns",
   :rdfs/range       :xsd/integer})

(def ^{:private true} coordinateCenter
  "coordinate center"
  {:db/ident         :qudt/coordinateCenter,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :qudt/CoordinateSystem,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "coordinate center",
   :rdfs/range       :qudt/CoordinateCenterType,
   :skos/prefLabel   "coordinate center"})

(def ^{:private true} coordinateSystem
  "coordinate system"
  {:db/ident         :qudt/coordinateSystem,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "coordinate system"})

(def ^{:private true} coordinateSystemFrame
  "coordinate system frame"
  {:db/ident         :qudt/coordinateSystemFrame,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "coordinate system frame"})

(def ^{:private true} dataOrder
  "data order"
  {:db/ident         :qudt/dataOrder,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "data order"})

(def ^{:private true} dataType
  {:db/ident :qudt/dataType,
   :rdf/type :owl/ObjectProperty})

(def ^{:private true} defaultValue
  "Default Value"
  {:db/ident         :qudt/defaultValue,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Default Value"})

(def ^{:private true} dimension
  "The number of elements in a vector."
  {:db/ident            :qudt/dimension,
   :dcterms/description "The number of elements in a vector.",
   :rdf/type            :owl/DatatypeProperty,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "dimension",
   :rdfs/range          :xsd/integer})

(def ^{:private true} dimensionVector
  "dimension vector"
  {:db/ident         :qudt/dimensionVector,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "dimension vector",
   :rdfs/range       :qudt/DimensionVector})

(def ^{:private true} dimensionality
  "The number of dimensions making up an array. For example a 4 by 4 array has a dimensionality of 2. Whereas a vector or a string has a dimensionality of 1."
  {:db/ident :qudt/dimensionality,
   :dcterms/description
   "The number of dimensions making up an array. For example a 4 by 4 array has a dimensionality of 2. Whereas a vector or a string has a dimensionality of 1.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "dimensionality",
   :rdfs/range :xsd/integer})

(def ^{:private true} elementKind
  "This property is used to describe the quantity kind for a dimensional data type."
  {:db/ident           :qudt/elementKind,
   :dcterms/description
   "This property is used to describe the quantity kind for a dimensional data type.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "element kind",
   :rdfs/subPropertyOf :qudt/elementKind})

(def ^{:private true} elementLabel
  "This property is used to label the field of a composite data structure."
  {:db/ident   :qudt/elementLabel,
   :dcterms/description
   "This property is used to label the field of a composite data structure.",
   :rdf/type   :rdf/Property,
   :rdfs/label "element label"})

(def ^{:private true} elementName
  "element name"
  {:db/ident   :qudt/elementName,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "element name"})

(def ^{:private true} elementType
  "This property is used to relate a structured data type with the data type the structured type's elements. It is used for structured data types with elements that are all of the same type."
  {:db/ident :qudt/elementType,
   :dcterms/description
   "This property is used to relate a structured data type with the data type the structured type's elements. It is used for structured data types with elements that are all of the same type.",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "This property is used to relate a structured data type with the data type of the structured type's elements. It is used for homogeneous structured data types, that is, those whose elements that are all of the same type.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "element type",
   :vaem/todo "Change name to type:elementDataType"})

(def ^{:private true} elementTypeCount
  "This property determines the allowed number of element types that a structured data type may have."
  {:db/ident :qudt/elementTypeCount,
   :dcterms/description
   "This property determines the allowed number of element types that a structured data type may have.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "element type count",
   :rdfs/range :xsd/integer})

(def ^{:private true} elementTypeList
  "This property is used to relate a structured data type with a list of data types. The list members determine the types of structured type's elements. It is used for structured data types with elements that are of different types."
  {:db/ident         :qudt/elementTypeList,
   :dcterms/description
   "This property is used to relate a structured data type with a list of data types. The list members determine the types of structured type's elements. It is used for structured data types with elements that are of different types.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "element type list"})

(def ^{:private true} elementUnit
  "element unit"
  {:db/ident         :qudt/elementUnit,
   :rdf/type         [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "element unit"})

(def ^{:private true} encodedValue
  "encoded value"
  {:db/ident         :qudt/encodedValue,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "encoded value"})

(def ^{:private true} encoding
  "encoding"
  {:db/ident         :qudt/encoding,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "encoding"})

(def ^{:private true} encodingDescription
  "encoding description"
  {:db/ident         :qudt/encodingDescription,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "encoding description",
   :rdfs/range       :xsd/string})

(def ^{:private true} enumeration
  "enumeration"
  {:db/ident   :qudt/enumeration,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "enumeration"})

(def ^{:private true} exponent
  "exponent"
  {:db/ident   :qudt/exponent,
   :rdf/type   [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/label "exponent"})

(def ^{:private true} field
  {:db/ident :qudt/field,
   :rdf/type :rdf/Property})

(def ^{:private true} fieldLabels
  "This property is used to list the field labels for a record type."
  {:db/ident         :qudt/fieldLabels,
   :dcterms/description
   "This property is used to list the field labels for a record type.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "field labels"})

(def ^{:private true} fieldName
  "field name"
  {:db/ident         :qudt/fieldName,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "field name",
   :rdfs/range       :xsd/string})

(def ^{:private true} float_X
  "float X"
  {:db/ident         :qudt/float_X,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "float X",
   :rdfs/range       :xsd/anySimpleType})

(def ^{:private true} float_Y
  "float Y"
  {:db/ident         :qudt/float_Y,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "float Y",
   :rdfs/range       :xsd/anySimpleType})

(def ^{:private true} float_Z
  "float Z"
  {:db/ident         :qudt/float_Z,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "float Z",
   :rdfs/range       :xsd/anySimpleType})

(def ^{:private true} frameType
  "frame type"
  {:db/ident         :qudt/frameType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "frame type"})

(def ^{:private true} functionArity
  "This property is used to state the number of arguments for a function type."
  {:db/ident :qudt/functionArity,
   :dcterms/description
   "This property is used to state the number of arguments for a function type.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "function arity",
   :rdfs/range :xsd/integer})

(def ^{:private true} hexbinary
  "hexbinary"
  {:db/ident            :qudt/hexbinary,
   :owl/equivalentClass {:owl/onDatatype :xsd/string,
                         :owl/withRestrictions [{:xsd/pattern "[0-9A-F]*"}],
                         :rdf/type       :rdfs/Datatype},
   :rdf/type            :rdfs/Datatype,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "hexbinary",
   :rdfs/subClassOf     :xsd/string})

(def ^{:private true} iconicCue
  "iconic cue"
  {:db/ident           :qudt/iconicCue,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "iconic cue",
   :rdfs/subPropertyOf :qudt/modalCue})

(def ^{:private true} iconicCueEnumeration
  "iconic cue enumeration"
  {:db/ident           :qudt/iconicCueEnumeration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "iconic cue enumeration",
   :rdfs/subPropertyOf :qudt/modalCueEnumeration})

(def ^{:private true} id
  "id"
  {:db/ident         :qudt/id,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "id"})

(def ^{:private true} integer1to12
  "integer 1..12"
  {:db/ident            :qudt/integer1to12,
   :owl/equivalentClass {:owl/onDatatype :xsd/integer,
                         :owl/withRestrictions [{:xsd/minInclusive 1.0}
                                                {:xsd/maxInclusive 12.0}],
                         :rdf/type       :rdfs/Datatype},
   :rdf/type            [:owl/DataRange :rdfs/Datatype],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "integer 1..12",
   :rdfs/subClassOf     :xsd/integer})

(def ^{:private true} integer1to31
  "integer 1..31"
  {:db/ident            :qudt/integer1to31,
   :owl/equivalentClass {:owl/onDatatype :xsd/integer,
                         :owl/withRestrictions [{:xsd/minInclusive 1.0}
                                                {:xsd/maxInclusive 31.0}],
                         :rdf/type       :rdfs/Datatype},
   :rdf/type            [:owl/DataRange :rdfs/Datatype],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/schema/datatype",
   :rdfs/label          "integer 1..31",
   :rdfs/subClassOf     :xsd/integer})

(def ^{:private true} inverted
  "inverted"
  {:db/ident         :qudt/inverted,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "inverted",
   :rdfs/range       :xsd/boolean})

(def ^{:private true} isByteString
  "is byte string"
  {:db/ident         :qudt/isByteString,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "is byte string",
   :rdfs/range       :xsd/boolean})

(def ^{:private true} isComprisedOf
  {:db/ident :qudt/isComprisedOf,
   :rdf/type :rdf/Property})

(def ^{:private true} javaName
  "java name"
  {:db/ident           :qudt/javaName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "java name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def ^{:private true} jsName
  "Javascript name"
  {:db/ident           :qudt/jsName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "Javascript name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def ^{:private true} kinestheticCue
  "kinesthetic cue"
  {:db/ident           :qudt/kinestheticCue,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "kinesthetic cue",
   :rdfs/subPropertyOf :qudt/modalCue})

(def ^{:private true} kinestheticCueEnumeration
  "kinesthetic cue enumeration"
  {:db/ident           :qudt/kinestheticCueEnumeration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "kinesthetic cue enumeration",
   :rdfs/subPropertyOf :qudt/modalCueEnumeration})

(def ^{:private true} length
  "The length of a structure, for example the size of a vector"
  {:db/ident :qudt/length,
   :dcterms/description
   "The length of a structure, for example the size of a vector",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "length",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf [:qudt/minLength :qudt/maxLength]})

(def ^{:private true} lowerBound
  "lower bound"
  {:db/ident         :qudt/lowerBound,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "lower bound"})

(def ^{:private true} mantissa
  "In scientific notation, the mantissa of a real number is the integer coefficient preceding the base raised to the exponent."
  {:db/ident :qudt/mantissa,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "In scientific notation, the mantissa of a real number is the integer coefficient preceding the base raised to the exponent.",
   :rdfs/label "mantissa"})

(def ^{:private true} matlabName
  "matlab name"
  {:db/ident           :qudt/matlabName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "matlab name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def ^{:private true} maxBits
  "maximum bits"
  {:db/ident         :qudt/maxBits,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "maximum bits",
   :rdfs/range       :xsd/integer})

(def ^{:private true} maxDepth
  "max depth"
  {:db/ident         :qudt/maxDepth,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "max depth",
   :rdfs/range       :xsd/integer})

(def ^{:private true} maxExclusive
  "maxExclusive is the exclusive upper bound of the value space for a datatype with the ordered property. The value of maxExclusive must be in the value space of the base type or be equal to {value} in {base type definition}."
  {:db/ident :qudt/maxExclusive,
   :dcterms/description
   "maxExclusive is the exclusive upper bound of the value space for a datatype with the ordered property. The value of maxExclusive must be in the value space of the base type or be equal to {value} in {base type definition}.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "max exclusive",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :qudt/upperBound})

(def ^{:private true} maxExponent
  "max exponent"
  {:db/ident         :qudt/maxExponent,
   :rdf/type         [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "max exponent",
   :rdfs/range       :xsd/integer})

(def ^{:private true} maxInclusive
  "maxInclusive is the inclusive upper bound of the value space for a datatype with the ordered property. The value of maxInclusive must be in the value space of the base type."
  {:db/ident           :qudt/maxInclusive,
   :dcterms/description
   "maxInclusive is the inclusive upper bound of the value space for a datatype with the ordered property. The value of maxInclusive must be in the value space of the base type.",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "max inclusive",
   :rdfs/subPropertyOf :qudt/upperBound})

(def ^{:private true} maxLength
  "max length"
  {:db/ident         :qudt/maxLength,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "max length",
   :rdfs/range       :xsd/integer})

(def ^{:private true} maxMantissa
  "<p>The maximium mantissa is the largest integer that may appear as a coefficient in a finite precision representation of a real number. For a given numeric data type, the value of <em>maxMantissa}</em> (<em>M</em>) and the values of <em>base</em> (<em>b</em>) and <em>precision</em> (<em>p</em>) are related by the formula: <em>M = b<sup></sup> - 1</em> .</p>"
  {:db/ident :qudt/maxMantissa,
   :dcterms/description
   "<p>The maximium mantissa is the largest integer that may appear as a coefficient in a finite precision representation of a real number.  For a given numeric data type, the value of <em>maxMantissa}</em> (<em>M</em>) and the values of <em>base</em> (<em>b</em>) and  <em>precision</em> (<em>p</em>) are related by the formula: <em>M = b<sup></sup> - 1</em> .</p>",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "max mantissa",
   :rdfs/range :xsd/integer})

(def ^{:private true} microsoftSQLServerName
  "Microsoft SQL Server name"
  {:db/ident           :qudt/microsoftSQLServerName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "Microsoft SQL Server name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def ^{:private true} minBits
  "minimum bits"
  {:db/ident         :qudt/minBits,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "minimum bits",
   :rdfs/range       :xsd/integer})

(def ^{:private true} minExclusive
  "minExclusive is the exclusive lower bound of the value space for a datatype with the ordered property. The value of minExclusive must be in the value space of the base type or be equal to {value} in {base type definition}."
  {:db/ident           :qudt/minExclusive,
   :dcterms/description
   "minExclusive is the exclusive lower bound of the value space for a datatype with the ordered property. The value of minExclusive must be in the value space of the base type or be equal to {value} in {base type definition}.",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "min exclusive",
   :rdfs/subPropertyOf :qudt/lowerBound})

(def ^{:private true} minInclusive
  "minInclusive is the inclusive lower bound of the value space for a datatype with the ordered property. The value of minInclusive must be in the value space of the base type."
  {:db/ident           :qudt/minInclusive,
   :dcterms/description
   "minInclusive is the inclusive lower bound of the value space for a datatype with the ordered property. The value of minInclusive must be in the value space of the base type.",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "min inclusive",
   :rdfs/subPropertyOf :qudt/lowerBound})

(def ^{:private true} minLength
  "min length"
  {:db/ident         :qudt/minLength,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "min length",
   :rdfs/range       :xsd/integer})

(def ^{:private true} minMantissa
  "<p>The minimium mantissa is the negative integer with the greatest magnitude that may appear as a coefficient in a finite precision representation of a real number. For a given numeric data type, the value of <em>minMantissa</em> (<em>M</em>) and the values of <em>base</em> (<em>b</em>) and <em>precision</em> (<em>p</em>) are related by the formula: <em>M = -(b<sup>p</sup> - 1)</em>.</p>"
  {:db/ident :qudt/minMantissa,
   :dcterms/description
   "<p>The minimium mantissa is the negative integer with the greatest magnitude that may appear as a coefficient in a finite precision representation of a real number.  For a given numeric data type, the value of <em>minMantissa</em> (<em>M</em>) and the values of <em>base</em> (<em>b</em>) and <em>precision</em> (<em>p</em>) are related by the formula: <em>M = -(b<sup>p</sup> - 1)</em>.</p>",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "min mantissa",
   :rdfs/range :xsd/integer})

(def ^{:private true} minValue
  "minimum value"
  {:db/ident         :qudt/minValue,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "minimum value"})

(def ^{:private true} modalCue
  "modal cue"
  {:db/ident   :qudt/modalCue,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "modal cue"})

(def ^{:private true} modalCueEnumeration
  "modal cue enumeration"
  {:db/ident           :qudt/modalCueEnumeration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "modal cue enumeration",
   :rdfs/subPropertyOf :qudt/enumeration})

(def ^{:private true} modifiability
  "Reference to one in a list of enumerated elements that indicates whether data (e.g. variable or parameter) can be changed."
  {:db/ident :qudt/modifiability,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Reference to one in a list of enumerated elements that indicates whether data (e.g. variable or parameter) can be changed.",
   :rdfs/label "modifiability"})

(def ^{:private true} mySQLName
  "MySQL name"
  {:db/ident           :qudt/mySQLName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "MySQL name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def ^{:private true} negative
  "negative"
  {:db/ident     :qudt/negative,
   :qudt/code    "1",
   :qudt/literal "negative",
   :rdf/type     :qudt/Polarity,
   :rdfs/label   "negative"})

(def ^{:private true} octets
  "octets"
  {:db/ident         :qudt/octets,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "octets",
   :rdfs/range       :xsd/integer})

(def ^{:private true} odbcName
  "ODBC name"
  {:db/ident           :qudt/odbcName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "ODBC name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def ^{:private true} oleDBName
  "OLE DB (Object Linking and Embedding, Database, sometimes written as OLEDB or OLE-DB), an API designed by Microsoft, allows accessing data from a variety of sources in a uniform manner. The API provides a set of interfaces implemented using the Component Object Model (COM); it is otherwise unrelated to OLE."
  {:db/ident :qudt/oleDBName,
   :dcterms/description
   "OLE DB (Object Linking and Embedding, Database, sometimes written as OLEDB or OLE-DB), an API designed by Microsoft, allows accessing data from a variety of sources in a uniform manner. The API provides a set of interfaces implemented using the Component Object Model (COM); it is otherwise unrelated to OLE. ",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/windows/desktop/ms714931(v=vs.85).aspx"
    "http://en.wikipedia.org/wiki/OLE_DB"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "OLE DB name",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def ^{:private true} optional
  "optional"
  {:db/ident   :qudt/optional,
   :rdf/type   :rdf/Property,
   :rdfs/label "optional"})

(def ^{:private true} oracleSQLName
  "ORACLE SQL name"
  {:db/ident           :qudt/oracleSQLName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/domain        :qudt/Datatype,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "ORACLE SQL name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def ^{:private true} orderInStructure
  "order in structure"
  {:db/ident         :qudt/orderInStructure,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "order in structure"})

(def ^{:private true} orderedType
  "ordered type"
  {:db/ident         :qudt/orderedType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "ordered type"})

(def ^{:private true} orderingRelation
  "This property identifies the mathematical comparison operator (such as \"<\" or \">\") that is used to order the elements of a collection."
  {:db/ident         :qudt/orderingRelation,
   :dcterms/description
   "This property identifies the mathematical comparison operator (such as \"<\" or \">\") that is used to order the elements of a collection.",
   :rdf/type         [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Ordering Relation"})

(def ^{:private true} originDefinition
  "origin definition"
  {:db/ident         :qudt/originDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "origin definition",
   :rdfs/range       :xsd/string})

(def ^{:private true} padding
  "padding"
  {:db/ident         :qudt/padding,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "padding"})

(def ^{:private true} pattern
  "A pattern is a constraint on the value space of a datatype which is achieved by constraining the lexical space to literals which match a specific pattern. The value of pattern must be a regular expression."
  {:db/ident :qudt/pattern,
   :dcterms/description
   "A pattern is a constraint on the value space of a datatype which is achieved by constraining the lexical space to literals which match a specific pattern. The value of pattern must be a regular expression.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "pattern",
   :rdfs/range :xsd/string})

(def ^{:private true} pitchRotationDefinition
  "pitch rotation definition"
  {:db/ident           :qudt/pitchRotationDefinition,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "pitch rotation definition",
   :rdfs/subPropertyOf :qudt/rotationDefinition})

(def ^{:private true} positive
  "positive"
  {:db/ident     :qudt/positive,
   :qudt/code    "2",
   :qudt/literal "positive",
   :rdf/type     :qudt/Polarity,
   :rdfs/label   "positive"})

(def ^{:private true} precision
  "Precision is the number of digits used to perform a given computation. The concepts of accuracy and precision are both closely related and often confused. While the accuracy of a number x is given by the number of significant decimal (or other) digits to the right of the decimal point in x, the precision of x is the total number of significant decimal (or other) digits. For a given numeric data type, the value of type:precision (?p) is related to the values of type:maxMantissa (?M) and type:base (?b) by the formula ?p := log(?b, ?M) where log(a,y) = x iff y=a^x."
  {:db/ident :qudt/precision,
   :dcterms/description
   "Precision is the number of digits used to perform a given computation. The concepts of accuracy and precision are both closely related and often confused. While the accuracy of a number x is given by the number of significant decimal (or other) digits to the right of the decimal point in x, the precision of x is the total number of significant decimal (or other) digits.\n\nFor a given numeric data type, the value of type:precision (?p) is related to the values of type:maxMantissa (?M) and type:base (?b) by the formula \n\n?p := log(?b, ?M) \n\nwhere log(a,y) = x iff y=a^x.",
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "precision",
   :rdfs/range :xsd/integer})

(def ^{:private true} protocolBuffersName
  "protocol buffers name"
  {:db/ident           :qudt/protocolBuffersName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/label         "protocol buffers name",
   :rdfs/subPropertyOf :qudt/id})

(def ^{:private true} pythonName
  "python name"
  {:db/ident           :qudt/pythonName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "python name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def ^{:private true} rdfsDatatype
  "rdfs datatype"
  {:db/ident         :qudt/rdfsDatatype,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "rdfs datatype"})

(def ^{:private true} realization
  "realization"
  {:db/ident         :qudt/realization,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "realization",
   :rdfs/range       :xsd/string})

(def ^{:private true} referenceFrame
  "reference frame"
  {:db/ident           :qudt/referenceFrame,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "reference frame",
   :rdfs/subPropertyOf :qudt/coordinateSystemFrame})

(def ^{:private true} referenceFrameType
  "reference frame type"
  {:db/ident         :qudt/referenceFrameType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "reference frame type"})

(def ^{:private true} returnType
  "This property is used to state the return type of a function type."
  {:db/ident           :qudt/returnType,
   :dcterms/description
   "This property is used to state the return type of a function type.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "return type",
   :rdfs/subPropertyOf :qudt/elementType})

(def ^{:private true} rgbCode
  "rgb code"
  {:db/ident   :qudt/rgbCode,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "rgb code"})

(def ^{:private true} rollRotationDefinition
  "roll rotation definition"
  {:db/ident           :qudt/rollRotationDefinition,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "roll rotation definition",
   :rdfs/subPropertyOf :qudt/rotationDefinition})

(def ^{:private true} rotationDefinition
  "rotation definition"
  {:db/ident         :qudt/rotationDefinition,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "rotation definition"})

(def ^{:private true} rows
  "rows"
  {:db/ident         :qudt/rows,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "rows",
   :rdfs/range       :xsd/integer})

(def ^{:private true} signedness
  "signedness"
  {:db/ident         :qudt/signedness,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "signedness"})

(def ^{:private true} significantDigits
  "significant digits"
  {:db/ident         :qudt/significantDigits,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "significant digits",
   :rdfs/range       :xsd/integer})

(def ^{:private true} sound
  "The intended use of the sound property is to be associated with modal enumerations"
  {:db/ident :qudt/sound,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The intended use of the sound property is to be associated with modal enumerations",
   :rdfs/label "sound"})

(def ^{:private true} stringValue
  "string value"
  {:db/ident           :qudt/stringValue,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/label         "string value",
   :rdfs/subPropertyOf :qudt/scalarValue})

(def ^{:private true} timeDatatype
  "time datatype"
  {:db/ident           :qudt/timeDatatype,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "time datatype",
   :rdfs/subPropertyOf :qudt/type})

(def ^{:private true} totalDigits
  "total digits"
  {:db/ident   :qudt/totalDigits,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label "total digits"})

(def ^{:private true} type
  "A reference to the specification of the data type of a variable or constant."
  {:db/ident :qudt/type,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A reference to the specification of the data type of a variable or constant.",
   :rdfs/label "type"})

(def ^{:private true} typeMatrix
  "type matrix"
  {:db/ident         :qudt/typeMatrix,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "type matrix"})

(def ^{:private true} typeVector
  "type vector"
  {:db/ident         :qudt/typeVector,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "type vector"})

(def ^{:private true} upperBound
  "upper bound"
  {:db/ident         :qudt/upperBound,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "upper bound",
   :rdfs/range       :xsd/anySimpleType})

(def ^{:private true} value
  "This property identifies the value associated with a data structure. The value may be a scalar or a reference to another object. The disjoint sub-properties of this data:value distinguish between scalar values and object references."
  {:db/ident :qudt/value,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This property identifies the value associated with a data structure. The value may be a scalar or a reference to another object. The disjoint sub-properties of this data:value distinguish between scalar values and object references.",
   :rdfs/label "value",
   :rdfs/subPropertyOf :rdf/value})

(def ^{:private true} valueRange
  "value range"
  {:db/ident   :qudt/valueRange,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "value range"})

(def ^{:private true} valueType
  "value type"
  {:db/ident         :qudt/valueType,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "value type"})

(def ^{:private true} valueVector
  "A list of the values of elements in a Partial Array."
  {:db/ident     :qudt/valueVector,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "A list of the values of elements in a Partial Array.",
   :rdfs/label   "value vector"})

(def ^{:private true} vbName
  "Visual Basic name"
  {:db/ident           :qudt/vbName,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "Visual Basic name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :qudt/id})

(def ^{:private true} vector
  "vector"
  {:db/ident   :qudt/vector,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "vector"})

(def ^{:private true} visualCue
  "visual cue"
  {:db/ident           :qudt/visualCue,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "visual cue",
   :rdfs/subPropertyOf :qudt/modalCue})

(def ^{:private true} visualCueEnumeration
  "visual cue enumeration"
  {:db/ident           :qudt/visualCueEnumeration,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "visual cue enumeration",
   :rdfs/subPropertyOf :qudt/modalCueEnumeration})

(def ^{:private true} xAxisDefinition
  "The definition of the X-Axis could be an intersection, cross-product or other function of a meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth, Sun, Moon or other celestial body. An epoch might also be given."
  {:db/ident :qudt/xAxisDefinition,
   :dcterms/description
   "The definition of the X-Axis could be an intersection, cross-product or other function of a  meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth,  Sun, Moon or other celestial body. An epoch might also be given.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "X-Axis Definition",
   :rdfs/range :xsd/string})

(def ^{:private true} xCoordinateDefinition
  "X-Coordinate definition"
  {:db/ident         :qudt/xCoordinateDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "X-Coordinate definition",
   :rdfs/range       :xsd/string})

(def ^{:private true} yAxisDefinition
  "The definition of the Y-Axis could be an intersection, cross-product or other function of a meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth, Sun, Moon or other celestial body. An epoch might also be given."
  {:db/ident :qudt/yAxisDefinition,
   :dcterms/description
   "The definition of the Y-Axis could be an intersection, cross-product or other function of a meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth,  Sun, Moon or other celestial body. An epoch might also be given.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Y-Axis definition",
   :rdfs/range :xsd/string})

(def ^{:private true} yCoordinateDefinition
  "Y-Coordinate definition"
  {:db/ident         :qudt/yCoordinateDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Y-Coordinate definition",
   :rdfs/range       :xsd/string})

(def ^{:private true} yawRotationDefinition
  "Yaw rotation definition"
  {:db/ident           :qudt/yawRotationDefinition,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/schema/datatype",
   :rdfs/label         "Yaw rotation definition",
   :rdfs/subPropertyOf :qudt/rotationDefinition})

(def ^{:private true} zAxisDefinition
  "The definition of the Y-Axis could be an intersection, croos-product or other function of a meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth, Sun, Moon or other celestial body. An epoch might also be given."
  {:db/ident :qudt/zAxisDefinition,
   :dcterms/description
   "The definition of the Y-Axis could be an intersection, croos-product or other function of a meridian or orbit. It could also mention any aspects of rotation, for example, the rotation equator of the Earth,  Sun, Moon or other celestial body. An epoch might also be given.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label "Z-Axis definition",
   :rdfs/range :xsd/string})

(def ^{:private true} zCoordinateDefinition
  "Z-Coordinate definition"
  {:db/ident         :qudt/zCoordinateDefinition,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy "http://qudt.org/2.1/schema/datatype",
   :rdfs/label       "Z-Coordinate definition",
   :rdfs/range       :xsd/string})

(def ^{:private true} CollectionGraph
  "A \"vaem:CollectionGraph\" is a graph that aggregates other graphs using \"owl:imports\" statements."
  {:db/ident :vaem/CollectionGraph,
   :dcterms/description
   "A \"vaem:CollectionGraph\" is a graph that aggregates other graphs using \"owl:imports\" statements."})

(def ^{:private true} ConfigurationGraph
  "A graph that serves as a registy or provides other parameter settings."
  {:db/ident :vaem/ConfigurationGraph,
   :dcterms/description
   "A graph that serves as a registy or provides other parameter settings."})

(def ^{:private true} ConnectSetGraph
  "A graph that specifies mapings between external data sources and a neutral model."
  {:db/ident :vaem/ConnectSetGraph,
   :dcterms/description
   "A graph that specifies mapings between external data sources and a neutral model."})

(def ^{:private true} ConstraintsGraph
  "A graph that is for defining constraints using SPIN."
  {:db/ident :vaem/ConstraintsGraph,
   :dcterms/description "A graph that is for defining constraints using SPIN."})

(def ^{:private true} ControllersGraph
  "A graph that acts as a controller in an MVC-like framework."
  {:db/ident :vaem/ControllersGraph,
   :dcterms/description
   "A graph that acts as a controller in an MVC-like framework."})

(def ^{:private true} CurationGraph
  "A graph to hold metadata that is needed to describe, govern and provision another graph. A curation graph will likely use VOAG and VAEM for this purpose. The property \"vaem:curationGraph\" is used to link to the graph (or graphs) being curated"
  {:db/ident :vaem/CurationGraph,
   :dcterms/description
   "A graph to hold metadata that is needed to describe, govern and provision another graph. A curation graph will likely use VOAG and VAEM for this purpose. The property \"vaem:curationGraph\" is used to link to the graph (or graphs) being curated"})

(def ^{:private true} DataGraph
  "A graph that holds data instances."
  {:db/ident :vaem/DataGraph,
   :dcterms/description "A graph that holds data instances."})

(def ^{:private true} DocumentationGraph
  "A graph that is soley for the purpose of generating documentation."
  {:db/ident :vaem/DocumentationGraph,
   :dcterms/description
   "A graph that is soley for the purpose of generating documentation."})

(def ^{:private true} FunctionsGraph
  "A graph that defines SPIN functions."
  {:db/ident :vaem/FunctionsGraph,
   :dcterms/description "A graph that defines SPIN functions."})

(def ^{:private true} GMD_VAEM
  "VAEM stands for \"Vocabulary for Attaching Essential Metadata\". What VAEM regards as essential metadata is data about dates and times, confidentiality, and other characterisitic qualifiers of the ontology, but also references to where a ontology is documented and where to find ontology registration for governance, attribution and provenance. VAEM makes use of some properties from the DC terms vocabulary using the namespace prefix \"dct\"."
  {:db/ident :vaem/GMD_VAEM,
   :dcterms/description
   "VAEM stands for \"Vocabulary for Attaching Essential Metadata\". What VAEM regards as essential metadata is data about dates and times, confidentiality, and other characterisitic qualifiers of the ontology, but also references to where a ontology is documented and where to find ontology registration for governance, attribution and provenance. VAEM makes use of some properties from the DC terms vocabulary using the namespace prefix \"dct\"."})

(def ^{:private true} LinkSetGraph
  "A graph that holds statements that specify links between resources."
  {:db/ident :vaem/LinkSetGraph,
   :dcterms/description
   "A graph that holds statements that specify links between resources."})

(def ^{:private true} MappingGraph
  "A graph that specifies a transformation of a graph into another graph or graphs. Invariably this is a SPINMap graph using SPARQL Rules (SPIN) to express the transforms."
  {:db/ident :vaem/MappingGraph,
   :dcterms/description
   "A graph that specifies a transformation of a graph into another graph or graphs. Invariably this is a SPINMap graph using SPARQL Rules (SPIN) to express the transforms."})

(def ^{:private true} ProxyGraph
  "A graph that represents an external data source, or schema, as an ontology model."
  {:db/ident :vaem/ProxyGraph,
   :dcterms/description
   "A graph that represents an external data source, or schema, as an ontology model."})

(def ^{:private true} ReferenceDataGraph
  "A graph that holds reference data."
  {:db/ident :vaem/ReferenceDataGraph,
   :dcterms/description "A graph that holds reference data."})

(def ^{:private true} RulesGraph
  "A graph that holds SPIN rules."
  {:db/ident :vaem/RulesGraph,
   :dcterms/description "A graph that holds SPIN rules."})

(def ^{:private true} SchemaGraph
  "A graph that defines classes and properties for one or more namespaces."
  {:db/ident :vaem/SchemaGraph,
   :dcterms/description
   "A graph that defines classes and properties for one or more namespaces."})

(def ^{:private true} ScriptGraph
  "A graph that defines SWP templates that are of a general scripting nature."
  {:db/ident :vaem/ScriptGraph,
   :dcterms/description
   "A graph that defines SWP templates that are of a general scripting nature."})

(def ^{:private true} ServicesGraph
  "A graph that implements SWP services."
  {:db/ident :vaem/ServicesGraph,
   :dcterms/description "A graph that implements SWP services."})

(def ^{:private true} TransformsGraph
  "A graph that uses SPIN to define transforms."
  {:db/ident :vaem/TransformsGraph,
   :dcterms/description "A graph that uses SPIN to define transforms."})

(def ^{:private true} ViewGraph
  "A graph that provides the access to services in an MVC-like framework."
  {:db/ident :vaem/ViewGraph,
   :dcterms/description
   "A graph that provides the access to services in an MVC-like framework."})

(def ^{:private true} VocabularyGraph
  "A graph that is a controlled set of instances that define a terminology. Typically this is based on SKOS."
  {:db/ident :vaem/VocabularyGraph,
   :dcterms/description
   "A graph that is a controlled set of instances that define a terminology. Typically this is based on SKOS."})
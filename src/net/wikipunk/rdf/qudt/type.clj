(ns net.wikipunk.rdf.qudt.type
  "QUDT Vocabulary of Datatypes v2.1.24"
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/qudt/qudt-public-repo/main/vocab/types/VOCAB_QUDT-DATATYPES-v2.1.ttl",
   :owl/imports ["http://www.linkedmodel.org/schema/vaem"
                 "http://www.linkedmodel.org/schema/dtype"
                 "http://qudt.org/2.1/schema/facade/qudt"
                 "http://qudt.org/2.1/schema/datatype"],
   :rdf/ns-prefix-map {"dc11" "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "dtype" "http://www.linkedmodel.org/schema/dtype#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "qudt" "http://qudt.org/schema/qudt/",
                       "qudt-refdata" "http://qudt.org/vocab/refdata/",
                       "qudt.type" "http://qudt.org/schema/type/",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "vaem" "http://www.linkedmodel.org/schema/vaem#",
                       "voag" "http://voag.linkedmodel.org/schema/voag#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "qudt.type",
   :rdfa/uri "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "QUDT Vocabulary of Datatypes v2.1.24",
   :vaem/hasGraphMetadata "http://qudt.org/vocab/datatype/GMD_datatypes",
   :vaem/hasGraphRole :vaem/VocabularyGraph})

(def ^{:private true} ACYCLIC-GRAPH
  "Acyclic Graph"
  {:db/ident         :qudt/ACYCLIC-GRAPH,
   :rdf/type         :qudt/Graph,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Acyclic Graph"})

(def ^{:private true} ALPHANUMERIC
  "ALPHANUMERIC"
  {:db/ident          :qudt/ALPHANUMERIC,
   :dtype/literal     "alphanumeric",
   :qudt/bits         8,
   :qudt/code         106,
   :qudt/id           "T001-00",
   :qudt/literal      "alphanumeric",
   :qudt/octets       1,
   :qudt/rdfsDatatype :xsd/byte,
   :rdf/type          :qudt/CharacterType,
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "ALPHANUMERIC"})

(def ^{:private true} ARRAY
  "Multi-dimensional array of elements of scalar types. The number of array dimensions are expressed as an unsigned integer (octet). Elements are arranged in a sequence with the most significant dimension occurs first."
  {:db/ident         :qudt/ARRAY,
   :dcterms/description
   "Multi-dimensional array of elements of scalar types. The number of array dimensions are expressed as an unsigned integer (octet). Elements are arranged in a sequence with the most significant dimension occurs first.",
   :rdf/type         :qudt/Array,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "ARRAY"})

(def ^{:private true} B-TREE
  "B-Tree"
  {:db/ident         :qudt/B-TREE,
   :rdf/type         :qudt/BalancedTree,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "B-Tree"})

(def ^{:private true} BALANCED-TREE
  "Balanced Tree"
  {:db/ident         :qudt/BALANCED-TREE,
   :rdf/type         :qudt/BalancedTree,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Balanced Tree"})

(def ^{:private true} BINARY-HEAP
  "A \"Binary Heap\" is one where the maximum number of children each node can have is at most two."
  {:db/ident         :qudt/BINARY-HEAP,
   :dcterms/description
   "A \"Binary Heap\" is one where the maximum number of children each node can have is at most two.",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Heap_(data_structure)",
   :rdf/type         :qudt/Heap,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Binary Heap"})

(def ^{:private true} BINARY-TREE
  "<p class=\"lm-para\">A \"Binary Tree\" is a tree data structure in which each node has at most two child nodes, usually distinguished as \"left\" and \"right\". Nodes with children are parent nodes, and child nodes may contain references to their parents. Outside the tree, there is often a reference to the \"root\" node (the ancestor of all nodes), if it exists. Any node in the data structure can be reached by starting at root node and repeatedly following references to either the left or right child. A tree which does not have any node other than root node is called a null tree. In a binary tree, a degree of every node is maximum two. A tree with <i>n</i> nodes has exactly <i>n-1</i> branches or degree.</p>"
  {:db/ident :qudt/BINARY-TREE,
   :dcterms/description
   "<p class=\"lm-para\">A \"Binary Tree\" is a tree data structure in which each node has at most two child nodes, usually distinguished as \"left\" and \"right\". Nodes with children are parent nodes, and child nodes may contain references to their parents. Outside the tree, there is often a reference to the \"root\" node (the ancestor of all nodes), if it exists. Any node in the data structure can be reached by starting at root node and repeatedly following references to either the left or right child. A tree which does not have any node other than root node is called a null tree. In a binary tree, a degree of every node is maximum two. A tree with <i>n</i> nodes has exactly <i>n-1</i> branches or degree.</p>",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Binary_Tree",
   :qudt/literal "binaryTree",
   :rdf/type :qudt/BinaryTree,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Binary Tree"})

(def ^{:private true} BOOLEAN
  "In computer science, the Boolean or logical data type is a data type, having two values (usually denoted true and false), intended to represent the truth values of logic and Boolean algebra. The Boolean data type is the primary result of conditional statements, which allow different actions and change control flow depending on whether a programmer-specified boolean condition evaluates to true or false."
  {:db/ident :qudt/BOOLEAN,
   :dcterms/description
   "In computer science, the Boolean or logical data type is a data type, having two values (usually denoted true and false), intended to represent the truth values of logic and Boolean algebra. The Boolean data type is the primary result of conditional statements, which allow different actions and change control flow depending on whether a programmer-specified boolean condition evaluates to true or false.",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/aa275635(v=sql.80).aspx"
    "http://en.wikipedia.org/wiki/Boolean%5Fdata%5Ftype"],
   :qudt/ansiSQLName "BOOLEAN",
   :qudt/code 1,
   :qudt/encoding :qudt/BooleanEncoding,
   :qudt/id "T000-01",
   :qudt/javaName "boolean",
   :qudt/jsName "Boolean()",
   :qudt/literal "boolean",
   :qudt/microsoftSQLServerName "bit",
   :qudt/mySQLName ["BOOLEAN" "TINYINT(1)" "BOOL"],
   :qudt/odbcName "SQL_BIT",
   :qudt/oleDBName "DBTYPE_BOOL",
   :qudt/oracleSQLName "RAW(1)",
   :qudt/pythonName "bool",
   :qudt/rdfsDatatype :xsd/boolean,
   :rdf/type :qudt/BooleanType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "BOOLEAN"})

(def ^{:private true} BYTE
  "The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation."
  {:db/ident :qudt/BYTE,
   :dcterms/description
   "The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.",
   :prov/wasInfluencedBy
   "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html",
   :qudt/abbreviation "byte",
   :qudt/cName "Byte",
   :qudt/code "800",
   :qudt/encoding :qudt/OctetEncoding,
   :qudt/id "T002-01",
   :qudt/literal "byte",
   :qudt/maxInclusive 127,
   :qudt/minInclusive "-128",
   :qudt/octets 1,
   :qudt/rdfsDatatype :xsd/byte,
   :rdf/type :qudt/SignedShortIntegerType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Byte"})

(def ^{:private true} BigEndian
  "A big-endian machine stores the most significant byte first."
  {:db/ident :qudt/BigEndian,
   :dcterms/description
   "A big-endian machine stores the most significant byte first.",
   :qudt/code 1,
   :qudt/literal "big",
   :rdf/type :qudt/EndianType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Big Endian"})

(def ^{:private true} BitAligned
  "Alignment at a bit level."
  {:db/ident            :qudt/BitAligned,
   :dcterms/description "Alignment at a bit level.",
   :qudt/literal        "bit",
   :rdf/type            :qudt/AlignmentType,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Bit aligned"})

(def ^{:private true} BitField01
  "Bit Field 01"
  {:db/ident             :qudt/BitField01,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf1",
   :qudt/bits            1,
   :qudt/id              "T010-01",
   :qudt/literal         "B1",
   :qudt/mySQLName       "BIT(1)",
   :qudt/rdfsDatatype    :qudt/BitField1,
   :rdf/type             :qudt/BitFieldType,
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 01"})

(def ^{:private true} BitField02
  "Bit Field 02"
  {:db/ident             :qudt/BitField02,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf2",
   :qudt/bits            2,
   :qudt/code            182,
   :qudt/id              "T010-02",
   :qudt/literal         "B2",
   :qudt/mySQLName       "BIT(2)",
   :qudt/rdfsDatatype    :qudt/BitField2,
   :rdf/type             :qudt/BitFieldType,
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 02"})

(def ^{:private true} BitField03
  "Bit Field 03"
  {:db/ident             :qudt/BitField03,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf3",
   :qudt/bits            3,
   :qudt/code            183,
   :qudt/id              "T010-03",
   :qudt/literal         "B3",
   :qudt/mySQLName       "BIT(3)",
   :qudt/rdfsDatatype    :qudt/BitField3,
   :rdf/type             :qudt/BitFieldType,
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 03"})

(def ^{:private true} BitField04
  "Bit Field 04"
  {:db/ident             :qudt/BitField04,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf4",
   :qudt/bits            4,
   :qudt/code            184,
   :qudt/id              "T010-04",
   :qudt/literal         "B4",
   :qudt/mySQLName       "BIT(4)",
   :qudt/rdfsDatatype    :qudt/BitField4,
   :rdf/type             :qudt/BitFieldType,
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 04"})

(def ^{:private true} BitField05
  "Bit Field 05"
  {:db/ident             :qudt/BitField05,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf5",
   :qudt/bits            5,
   :qudt/code            185,
   :qudt/id              "T010-05",
   :qudt/literal         "B5",
   :qudt/mySQLName       "BIT(5)",
   :qudt/rdfsDatatype    :qudt/BitField5,
   :rdf/type             :qudt/BitFieldType,
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 05"})

(def ^{:private true} BitField06
  "Bit Field 06"
  {:db/ident             :qudt/BitField06,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf6",
   :qudt/bits            6,
   :qudt/code            186,
   :qudt/id              "T010-06",
   :qudt/literal         "B6",
   :qudt/mySQLName       "BIT(6)",
   :qudt/rdfsDatatype    :qudt/BitField6,
   :rdf/type             :qudt/BitFieldType,
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 06"})

(def ^{:private true} BitField07
  "Bit Field 07"
  {:db/ident             :qudt/BitField07,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf7",
   :qudt/bits            7,
   :qudt/code            187,
   :qudt/id              "T010-07",
   :qudt/literal         "B7",
   :qudt/mySQLName       "BIT(7)",
   :qudt/rdfsDatatype    :qudt/BitField7,
   :rdf/type             :qudt/BitFieldType,
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 07"})

(def ^{:private true} BitField08
  "Bit Field 08"
  {:db/ident             :qudt/BitField08,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf8",
   :qudt/bits            8,
   :qudt/code            188,
   :qudt/id              "T010-08",
   :qudt/literal         "B8",
   :qudt/mySQLName       "BIT(8)",
   :qudt/rdfsDatatype    :qudt/BitField8,
   :rdf/type             :qudt/BitFieldType,
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 08"})

(def ^{:private true} BitField09
  "Bit Field 09"
  {:db/ident             :qudt/BitField09,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf9",
   :qudt/bits            9,
   :qudt/code            189,
   :qudt/id              "T010-09",
   :qudt/literal         "B9",
   :qudt/mySQLName       "BIT(9)",
   :qudt/rdfsDatatype    :qudt/BitField9,
   :rdf/type             :qudt/BitFieldType,
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 09"})

(def ^{:private true} BitField10
  "Bit Field 10"
  {:db/ident             :qudt/BitField10,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf10",
   :qudt/bitOrder        :qudt/BigEndian,
   :qudt/bits            10,
   :qudt/byteOrder       :qudt/BigEndian,
   :qudt/code            190,
   :qudt/id              "T010-02",
   :qudt/literal         "B10",
   :qudt/mySQLName       "BIT(10)",
   :qudt/rdfsDatatype    :qudt/BitField10,
   :rdf/type             :qudt/BitFieldType,
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 10"})

(def ^{:private true} BitField11
  "Bit Field 11"
  {:db/ident             :qudt/BitField11,
   :prov/wasInfluencedBy "http://dev.mysql.com/doc/refman/5.0/en/bit-type.html",
   :qudt/abbreviation    "bf11",
   :qudt/bits            11,
   :qudt/code            191,
   :qudt/id              "T010-11",
   :qudt/literal         "B11",
   :qudt/mySQLName       "BIT(11)",
   :qudt/rdfsDatatype    :qudt/BitField11,
   :rdf/type             :qudt/BitFieldType,
   :rdfs/isDefinedBy     "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label           "Bit Field 11"})

(def ^{:private true} BooleanEncoding
  "Boolean Encoding"
  {:db/ident         :qudt/BooleanEncoding,
   :rdf/type         :qudt/BooleanEncodingType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Boolean Encoding"})

(def ^{:private true} BooleanTypeEnumeration
  "The elements of the 'BooleanEnumeration' with two values, 'true' and 'false'."
  {:db/ident :qudt/BooleanTypeEnumeration,
   :dcterms/description
   "The elements of the 'BooleanEnumeration' with two values, 'true' and 'false'.",
   :qudt/code 1002,
   :qudt/value ["http://qudt.org/schema/type#True"
                "http://qudt.org/schema/type#False"],
   :rdf/type :qudt/DiscreteStateEnumeration,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Boolean value"})

(def ^{:private true} ByteAligned
  "Alignment of a field at a byte boundary."
  {:db/ident            :qudt/ByteAligned,
   :dcterms/description "Alignment of a field at a byte boundary.",
   :qudt/literal        "byte",
   :rdf/type            :qudt/AlignmentType,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Byte aligned"})

(def ^{:private true} CC_EarthCentered
  "Earth centered"
  {:db/ident         :qudt/CC_EarthCentered,
   :qudt/literal     "earthCentered",
   :rdf/type         :qudt/CoordinateCenterType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Earth centered"})

(def ^{:private true} CC_MarsCentered
  "Mars centered"
  {:db/ident         :qudt/CC_MarsCentered,
   :qudt/literal     "marsCentered",
   :rdf/type         :qudt/CoordinateCenterType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Mars centered"})

(def ^{:private true} CC_MoonCentered
  "Moon centered"
  {:db/ident         :qudt/CC_MoonCentered,
   :qudt/literal     "moonCentered",
   :rdf/type         :qudt/CoordinateCenterType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Moon centered"})

(def ^{:private true} CC_SunCentered
  "Sun centered"
  {:db/ident         :qudt/CC_SunCentered,
   :qudt/literal     "sunCentered",
   :rdf/type         :qudt/CoordinateCenterType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Sun centered"})

(def ^{:private true} CC_VehicleCentered
  "Vehicle centered"
  {:db/ident         :qudt/CC_VehicleCentered,
   :qudt/literal     "vehicleCentered",
   :rdf/type         :qudt/CoordinateCenterType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Vehicle centered"})

(def ^{:private true} CDF
  "CDF (Common Data format), a data format for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, making interoperability between applications and tools easier. CDF provides device independent view of the CDF data model by software programming interface insulting developers from actual physical file format. CDF was developed by NASA, and is described at http://cdf.gsfc.nasa.gov/."
  {:db/ident         :qudt/CDF,
   :dcterms/description
   "CDF (Common Data format), a data format for storing and manipulating scalar and multidimensional data in a platform and discipline independent manner, making interoperability between applications and tools easier. CDF provides device independent view of the CDF data model by software programming interface insulting developers from actual physical file format. CDF was developed by NASA, and is described at http://cdf.gsfc.nasa.gov/.",
   :rdf/type         :qudt/MultiDimensionalDataFormat,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Common Data Format (CDF)"})

(def ^{:private true} CHAR
  "CHAR"
  {:db/ident          :qudt/CHAR,
   :dtype/literal     "char",
   :qudt/bits         8,
   :qudt/encoding     :qudt/CharEncoding,
   :qudt/id           "T001-01",
   :qudt/literal      "char",
   :qudt/octets       1,
   :qudt/rdfsDatatype :xsd/byte,
   :rdf/type          :qudt/CharacterType,
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "CHAR"})

(def ^{:private true} COORDS-2D-DOUBLE
  "COORDS-2D-DOUBLE"
  {:db/ident         :qudt/COORDS-2D-DOUBLE,
   :qudt/elementType :qudt/FLOAT-DP,
   :rdf/type         :qudt/Coordinates-2D-DoublePrecision,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "COORDS-2D-DOUBLE"})

(def ^{:private true} COORDS-2D-SINGLE
  "COORDS-2D-SINGLE"
  {:db/ident         :qudt/COORDS-2D-SINGLE,
   :qudt/elementType :qudt/FLOAT-SP,
   :qudt/elementTypeCount 2,
   :rdf/type         :qudt/Coordinates-2D-SinglePrecision,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "COORDS-2D-SINGLE"})

(def ^{:private true} COORDS-3D-DOUBLE
  "COORDS-3D-DOUBLE"
  {:db/ident         :qudt/COORDS-3D-DOUBLE,
   :qudt/elementTypeCount 3,
   :rdf/type         :qudt/Coordinates-3D-DoublePrecision,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "COORDS-3D-DOUBLE"})

(def ^{:private true} COORDS-3D-SINGLE
  "COORDS-3D-SINGLE"
  {:db/ident         :qudt/COORDS-3D-SINGLE,
   :rdf/type         :qudt/Coordinates-3D-SinglePrecision,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "COORDS-3D-SINGLE"})

(def ^{:private true} COORDS-RH-DP
  "A three-dimensional coordinate system in which the axes satisfy the right-hand rule."
  {:db/ident         :qudt/COORDS-RH-DP,
   :dcterms/description
   "A three-dimensional coordinate system in which the axes satisfy the right-hand rule. ",
   :rdf/type         :qudt/Coordinates-3D-DoublePrecision,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "COORDS - RH DP"})

(def ^{:private true} CharEncoding
  "7 bits of 1 octet"
  {:db/ident            :qudt/CharEncoding,
   :dcterms/description "7 bits of 1 octet",
   :qudt/bytes          1,
   :rdf/type            [:qudt/CharEncodingType :qudt/BooleanEncodingType],
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Char Encoding"})

(def ^{:private true} CompositeTABLE
  "Composite table"
  {:db/ident         :qudt/CompositeTABLE,
   :rdf/type         :qudt/CompositeTable,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Composite table"})

(def ^{:private true} DATE
  "Provides the date expressed in year, month and day."
  {:db/ident            :qudt/DATE,
   :dcterms/description "Provides the date expressed in year, month and day.",
   :qudt/code           255,
   :qudt/encodingDescription
   "YYYY:MM:DD, where YYYY is a 4 digit year, MM is a 2 digit month and DD is a 2 digit day.",
   :qudt/id             "T004-01",
   :qudt/literal        "date",
   :qudt/rdfsDatatype   :xsd/dateTime,
   :rdf/type            :qudt/DateStringType,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Date"})

(def ^{:private true} DECIMAL
  "Decimal"
  {:db/ident           :qudt/DECIMAL,
   :qudt/ansiSQLName   "DECIMAL(p,s)",
   :qudt/code          101,
   :qudt/literal       "numeric",
   :qudt/odbcName      "SQL_DECIMAL(p,s)",
   :qudt/oracleSQLName "NUMBER(p,s)",
   :qudt/rdfsDatatype  :qudt/numericUnion,
   :rdf/type           :qudt/NumericType,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label         "Decimal"})

(def ^{:private true} DICTIONARY
  "DICTIONARY"
  {:db/ident         :qudt/DICTIONARY,
   :rdf/type         :qudt/Dictionary,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "DICTIONARY"})

(def ^{:private true} DIGIT
  "DIGIT"
  {:db/ident          :qudt/DIGIT,
   :dtype/literal     "digit",
   :qudt/bits         8,
   :qudt/id           "T001-02",
   :qudt/literal      "digit",
   :qudt/octets       1,
   :qudt/rdfsDatatype :xsd/byte,
   :rdf/type          :qudt/CharacterType,
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "DIGIT"})

(def ^{:private true} DoublePrecisionEncoding
  "Double Precision Encoding"
  {:db/ident         :qudt/DoublePrecisionEncoding,
   :qudt/bytes       64,
   :rdf/type         :qudt/FloatingPointEncodingType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Double Precision Encoding"})

(def ^{:private true} ECS_EC-EMEPM
  "Earth Centered Earth Mean Equator And Prime Meridian Coordinate System"
  {:db/ident :qudt/ECS_EC-EMEPM,
   :qudt/code 10,
   :qudt/coordinateCenter :qudt/CC_EarthCentered,
   :qudt/id "TECS-03",
   :qudt/literal "EC-EMEP",
   :qudt/referenceFrame :qudt/RRF_EMEPM,
   :rdf/type :qudt/EarthCoordinateSystem,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "Earth centered earth mean equator and prime meridian coordinate system",
   :skos/definition
   "Earth Centered Earth Mean Equator And Prime Meridian Coordinate System",
   :vaem/acronym "EC-EMEP"})

(def ^{:private true} ECS_EC-ETEPME
  "Earth Centered Earth True Equator And Prime Meridian Of Epoch Coordinate System"
  {:db/ident :qudt/ECS_EC-ETEPME,
   :qudt/code 12,
   :qudt/coordinateCenter :qudt/CC_EarthCentered,
   :qudt/id "TECS-04",
   :qudt/literal "EC-ETEP",
   :qudt/referenceFrame :qudt/NRIF_ETEPME,
   :rdf/type :qudt/EarthCoordinateSystem,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "Earth centered earth true equator and prime meridian of epoch coordinate system",
   :skos/definition
   "Earth Centered Earth True Equator And Prime Meridian Of Epoch Coordinate System"})

(def ^{:private true} ECS_EC-ICRF
  "Earth Centered International Celestial Reference System"
  {:db/ident :qudt/ECS_EC-ICRF,
   :qudt/code 14,
   :qudt/coordinateCenter :qudt/CC_EarthCentered,
   :qudt/id "TECS-01",
   :qudt/literal "EC-IC",
   :qudt/referenceFrame :qudt/NRIF_ICRF,
   :rdf/type :qudt/EarthCoordinateSystem,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Earth centered international celestial reference system",
   :skos/definition "Earth Centered International Celestial Reference System"})

(def ^{:private true} ECS_EC-ITRF
  "Earth Centered International Terrestrial Reference System"
  {:db/ident :qudt/ECS_EC-ITRF,
   :qudt/code 16,
   :qudt/coordinateCenter :qudt/CC_EarthCentered,
   :qudt/id "TECS-02",
   :qudt/literal "EC-IT",
   :qudt/referenceFrame :qudt/RRF_ITRF,
   :rdf/type :qudt/EarthCoordinateSystem,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Earth centered international terrestrial reference system",
   :skos/definition
   "Earth Centered International Terrestrial Reference System"})

(def ^{:private true} ECS_SC-ICRF
  "Sun Centered International Celestial Reference System"
  {:db/ident :qudt/ECS_SC-ICRF,
   :qudt/code 90,
   :qudt/coordinateCenter :qudt/CC_EarthCentered,
   :qudt/id "TECS-05",
   :qudt/referenceFrame :qudt/NRIF_ICRF,
   :rdf/type :qudt/EarthCoordinateSystem,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Sun-Centered international celestial reference system",
   :skos/definition "Sun Centered International Celestial Reference System"})

(def ^{:private true} ECS_VC-ICRF
  "Vehicle Centered International Celestial Reference System"
  {:db/ident :qudt/ECS_VC-ICRF,
   :qudt/code 100,
   :qudt/coordinateCenter :qudt/CC_EarthCentered,
   :qudt/id "TECS-06",
   :qudt/literal "VC-IC",
   :qudt/referenceFrame :qudt/NRIF_ICRF,
   :rdf/type :qudt/EarthCoordinateSystem,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Vehicle centered international celestial reference system",
   :skos/definition
   "Vehicle Centered International Celestial Reference System"})

(def ^{:private true} FIG_EM-ETEPME
  "COORDINATE FRAME: EARTH TRUE EQUATOR AND PRIME MERIDIAN OF EPOCH (ETEPME)"
  {:db/ident :qudt/FIG_EM-ETEPME,
   :qudt/figureCaption
   "COORDINATE FRAME: EARTH TRUE EQUATOR AND PRIME MERIDIAN OF EPOCH (ETEPME)",
   :qudt/figureLabel "EM-ROT",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/ETEPME.png",
   :qudt/imageLocation "../images/coordinate-systems/ETEPME.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type :qudt/Figure,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "COORDINATE FRAME: EARTH TRUE EQUATOR AND PRIME MERIDIAN OF EPOCH (ETEPME)"})

(def ^{:private true} FIG_EM-ROT
  "COORDINATE FRAME: EARTH-MOON ROTATING (EM-ROT)"
  {:db/ident :qudt/FIG_EM-ROT,
   :qudt/figureCaption "COORDINATE FRAME: EARTH-MOON ROTATING (EM-ROT)",
   :qudt/figureLabel "EM-ROT",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/SE-ROT.png",
   :qudt/imageLocation "../images/coordinate-systems/SE-ROT.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type :qudt/Figure,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "COORDINATE FRAME: EARTH-MOON ROTATING (EM-ROT)"})

(def ^{:private true} FIG_ICRF
  "COORDINATE FRAME: INTERNATIONAL CELESTIAL REFERENCE FRAME (ICRF)"
  {:db/ident :qudt/FIG_ICRF,
   :qudt/figureCaption
   "COORDINATE FRAME: INTERNATIONAL CELESTIAL REFERENCE FRAME (ICRF)",
   :qudt/figureLabel "ICRF",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/ICRF.png",
   :qudt/imageLocation "../images/coordinate-systems/ICRF.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type :qudt/Figure,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "COORDINATE FRAME: INTERNATIONAL CELESTIAL REFERENCE FRAME (ICRF)"})

(def ^{:private true} FIG_ICRF_EME-EMEPM
  "COORDINATE FRAME: EARTH MEAN EQUATOR AND PRIME MERIDIAN (EMEPM)"
  {:db/ident :qudt/FIG_ICRF_EME-EMEPM,
   :qudt/figureCaption
   "COORDINATE FRAME: EARTH MEAN EQUATOR AND PRIME MERIDIAN (EMEPM)",
   :qudt/figureLabel "EME-EMEPM",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/EMEPM.png",
   :qudt/imageLocation "../images/coordinate-systems/EMEPM.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type :qudt/Figure,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "COORDINATE FRAME: EARTH MEAN EQUATOR AND PRIME MERIDIAN (EMEPM)"})

(def ^{:private true} FIG_ICRF_EMEPM
  "FIG ICRF"
  {:db/ident :qudt/FIG_ICRF_EMEPM,
   :qudt/figureCaption "test caption",
   :qudt/figureLabel "ICRF",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/EMEPM.png",
   :qudt/imageLocation "../images/coordinate-systems/EMEPM.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type :qudt/Figure,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "FIG ICRF"})

(def ^{:private true} FIG_ITRF
  "COORDINATE FRAME: INTERNATIONAL TERRESTRIAL REFERENCE FRAME (ITRF)"
  {:db/ident :qudt/FIG_ITRF,
   :qudt/figureCaption
   "COORDINATE FRAME: INTERNATIONAL TERRESTRIAL REFERENCE FRAME (ITRF)",
   :qudt/figureLabel "ICRF",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/ITRF.png",
   :qudt/imageLocation "../images/coordinate-systems/ITRF.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type :qudt/Figure,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "COORDINATE FRAME: INTERNATIONAL TERRESTRIAL REFERENCE FRAME (ITRF)"})

(def ^{:private true} FIG_LPAE
  "COORDINATE FRAME: LUNAR PRINCIPAL AXIS OF EPOCH (LPAE) (NON-ROTATING/\"INERTIAL\") OR BODY-FIXED (LPABF) (ROTATING)"
  {:db/ident :qudt/FIG_LPAE,
   :qudt/figureCaption
   "COORDINATE FRAME: LUNAR PRINCIPAL AXIS OF EPOCH (LPAE) (NON-ROTATING/\"INERTIAL\") OR BODY-FIXED (LPABF) (ROTATING)",
   :qudt/figureLabel "ICRF",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/LPAE.png",
   :qudt/imageLocation "../images/coordinate-systems/LPAE.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type :qudt/Figure,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "COORDINATE FRAME: LUNAR PRINCIPAL AXIS OF EPOCH (LPAE) (NON-ROTATING/\"INERTIAL\") OR BODY-FIXED (LPABF) (ROTATING)"})

(def ^{:private true} FIG_SE-ROT
  "COORDINATE FRAME: SUN-EARTH ROTATING (SE-ROT)"
  {:db/ident :qudt/FIG_SE-ROT,
   :qudt/figureCaption "COORDINATE FRAME: SUN-EARTH ROTATING (SE-ROT)",
   :qudt/figureLabel "SE-ROT",
   :qudt/image
   "http://localhost:8083/tbl/data/qudt.org/images/coordinate-systems/SE-ROT.png",
   :qudt/imageLocation "../images/coordinate-systems/SE-ROT.png",
   :qudt/landscape false,
   :qudt/width "4.0",
   :rdf/type :qudt/Figure,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "COORDINATE FRAME: SUN-EARTH ROTATING (SE-ROT)"})

(def ^{:private true} FLAG
  "FLAG"
  {:db/ident          :qudt/FLAG,
   :qudt/code         2,
   :qudt/id           "T000-02",
   :qudt/literal      "flag",
   :qudt/rdfsDatatype :xsd/boolean,
   :rdf/type          :qudt/BooleanType,
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "FLAG"})

(def ^{:private true} FLOAT-DP
  "A double precision floating point datatype. Numbers of this type are stored using 64 bits, they require more memory than numbers of type single, which use 32 bits. However, because they are stored with more bits, numbers of type double are represented to more precision than numbers of type single. The double-precision (or double) data type is represented according to IEEE Standard 754 for double precision. A value is formatted with bit-fields for sign, mantissa and exponent."
  {:db/ident :qudt/FLOAT-DP,
   :dcterms/description
   "A double precision floating point datatype.  Numbers of this type are stored using 64 bits, they require more memory than numbers of type single, which use 32 bits. However, because they are stored with more bits, numbers of type double are represented to more precision than numbers of type single. The double-precision (or double) data type is represented according to IEEE Standard 754 for double precision. A value is formatted with bit-fields for sign, mantissa and exponent.",
   :owl/sameAs :qudt/FLOAT_IEEE754-BINARY64,
   :prov/wasInfluencedBy
   ["http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"
    "http://en.wikipedia.org/wiki/IEEE_floating_point"
    "http://www.mathworks.com/help/matlab/matlab_prog/floating-point-numbers.html"
    "http://en.wikipedia.org/wiki/Floating_point"
    "http://msdn.microsoft.com/en-us/library/aa275635(v=sql.80).aspx"
    "http://dev.mysql.com/doc/refman/5.0/en/floating-point-types.html"],
   :qudt/abbreviation "F64",
   :qudt/ansiSQLName "DOUPLE PRECISION",
   :qudt/base 2,
   :qudt/bits 64,
   :qudt/bytes 8,
   :qudt/code 405,
   :qudt/encoding :qudt/DoublePrecisionEncoding,
   :qudt/id "T006-03",
   :qudt/javaName "double",
   :qudt/jsName "double",
   :qudt/literal "double",
   :qudt/matlabName "double",
   :qudt/maxExclusive "(1-2^{-53}) \\times 2^{1024}",
   :qudt/maxExponent 1023,
   :qudt/maxMantissa 9007199254740991,
   :qudt/microsoftSQLServerName "float",
   :qudt/minExclusive "-(1-2^{-53}) \\times 2^{1024}",
   :qudt/minMantissa -9007199254740991,
   :qudt/mySQLName "DOUBLE",
   :qudt/octets 8,
   :qudt/odbcName "SQL_DOUBLE",
   :qudt/oleDBName "DBTYPE_R8",
   :qudt/oracleSQLName "FLOAT(49)",
   :qudt/rdfsDatatype :xsd/double,
   :rdf/type :qudt/RealDoublePrecisionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Double Precision Real"})

(def ^{:private true} FLOAT-SP
  "A single precision real is a 32 bit signed floating point representation. Numbers of type single are stored using 32 bits, they require less memory than numbers of type double, which use 64 bits. However, because they are stored with fewer bits, numbers of type single are represented to less precision than numbers of type double."
  {:db/ident :qudt/FLOAT-SP,
   :dcterms/description
   "A single precision real is a 32 bit signed floating point representation. Numbers of type single are stored using 32 bits, they require less memory than numbers of type double, which use 64 bits. However, because they are stored with fewer bits, numbers of type single are represented to less precision than numbers of type double.",
   :prov/wasInfluencedBy
   ["http://www.mathworks.com/help/matlab/matlab_prog/floating-point-numbers.html"
    "http://www-01.ibm.com/support/docview.wss?uid=swg21325957"
    "http://www.stanford.edu/dept/itss/docs/oracle/10g/server.101/b10764/apb.htm"
    "http://en.wikipedia.org/wiki/Floating_point"
    "http://msdn.microsoft.com/en-us/library/aa275635(v=sql.80).aspx"
    "http://dev.mysql.com/doc/refman/5.0/en/floating-point-types.html"
    "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"],
   :qudt/ansiSQLName "FLOAT",
   :qudt/bits 32,
   :qudt/bytes 4,
   :qudt/cName "float",
   :qudt/encoding :qudt/SinglePrecisionRealEncoding,
   :qudt/id "T006-01",
   :qudt/javaName "float",
   :qudt/jsName "float",
   :qudt/literal "single",
   :qudt/matlabName "single",
   :qudt/maxExclusive "$(2-2^{-23}) \\times 2^127$",
   :qudt/maxExponent 23,
   :qudt/microsoftSQLServerName "real",
   :qudt/minExclusive "-(2-2^{-23}) \\times 2^{127}",
   :qudt/mySQLName "FLOAT",
   :qudt/octets 4,
   :qudt/odbcName "SQL_FLOAT",
   :qudt/oleDBName "DBTYPE_R4",
   :qudt/oracleSQLName "FLOAT(23)",
   :qudt/rdfsDatatype :xsd/float,
   :rdf/type :qudt/RealSinglePrecisionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Single Precision Real"})

(def ^{:private true} FLOAT_IEEE754-BINARY64
  "IEEE-754 floating point datatype is a technical standar established in 1985 by the Institute of Electrical and Electronics Engineers (IEEE). Many hardware floating point units use the IEEE 754 standard.."
  {:db/ident :qudt/FLOAT_IEEE754-BINARY64,
   :dcterms/description
   "IEEE-754 floating point datatype is a technical standar established in 1985 by the Institute of Electrical and Electronics Engineers (IEEE). Many hardware floating point units use the IEEE 754 standard..",
   :owl/sameAs :qudt/FLOAT-DP,
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/IEEE_floating_point",
   :qudt/base 2,
   :qudt/bits 64,
   :qudt/id "T006-05",
   :qudt/maxExponent 970,
   :qudt/maxMantissa 9007199254740991,
   :qudt/minMantissa -9007199254740991,
   :qudt/rdfsDatatype :xsd/double,
   :rdf/type :qudt/RealDoublePrecisionType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "IEEE754 BINARY64"})

(def ^{:private true} FT_INERTIAL
  "Inertial"
  {:db/ident         :qudt/FT_INERTIAL,
   :qudt/literal     "inertial",
   :rdf/type         :qudt/FrameType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Inertial"})

(def ^{:private true} FT_NON-ROTATING
  "Non rotating"
  {:db/ident         :qudt/FT_NON-ROTATING,
   :qudt/literal     "nonrotating",
   :rdf/type         :qudt/FrameType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Non rotating"})

(def ^{:private true} FT_ROTATING
  "Rotating"
  {:db/ident         :qudt/FT_ROTATING,
   :qudt/literal     "rotating",
   :rdf/type         :qudt/FrameType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Rotating"})

(def ^{:private true} GRAPH
  "GRAPH"
  {:db/ident         :qudt/GRAPH,
   :rdf/type         :qudt/Graph,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "GRAPH"})

(def ^{:private true} GlobalPositionVector-DP
  "Global Position Vector - double precision"
  {:db/ident            :qudt/GlobalPositionVector-DP,
   :qudt/code           360,
   :qudt/dimension      3,
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt/FLOAT-DP,
   :rdf/type            :qudt/StateSpaceVector,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Global Position Vector - double precision"})

(def ^{:private true} HASH-TABLE
  "Hash Table"
  {:db/ident         :qudt/HASH-TABLE,
   :rdf/type         :qudt/HashTable,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Hash Table"})

(def ^{:private true} HDF5
  "The Hierarchical Data Format (HDF) is a common data format and a collection of application programming libraries developed at the NSCA primarily for the scientific community and for the exchange of scientific datasets. The present version of HDF is HDF5 which offers a simple data model and application interfaces for encoding and exchanging data without the added burden of defining mappings to the underlying machine representations."
  {:db/ident         :qudt/HDF5,
   :dcterms/description
   "The Hierarchical Data Format (HDF) is a common data format and a collection of application programming libraries developed at the NSCA primarily for the scientific community and for the exchange of scientific datasets. The present version of HDF is HDF5 which offers a simple data model and application interfaces for encoding and exchanging data without the added burden of defining mappings to the underlying machine representations.",
   :rdf/type         :qudt/MultiDimensionalDataFormat,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "HDF5"})

(def ^{:private true} HDF6
  "A \"Hierarchical Data Format\"."
  {:db/ident         :qudt/HDF6,
   :dcterms/description "A \"Hierarchical Data Format\".",
   :rdf/type         :qudt/MultiDimensionalDataFormat,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "HDF6"})

(def ^{:private true} HEAP
  "In computer science, a heap is a specialized tree-based data structure that satisfies the heap property: If A is a parent node of B then key(A) is ordered with respect to key(B) with the same ordering applying across the heap. Either the keys of parent nodes are always greater than or equal to those of the children and the highest key is in the root node (this kind of heap is called max heap) or the keys of parent nodes are less than or equal to those of the children and the least key is in the root node (min heap). The heap relation mentioned above applies only between nodes and their immediate parents. The maximum number of children each node can have depends on the type of heap, but in many types it is at most two, which is known as a \"binary heap\"."
  {:db/ident         :qudt/HEAP,
   :dcterms/description
   "In computer science, a heap is a specialized tree-based data structure that satisfies the heap property: If A is a parent node of B then key(A) is ordered with respect to key(B) with the same ordering applying across the heap. Either the keys of parent nodes are always greater than or equal to those of the children and the highest key is in the root node (this kind of heap is called max heap) or the keys of parent nodes are less than or equal to those of the children and the least key is in the root node (min heap). The heap relation mentioned above applies only between nodes and their immediate parents. The maximum number of children each node can have depends on the type of heap, but in many types it is at most two, which is known as a \"binary heap\".",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Heap_(data_structure)",
   :rdf/type         :qudt/Heap,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Heap"})

(def ^{:private true} HEXBINARY
  "HEXBINARY"
  {:db/ident          :qudt/HEXBINARY,
   :qudt/code         803,
   :qudt/literal      "hexbinary",
   :qudt/rdfsDatatype :qudt/hexbinary,
   :rdf/type          :qudt/HexBinaryType,
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "HEXBINARY"})

(def ^{:private true} HighToLow
  "High to low"
  {:db/ident         :qudt/HighToLow,
   :qudt/literal     "high",
   :rdf/type         :qudt/MemoryOrderType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "High to low"})

(def ^{:private true} IEEE754_1985RealEncoding
  "IEEE 754 1985 Real Encoding"
  {:db/ident         :qudt/IEEE754_1985RealEncoding,
   :qudt/bytes       32,
   :rdf/type         :qudt/FloatingPointEncodingType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "IEEE 754 1985 Real Encoding"})

(def ^{:private true} IERS-TN-32-2004
  "IERS Conventions (2003), D. D. McCarthy and Ge??rard Petit (eds.), IERS Technical Note No. 32, 2004; http://www.iers.org/iers/publications/tn/tn32."
  {:db/ident :qudt/IERS-TN-32-2004,
   :dcterms/description
   "IERS Conventions (2003), D. D. McCarthy and Ge??rard Petit (eds.), IERS Technical Note No. 32, 2004; http://www.iers.org/iers/publications/tn/tn32.",
   :qudt/url "http://www.iers.org/iers/publications/tn/tn32.",
   :rdf/type :qudt/Citation,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "IERS-TN-32-2004",
   :skos/prefLabel "IERS-TN-32-2004"})

(def ^{:private true} ISO8601-UTCDateTime-BasicFormat
  "ISO 8601 UTC Date Time - Basic Format"
  {:db/ident         :qudt/ISO8601-UTCDateTime-BasicFormat,
   :qudt/allowedPattern
   ["[0-9]{4}[0-9]{2}[0-9]{2}T[0-9]{2}[0-9]{2}[0-9]{2}Z"
    "[0-9]{4}[0-9]{2}[0-9]{2}T[0-9]{2}[0-9]{2}[0-9]{2}.[0-9]+Z"],
   :rdf/type         :qudt/DateTimeStringEncodingType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "ISO 8601 UTC Date Time - Basic Format"})

(def ^{:private true} InterpolatedTABLE
  "Interpolated table"
  {:db/ident         :qudt/InterpolatedTABLE,
   :rdf/type         :qudt/InterpolatedTable,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Interpolated table"})

(def ^{:private true} Konopliv2001
  "\"Recent Gravity Models as a Result of the Lunar Prospector Mission\", A. S. Konopliv, S. W. Asmar, E. Carranza, W. L. Sjogren, and D. N. Yuan, Academic Press, Icarus 150, 1-18 (2001)."
  {:db/ident :qudt/Konopliv2001,
   :dcterms/description
   "\"Recent Gravity Models as a Result of the Lunar Prospector Mission\", A. S. Konopliv, S. W. Asmar, E. Carranza, W. L. Sjogren, and D. N. Yuan, Academic Press, Icarus 150, 1-18 (2001).",
   :rdf/type :qudt/Citation,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Konopliv2001",
   :skos/prefLabel "Konopliv2001"})

(def ^{:private true} LCS_LC-LMEBF
  "Lunar Mean Earth Body Fixed Coordinate System"
  {:db/ident            :qudt/LCS_LC-LMEBF,
   :qudt/code           40,
   :qudt/coordinateCenter :qudt/CC_MoonCentered,
   :qudt/id             "TLCS-01",
   :qudt/literal        "LMEBF",
   :qudt/referenceFrame :qudt/RRF_LMEBF,
   :rdf/type            :qudt/LunarCoordinateSystem,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Lunar mean earth body fixed Coordinate System",
   :skos/definition     "Lunar Mean Earth Body Fixed Coordinate System"})

(def ^{:private true} LCS_LC-LPABF
  "Lunar body-fixed coordinate frame aligned with the principal axes of the Moon."
  {:db/ident :qudt/LCS_LC-LPABF,
   :dcterms/description
   "Lunar body-fixed coordinate frame aligned with the principal axes of the Moon.",
   :qudt/code 42,
   :qudt/coordinateCenter :qudt/CC_MoonCentered,
   :qudt/id "TLCS-02",
   :qudt/literal "LPABF",
   :qudt/realization "This is a fixed rotation from LMEBF",
   :qudt/referenceFrame :qudt/RRF_LPABF,
   :rdf/type :qudt/LunarCoordinateSystem,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Lunar principal axis body fixed Coordinate System",
   :skos/definition "Lunar Principal Axis Body Fixed Coordinate System"})

(def ^{:private true} LCS_LC-LPAE
  "Lunar Principal Axis of Epoch Coordinate System"
  {:db/ident            :qudt/LCS_LC-LPAE,
   :qudt/code           42,
   :qudt/coordinateCenter :qudt/CC_MoonCentered,
   :qudt/id             "TLCS-03",
   :qudt/literal        "LPABF",
   :qudt/referenceFrame :qudt/NRIF_LPAE,
   :rdf/type            :qudt/LunarCoordinateSystem,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Lunar Principal Axis of Epoch Coordinate System"})

(def ^{:private true} LETTER
  "LETTER"
  {:db/ident          :qudt/LETTER,
   :dtype/literal     "letter",
   :qudt/bits         8,
   :qudt/id           "T001-03",
   :qudt/literal      "letter",
   :qudt/octets       1,
   :qudt/rdfsDatatype :xsd/byte,
   :rdf/type          :qudt/CharacterType,
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "LETTER"})

(def ^{:private true} LIST
  "LIST"
  {:db/ident         :qudt/LIST,
   :rdf/type         :qudt/List,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "LIST"})

(def ^{:private true} LittleEndian
  "A little-endian machine stores the least significant byte first."
  {:db/ident :qudt/LittleEndian,
   :dcterms/description
   "A little-endian machine stores the least significant byte first.",
   :qudt/code 2,
   :qudt/literal "little",
   :rdf/type :qudt/EndianType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Little Endian"})

(def ^{:private true} LongUnsignedIntegerEncoding
  "Long Unsigned Integer Encoding"
  {:db/ident         :qudt/LongUnsignedIntegerEncoding,
   :qudt/bytes       8,
   :rdf/type         :qudt/IntegerEncodingType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Long Unsigned Integer Encoding"})

(def ^{:private true} LowToHigh
  "Low to high"
  {:db/ident         :qudt/LowToHigh,
   :qudt/literal     "low",
   :rdf/type         :qudt/MemoryOrderType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Low to high"})

(def ^{:private true} MAP
  "MAP"
  {:db/ident         :qudt/MAP,
   :rdf/type         :qudt/Map,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "MAP"})

(def ^{:private true} MATRIX
  "MATRIX"
  {:db/ident         :qudt/MATRIX,
   :qudt/code        300,
   :rdf/type         :qudt/Matrix,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "MATRIX"})

(def ^{:private true} MATRIX-4X4-FLOATDP
  "MATRIX-4 X 4 Double precision"
  {:db/ident            :qudt/MATRIX-4X4-FLOATDP,
   :qudt/code           320,
   :qudt/dimensionality 2,
   :qudt/elementType    :qudt/FLOAT-DP,
   :qudt/hasDimensionVector [4 4],
   :qudt/typeMatrix     "http://qudt.org/schema/type#TYPE-MATRIX-4x4-FLOATDP",
   :rdf/type            :qudt/Matrix,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "MATRIX-4 X 4 Double precision"})

(def ^{:private true} MCS_MC-MMEIAUE
  "Mars Mean Equator And IAU-Node Of Epoch Coordinate System"
  {:db/ident :qudt/MCS_MC-MMEIAUE,
   :qudt/code 50,
   :qudt/coordinateCenter :qudt/CC_MarsCentered,
   :qudt/id "TMCS-01",
   :qudt/literal "MMEIAUE",
   :qudt/referenceFrame :qudt/NRIF_MMEIAUE,
   :rdf/type :qudt/MarsCoordinateSystem,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Mars mean equator and IAU-Node of epoch Coordinate System",
   :skos/definition
   "Mars Mean Equator And IAU-Node Of Epoch Coordinate System"})

(def ^{:private true} MCS_MC-MMEPMBF
  "Mars Mean Equator And Prime Meridian Body-Fixed Coordinate System"
  {:db/ident :qudt/MCS_MC-MMEPMBF,
   :qudt/code 52,
   :qudt/coordinateCenter :qudt/CC_MarsCentered,
   :qudt/id "TMCS-02",
   :qudt/literal "MMEPMBF",
   :qudt/referenceFrame :qudt/RRF_MMEPMBF,
   :rdf/type :qudt/MarsCoordinateSystem,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label
   "Mars mean equator and prime meridian body-fixed Coordinate System",
   :skos/definition
   "Mars Mean Equator And Prime Meridian Body-Fixed Coordinate System"})

(def ^{:private true} Major
  "Major"
  {:db/ident         :qudt/Major,
   :qudt/code        2,
   :qudt/literal     "major",
   :qudt/order       2,
   :rdf/type         :qudt/MajorMinorType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Major"})

(def ^{:private true} MassPropertiesARRAY
  "Mass properties ARRAY"
  {:db/ident         :qudt/MassPropertiesARRAY,
   :rdf/type         :qudt/MassPropertiesArray,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Mass properties ARRAY"})

(def ^{:private true} MassPropertiesStateVector-DP
  "Mass properties State Vector - double precision"
  {:db/ident            :qudt/MassPropertiesStateVector-DP,
   :qudt/code           440,
   :qudt/dimension      4,
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt/FLOAT-DP,
   :rdf/type            :qudt/TypeVector,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Mass properties State Vector - double precision"})

(def ^{:private true} Minor
  "Minor"
  {:db/ident         :qudt/Minor,
   :qudt/code        1,
   :qudt/literal     "minor",
   :qudt/order       1,
   :rdf/type         :qudt/MajorMinorType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Minor"})

(def ^{:private true} NRIF_ETEPMBF
  "Earth True Equator and Prime Meridian Body Fixed"
  {:db/ident :qudt/NRIF_ETEPMBF,
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-01",
   :qudt/literal "ETEPMBF",
   :qudt/realization
   "The International Terrestrial Reference Frame (ITRF) is realized by the locations of a set of points or stations on a tide-free Earth. As measurements and models have improved or changed, these locations have been changed also and the ITRF has moved slightly with respect to the physical Earth every few years.",
   :qudt/xAxisDefinition
   "The intersection of the prime meridian and the rotation equator of the Earth.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition "The rotation pole of the Earth.",
   :rdf/type :qudt/NonRotatingInertialFrame,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Earth True Equator and Prime Meridian Body Fixed"})

(def ^{:private true} NRIF_ETEPME
  "Earth True Equator and Prime Meridian of Epoch"
  {:db/ident :qudt/NRIF_ETEPME,
   :qudt/figure :qudt/FIG_EM-ETEPME,
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-02",
   :qudt/literal "ETEPME",
   :qudt/longDescription
   "The relationship between ITRF and ICRS is discussed extensively in [IERS-TN-32-2004]. Different models of this relationship are used. The NASA Deep Space Network uses the Lieske precession model (1976) and the corresponding nutation model is realized by nutations provided on DE405; the corresponding timing and polar motion data as measured for times past are maintained in internal files at the Jet Propulsion Laboratory. The IERS has proposed use of more recent precession (two flavors available) and nutation models and publishes timing and polar motion data for times past in its Earth Orientation Parameters (EOP) file available at http://www.iers.org. Either algorithm should be sufficiently accurate and it should be stated which is being used. However, the data and models must not be mixed. Do not, for example, use IERS EOP data with the Lieske precession model and DE405 nutations.",
   :qudt/realization
   "The International Terrestrial Reference Frame as defined for 1993 (ITRF93), as located in the ICRF at the epoch given using a consistent set of precession, nutation, and timing and polar motion models.",
   :qudt/xAxisDefinition
   "The intersection of the prime meridian and the rotation equator of the Earth, in the ICRF and at the epoch given.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "The rotation pole of the Earth, in the ICRF and at the epoch given.",
   :rdf/type :qudt/NonRotatingInertialFrame,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Earth True Equator and Prime Meridian of Epoch",
   :rdfs/seeAlso ["http://qudt.org/schema/qudt/IERS-TN-32-2004"],
   :skos/prefLabel "Earth True Equator and Prime Meridian of Epoch"})

(def ^{:private true} NRIF_ICRF
  "The International celestial reference frame (ICRF) is the best-determined and most stable reference frame and is the root frame. Other reference frames are often given with respect to the ICRF."
  {:db/ident :qudt/NRIF_ICRF,
   :dcterms/description
   "The International celestial reference frame (ICRF) is the best-determined and most stable reference frame and is the root frame.  Other reference frames are often given with respect to the ICRF.",
   :qudt/figure :qudt/FIG_ICRF,
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-03",
   :qudt/literal "ICRF",
   :qudt/realization
   "The International Celestial Reference Frame (ICRF) was defined in 1995 with locations given for 22 quasars and other bright radio objects. This definition was extended by the addition of more sources in 2000.",
   :qudt/xAxisDefinition
   "Defined as the cross product of the Z-axis (as defined above) and the Earth mean orbit pole of J2000 (i.e. the ecliptic pole of J2000). The X-axis of this coordinate frame is the Earth vernal equinox of J2000.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Defined as the pole vector of the Earth Mean Equator of J2000 (where J2000 = Julian date 2451545.0 TDB (Barycentric Dynamical Time)).",
   :rdf/type :qudt/NonRotatingInertialFrame,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "International celestial reference frame"})

(def ^{:private true} NRIF_LPAE
  "Lunar Principal Axis Of Epoch Coordinate System"
  {:db/ident :qudt/NRIF_LPAE,
   :qudt/abbreviation "LPAE",
   :qudt/code 44,
   :qudt/figure :qudt/FIG_LPAE,
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-04",
   :qudt/literal "LPAE",
   :qudt/xAxisDefinition
   "Points in the direction of the Moon???s prime meridian principal axis of Epoch (minimum moment of inertia).",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Points in the direction of the Moon???s North pole principal axis of Epoch (maximum moment of inertia).",
   :rdf/type :qudt/NonRotatingInertialFrame,
   :rdfs/comment
   "Finding the principal axes depends on solving for the dynamics of the Moon???s orientation, which must be done in conjunction with solving for its motion in space, though the Moon???s motion in space can also be solved for independently. The terms ???north pole??? and ???prime meridian??? are loosely used for the Z and X axes respectively of both this and the Lunar Mean Earth frames.",
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Lunar Principal Axis of Epoch",
   :skos/definition "Lunar Principal Axis Of Epoch Coordinate System",
   :skos/prefLabel "Lunar Principal Axis of Epoch"})

(def ^{:private true} NRIF_MMEIAUE
  "Mars Mean Equator And IAU-Node Of Epoch Coordinate System"
  {:db/ident :qudt/NRIF_MMEIAUE,
   :qudt/code 50,
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-05",
   :qudt/literal "MMEIAUE",
   :qudt/realization
   "This frame is realized from the ICRF, precessed and rotated Relationships: according to the formulae in IAU2000, [Seidelmann2000]",
   :qudt/xAxisDefinition
   "Defined as the cross product of the ICRF Z-axis with the Z-axis (as defined above).",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Defined as the pole vector of the Mars Mean Equator of Epoch.",
   :rdf/type :qudt/NonRotatingInertialFrame,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Mars Mean Equator and IAU-Node of Epoch",
   :skos/definition "Mars Mean Equator And IAU-Node Of Epoch Coordinate System",
   :skos/prefLabel "Mars Mean Equator and IAU-Node of Epoch"})

(def ^{:private true} NUMERIC
  "Numeric"
  {:db/ident           :qudt/NUMERIC,
   :qudt/ansiSQLName   "DECIMAL(p,s)",
   :qudt/code          101,
   :qudt/literal       "numeric",
   :qudt/odbcName      "SQL_DECIMAL(p,s)",
   :qudt/oracleSQLName "NUMBER(p,s)",
   :rdf/type           :qudt/NumericType,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label         "Numeric"})

(def ^{:private true} NegativeX
  "The axis that is in the negative X direction."
  {:db/ident            :qudt/NegativeX,
   :dcterms/description "The axis that is in the negative X direction.",
   :qudt/code           1,
   :qudt/literal        "negativeX",
   :rdf/type            :qudt/AxialOrientationType,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Negative X"})

(def ^{:private true} NegativeY
  "The axis that is in the negative Y direction."
  {:db/ident            :qudt/NegativeY,
   :dcterms/description "The axis that is in the negative Y direction.",
   :qudt/code           2,
   :qudt/literal        "negativeY",
   :rdf/type            :qudt/AxialOrientationType,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Negative Y"})

(def ^{:private true} NegativeZ
  "The axis that is in the negative Z direction."
  {:db/ident            :qudt/NegativeZ,
   :dcterms/description "The axis that is in the negative Z direction.",
   :qudt/code           3,
   :qudt/literal        "negativeZ",
   :rdf/type            :qudt/AxialOrientationType,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Negative Z"})

(def ^{:private true} NetCDF
  "NetCDF (network Common Data Form) is a set of interfaces for array-oriented data access and a freely-distributed collection of data access libraries for C, Fortran, C++, Java, and other languages. The netCDF libraries support a machine-independent format for representing scientific data. Together, the interfaces, libraries, and format support the creation, access, and sharing of scientific data."
  {:db/ident         :qudt/NetCDF,
   :dcterms/description
   "NetCDF (network Common Data Form) is a set of interfaces for array-oriented data access and a freely-distributed collection of data access libraries for C, Fortran, C++, Java, and other languages. The netCDF libraries support a machine-independent format for representing scientific data. Together, the interfaces, libraries, and format support the creation, access, and sharing of scientific data.",
   :rdf/type         :qudt/MultiDimensionalDataFormat,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "NetCDF"})

(def ^{:private true} OCTET
  "Octet"
  {:db/ident          :qudt/OCTET,
   :dtype/literal     "octet",
   :qudt/abbreviation "octet",
   :qudt/bits         8,
   :qudt/bytes        1,
   :qudt/cName        "Byte",
   :qudt/code         "800",
   :qudt/encoding     :qudt/OctetEncoding,
   :qudt/id           "T002-01",
   :qudt/literal      "octet",
   :qudt/maxInclusive 255,
   :qudt/minInclusive [0 "0"],
   :qudt/octets       1,
   :qudt/rdfsDatatype :xsd/byte,
   :qudt/signedness   :qudt/UNSIGNED,
   :rdf/type          :qudt/OctetType,
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "Octet"})

(def ^{:private true} ORDERED-TREE
  "Ordered Tree"
  {:db/ident         :qudt/ORDERED-TREE,
   :rdf/type         :qudt/OrderedTree,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Ordered Tree"})

(def ^{:private true} OctetEncoding
  "OCTET Encoding"
  {:db/ident         :qudt/OctetEncoding,
   :qudt/bytes       1,
   :rdf/type         [:qudt/ByteEncodingType :qudt/BooleanEncodingType],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "OCTET Encoding"})

(def ^{:private true} OffOnStateTypeEnumeration
  "A discrete state enumeration whose values are 'off' and 'on'. The 'off' value is encoded as a zero (0) and the 'on' value as a one (1)."
  {:db/ident :qudt/OffOnStateTypeEnumeration,
   :dcterms/description
   "A discrete state enumeration whose values are 'off' and 'on'. The 'off' value is encoded as a zero (0) and the 'on' value as a one (1).",
   :qudt/code 1014,
   :qudt/value ["http://qudt.org/schema/type#On"
                "http://qudt.org/schema/type#Off"],
   :rdf/type :qudt/DiscreteStateEnumeration,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Off/On State Type Enumeration"})

(def ^{:private true} OnOffStateTypeEnumeration
  "A discrete state enumeration whose values are 'off' and 'on'. The 'on' value is encoded as a zero (0) and the 'off' value as a one (1)."
  {:db/ident :qudt/OnOffStateTypeEnumeration,
   :dcterms/description
   "A discrete state enumeration whose values are 'off' and 'on'. The 'on' value is encoded as a zero (0) and the 'off' value as a one (1).",
   :qudt/code 1016,
   :qudt/inverted true,
   :qudt/value ["http://qudt.org/schema/type#On"
                "http://qudt.org/schema/type#Off"],
   :rdf/type :qudt/DiscreteStateEnumeration,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "On/Off State Type Enumeration"})

(def ^{:private true} OrderedCOLLECTION
  "Ordered COLLECTION"
  {:db/ident         :qudt/OrderedCOLLECTION,
   :rdf/type         :qudt/OrderedCollection,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Ordered COLLECTION"})

(def ^{:private true} Other_TBD
  "2. ???The adoption of ICRS on 1 January 1998: meaning and consequences???, Letter to the Editor, M. Feissel and F. Mignard, Astronomy and Astrophysics, 331, L33-L36, 1998, http://adsabs.harvard.edu/cgi-bin/nph- bib_query?bibcode=1998A%26A...331L..33F&amp;db_key=AST&amp;data_typ e=HTML&amp;format= 4. ???Lunar Laser Ranging Science: Gravitational Physics and Lunar Interior and Geodesy???, J. G. Williams, S. G. Turyshev, D. H. Boggs, and J. T. Ratcliff, 35th COSPAR Scientific Assembly, Paris, France, July 18-24, 2004, Advances in Space Research, in press 2005, http://arxiv.org/abs/gr-qc/?412049. 6. ???JPL Planetary and Lunar Ephemerides, DE403/LE403???, E. M. Standish, X. X. Newhall, J. G. Williams, and W. M. Folkner, JPL IOM 314.10-127, May 22, 1995, http://ssd.jpl.nasa.gov/iau-comm4/de403iom/. 8. IERS Conventions (2003), D. D. McCarthy and Ge??rard Petit (eds.), IERS Technical Note No. 32, 2004; http://www.iers.org/iers/publications/tn/tn32. 9. ???Lunar coordinates in the regions of the Apollo lander,??? M. E. Davies and T. R. Coltin, Journal Of Geophysical Research, V. 105, No. E8, Pages 20, 277-20, 280, August 25, 2000. 10. ???A Meaningful Relative Motion Coordinate System For Generic Use,??? D. R. Adamo, AAS Paper No. 05-306, presented at the AAS/AIAA Astrodynamics Specialists Conference, Lake Tahoe, California, August 7 - 11, 2005. 11. ???Lunar moments, tides, orientation, and coordinate frames,??? J. G. Williams, X. X. Newhall, and J. O. Dickey, Planet. Space Sci. 44:1077-1080, 1996."
  {:db/ident :qudt/Other_TBD,
   :dcterms/description
   "2. ???The adoption of ICRS on 1 January 1998: meaning and consequences???, Letter to the Editor, M. Feissel and F. Mignard, Astronomy and Astrophysics, 331, L33-L36, 1998, http://adsabs.harvard.edu/cgi-bin/nph- bib_query?bibcode=1998A%26A...331L..33F&amp;db_key=AST&amp;data_typ e=HTML&amp;format= \n\n4. ???Lunar Laser Ranging Science: Gravitational Physics and Lunar Interior and Geodesy???, J. G. Williams, S. G. Turyshev, D. H. Boggs, and J. T. Ratcliff, 35th COSPAR Scientific Assembly, Paris, France, July 18-24, 2004, Advances in Space Research, in press 2005, http://arxiv.org/abs/gr-qc/?412049.\n\n6. ???JPL Planetary and Lunar Ephemerides, DE403/LE403???, E. M. Standish, X. X. Newhall, J. G. Williams, and W. M. Folkner, JPL IOM 314.10-127, May 22, 1995, http://ssd.jpl.nasa.gov/iau-comm4/de403iom/.\n\n8. IERS Conventions (2003), D. D. McCarthy and Ge??rard Petit (eds.), IERS Technical Note No. 32, 2004; http://www.iers.org/iers/publications/tn/tn32.\n\n9. ???Lunar coordinates in the regions of the Apollo lander,??? M. E. Davies and T. R. Coltin, Journal Of Geophysical Research, V. 105, No. E8, Pages 20, 277-20, 280, August 25, 2000.\n\n10. ???A Meaningful Relative Motion Coordinate System For Generic Use,??? D. R. Adamo, AAS Paper No. 05-306, presented at the AAS/AIAA Astrodynamics Specialists Conference, Lake Tahoe, California, August 7 - 11, 2005.\n11. ???Lunar moments, tides, orientation, and coordinate frames,??? J. G. Williams, X. X. Newhall, and J. O. Dickey, Planet. Space Sci. 44:1077-1080, 1996.",
   :rdf/type :qudt/Citation,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Other (TBD)",
   :skos/prefLabel "Other"})

(def ^{:private true} POSITIVE-BIG-INTEGER
  "Positive Big Integer"
  {:db/ident          :qudt/POSITIVE-BIG-INTEGER,
   :dtype/literal     "PI64",
   :qudt/abbreviation "PI64",
   :qudt/bits         64,
   :qudt/maxInclusive "2^{64}-1",
   :qudt/minInclusive "1",
   :qudt/mySQLName    "BIGINT",
   :qudt/octets       8,
   :qudt/rdfsDatatype :xsd/unsignedLong,
   :qudt/signedness   :qudt/UNSIGNED,
   :rdf/type          :qudt/PositiveIntegerType,
   :rdfs/label        "Positive Big Integer"})

(def ^{:private true} POSITIVE-LONG-INTEGER
  "Unsigned Long Integer"
  {:db/ident          :qudt/POSITIVE-LONG-INTEGER,
   :dtype/literal     "PI32",
   :qudt/abbreviation "UI32",
   :qudt/bits         32,
   :qudt/encoding     :qudt/UnsignedIntegerEncoding,
   :qudt/maxInclusive "2^{32}-1",
   :qudt/minInclusive "1",
   :qudt/mySQLName    "INT",
   :qudt/octets       4,
   :qudt/rdfsDatatype :xsd/unsignedInt,
   :qudt/signedness   :qudt/UNSIGNED,
   :rdf/type          :qudt/PositiveIntegerType,
   :rdfs/label        "Unsigned Long Integer"})

(def ^{:private true} PRIORITY-QUEUE
  "A \"Priority Queue \"is an abstract data type which is like a regular queue or stack data structure, but where additionally each element has a \"priority\" associated with it. In a priority queue, an element with high priority is served before an element with low priority. If two elements have the same priority, they are served according to their order in the queue."
  {:db/ident :qudt/PRIORITY-QUEUE,
   :dcterms/description
   "A \"Priority Queue \"is an abstract data type which is like a regular queue or stack data structure, but where additionally each element has a \"priority\" associated with it. In a priority queue, an element with high priority is served before an element with low priority. If two elements have the same priority, they are served according to their order in the queue.",
   :prov/wasInfluencedBy "http://en.wikipedia.org/wiki/Priority_queue",
   :rdf/type :qudt/OrderedCollection,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Priority Queue",
   :rdfs/seeAlso ["http://qudt.org/schema/qudt/HEAP"]})

(def ^{:private true} PadWithAny
  "Pad with either a one or a zero. In other words, this is the \"don't care\" situation."
  {:db/ident :qudt/PadWithAny,
   :dcterms/description
   "Pad with either a one or a zero. In other words, this is the \"don't care\" situation.",
   :qudt/literal "none",
   :rdf/type :qudt/PaddingType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Pad with any"})

(def ^{:private true} PadWithOnes
  "Pad unused bits of a field with a one."
  {:db/ident            :qudt/PadWithOnes,
   :dcterms/description "Pad unused bits of a field with a one.",
   :qudt/literal        "ones",
   :rdf/type            :qudt/PaddingType,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Pad with ones"})

(def ^{:private true} PadWithZeros
  "Pad unused bits of a field with a zero."
  {:db/ident            :qudt/PadWithZeros,
   :dcterms/description "Pad unused bits of a field with a zero.",
   :qudt/literal        "zeros",
   :rdf/type            :qudt/PaddingType,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Pad with zeros"})

(def ^{:private true} PartialArray
  "A partial array is an Array with two attributes that define the starting and ending indices of the elements that are provided."
  {:db/ident         :qudt/PartialArray,
   :dcterms/description
   "A partial array is an Array with two attributes that define the starting and ending indices of the elements that are provided.",
   :rdf/type         :qudt/Array,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Partial Array"})

(def ^{:private true} Pointer
  "A pointer is a programming language data type whose value refers directly to (or \"points to\") another value stored elsewhere in the computer memory using its address. A pointer references a value stored elsewhere in memory, and obtaining or requesting the value to which a pointer refers is called dereferencing the pointer. A pointer is a simple implementation of the general reference data type. Pointers to data improve performance for repetitive operations such as traversing string and tree structures, and pointers to functions are used for binding methods in Object-oriented programming and run-time linking to dynamic link libraries (DLLs). While \"pointer\" has been used to refer to references in general, it more properly applies to data structures whose interface explicitly allows the pointer to be manipulated as a memory address."
  {:db/ident         :qudt/Pointer,
   :dcterms/description
   "A pointer is a programming language data type whose value refers directly to (or \"points to\") another value stored elsewhere in the computer memory using its address. A pointer references a value stored elsewhere in memory, and obtaining or requesting the value to which a pointer refers is called dereferencing the pointer. A pointer is a simple implementation of the general reference data type. Pointers to data improve performance for repetitive operations such as traversing string and tree structures, and pointers to functions are used for binding methods in Object-oriented programming and run-time linking to dynamic link libraries (DLLs).\n\nWhile \"pointer\" has been used to refer to references in general, it more properly applies to data structures whose interface explicitly allows the pointer to be manipulated as a memory address.",
   :rdf/type         :qudt/ReferenceDatatype,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Pointer"})

(def ^{:private true} PositiveX
  "The axis that is in the positive X direction."
  {:db/ident            :qudt/PositiveX,
   :dcterms/description "The axis that is in the positive X direction.",
   :qudt/code           4,
   :qudt/literal        "positiveX",
   :rdf/type            :qudt/AxialOrientationType,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Positive X"})

(def ^{:private true} PositiveY
  "The axis that is in the positive Y direction."
  {:db/ident            :qudt/PositiveY,
   :dcterms/description "The axis that is in the positive Y direction.",
   :qudt/code           5,
   :qudt/literal        "positiveY",
   :rdf/type            :qudt/AxialOrientationType,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Positive Y"})

(def ^{:private true} PositiveZ
  "The axis that is in the positive Z direction."
  {:db/ident            :qudt/PositiveZ,
   :dcterms/description "The axis that is in the positive Z direction.",
   :qudt/code           6,
   :qudt/literal        "positiveZ",
   :rdf/type            :qudt/AxialOrientationType,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Positive Z"})

(def ^{:private true} QUEUE
  "Queue"
  {:db/ident         :qudt/QUEUE,
   :rdf/type         :qudt/OrderedCollection,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Queue"})

(def ^{:private true} QuaternionVector-DP
  "<p class=\"lm-para\">This vector type is intended to hold the (real-valued) coefficients to a quaternion number. That is, if \\(V=[a,b,c,d]\\) is a vector of type <i>QUATERNION-VECTOR</i>, then the proper interpretation of this vector is with respect to the basis elements \\(1,i,j,k\\) of the quaternion algebra. Specifically, the V corresponds to the quaternion \\(v = a*1 + b*i + c*j + d*k\\). Note that for most computations, the quaternion basis elements will be replaced with their 4 X 4 dimensional matrix representations, which are elements of type <i>QuaternionBasisMatrix</i>. In this case, the resulting quaternion will be a 4 X 4 dimensional matrix of the form:</p> <pre> a b c d -b a -d c -c d a -b -d -c b a </pre>"
  {:db/ident :qudt/QuaternionVector-DP,
   :dcterms/description
   "<p class=\"lm-para\">This vector type is intended to hold the (real-valued) coefficients to a quaternion number. That is, if \\(V=[a,b,c,d]\\) is a vector of type <i>QUATERNION-VECTOR</i>, then the proper interpretation of this vector is with respect to the basis elements \\(1,i,j,k\\) of the quaternion algebra. Specifically, the V corresponds to the quaternion \\(v = a*1 + b*i + c*j + d*k\\). Note that for most computations, the quaternion basis elements will be replaced with their 4 X 4 dimensional matrix representations, which are elements of type <i>QuaternionBasisMatrix</i>. In this case, the resulting quaternion will be a 4 X 4 dimensional matrix of the form:</p>\n<pre>\n  a   b  c  d\n-b   a -d  c\n-c   d  a -b\n-d -c  b   a\n</pre>",
   :qudt/code 340,
   :qudt/dimension 4,
   :qudt/dimensionality 1,
   :qudt/elementType :qudt/FLOAT-DP,
   :rdf/type :qudt/Vector,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Quaternion Vector - double precision"})

(def ^{:private true} RELATIVE-DATETIME
  "Days and time relative to some Epoch"
  {:db/ident         :qudt/RELATIVE-DATETIME,
   :dcterms/description "Days and time relative to some Epoch",
   :qudt/code        76,
   :qudt/dimensionality 1,
   :qudt/encodingDescription "TBD",
   :qudt/id          "T004-08",
   :qudt/literal     "reldate",
   :rdf/type         :qudt/DateStringType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Relative date and time"})

(def ^{:private true} RRF_EMEPM
  "Earth Mean Equator and Prime Meridian"
  {:db/ident :qudt/RRF_EMEPM,
   :qudt/figure :qudt/FIG_ICRF_EME-EMEPM,
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-07",
   :qudt/literal "EMEPM",
   :qudt/longDescription
   "Reasonable alternatives include the ICRF precessed and rotated according to any standard precession model, but since the ???mean??? is an approximation, it seems not worthwhile to additional computation to this definition. Although [Seidelmann2000] specifies TCB (Barycentric Coordinate Time), this in fact was an error introduced late in the preparation of the paper; the correct time scale for use in the IAU formulae given in Table 2.0-1 in the paper is TDB (Barycentric Dynamical Time, i.e., ephemeris time) and the standard epoch is 2451545.0 TDB.",
   :qudt/realization
   "This frame is realized from the ICRF, precessed and rotated according to the formulae in IAU2000.",
   :qudt/xAxisDefinition
   "The intersection of the prime meridian and the rotation equator of the Earth, in the ICRF and as a function of time.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "The mean rotation pole of the Earth, in the ICRF and as a function of time.",
   :rdf/type :qudt/RotatingReferenceFrame,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Earth Mean Equator and Prime Meridian",
   :skos/prefLabel "Earth Mean Equator and Prime Meridian"})

(def ^{:private true} RRF_EMR
  "In this coordinate frame, the two collinear Lagrange points LL_1 and LL_2 (sometimes called Libration points) both lie along the positive X-axis approximately 60000 kilometers from the Moon. The LL_1 point lies on the X-axis between the Moon and the Earth and the LL_2 point lies on the X-axis on the other side of the Moon away from the Earth. See [Roncoli2005] for more information about Lagrange points."
  {:db/ident :qudt/RRF_EMR,
   :dcterms/description
   "In this coordinate frame, the two collinear Lagrange points LL_1 and LL_2 (sometimes called Libration points) both lie along the positive X-axis approximately 60000 kilometers from the Moon. The LL_1 point lies on the X-axis between the Moon and the Earth and the LL_2 point lies on the X-axis on the other side of the Moon away from the Earth. See [Roncoli2005] for more information about Lagrange points.",
   :qudt/code 20,
   :qudt/frameType :qudt/FT_ROTATING,
   :qudt/id "T110-08",
   :qudt/literal "EM-ROT",
   :qudt/xAxisDefinition
   "Points in the direction of the vector from the Earth to the Moon.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Points in the direction of the instantaneous orbit normal of the Moon about the Earth.",
   :rdf/type :qudt/RotatingReferenceFrame,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Earth-Moon Rotating",
   :skos/definition "Earth-Moon Rotating Coordinate System",
   :skos/prefLabel "Earth-Moon Rotating"})

(def ^{:private true} RRF_ICRF
  "The ICRF is the best-determined and most stable reference frame and is the ???root??? frame???other reference frames are often given with respect to the ICRF."
  {:db/ident :qudt/RRF_ICRF,
   :dcterms/description
   "The ICRF is the best-determined and most stable reference frame and is the ???root??? frame???other reference frames are often given with respect to the ICRF.",
   :owl/sameAs :qudt/NRIF_ICRF,
   :qudt/figure :qudt/FIG_ICRF,
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-06",
   :qudt/literal "ICRF",
   :qudt/longDescription
   "The vehicle-centered,EME2000coordinatesystemisusefulforvehicleattitude determination since the positions of stars in star catalogs used with star trackers and other celestial sensors are generally expressed in the EME2000 coordinate frame. However, caution must be exercised here since the EME2000 frames realized in the past by various star catalogs (such as FK5) and ephemerides (such as DE205) were actually slightly different frames because estimates of the actual location EME2000 changed with improvements in models and new data. For this reason the ICRF is the recommended standard.",
   :qudt/realization
   "The International Celestial Reference Frame (ICRF) was defined in 1995 with locations given for 22 quasars and other bright radio objects. This definition was extended by the addition of more sources in 2000. See Reference 8 for further information.",
   :qudt/xAxisDefinition
   "Defined as the cross product of the Z-axis (as defined above) and the Earth mean orbit pole of J2000 (i.e. the ecliptic pole of J2000). The X-axis of this coordinate frame is the Earth vernal equinox of J2000.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Defined as the pole vector of the Earth Mean Equator of J2000 (where J2000 = Julian date 2451545.0 TDB (Barycentric Dynamical Time)).",
   :rdf/type :qudt/ReferenceFrame,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "International Celestial Reference Frame",
   :skos/altLabel "Earth Mean Equator and Equinox of J2000",
   :skos/prefLabel "International Celestial Reference Frame"})

(def ^{:private true} RRF_ITRF
  "At current levels of accuracy and precision the location of the ITRF at any point in time with respect to the ICRF cannot be predicted because the Earth (and its weather!) are not modeled that accurately. The location of the true pole depends on modeling precession and nutation and then measuring the actual rotation pole relative to the modeled pole with respect to both the ITRF and the ICRF. One can use either the NASA Deep Space Network???s models and file of pole locations, which also includes timing information to tell where the prime meridian was OR one can use the IERS models and file of pole locations and timing called the Earth Orientation Parameters (EOP) file BUT NOT BOTH, e.g., do not use the IERS EOP with the DSN models for precession and nutation. The IERS information is more publicly available and is recommended. See Reference 8 for more information, including the relationships between the various ITRF frames."
  {:db/ident :qudt/RRF_ITRF,
   :dcterms/description
   "At current levels of accuracy and precision the location of the ITRF at any point in time with respect to the ICRF cannot be predicted because the Earth (and its weather!) are not modeled that accurately. The location of the true pole depends on modeling precession and nutation and then measuring the actual rotation pole relative to the modeled pole with respect to both the ITRF and the ICRF. One can use either the NASA Deep Space Network???s models and file of pole locations, which also includes timing information to tell where the prime meridian was OR one can use the IERS models and file of pole locations and timing called the Earth Orientation Parameters (EOP) file BUT NOT BOTH, e.g., do not use the IERS EOP with the DSN models for precession and nutation. The IERS information is more publicly available and is recommended. See Reference 8 for more information, including the relationships between the various ITRF frames.",
   :owl/sameAs :qudt/NRIF_ETEPMBF,
   :qudt/figure :qudt/FIG_ITRF,
   :qudt/frameType :qudt/FT_ROTATING,
   :qudt/id "T110-09",
   :qudt/literal "ITRF",
   :qudt/realization
   "The International Terrestrial Reference Frame (ITRF) is realized by the locations of a set of points or stations on a tide-free Earth. As measurements and models have improved or changed, these locations have been changed also and the ITRF has moved slightly with respect to the physical Earth every few years; ITRF93 is recommended.",
   :qudt/xAxisDefinition
   "The intersection of the prime meridian and the rotation equator of the Earth.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition "The rotation pole of the Earth.",
   :rdf/type :qudt/RotatingReferenceFrame,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "International Terrestrial Reference Frame",
   :rdfs/seeAlso ["http://qudt.org/schema/qudt/RRF_ICRF"],
   :skos/prefLabel "International Terrestrial Reference Frame"})

(def ^{:private true} RRF_LMEBF
  "Lunar body-fixed coordinate frame aligned with the rotation axis of the Moon."
  {:db/ident :qudt/RRF_LMEBF,
   :dcterms/description
   "Lunar body-fixed coordinate frame aligned with the rotation axis of the Moon.",
   :qudt/citation
   "???Lunar moments, tides, orientation, and coordinate frames,??? J. G. Williams, X. X. Newhall, and J. O. Dickey, Planet. Space Sci. 44:1077-1080, 1996.",
   :qudt/code 40,
   :qudt/frameType :qudt/FT_ROTATING,
   :qudt/id "T110-10",
   :qudt/literal "LMEBF",
   :qudt/longDescription
   "The location of the LMEBF is a fixed rotation from the LPABF given in [Williams96] as: ???The three rotations (in arcseconds) from Principal (P) to Mean (M) axes are M = R_1(-0.15??????) R_2(-79.12??????) R_3(-66.48??????) P.\"\n\nHistorical data and surface maps are given in this frame. Finding the rotation axes and principal axes depends on solving for the dynamics of the Moon???s orientation, which must be done in conjunction with solving for its motion in space, though the Moon???s motion in space can also be solved for independently.\n\nUsing the traditional terminology and syntax for trajectory-related coordinate frames, this frame probably could have been called ???Moon True Equator and Prime Meridian Body-Fixed??? since the lunar principal axes directions represent the best (or ???true???) orientations of the Moon???s pole and prime meridian at any given time. These axes are slightly rotated away from the Moon???s principal axes because the Moon is tidally locked to Earth so that perturbations from higher order terms in the gravity field are not averaged out by rotation.",
   :qudt/realization
   "This is realized by the locations of the three Apollo and one Lunar laser ranging retroreflectors",
   :qudt/xAxisDefinition
   "Points in the direction of the Moon???s historical prime meridian (mean direction toward Earth).",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Points in the direction of the Moon???s North rotation pole (mean rotation axis).",
   :rdf/type :qudt/RotatingReferenceFrame,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Lunar Mean Earth Body-Fixed",
   :skos/definition "Lunar Mean Earth Body Fixed Coordinate System",
   :skos/prefLabel "Lunar Mean Earth Body-Fixed"})

(def ^{:private true} RRF_LPABF
  "Lunar body-fixed coordinate frame aligned with the principal axes of the Moon. The location of the LPABF in the ICRF should be solved for in conjunction with solving for the Moon???s motion in space."
  {:db/ident :qudt/RRF_LPABF,
   :dcterms/description
   "Lunar body-fixed coordinate frame aligned with the principal axes of the Moon. The location of the LPABF in the ICRF should be solved for in conjunction with solving for the Moon???s motion in space.",
   :qudt/code 42,
   :qudt/frameType :qudt/FT_ROTATING,
   :qudt/id "T110-11",
   :qudt/literal "LPABF",
   :qudt/realization "This is a fixed rotation from LMEBF",
   :qudt/xAxisDefinition
   "Points in the direction of the Moon's prime meridian principal axis (minimum moment of inertia).",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Points in the direction of the Moon's North pole principal axis (maximum moment of inertia).",
   :rdf/type :qudt/RotatingReferenceFrame,
   :rdfs/comment
   "Lunar gravity fields are defined in this frame. Finding the principal axes depends on solving for the dynamics of the Moon???s orientation, which must be done in conjunction with solving for its motion in space, though the Moon???s motion in space can also be solved for independently. The terms ???north pole??? and ???prime meridian??? are loosely used for the Z and X axes respectively of both this and the Lunar Mean Earth frames",
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Lunar Principal Axis Body-Fixed",
   :skos/prefLabel "Lunar Principal Axis Body-Fixed"})

(def ^{:private true} RRF_LVC
  "Since this coordinate system is non-Euclidean, the axes are not defined by vectors but are lines and circles in space through an origin at a vehicle in orbit around a central body."
  {:db/ident :qudt/RRF_LVC,
   :dcterms/description
   "Since this coordinate system is non-Euclidean, the axes are not defined by vectors but are lines and circles in space through an origin at a vehicle in orbit around a central body.",
   :qudt/frameType :qudt/FT_NON-ROTATING,
   :qudt/id "T110-12",
   :qudt/literal "LVC",
   :qudt/realization
   "Defined by the position and velocity vectors associated with a vehicle and thus directly related to the coordinate system in which those vectors are expressed.",
   :qudt/xAxisDefinition
   "Defined as the circle that intersects the vehicle center-of-mass, is centered on the central body center, and lies in the vehicle orbit plane, positive in the direction of motion.",
   :qudt/xCoordinateDefinition
   "Defined as the distance on C between the radial projection of P onto C and the Y-axis; this is taken to be positive if P is on the same side from the Y-Z plane as the vehicle velocity vector points and negative otherwise. Equivalently, if we let ?? be the centralbody-centered angle from the vehicle to the projection of P onto the orbit plane (measured positively in a right-handed sense with respect to the vehicle orbit angular momentum), then the xcoordinate of the point is ?? (in radians) times the radius of the vehicle. Note that the LVC x-coordinate is arbitrary for P located on N.",
   :qudt/yAxisDefinition
   "Defined as the line that intersects the vehicle center-of-mass and is normal to the vehicle orbit plane, positive opposite the direction of the orbit angular momentum vector (thus completing a right-handed coordinate system).",
   :qudt/yCoordinateDefinition
   "Defined as the distance from the orbit plane, positive on the side opposite the angular momentum direction.",
   :qudt/zAxisDefinition
   "Defined as the line through the vehicle center-of-mass and the central body center, positive toward the central body center.",
   :qudt/zCoordinateDefinition
   "Defined as the distance from the central body center to the vehicle center-of-mass minus the distance between P and N; equivalently, the radius of C minus the radius of the projection of P onto the vehicle orbit plane.",
   :rdf/type :qudt/RotatingReferenceFrame,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Local Vertical Curvilinear",
   :skos/prefLabel "Local Vertical Curvilinear"})

(def ^{:private true} RRF_LVLH
  "Local Vertical Local Horizontal"
  {:db/ident :qudt/RRF_LVLH,
   :qudt/frameType :qudt/FT_ROTATING,
   :qudt/id "T110-13",
   :qudt/literal "LVLH",
   :qudt/realization
   "Defined by the position and velocity vectors associated with a Relationships: vehicle and thus directly related to the coordinate system in which those vectors are expressed.",
   :qudt/xAxisDefinition
   "Defined as the circle that intersects the vehicle center-of-mass, is centered on the central body center, and lies in the vehicle orbit plane, positive in the direction of motion.",
   :qudt/yAxisDefinition
   "Completes a standard, right-handed coordinate frame and is positive in the direction of vehicle motion.",
   :qudt/zAxisDefinition
   "Defined as a line that lies along the radius vector from the central body center to the vehicle center-of-mass and is positive toward the central body center.",
   :rdf/type :qudt/RotatingReferenceFrame,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Local Vertical Local Horizontal"})

(def ^{:private true} RRF_MMEPMBF
  "Mars body-fixed coordinate frame with the Mars North pole and prime meridian directions defined by the IAU/IAG [@Seidelmann:2000]."
  {:db/ident :qudt/RRF_MMEPMBF,
   :dcterms/description
   "Mars body-fixed coordinate frame with the Mars North pole and prime meridian directions defined by the IAU/IAG [@Seidelmann:2000].",
   :qudt/code 52,
   :qudt/frameType :qudt/FT_ROTATING,
   :qudt/id "T110-14",
   :qudt/literal "MMEPMBF",
   :rdf/type :qudt/RotatingReferenceFrame,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Mars Mean Equator and Prime Meridian Body-Fixed",
   :skos/definition
   "Mars Mean Equator And Prime Meridian Body-Fixed Coordinate System",
   :skos/prefLabel "Mars Mean Equator and Prime Meridian Body-Fixed"})

(def ^{:private true} RRF_SER
  "In this coordinate frame, the two collinear Lagrange points EL_1 and EL_2 (sometimes called Libration points) both lie along the positive X-axis approximately 1.5 million kilometers from the Earth. The EL_1 point lies on the X-axis between the Earth and the Sun and the EL_2 point lies on the X-axis on the other side of the Earth away from the Sun. See [Roncoli2005] for more information about Lagrange points."
  {:db/ident :qudt/RRF_SER,
   :dcterms/description
   "In this coordinate frame, the two collinear Lagrange points EL_1 and EL_2 (sometimes called Libration points) both lie along the positive X-axis approximately 1.5 million kilometers from the Earth. The EL_1 point lies on the X-axis between the Earth and the Sun and the EL_2 point lies on the X-axis on the other side of the Earth away from the Sun. See [Roncoli2005] for more information about Lagrange points.",
   :qudt/code 92,
   :qudt/figure :qudt/FIG_EM-ROT,
   :qudt/frameType :qudt/FT_ROTATING,
   :qudt/id "T110-15",
   :qudt/literal "SE-ROT",
   :qudt/xAxisDefinition
   "Points in the direction of the vector from the Sun to the Earth.",
   :qudt/yAxisDefinition "Completes a standard, right-handed coordinate frame.",
   :qudt/zAxisDefinition
   "Points in the direction of the instantaneous orbit normal of the Earth about the Sun.",
   :rdf/type :qudt/RotatingReferenceFrame,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Sun-Earth Rotating"})

(def ^{:private true} Roncoli2005
  "\"Lunar Constants and Models Document???, R. Roncoli, JPL D-32296, September 23, 2005, http://ssd.jpl.nasa.gov/?lunar_doc."
  {:db/ident :qudt/Roncoli2005,
   :dcterms/description
   "\"Lunar Constants and Models Document???, R. Roncoli, JPL D-32296, September 23, 2005, http://ssd.jpl.nasa.gov/?lunar_doc.",
   :qudt/url "http://ssd.jpl.nasa.gov/?lunar_doc",
   :rdf/type :qudt/Citation,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Roncoli2005",
   :skos/prefLabel "Roncoli2005"})

(def ^{:private true} SEQUENCE
  "SEQUENCE"
  {:db/ident         :qudt/SEQUENCE,
   :rdf/type         :qudt/Sequence,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "SEQUENCE"})

(def ^{:private true} SET
  "SET"
  {:db/ident         :qudt/SET,
   :rdf/type         :qudt/Set,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "SET"})

(def ^{:private true} SIGNED-BIG-INTEGER
  "<p>The <em>Signed Big Integer</em>, (<em>long</em> in Java) data type is a 64-bit signed two's complement integer. It has a minimum value of -9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807 (inclusive). Use this data type when you need a range of values wider than those provided by int.</p> The\"Signed Big Integer\", (\\textit{long) in Java) data type is a 64-bit signed two's complement integer. It has a minimum value of -9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807 (inclusive). Use this data type when you need a range of values wider than those provided by int."
  {:db/ident :qudt/SIGNED-BIG-INTEGER,
   :dcterms/description
   ["<p>The <em>Signed Big Integer</em>, (<em>long</em> in Java) data type is a 64-bit signed two's complement integer. It has a minimum value of -9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807 (inclusive). Use this data type when you need a range of values wider than those provided by int.</p>"
    "The\"Signed Big Integer\", (\\textit{long) in Java) data type is a 64-bit signed two's complement integer. It has a minimum value of -9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807 (inclusive). Use this data type when you need a range of values wider than those provided by int."],
   :dtype/literal "SI64",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/4xwz0t37(v=vs.71).aspx"
    "http://msdn.microsoft.com/en-us/library/4xwz0t37(v=vs.71).aspx"
    "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"
    "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"
    "http://www.mathworks.com/help/matlab/ref/int16.html"
    "http://docs.python.org/2/library/stdtypes.html"
    "http://docs.python.org/2/library/stdtypes.html"
    "http://www.mathworks.com/help/matlab/ref/int16.html"],
   :qudt/abbreviation "SI64",
   :qudt/bits 64,
   :qudt/code 109,
   :qudt/encoding :qudt/LongUnsignedIntegerEncoding,
   :qudt/id "T002-02",
   :qudt/javaName "long",
   :qudt/literal "SI64",
   :qudt/matlabName "int64",
   :qudt/maxInclusive "2^{63}-1",
   :qudt/minInclusive ["-2^{63}" "- 2^{63}-1"],
   :qudt/mySQLName "BIGINT",
   :qudt/octets 8,
   :qudt/protocolBuffersName "int64",
   :qudt/rdfsDatatype :xsd/long,
   :qudt/signedness :qudt/SIGNED,
   :rdf/type :qudt/SignedBigIntegerType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Signed Big Integer"})

(def ^{:private true} SIGNED-INTEGER
  "The \"Signed Integer} or \\textit{short} data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 ( $-2^{15}$ ) and a maximum (inclusive) value of 32,767 ($2^{15\"$). As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters."
  {:db/ident :qudt/SIGNED-INTEGER,
   :dcterms/description
   "The \"Signed Integer} or \\textit{short} data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 ( $-2^{15}$ ) and a maximum (inclusive) value of 32,767 ($2^{15\"$). As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/4xwz0t37(v=vs.71).aspx"
    "http://www.mathworks.com/help/matlab/ref/int16.html"
    "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"
    "http://docs.python.org/2/library/stdtypes.html"],
   :qudt/abbreviation "SI16",
   :qudt/ansiSQLName "SMALLINT",
   :qudt/bits 16,
   :qudt/bytes 2,
   :qudt/code 105,
   :qudt/encoding :qudt/ShortSignedIntegerEncoding,
   :qudt/id "T002-03",
   :qudt/javaName "short",
   :qudt/jsName "short",
   :qudt/literal "SI16",
   :qudt/matlabName "int16",
   :qudt/maxInclusive "32767",
   :qudt/microsoftSQLServerName "smallint",
   :qudt/minInclusive "-32767",
   :qudt/mySQLName "SMALLINT",
   :qudt/rdfsDatatype :xsd/short,
   :rdf/type :qudt/SignedIntegerType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Signed Integer"})

(def ^{:private true} SIGNED-LONG-INTEGER
  "A \\textit{Signed Long Integer) is a 32 bit signed integer in 2's complement form. It has a minimum value of -2,147,483,648 and a maximum value of 2,147,483,647 (inclusive). For integral values, this data type is generally the default choice unless there is a reason (like the above) to choose something else. This data type will most likely be large enough for the numbers your program will use, but if you need a wider range of values, use long instead."
  {:db/ident :qudt/SIGNED-LONG-INTEGER,
   :dcterms/description
   "A \\textit{Signed Long Integer) is a 32 bit signed integer in 2's complement form.  It has a minimum value of -2,147,483,648 and a maximum value of 2,147,483,647 (inclusive). For integral values, this data type is generally the default choice unless there is a reason (like the above) to choose something else. This data type will most likely be large enough for the numbers your program will use, but if you need a wider range of values, use long instead.",
   :dtype/literal "SI32",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/4xwz0t37(v=vs.71).aspx"
    "http://msdn.microsoft.com/en-us/library/4xwz0t37(v=vs.71).aspx"
    "http://docs.python.org/2/library/stdtypes.html"
    "http://docs.python.org/2/library/stdtypes.html"
    "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"
    "http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"],
   :qudt/abbreviation "SI32",
   :qudt/ansiSQLName "INTEGER",
   :qudt/bits 32,
   :qudt/bytes 4,
   :qudt/cName "int",
   :qudt/id "T002-04",
   :qudt/javaName "int",
   :qudt/jsName "int",
   :qudt/literal "SI32",
   :qudt/matlabName "int32",
   :qudt/maxInclusive ["2^{31}-1" "2^{31}- 1"],
   :qudt/microsoftSQLServerName "integer",
   :qudt/minInclusive ["-2^31 -1" "-2^{31}"],
   :qudt/mySQLName "INT",
   :qudt/octets 4,
   :qudt/odbcName "SQL_INTEGER",
   :qudt/oleDBName "DBTYPE_I4",
   :qudt/oracleSQLName "NUMBER(10)",
   :qudt/protocolBuffersName "int32",
   :qudt/rdfsDatatype :xsd/int,
   :qudt/signedness [:qudt/Signed :qudt/SIGNED],
   :rdf/type :qudt/SignedLongIntegerType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Signed Long Integer"})

(def ^{:private true} SIGNED-MEDIUM-INTEGER
  "Signed Medium Integer"
  {:db/ident :qudt/SIGNED-MEDIUM-INTEGER,
   :prov/wasInfluencedBy
   "http://dev.mysql.com/doc/refman/5.0/en/integer-types.html",
   :qudt/abbreviation "SI24",
   :qudt/bits 24,
   :qudt/bytes 3,
   :qudt/maxInclusive 8388607,
   :qudt/minInclusive -8388608,
   :qudt/mySQLName "MEDIUMINT",
   :rdf/type :qudt/SignedMediumIntegerType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Signed Medium Integer"})

(def ^{:private true} SIGNED-SHORT-INTEGER
  "Unsigned 8 bit integer."
  {:db/ident            :qudt/SIGNED-SHORT-INTEGER,
   :dcterms/description "Unsigned 8 bit integer.",
   :qudt/abbreviation   "SI8",
   :qudt/ansiSQLName    "NUMERIC(3,0)",
   :qudt/bits           8,
   :qudt/bytes          1,
   :qudt/code           103,
   :qudt/encoding       :qudt/OctetEncoding,
   :qudt/id             "T002-06",
   :qudt/literal        "SI8",
   :qudt/maxInclusive   "127",
   :qudt/microsoftSQLServerName "tinyint",
   :qudt/minInclusive   "-127",
   :qudt/mySQLName      "TINYINT",
   :qudt/octets         1,
   :qudt/odbcName       "SQL_TINYINT",
   :qudt/oleDBName      "DBTYPE_I1",
   :qudt/rdfsDatatype   :xsd/byte,
   :rdf/type            :qudt/SignedShortIntegerType,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Signed Short Integer"})

(def ^{:private true} STRING
  "String consisting of UTF-8 characters"
  {:db/ident            :qudt/STRING,
   :dcterms/description "String consisting of UTF-8 characters",
   :dtype/literal       "string",
   :owl/sameAs          :qudt/UTF8-STRING,
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt/UTF8-CHAR,
   :qudt/encoding       :qudt/UTF8-StringEncoding,
   :qudt/protocolBuffersName "string",
   :qudt/rdfsDatatype   :xsd/string,
   :rdf/type            :qudt/StringUTF8,
   :rdfs/label          "String"})

(def ^{:private true} STRUCT
  "A struct is C's and C++'s notion of a composite type, a datatype that composes a fixed set of labeled fields or members. It is so called because of the struct keyword used in declaring them, which is short for structure or, more precisely, user-defined data structure. A struct declaration consists of a list of fields, each of which can have any type. The total storage required for a struct object is the sum of the storage requirements of all the fields, plus any internal padding. [Wikipedia]"
  {:db/ident         :qudt/STRUCT,
   :dcterms/description
   "A struct is C's and C++'s notion of a composite type, a datatype that composes a fixed set of labeled fields or members. It is so called because of the struct keyword used in declaring them, which is short for structure or, more precisely, user-defined data structure. A struct declaration consists of a list of fields, each of which can have any type. The total storage required for a struct object is the sum of the storage requirements of all the fields, plus any internal padding. [Wikipedia]",
   :rdf/type         :qudt/CompositeDatatype,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "STRUCT"})

(def ^{:private true} ScaleVector3D-DP
  "Scale 3D Vector - double precision"
  {:db/ident            :qudt/ScaleVector3D-DP,
   :qudt/code           350,
   :qudt/dimension      3,
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt/FLOAT-DP,
   :rdf/type            :qudt/Vector,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Scale 3D Vector - double precision"})

(def ^{:private true} Seidelmann2000
  "???Report of the IAU/IAG Working Group on Cartographic Coordinates and Rotational Elements of the Planets and Satellites: 2000???, P.K. Seidelmann, V. K. Abalakin, M. Bursa, M. E. Davies, C. DeBergh, J. H. Lieske, J. Oberst, J. L. Simon, E. M. Standish, P. Stooke, and P. C. Thomas, Celestial Mechanics and Dynamical Astronomy 82: 83-110, 2002 (http://springerlink.metapress.com, follow the links from ???Browse by Online Libraries (subject areas)???, then ???Physics and Astronomy???, then ???Celestial Mechanics and Dynamical Astronomy???, then ???Volume 82 - Number 1/January 2002???, then follow the links to download the paper."
  {:db/ident :qudt/Seidelmann2000,
   :dcterms/description
   "???Report of the IAU/IAG Working Group on Cartographic Coordinates and Rotational Elements of the Planets and Satellites: 2000???, P.K. Seidelmann, V. K. Abalakin, M. Bursa, M. E. Davies, C. DeBergh, J. H. Lieske, J. Oberst, J. L. Simon, E. M. Standish, P. Stooke, and P. C. Thomas, Celestial Mechanics and Dynamical Astronomy 82: 83-110, 2002 (http://springerlink.metapress.com, follow the links from ???Browse by Online Libraries (subject areas)???, then ???Physics and Astronomy???, then ???Celestial Mechanics and Dynamical Astronomy???, then ???Volume 82 - Number 1/January 2002???, then follow the links to download the paper.",
   :rdf/type :qudt/Citation,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Seidelmann2000",
   :skos/prefLabel "Seidelmann2000"})

(def ^{:private true} ShortSignedIntegerEncoding
  "Short Signed Integer Encoding"
  {:db/ident         :qudt/ShortSignedIntegerEncoding,
   :qudt/bytes       2,
   :rdf/type         :qudt/IntegerEncodingType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Short Signed Integer Encoding"})

(def ^{:private true} ShortUnsignedIntegerEncoding
  "Short Unsigned Integer Encoding"
  {:db/ident         :qudt/ShortUnsignedIntegerEncoding,
   :qudt/bytes       2,
   :rdf/type         [:qudt/IntegerEncodingType :qudt/BooleanEncodingType],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Short Unsigned Integer Encoding"})

(def ^{:private true} Signed
  "Signed"
  {:db/ident         :qudt/Signed,
   :qudt/literal     "signed",
   :rdf/type         :qudt/SignednessType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Signed"})

(def ^{:private true} SignedIntegerEncoding
  "Signed Integer Encoding"
  {:db/ident         :qudt/SignedIntegerEncoding,
   :qudt/bytes       4,
   :rdf/type         :qudt/IntegerEncodingType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Signed Integer Encoding"})

(def ^{:private true} SinglePrecisionRealEncoding
  "Single Precision Real Encoding"
  {:db/ident         :qudt/SinglePrecisionRealEncoding,
   :qudt/bytes       32,
   :rdf/type         :qudt/FloatingPointEncodingType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Single Precision Real Encoding"})

(def ^{:private true} Stack
  "Stack"
  {:db/ident         :qudt/Stack,
   :rdf/type         :qudt/OrderedCollection,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Stack"})

(def ^{:private true} StateSpaceMatrix-2X2-DP
  "State space matrix 2 by 2 Double Precision"
  {:db/ident            :qudt/StateSpaceMatrix-2X2-DP,
   :qudt/code           321,
   :qudt/dimensionality 2,
   :qudt/elementType    :qudt/FLOAT-DP,
   :qudt/hasDimensionVector [2 2],
   :rdf/type            :qudt/StateSpaceMatrix,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "State space matrix 2 by 2 Double Precision"})

(def ^{:private true} StateSpaceMatrix-2by4-FLOATDP
  "State space matrix 2 by 4 Double Precision"
  {:db/ident            :qudt/StateSpaceMatrix-2by4-FLOATDP,
   :qudt/code           323,
   :qudt/dimensionality 2,
   :qudt/elementType    :qudt/FLOAT-DP,
   :qudt/hasDimensionVector [2 4],
   :rdf/type            :qudt/StateSpaceMatrix,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "State space matrix 2 by 4 Double Precision"})

(def ^{:private true} StateSpaceMatrix-4X4-DP
  "State space matrix 4 by 4 Double Precision"
  {:db/ident            :qudt/StateSpaceMatrix-4X4-DP,
   :qudt/code           327,
   :qudt/dimensionality 2,
   :qudt/elementType    :qudt/FLOAT-DP,
   :qudt/hasDimensionVector [4 4],
   :rdf/type            :qudt/StateSpaceMatrix,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "State space matrix 4 by 4 Double Precision"})

(def ^{:private true} StateSpaceMatrix-4by2-DoublePrecision
  "State space matrix 4 by 2 Double Precision"
  {:db/ident            :qudt/StateSpaceMatrix-4by2-DoublePrecision,
   :qudt/code           325,
   :qudt/dimensionality 2,
   :qudt/elementType    :qudt/FLOAT-DP,
   :qudt/hasDimensionVector [4 2],
   :rdf/type            :qudt/StateSpaceMatrix,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "State space matrix 4 by 2 Double Precision"})

(def ^{:private true} StateVector-DP
  "State Vector Double Precision"
  {:db/ident            :qudt/StateVector-DP,
   :qudt/code           353,
   :qudt/dimension      3,
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt/FLOAT-DP,
   :rdf/type            :qudt/StateSpaceVector,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "State Vector Double Precision"})

(def ^{:private true} StateVector-SP
  "State Vector Single Precision"
  {:db/ident            :qudt/StateVector-SP,
   :qudt/code           351,
   :qudt/dimension      3,
   :qudt/dimensionality 1,
   :qudt/elementType    :qudt/FLOAT-SP,
   :rdf/type            :qudt/StateSpaceVector,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "State Vector Single Precision"})

(def ^{:private true} TABLE
  "TABLE"
  {:db/ident         :qudt/TABLE,
   :rdf/type         :qudt/Table,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "TABLE"})

(def ^{:private true} TABLE-2x4
  "TABLE-2x4"
  {:db/ident            :qudt/TABLE-2x4,
   :qudt/byRow          true,
   :qudt/columns        4,
   :qudt/dimensionality 2,
   :qudt/hasDimensionVector [2 4],
   :qudt/rows           2,
   :rdf/type            :qudt/Table,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "TABLE-2x4"})

(def ^{:private true} TBRCS_EC-EMR
  "Earth-Centered Earth-Moon Rotating Coordinate System"
  {:db/ident            :qudt/TBRCS_EC-EMR,
   :qudt/code           20,
   :qudt/coordinateCenter :qudt/CC_EarthCentered,
   :qudt/id             "TTBRCS-01",
   :qudt/literal        "EM-ROT",
   :qudt/referenceFrame :qudt/RRF_EMR,
   :rdf/type            :qudt/ThreeBodyRotatingCoordinateSystem,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Earth-Centered Earth-Moon Rotating Coordinate System"})

(def ^{:private true} TBRCS_EC-SER
  "Earth-Centered Sun Earth Rotating Coordinate System"
  {:db/ident            :qudt/TBRCS_EC-SER,
   :qudt/code           92,
   :qudt/coordinateCenter :qudt/CC_EarthCentered,
   :qudt/id             "TTBRCS-02",
   :qudt/literal        "SE-ROT",
   :qudt/referenceFrame :qudt/RRF_SER,
   :rdf/type            :qudt/ThreeBodyRotatingCoordinateSystem,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Earth-Centered Sun Earth Rotating Coordinate System",
   :skos/definition     "Earth-Centered Sun Earth Rotating Coordinate System"})

(def ^{:private true} TBRCS_MC-EMR
  "Moon-Centered Earth-Moon Rotating Coordinate System"
  {:db/ident            :qudt/TBRCS_MC-EMR,
   :qudt/code           20,
   :qudt/coordinateCenter :qudt/CC_MoonCentered,
   :qudt/id             "TTBRCS-03",
   :qudt/literal        "EM-ROT",
   :qudt/referenceFrame :qudt/RRF_EMR,
   :rdf/type            :qudt/ThreeBodyRotatingCoordinateSystem,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Moon-Centered Earth-Moon Rotating Coordinate System"})

(def ^{:private true} TBRCS_SC-SER
  "Sun-Centered Sun Earth Rotating Coordinate System"
  {:db/ident            :qudt/TBRCS_SC-SER,
   :qudt/code           92,
   :qudt/coordinateCenter :qudt/CC_SunCentered,
   :qudt/id             "TTBRCS-04",
   :qudt/literal        "SE-ROT",
   :qudt/referenceFrame :qudt/RRF_SER,
   :rdf/type            :qudt/ThreeBodyRotatingCoordinateSystem,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Sun-Centered Sun Earth Rotating Coordinate System",
   :skos/definition     "Sun-Centered Sun Earth Rotating Coordinate System"})

(def ^{:private true} TIME
  "Time in hh:mm:ss[Z|(+|-)hh:mm]format."
  {:db/ident            :qudt/TIME,
   :dcterms/description "Time in hh:mm:ss[Z|(+|-)hh:mm]format.",
   :qudt/code           68,
   :qudt/id             "T004-12",
   :qudt/literal        "time",
   :qudt/rdfsDatatype   :xsd/time,
   :rdf/type            :qudt/TimeStringType,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "TIME"})

(def ^{:private true} TREE
  "TREE"
  {:db/ident         :qudt/TREE,
   :rdf/type         :qudt/Tree,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "TREE"})

(def ^{:private true} TYPE-MATRIX-4by4-FLOATDP
  "TYPE-MATRIX-4by4-FLOATDP"
  {:db/ident         :qudt/TYPE-MATRIX-4by4-FLOATDP,
   :rdf/type         :qudt/TypeList,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "TYPE-MATRIX-4by4-FLOATDP"})

(def ^{:private true} UNARY-FUNCTION
  "This type identifies functions that have exactly one argument."
  {:db/ident           :qudt/UNARY-FUNCTION,
   :dcterms/description
   "This type identifies functions that have exactly one argument.",
   :qudt/functionArity 1,
   :rdf/type           :qudt/FunctionDatatype,
   :rdfs/isDefinedBy   "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label         "UNARY-FUNCTION"})

(def ^{:private true} UNSIGNED-BIG-INTEGER
  "Unsigned Big Integer"
  {:db/ident          :qudt/UNSIGNED-BIG-INTEGER,
   :dtype/literal     "UI64",
   :qudt/abbreviation "UI64",
   :qudt/bits         64,
   :qudt/code         117,
   :qudt/id           "T002-08",
   :qudt/literal      "UI64",
   :qudt/maxInclusive "2^{64}-1",
   :qudt/minInclusive "0",
   :qudt/mySQLName    "BIGINT",
   :qudt/octets       8,
   :qudt/rdfsDatatype :xsd/unsignedLong,
   :qudt/signedness   :qudt/UNSIGNED,
   :rdf/type          :qudt/UnsignedBigIntegerType,
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "Unsigned Big Integer"})

(def ^{:private true} UNSIGNED-INTEGER
  "An unsigned 16-bit integer in the range 0 to 65,535"
  {:db/ident            :qudt/UNSIGNED-INTEGER,
   :dcterms/description "An unsigned 16-bit integer in the range 0 to 65,535",
   :qudt/abbreviation   "UI16",
   :qudt/bits           16,
   :qudt/code           113,
   :qudt/id             "T002-09",
   :qudt/literal        "UI16",
   :qudt/maxInclusive   "65535",
   :qudt/microsoftSQLServerName "smallint",
   :qudt/minInclusive   "0",
   :qudt/mySQLName      "SMALLINT",
   :qudt/rdfsDatatype   :xsd/unsignedShort,
   :qudt/signedness     :qudt/UNSIGNED,
   :rdf/type            :qudt/UnsignedIntegerType,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "Unsigned Integer"})

(def ^{:private true} UNSIGNED-LONG-INTEGER
  "Unsigned Long Integer"
  {:db/ident          :qudt/UNSIGNED-LONG-INTEGER,
   :dtype/literal     "UI32",
   :qudt/abbreviation "UI32",
   :qudt/bits         32,
   :qudt/code         115,
   :qudt/encoding     :qudt/UnsignedIntegerEncoding,
   :qudt/id           "T002-10",
   :qudt/literal      "UI32",
   :qudt/maxInclusive "2^{32}-1",
   :qudt/minInclusive "0",
   :qudt/mySQLName    "INT",
   :qudt/octets       4,
   :qudt/rdfsDatatype :xsd/unsignedInt,
   :qudt/signedness   :qudt/UNSIGNED,
   :rdf/type          :qudt/UnsignedLongIntegerType,
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "Unsigned Long Integer"})

(def ^{:private true} UNSIGNED-MEDIUM-INTEGER
  "Unsigned Medium Integer"
  {:db/ident :qudt/UNSIGNED-MEDIUM-INTEGER,
   :prov/wasInfluencedBy
   "http://dev.mysql.com/doc/refman/5.0/en/integer-types.html",
   :qudt/abbreviation "UI24",
   :qudt/bits 24,
   :qudt/bytes 3,
   :qudt/maxInclusive 8388607,
   :qudt/minInclusive -8388608,
   :qudt/mySQLName "MEDIUMINT",
   :qudt/signedness :qudt/UNSIGNED,
   :rdf/type :qudt/UnsignedMediumIntegerType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Unsigned Medium Integer"})

(def ^{:private true} UNSIGNED-SHORT-INTEGER
  "Unsigned Short Integer"
  {:db/ident :qudt/UNSIGNED-SHORT-INTEGER,
   :dtype/literal "UI8",
   :prov/wasInfluencedBy
   ["http://msdn.microsoft.com/en-us/library/aa275635(v=sql.80).aspx"
    "http://msdn.microsoft.com/en-us/library/aa275635(v=sql.80).aspx"],
   :qudt/abbreviation "UI8",
   :qudt/bits 8,
   :qudt/code 111,
   :qudt/id "T002-13",
   :qudt/literal "UI8",
   :qudt/maxInclusive 255,
   :qudt/microsoftSQLServerName "tinyint",
   :qudt/minInclusive [0 "0"],
   :qudt/octets 1,
   :qudt/oleDBName "DBTYPE_UI1",
   :qudt/rdfsDatatype :xsd/unsignedByte,
   :qudt/signedness :qudt/UNSIGNED,
   :rdf/type :qudt/OctetType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Unsigned Short Integer"})

(def ^{:private true} UTC-DATETIME
  "UTC is the time-scale maintained by the BIPM, with assistance from the IERS, which forms the basis of a coordinated dissemination of standard frequencies and time signals. It corresponds exactly in rate with the international reference scale of atomic time (TAI) but differs from it by an integer number of seconds. TAI, based on the second (SI), as realized on the rotating geoid, is formed by the BIPM on the basis of clock data supplied by cooperating establishments. It is in the form of a continuous scale, e.g. in days, hours, minutes and seconds from the origin 1 January, 1958 (adopted by the CGPM 1971)."
  {:db/ident :qudt/UTC-DATETIME,
   :dcterms/description
   "UTC is the time-scale maintained by the BIPM, with assistance from the IERS, which forms the basis of a coordinated dissemination of standard frequencies and time signals. It corresponds exactly in rate with  the international reference scale of atomic time (TAI) but differs from it by an integer number of seconds.  TAI, based on the second (SI), as realized on the rotating geoid, is formed by the BIPM on the basis of clock data supplied by cooperating establishments. It is in the form of a continuous scale, e.g. in days, hours, minutes and seconds from the origin 1 January, 1958 (adopted by the CGPM 1971). ",
   :qudt/code 78,
   :qudt/encodingDescription
   "YYYY-MM-DDThh:mm:ss[.dd] or YYYY-DDDThh:mm:ss[.dd], where 'YYYY' is the year, 'MM' is the two-digit month, 'DD' is the two-digit day, 'DDD' is the three digit day of year, 'T' is constant, 'hh:mm:ss[.dd]' is the UTC time in hours, minutes, seconds, and optional fractional seconds. As many 'd' characters to the right of the period as required may be used to obtain the required precision. All fields require leading zeros.",
   :qudt/id "T004-13",
   :qudt/literal "utc-date",
   :qudt/rdfsDatatype :xsd/dateTime,
   :rdf/type :qudt/DateStringType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "UTC Date Time"})

(def ^{:private true} UTC-DAYTIME
  "UTC DAY TIME"
  {:db/ident          :qudt/UTC-DAYTIME,
   :qudt/code         79,
   :qudt/encodingDescription
   "YYYY-DDDThh:mm:ss.ddZ, where each character is an ASCII character using one octet with the following meanings: YYYY = Year in four-character subfield with values 0001-9999, DDD = Day of year in three-character subfield with values 001-365 or -366, T =  Calendar-Time separator, hh = Hour in two-character subfield with values 00-23,  mm = Minute in two-character subfield with values 00-59, ss = Second in two-character subfield with values 00-59 (-58 or -60 during leap seconds), dd = Decimal fraction of second in one- to n-character subfield, each d has values 0-9, and Z = time code terminator (optional)",
   :qudt/id           "T004-14",
   :qudt/literal      "utc-dayTime",
   :qudt/rdfsDatatype :qudt/UTC-DayTime,
   :rdf/type          :qudt/DateStringType,
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "UTC DAY TIME"})

(def ^{:private true} UTF16-CHAR
  "UTF16 CHAR"
  {:db/ident          :qudt/UTF16-CHAR,
   :dtype/literal     "utf16",
   :qudt/bits         16,
   :qudt/code         150,
   :qudt/id           "T001-04",
   :qudt/literal      "utf16",
   :qudt/octets       2,
   :qudt/rdfsDatatype :xsd/short,
   :rdf/type          :qudt/CharacterType,
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "UTF16 CHAR"})

(def ^{:private true} UTF16STRING
  "UTF-16 String"
  {:db/ident            :qudt/UTF16STRING,
   :qudt/code           600,
   :qudt/dimensionality 1,
   :qudt/encoding       :qudt/UTF16StringEncoding,
   :qudt/literal        "utf16",
   :rdf/type            :qudt/StringUTF16,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "UTF-16 String"})

(def ^{:private true} UTF16StringEncoding
  "UTF-16 String"
  {:db/ident         :qudt/UTF16StringEncoding,
   :rdf/type         :qudt/StringEncodingType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "UTF-16 String"})

(def ^{:private true} UTF8-CHAR
  "UTF8 CHAR"
  {:db/ident          :qudt/UTF8-CHAR,
   :dtype/literal     "utf8",
   :qudt/bits         8,
   :qudt/code         122,
   :qudt/id           "T001-05",
   :qudt/literal      "utf8",
   :qudt/octets       1,
   :qudt/rdfsDatatype :xsd/byte,
   :rdf/type          :qudt/CharacterType,
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "UTF8 CHAR"})

(def ^{:private true} UTF8STRING
  "String consisting of UTF-8 characters"
  {:db/ident            :qudt/UTF8STRING,
   :dcterms/description "String consisting of UTF-8 characters",
   :qudt/code           500,
   :qudt/dimensionality 1,
   :qudt/encoding       :qudt/UTF8StringEncoding,
   :qudt/literal        "utf8",
   :rdf/type            :qudt/StringUTF8,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "UTF-8 String"})

(def ^{:private true} UTF8StringEncoding
  "UTF-8 Encoding"
  {:db/ident         :qudt/UTF8StringEncoding,
   :qudt/bytes       8,
   :rdf/type         :qudt/StringEncodingType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "UTF-8 Encoding"})

(def ^{:private true} Unsigned
  "Unsigned"
  {:db/ident         :qudt/Unsigned,
   :qudt/literal     "unsigned",
   :rdf/type         :qudt/SignednessType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Unsigned"})

(def ^{:private true} UnsignedIntegerEncoding
  "Unsigned Integer Encoding"
  {:db/ident         :qudt/UnsignedIntegerEncoding,
   :qudt/bytes       4,
   :rdf/type         :qudt/IntegerEncodingType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label       "Unsigned Integer Encoding"})

(def ^{:private true} VCS_VC-LVC
  "Vehicle centered local vertical curvilinear coordinate system"
  {:db/ident :qudt/VCS_VC-LVC,
   :qudt/code 30,
   :qudt/coordinateCenter :qudt/CC_VehicleCentered,
   :qudt/id "TVCS-01",
   :qudt/literal "VC-LVC",
   :qudt/referenceFrame :qudt/RRF_LVC,
   :rdf/type [:qudt/VehicleCoordinateSystem :qudt/LocalCoordinateSystem],
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Vehicle centered local vertical curvilinear coordinate system"})

(def ^{:private true} VCS_VC-LVLH
  "Local Vertical Local Horizontal Coordinate System"
  {:db/ident              :qudt/VCS_VC-LVLH,
   :qudt/code             32,
   :qudt/coordinateCenter :qudt/CC_VehicleCentered,
   :qudt/id               "TVCS-02",
   :qudt/literal          "LVLH",
   :rdf/type              [:qudt/VehicleCoordinateSystem
                           :qudt/LocalCoordinateSystem],
   :rdfs/isDefinedBy      "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label            "Local vertical local horizontal coordinate system",
   :skos/definition       "Local Vertical Local Horizontal Coordinate System"})

(def ^{:private true} VECTOR
  "VECTOR"
  {:db/ident            :qudt/VECTOR,
   :qudt/code           450,
   :qudt/dimensionality 1,
   :rdf/type            :qudt/Vector,
   :rdfs/isDefinedBy    "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label          "VECTOR"})

(def ^{:private true} WordAligned
  "Alignment of a field at a word boundary, that is 2 bytes."
  {:db/ident :qudt/WordAligned,
   :dcterms/description
   "Alignment of a field at a word boundary, that is 2 bytes.",
   :qudt/literal "word",
   :rdf/type :qudt/AlignmentType,
   :rdfs/isDefinedBy "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label "Word aligned"})

(def ^{:private true} YDT
  "Year Day Time"
  {:db/ident          :qudt/YDT,
   :qudt/code         215,
   :qudt/encodingDescription "TBD",
   :qudt/id           "T004-16",
   :qudt/literal      "YDT",
   :qudt/rdfsDatatype :xsd/string,
   :rdf/type          :qudt/DateStringType,
   :rdfs/isDefinedBy  "http://qudt.org/2.1/vocab/datatype",
   :rdfs/label        "Year Day Time"})
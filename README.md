

    ├── .gitignore
	├── build.sbt
	├── LICENSE
	├── project
	│   ├── build.properties
	│   └── plugins.sbt
	│
	├── README.md
	└── src
	    ├── main
	    │   ├── resources
	    │   │   └── schemaInformation
	    │   │       └── DataInformation.md
	    │   │
	    │   └── scala
	    │       └── com
	    │           └── promptscalaspark
	    │               └── framework
	    │                   ├── api
	    │                   │   ├── LoaderHelper.scala
	    │                   │   ├── ModellerHelper.scala
	    │                   │   └── ModelProcessor12.scala
	    │                   │
	    │                   ├── io
	    │                   │   ├── ioSchema
	    │                   │   │   └── InputSchema.scala
	    │                   │   │
	    │                   │   ├── loader
	    │                   │   │   └── DummyInputFileData1Loader.scala
	    │                   │   │
	    │                   │   └── writer
	    │                   │       └── DSWriter.scala
	    │                   │
	    │                   ├── jobs
	    │                   │   └── PromptBatchJob.scala
	    │                   │
	    │                   ├── modeller
	    │                   │   ├── ModellerSchema
	    │                   │   │   ├── Sample1ModellerSchema.scala
	    │                   │   │   └── Sample2ModellerSchema.scala
	    │                   │   │
	    │                   │   ├── SampleModeller1.scala
	    │                   │   └── SampleModeller2.scala
	    │                   │
	    │                   └── visualiser
	    │                       └── preVisualiserProcessor.scala
	    │
	    └── test
	        └── scala
	            └── com
	                └── promptscalaspark
	                    └── framework
	                        ├── io
	                        │   ├── loader
	                        │   │   ├── DummyInputFileData1LoaderSpec.scala
	                        │   │   └── DummyInputFileData2LoaderSpec.scala
	                        │   │
	                        │   └── writer
	                        │       └── DSWriterSpec.scala
	                        │
	                        ├── jobs
	                        │   └── PromptBatchJobSpec.scala
	                        │
	                        ├── modeller
	                        │   ├── SampleModeller1Spec.scala
	                        │   └── SampleModeller2Spec.scala
	                        │
	                        └── SparkSpec.scala

# PROMPT Framework - The Highly efficent and modular Spark Data Engineering Framework

[![Build Status](https://secure.travis-ci.org/twitter/finatra.png?branch=develop)](https://travis-ci.org/abhishekvermax/promptscalaspark-framework.svg?branch=master)

## Status


The Prompt Framework combines productivity and performance making it easy to build scalable type safe spark data engineering applications with Scala specially when it comes to develop production pipeline.  Prompt is functional as well as developers friendly with providing modular level of transformation steps in whole data flow pipeline.  With Prompt, spark can scale predictably due to a abstracted and non-blocking architecture.  By being as static at functional level and more modular at development layer.

<img src="./prompt_logo.png" title="Prompt Logo" alt="Prompt Logo" height=350 width=800 />

Prompt is a modular framework for building fast, testable, scala spark application on top of any structured and structured data. Prompt provides an easy-to-use API for reading and writing data 
parallely as much as possible.


## Documentation


## G8 Template can be downloaded as


## Example Projects

Prompt includes working examples which highlight various features of the framework and include tests. 

Please take a look through the [examples](/prompt-scala-examples) for more detailed information on features, testing, building, and running.

## Latest version

The [master branch](https://github.com/abhishekvermax/promptscalaspark-framework/tree/master) in Github tracks the latest stable [release](https://github.com/abhishekvermax/promptscalaspark-framework/releases)


## Development version

## Presentations


## Authors

* Abhishek Verma <https://github.com/abhishekvermax>


## Project Structure (Implementation layer)

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


## Project Structure (Logical Layer)


## Project Structure (Spark Execution Layer)


## Whole as a System Structure


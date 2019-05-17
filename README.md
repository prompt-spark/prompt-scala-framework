# PROMPT Framework - The Highly efficent and modular Spark Data Engineering Framework

<a href="" target="_blank"><img align="right" width="411" height="241" src="https://github.com/abhishekvermax/promptscalaspark-framework/blob/master/PROMPT_logo.png"></a>


## Table of Contents

- [Motivation Behind Development](#motivation-behind-development)
  * [1. Why PROMPT!](#Why-PROMPT)
  * [2. How it is diffrent from other Frameworks](#2-How-it-is-diffrent-from-other-Frameworks)
- [Hurdles To Overcome with PROMPT](#Overcome-Hurdles-with-PROMPT)
  * [1.Functional Hurdles!](#functional-Hurdles!)
  * [2.Technical Hurdles!](#technical-hurdles!)
- [PROMPT In Action](#Framework-In-Details)
  * [1. Modules In Details](#PROMPT-mind-map-diagram)
  * [2. PROMPT mind map diagram](#PROMPT-mind-map-diagram)
  * [2. PROMPT interaction with Spark](#PROMPT-interaction-with-Spark)
  * [3. PROMPT Scala Strategy](#PROMPT-Scala-Strategy)
- [Prompt Example Projects](#Prompt-Example-Projects)
- [PROMPT sbt build](#PROMPT-sbt-build)
- [PROMPT SCALA G8 Template](#PROMPT-SCALA-G8-Template)
- [PROMPT SCALA Issue Template](#PROMPT-SCALA-Issue-Template)
- [PROMPT SCALA Release Template](#PROMPT-SCALA-Release-Template)
- [PROMPT SCALA Contribution Invited](#PROMPT-SCALA-Contribution-Invited)



## [Motivation Behind Development](#motivation-behind-development)

Building new Spark Data engineering ETL/ELT pipeline from scratch is really hard and sometimes a bit deviating from final goal. 
Keeping hard eye on spark daily production implementation and hurdles leads to PROMPT. So need some framework that make things much eaiser when it comes to implimenting Big Data Engineering projects.

### 1. Why PROMPT ?

Prompt is a modular framework for building fast, testable, scala spark application on top of any structured and structured data. Prompt provides an easy-to-use API for reading and writing data 
parallely as much as possible

### 2. How it is diffrent from other Frameworks ?

Currently, there is no frame work that works closely to SPARK and still provides ability to achieve large vision goals like designing a whole financial system or pipeline for aviation data flow pipeline.

## [Hurdles To Overcome with PROMPT]()

The Prompt Framework combines productivity and performance, making it an easy to build, scalable, type-safe Spark data engineering application with Scala, specially when it comes to develop production pipeline. Prompt is functional as well as developer-friendly,providing modular level of transformation steps in the whole data flow pipeline. With Prompt, Spark can scale predictably due to an abstracted and non-blocking architecture. By being as static at functional level and more modular at development level.

### 1.  Functional Smoothness!

Only thing that make any data flow pipeline work great is the answer oriented thinking means what is the final goal, that what PROMPT will make happen in the world of big data where its always easy to flow with the complexity of system, interfaces, data size, velocity and lastly goal.

    1. PROMPT provides data modelling concept back in the world of Big Data.
    2. Dont care about the setup of pipeline code.
    3. Helper API's to make things generic.

### 2.  Technical Smoothness

Providing the capability to debug at any level of data flow from reading, transforming , processing till visualization of data.



##  [Framework In Details]()

**PROMPT** consists of below modules:

    └── com
	└── promptscalaspark
	    └── framework
	        ├── api
	        │   ├── LoaderHelper.scala
	        │   ├── ModellerHelper.scala
	        │
	        ├── io
	        │   ├── ioSchema
	        │   │   └── InputSchema.scala
	        │   │
	        │   ├── loader
	        │   │   └── DummyInputFileData1Loader.scala
	        │   │
	        │   └── writer
	        │       └── DSWriter.scala
	        │
	        ├── jobs
	        │   └── PromptBatchJob.scala
	        │
	        ├── modeller
	        │   ├── ModellerSchema
	        │   │   ├── Sample1ModellerSchema.scala
	        │   │   └── Sample2ModellerSchema.scala
	        │   │
	        │   ├── SampleModeller1.scala
	        │   └── SampleModeller2.scala
	        │
		├── functionalModel
	        │   └── functionalModellerl2.scala
		|
		|
	        └── visualiser
	            └── preVisualiserProcessor.scala

### 1. Modules In Details

#### a. io - Input/Output (SCALA Object)

**ioSchema** in **PROMPT** consists of multiple *case classs* that will define and bound with input and output data.

**Loader** in **PROMPT** reads data in SPARK Data Structres like RDD or Datasets, now it can behave diffrentls in case of varied kind of input data but the output of loader should be bounded with some *case class* structure.

**Writer** in **PROMPT** writes data from SPARK Data Structres like RDD or Datasets, that is already bounded with **ioSchema** *case classes*.

#### b. api (SCALA Object)

**LoaderHelper** is the object where helper methods will reside to load data through loader perfectly and smoothly.

**ModellerHelper** is the object where helper methods will reside to model data according to the needs of either models or modelProcessors.

#### c. modeller (SCALA Object)

Is the object where all the transformation would be present aligned to the business requirements or targets.There can be multiple layers of modellers but they all need to be either taking params from loaders or other modellers. output from all the methods inside modellers need to be mapped with *case classes* in **ModellerSchema**.

**ModellerSchema** in **PROMPT** consists of multiple *case classs* that will define and bound with input and output data.

### d. functionalModel (SCALA Trait)

This is wrapper covering all the models in side and provides the functional layer to connect and implement the data flow pipeline according to business requirements, it can process one or more type of models.

### e. Jobs (SCALA Object with main)

Here the application starts to execute and it mainly resides over **functionalModel**, so the control over specific execution flows from start to end of the pipeline.

 ## [PROMPT mind map diagram]

Below mind map diagram shows PROMPT preserves the type safety of scala and still provides the ability to move around the pipeline to do multi-level transformation at great ease.

<a href="" target="_blank"><img align="center" width="600" height="500" src="https://github.com/abhishekvermax/promptscalaspark-framework/blob/master/PROMPT_mind_map.jpg"></a>

---

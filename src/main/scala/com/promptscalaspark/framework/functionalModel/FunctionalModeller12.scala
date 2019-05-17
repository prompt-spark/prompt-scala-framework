package com.promptscalaspark.framework.functionalModel

import com.promptscalaspark.framework.modeller.SampleModeller1

trait FunctionalModeller12 {

  def dummyModelProcessor1(path: String): Unit = {}

  def dummyModelProcessor2(inputPath: String, outputPath: String): Unit = {

    val sampleModeller1: Unit = SampleModeller1.sampleTransformation3(inputPath)
    val sampleModeller2: Unit = SampleModeller1.sampleTransformation1(inputPath)
    val sampleModeller3: Unit = SampleModeller1.sampleTransformation2(inputPath)

  }

}

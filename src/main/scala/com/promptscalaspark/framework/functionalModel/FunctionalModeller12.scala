package com.promptscalaspark.framework.functionalModel

import com.promptscalaspark.framework.functionalModel.FunctionalModelSchema.FunctionalModeldata

/**
  * FunctionalModel trait for  business to provide name of functional model on which whole pipeline is dependent
  * there can be multiple traits but each trait should represent a specific functional purpose
  * Every method inside this trait should be bound with some case class
  */

trait FunctionalModeller12 {

  /**
    * dummyFunctionalModel, here modeller implementation would be written and bounded with
    * case class FunctionalModeldata
    */

  def dummyFunctionalModel(path: String): FunctionalModeldata = {
    FunctionalModeldata()

  }


}

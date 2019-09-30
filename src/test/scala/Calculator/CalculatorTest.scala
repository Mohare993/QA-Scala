package Calculator


import java.lang.annotation.AnnotationTypeMismatchException

import Resources.BaseTestingClass

class CalculatorTest extends BaseTestingClass {

  "Sum method" should "return the sum of two values" in {
    assertResult(Day5.Calculator.sum(1,2)){3}
  }

  "Sub method" should "return the subtraction of two values" in {
    assertResult(Day5.Calculator.sub(10,4)){6}
  }





}

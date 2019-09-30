package Calculator

import java.lang.annotation.AnnotationTypeMismatchException

import Resources.BaseTestingClass

class CalculatorTest extends BaseTestingClass {

  "Sum method" should "return the sum of two values" in {
    assertResult(Day5.Calculator.sum(1, 2)) {
      3
    }
  }

  "Sub method" should "return the subtraction of two values" in {
    assertResult(Day5.Calculator.sub(10, 4)) {
      6
    }
  }

  "Multiply method" should "return the multiplication of two values" in {
    assertResult(Day5.Calculator.multiply(5, 5)) {
      25
    }
  }

  "Divide method" should "return the division of two values" in {
    assertResult(Day5.Calculator.divide(70, 7)) {
      10
    }
  }

}

package Calculator

import java.lang.annotation.AnnotationTypeMismatchException

import Resources.BaseTestingClass

class CalculatorTest extends BaseTestingClass {

  val cal = new Day5.Calculator()

  "New Cal" should "return a new calculator object" in {
    assert(cal.isInstanceOf[Day5.Calculator])
  }

  "Sum method" should "return the sum of two values" in {
    assertResult(cal.sum(1, 2)) {
      3
    }
    assertResult(cal.sum(6, 2)) {
      8
    }
  }

  "Sub method" should "return the subtraction of two values" in {
    assertResult(cal.sub(10, 4)) {
      6
    }
  }

  "Multiply method" should "return the multiplication of two values" in {
    assertResult(cal.multiply(5, 5)) {
      25
    }
  }

  "Divide method" should "return the division of two values" in {
    assertResult(cal.divide(70, 7)) {
      10
    }
  }

  "Divide by 0" should "return IllegalArgumentException" in {
    assertThrows[IllegalArgumentException] {
      cal.divide(8, 0)
    }
  }



}

package Intermediate

import Resources.BaseTestingClass

class IntermediateTest extends BaseTestingClass {

  val intermediate = new Day3.Intermediate

  "New intermediate" should "return a new intermediate object" in {
    assert(intermediate.isInstanceOf[Day3.Intermediate])
  }

  "blackjack method" should "return an the highest number" in {
    assertResult(intermediate.blackjack(1, 2)) {2}
  }

  "blackjack method" should "return a 0 if both numbers are above 21" in {
    assertResult(intermediate.blackjack(24, 32)) {0}
  }

  "uniqueSum method" should "return the sum of three numbers" in {
    assertResult(intermediate.uniqueSum(1, 2, 3)) {6}
  }

  "uniqueSum method" should "return the 0 if all the numbers are the same" in {
    assertResult(intermediate.uniqueSum(3, 3, 3)) {0}
  }

  "uniqueSum method" should "return only the sum of unique numbers" in {
    assertResult(intermediate.uniqueSum(1, 1, 3)) {3}
  }

  "tooHot method" should "return either true or false" in {
    assertResult(intermediate.tooHot(80, false)) {true}
  }

}

package Day2

object Basic2 extends App {

  // Pattern Matching 1
  def patternMatch(a: Int, b: Int, c: Boolean): Unit = c match {
    case true => println(a + b)
    case false => println(a*b)
  }

  patternMatch(2,4,true)
  patternMatch(2,4,false)

  // Pattern Matching 2
  case class Nums(num1: Int, num2: Int)

  def patternMatch2(nums: Any): Unit = nums match {

  }

  patternMatch2(0,2)
  patternMatch2(4,0)
  patternMatch2(5,6)
  patternMatch2(0,0)

}

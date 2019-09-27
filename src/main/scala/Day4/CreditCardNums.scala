package Day4

import scala.collection.mutable.ListBuffer

object CreditCardNums extends App {

  def identifyCheck(num: Long) = {
    var nums = num
    var numList = new ListBuffer[Long]()
    while (nums > 0) {
      numList += (nums % 10);
      nums /= 10
    }

  }

  identifyCheck(49927398716L)
  }



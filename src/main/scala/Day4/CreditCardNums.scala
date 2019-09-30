package Day4

object CreditCardNums extends App {

  def identityCheck(number: Long): Boolean = {
    val cardNumber = number.toString.toCharArray.map(_.toString.toLong).toList.reverse
    val newCardNumber = cardNumber.zipWithIndex.map {
      case (number, index) =>
        if (index % 2 != 0) {
          val doubleNumber = number * 2
          if (doubleNumber > 9) doubleNumber - 9 else doubleNumber
        }
        else number
    }.sum
    if (newCardNumber % 10 == 0) {
      println("Number is Valid")
      true
    }
    else {
      println("Number is Invalid")
      false
    }
  }

  identityCheck(49927398716L)
  identityCheck(1112324251L)

  def makeValid(number: Long): Unit = {
    var num = number
    while (identityCheck(num) == false) {
      num += 1
    }
    println(num)
  }

  makeValid(1112324251L)

}



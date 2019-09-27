package Day4

object CreditCardNums extends App {

    def identityCheck(number:Long):Any={
      val cardNumber = number.toString.toCharArray.map(_.toString.toLong).toList.reverse
      val newCardNumber = cardNumber.zipWithIndex.map{
        case (number, index) =>
          if (index % 2 != 0){
            val doubleNumber = number * 2
            if (doubleNumber > 9) doubleNumber - 9 else doubleNumber
          }
          else number
      }.sum
        if (newCardNumber % 10 == 0) println("Number is Valid")
        else println("Number is invalid")
    }
  identityCheck(49927398716L)
  identityCheck(1112324255)
  }



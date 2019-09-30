package Day5

class Calculator {

  def sum(num1: Int, num2: Int) =
    num1 + num2

  def sub(num1: Int, num2: Int) =
    num1 - num2

  def multiply(num1: Int, num2: Int) =
    num1 * num2

  def divide(num1: Int, num2: Int) =
    if (num2 == 0) {
      throw new IllegalArgumentException("Cannot division by zero");
    } else {
      num1 / num2
    }

}
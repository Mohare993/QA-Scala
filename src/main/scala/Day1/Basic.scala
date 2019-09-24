package Day1

object Basic extends App {

  // Hello World!
  println("Hello World!")

  // Assignment
  val helloWorld = "Hello World!"
  println(helloWorld)

  // Parameters
  def printWord(word: String): Unit = println(word)
  printWord("test")

  // Return types
  def printHelloWorld() = "Hello World!"
  println(printHelloWorld())

  // Type Inference
  def returnAnyType(a: Any): Unit = println(a)
  returnAnyType(2.003)
  returnAnyType(23)
  returnAnyType(true)
  returnAnyType("String")

  // Strings
  def stringPrinting(str: String, num: Int): Unit =
    println(str.takeRight(num))

  stringPrinting("Hello",3)

  // Strings 2
  def charReplace(str1: String, str2: String, char1: Char, char2: Char): Unit ={
    println(str1.concat(str2).replace(char1,char2))
  }

  charReplace("Ha", "llo", 'a', 'e')

  // Operators
  def add(a: Int, b: Int): Int = a+b

  println(add(3,4))

  // Conditionals
  def addConditional(a: Int, b: Int, c: Boolean): Unit = {
    if (c) {
      println(a+b)
    } else println(a*b)
  }

  addConditional(2,4,true)
  addConditional(2,4,false)

  // Conditionals2
  def conditional2(a: Int, b: Int): Unit = {
    if (a==0 && b==0) println("Conditional2 : " + 0)
    else if (a==0) println("Conditional2 : " + b)
    else if (b==0) println("Conditional2 : " + a)
    else println("Conditional2 : " + (a+b))
  }

  conditional2(0,2)
  conditional2(4,0)
  conditional2(5,6)
  conditional2(0,0)

  // Iteration
  def iteration(str: String, num: Int): Unit =
    for (i <- 1 to num) println(str)

  iteration("Hi", 3)

  // Iteration2
  def iteration2(str: String, num: Int): Unit =
    for (i <- 1 to num) println(str * num)

  iteration2("H", 10)

  // Iteration3
  def fizzBuzz(str1: String, str2: String, num: Int): Unit =
    for (i <- 1 to num)
    if (i%3 == 0 && i%5 ==0) print(str1 + str2)
    else if (i%5 == 0) print(str2 + ", ")
    else if (i%3 == 0) print(str1 + ", ")
    else print(i + ", ")

  fizzBuzz("Fizz","Buzz",15)

  // Iteration4
  def recursIteration(str: String, num: Int): Unit = {
    println(str)
    if (num == 1 ) 0
    else recursIteration(str, (num-1))
  }
  recursIteration("HELP!", 1)

 // Iteration5
  def recursIteration2(str: String, num: Int): Unit = {
    println(str * num)
    if (num == 1) 0
    else recursIteration2(str, (num - 1))
  }

  iteration2("H", 5)

  // Iteration6
  def recursIteration3(str1: String, str2: String, num: Int): Unit = {

    if (count % 3 == 0 && count % 5 == 0) print(str1.concat(str2))
    else if (count % 5 == 0) print(str2 + ", ")
    else if (count % 3 == 0) print(str1 + ", ")
    else print(count + ", ")
    if (num == 1) 0
    else recursIteration3(str1, str2, (num - 1))
  }

  recursIteration3("Fizz","Buzz",15)






}

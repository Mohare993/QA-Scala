package Day1

object Basic extends App {

  // Hello World!
  println("Hello World!")

  // Assignment
  var helloWorld = "Hello World!"
  println(helloWorld)

  // Parameters
  def printWord(word: String) = println(word)
  printWord("test")

  // Return types
  def printHelloWorld() = "Hello World!"
  println(printHelloWorld())

  // Type Inference
  def returnAnyType(a: Any) = println(a)
  returnAnyType(2.003)
  returnAnyType(23)
  returnAnyType(true)
  returnAnyType("String")


  // Strings
  def stringPrinting(str: String, num: Int) =
    println(str.takeRight(num))

  stringPrinting("Hello",3)




  // Strings 2
  def charReplace(str1: String, str2: String, char1: Char, char2: Char): Unit ={
    val fullString = str1 + str2
    println(fullString.replace(char1,char2))
  }

  charReplace("Ha", "llo", 'a', 'e')


  // Operators
  def add(a: Int, b: Int) = a+b

  println(add(3,4))

  // Conditionals




}

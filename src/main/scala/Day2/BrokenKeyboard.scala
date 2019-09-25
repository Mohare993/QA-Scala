package Day2

object BrokenKeyboard extends App {

  //  Source.fromFile("/enable1.txt").getLines.toList
  //  Source.fromFile("/enable1.txt").getLines.toArray

  def brokenKeyboard() {
    import scala.collection.mutable.ListBuffer
    import scala.io.Source
    val filename = "C:\\Users\\Administrator\\IdeaProjects\\QA-Scala\\src\\main\\scala\\Day2\\enable1.txt"
    val textFile = Source.fromFile(filename).getLines.toList
    var linesIn = new ListBuffer[String]()
    println("Enter number of lines to read : ")

    var numberOfLines = scala.io.StdIn.readInt
    while (numberOfLines > 0) {
      println("Enter chars : ")
      linesIn += scala.io.StdIn.readLine()
      numberOfLines -= 1
    }

    for (str <- linesIn) {
      for (w <- textFile if w.forall(str.toList.contains)) yield println(str + " = " + w)
    }
//    val chars = List('a', 'b')
//    for (w <- lines1 if w.forall(chars.contains)) yield println(w)

    }
  brokenKeyboard()
}

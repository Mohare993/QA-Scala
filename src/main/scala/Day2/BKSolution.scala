package Day2

object BKSolution extends App {
    import scala.io.Source

    val lines = Source.fromFile("C:\\Users\\Administrator\\IdeaProjects\\QA-Scala\\src\\main\\scala\\Day2\\enable1.txt").getLines.toList

    val wordCheck: (String, String) => Boolean = (potentialLongerWord, keys) => {
      (potentialLongerWord.toList.toSet equals keys.toList.toSet) || (potentialLongerWord.toList.toSet.subsetOf(keys.toList.toSet))
    }

    val isNewWordLonger: (String, String) => Boolean = (oldWord, newWord) => {
      oldWord.length < newWord.length
    }

    def longestWord(keys: String) = {
      lines.reduceLeft(
        (leftWord: String, rightWord: String) => {
          if (isNewWordLonger(leftWord, rightWord) & wordCheck(rightWord, keys)) {
            rightWord
          } else {
            leftWord
          }
        }
      )
    }

    println("enter number of keyboards")
    val numberOfkeyboards = scala.io.StdIn.readLine().toInt
    for(index <- 1 to numberOfkeyboards) {
      println("enter available keys")
      println("longest word: " + longestWord(scala.io.StdIn.readLine()))
    }

  }


package Day4

object LumberJack extends App {

  val numberOfLogs = 7
  val currentLogPile = ((1,1,1), (2,1,3), (1,4,1))

//  val grid = getStorageGrid()

  def getStorageGrid(size: Int): Unit = {
    var grid = Array.ofDim[Int](size, size)
    print(grid.map(_.mkString).mkString("\n"))
    return grid

  }
}

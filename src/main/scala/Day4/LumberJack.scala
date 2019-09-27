package Day4

object LumberJack extends App {

//  val grid = getStorageGrid()

  def getStorageGrid(size: Int): Unit = {
    var grid = Array.ofDim[Int](size, size)
    print(grid.map(_.mkString).mkString("\n"))
    return grid

  }
}

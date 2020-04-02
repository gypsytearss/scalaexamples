package com.gypsytearss.scala_examples.leetcode

object PathsWIthObstacles {
  import scala.math.max

  def uniquePathsWithObstacles(obstacleGrid: Array[Array[Int]]): Int = {
    if (obstacleGrid.isEmpty)
      return 0

    val yMax = obstacleGrid.size - 1
    val xMax = obstacleGrid(0).size - 1
    var numPaths = obstacleGrid.map(_.map(_ => 0))

    for { y <- (yMax to 0 by -1);
          x <- (xMax to 0 by -1) } {
      if (obstacleGrid(y)(x) == 1)
        numPaths(y)(x) = -1
      else if (x == xMax && y == yMax)
        numPaths(y)(x) = 1
      else {
        var paths = 0
        if (y < yMax && numPaths(y+1)(x) > 0)
          paths = paths + numPaths(y+1)(x)
        if (x < xMax && numPaths(y)(x+1) > 0)
          paths = paths + numPaths(y)(x+1)
        numPaths(y)(x) = paths
      }
    }
    max(numPaths(0)(0), 0)
  }

}

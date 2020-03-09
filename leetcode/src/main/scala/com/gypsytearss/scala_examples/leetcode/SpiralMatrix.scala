package com.gypsytearss.scala_examples.leetcode

object SpiralMatrix {

  /**
    * https://leetcode.com/problems/spiral-matrix/
    */
  def isValid(visited: Array[Array[Boolean]],
              x: Int,
              y: Int): Boolean = {
    x >= 0 &&
      y >= 0 &&
    x < visited(0).length &&
    y < visited.length &&
    !visited(y)(x)
  }

  def spiralOrder(matrix: Array[Array[Int]]): List[Int] = {
    if (matrix.isEmpty)
      return List()

    var directions = Vector((0, 1), (1, 0), (0, -1), (-1, 0))
    val visited: Array[Array[Boolean]] = matrix.map(_.map(_ => false))
    visited(0)(0) = true
    var res: Vector[Int] = Vector(matrix(0)(0))

    var x = 0
    var y = 0
      while (isValid(visited, x + directions.head._2, y + directions.head._1) ||
          isValid(visited, x + directions(1)._2, y + directions(1)._1)) {
      if (!isValid(visited, x + directions.head._2, y + directions.head._1))
        directions = directions.tail :+ directions.head
      x = x + directions.head._2
      y = y + directions.head._1
      res = res :+ matrix(y)(x)
      visited(y)(x) = true
    }

    res.toList
  }

}

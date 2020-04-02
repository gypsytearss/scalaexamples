package com.gypsytearss.scala_examples.leetcode

object NQueens {

  /**
   * https://leetcode.com/problems/n-queens/
   */
  def isSafe(board: List[String], x: Int, y: Int): Boolean = {
    import scala.math.min

    def checkRow(board: List[String], y: Int): Boolean = board(y).contains('Q')
    def checkCol(board: List[String], x: Int): Boolean = board.map(r => r(x)).contains('Q')
    def checkDiag(board: List[String], x: Int, y: Int): Boolean = {
      val n = board.size
      var pos = (x - min(x, y), y - min(x, y))
      var res = false
      while (pos._1 < n && pos._2 < n) {
        res = res | board(pos._2)(pos._1) == 'Q'
        pos = (pos._1 + 1, pos._2 + 1)
      }

      val rightDist = min(x, n - y - 1)
      var posRight = (x - rightDist, y + rightDist)
      while (posRight._1 < n && posRight._2 >= 0) {
        res = res | board(posRight._2)(posRight._1) == 'Q'
        posRight = (posRight._1 + 1, posRight._2 - 1)
      }
      res
    }
    !checkRow(board, y) && !checkCol(board, x) && !checkDiag(board, x, y)
  }

  def getNumberQueens(board: List[String]): Int = {
    board
      .map { r => r.count(_ == 'Q') }
      .sum
  }

  def doSolveNQueens(board: List[String], x: Int, y: Int, n: Int): List[List[String]] = {
    if (getNumberQueens(board) == n)
      List(board)
    else if ( x >= n | y >= n)
      List()
    else {
      if (isSafe(board, x, y)) {
        val updatedBoard = board.updated(y, board(y).updated(x, 'Q'))
        doSolveNQueens(board, (x + 1) % n, y + ((x + 1) / n), n) ++
          doSolveNQueens(updatedBoard, (x + 1) % n, y + ((x + 1) / n), n)
      } else
        doSolveNQueens(board, (x + 1) % n, y + ((x + 1) / n), n)
    }
  }

  def solveNQueens(n: Int): List[List[String]] = {
    val startBoard =
      (0 until n)
        .toList
        .map { _ =>
          (0 until n)
            .toList
            .map { _ => "."}.mkString("")
        }
    doSolveNQueens(startBoard, 0, 0, n)
  }

}

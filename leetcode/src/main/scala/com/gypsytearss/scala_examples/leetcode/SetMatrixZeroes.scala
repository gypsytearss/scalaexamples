package com.gypsytearss.scala_examples.leetcode

/**
 * https://leetcode.com/problems/set-matrix-zeroes/submissions/
 */
object SetMatrixZeroes {
  /**
   * Iterative solution - Time: O(mn), Space: O(m + n)
   */
  def setZeroes(matrix: Array[Array[Int]]): Unit = {
    var rows: Set[Int] = Set()
    var cols: Set[Int] = Set()

    for {i <- matrix.indices;
         j <- matrix.headOption.map(_.indices).getOrElse((0 until 0)) } {
      if (matrix(i)(j) == 0) {
        rows = rows + i
        cols = cols + j
      }
    }

    for {i <- matrix.indices;
         j <- matrix.headOption.map(_.indices).getOrElse((0 until 0)) } {
      if (rows.contains(i) || cols.contains(j)) {
        matrix(i)(j) = 0
      }
    }
  }

}

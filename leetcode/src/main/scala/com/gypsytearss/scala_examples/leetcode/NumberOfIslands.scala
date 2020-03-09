package com.gypsytearss.scala_examples.leetcode

object NumberOfIslands {
  /**
   * https://leetcode.com/problems/number-of-islands/submissions/
   */
  def floodFill(grid: Array[Array[Char]], i: Int, j: Int): Unit = {
    if (i >= 0 && j >= 0 && i < grid.length && j < grid(0).length && grid(i)(j) == '1') {
      grid(i)(j) = 'x'
      floodFill(grid, i-1, j)
      floodFill(grid, i+1, j)
      floodFill(grid, i, j-1)
      floodFill(grid, i, j+1)
    }
  }

  def numIslands(grid: Array[Array[Char]]): Int = {
    var count = 0
    for { i <- (0 until grid.length)
          j <- (0 until grid(0).length) } {
      if (grid(i)(j) == '1') {
        floodFill(grid, i, j)
        count = count + 1
      }
    }
    count
  }
}

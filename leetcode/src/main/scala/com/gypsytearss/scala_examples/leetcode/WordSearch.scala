package com.gypsytearss.scala_examples.leetcode

object WordSearch {

  /**
    * https://leetcode.com/problems/word-search/
    */
  def getValidNeighbors(start: (Int, Int),
                        used: Set[(Int, Int)],
                        size: (Int, Int)): List[(Int, Int)] = {
    val (i, j) = start
    List((i, j - 1), (i, j + 1), (i - 1, j), (i + 1, j))
      .filter(!used.contains(_))
      .filter {
        case (i, j) =>
          i >= 0 && j >= 0 && i < size._1 && j < size._2
      }
  }

  def findWord(board: Array[Array[Char]],
               word: String,
               start: (Int, Int),
               used: Set[(Int, Int)]): Boolean = {
    if (word.length <= 1)
      board(start._1)(start._2).toString == word
    else if (word.head != board(start._1)(start._2))
      false
    else {
      val validNeighbors = getValidNeighbors(start, used, (board.length, board.head.length))
      validNeighbors.exists(n => findWord(board, word.tail, n, used + start))
    }
  }

  def exist(board: Array[Array[Char]], word: String): Boolean = {
    if (word.length == 0 || word.length > board.map(_.length).sum)
      false
    else {
      var found = false
      var idx = 0
      val indices = board.zipWithIndex.flatMap {
        case (rv, i) =>
          rv.zipWithIndex.filter(_._1 == word.head).map(j => (i, j._2))
      }

      while (!found && idx < indices.size) {
        found = findWord(board, word, indices(idx), Set())
        idx += 1
      }

      found
    }
  }
}

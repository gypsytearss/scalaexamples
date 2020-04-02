package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class NQueensTest extends FlatSpec with Matchers {

  "NQueens" should "pass simple test" in {
    val res = NQueens.solveNQueens(4)
    res.size shouldBe 2
  }
}

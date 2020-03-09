package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class NumberOfIslandsTest extends FlatSpec with Matchers {

  "Number of Islands" should "pass a simple test" in {
    val grid =
      Array(
        Array('0','1','0','0','0'),
        Array('0','1','1','0','0'),
        Array('0','0','0','0','0'),
        Array('0','0','1','1','0'),
        Array('0','0','1','1','1'),
      )

    NumberOfIslands.numIslands(grid) shouldBe 2
  }

}

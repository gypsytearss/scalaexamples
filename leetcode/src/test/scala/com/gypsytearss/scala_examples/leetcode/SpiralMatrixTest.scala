package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class SpiralMatrixTest extends FlatSpec with Matchers {

  "Spiral Matrix" should "pass a simple test" in {
    val matrix =
      Array(
        Array(1, 2, 3),
        Array(4, 5, 6),
        Array(7, 8, 9)
      )
    SpiralMatrix.spiralOrder(matrix) shouldBe List(1,2,3,6,9,8,7,4,5)
  }

}

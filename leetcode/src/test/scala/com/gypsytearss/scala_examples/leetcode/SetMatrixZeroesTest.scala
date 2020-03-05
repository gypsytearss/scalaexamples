package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class SetMatrixZeroesTest extends FlatSpec with Matchers {

  "Set Matrix Zeroes" should "pass simple test" in {
    val testMatrix =
      Array(
        Array(0,1,2,5),
        Array(1,2,3,4),
        Array(3,4,5,6),
        Array(0,1,1,0)
      )

    val expectedMatrix =
      Array(
        Array(0,0,0,0),
        Array(0,2,3,0),
        Array(0,4,5,0),
        Array(0,0,0,0)
      )

    SetMatrixZeroes.setZeroes(testMatrix)
    testMatrix shouldBe expectedMatrix
  }

}

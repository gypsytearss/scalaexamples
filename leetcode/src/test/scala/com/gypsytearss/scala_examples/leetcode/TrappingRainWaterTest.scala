package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class TrappingRainWaterTest extends FlatSpec with Matchers {

  "Trapping Rain Water" should "pass simple test for all solutions" in {
    TrappingRainWater.trap(Array(0, 2, 4, 1, 2, 5, 3, 2, 6, 3, 0)) shouldBe 10
    TrappingRainWater.trapII(Array(0, 2, 4, 1, 2, 5, 3, 2, 6, 3, 0)) shouldBe 10
  }

}

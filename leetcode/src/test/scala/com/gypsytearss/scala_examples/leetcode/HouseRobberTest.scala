package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class HouseRobberTest extends FlatSpec with Matchers {

  "House Robber" should "pass simple test" in {
    HouseRobber.rob(Array(8, 1, 1, 8)) shouldBe (16)
    HouseRobber.rob(Array(3, 1, 1, 4, 1, 5)) shouldBe (12)
    HouseRobber.rob(Array(2, 2, 3, 4, 5, 6)) shouldBe (12)
  }
}

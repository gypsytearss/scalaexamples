package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class TwoSumTest extends FlatSpec with Matchers {

  "two sum" should "pass simple test" in {
    TwoSum.twoSum(Array(3,4,5,0,3), 6) should contain allOf (0, 4)
  }
}

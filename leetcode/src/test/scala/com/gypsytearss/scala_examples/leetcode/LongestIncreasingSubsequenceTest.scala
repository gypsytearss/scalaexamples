package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class LongestIncreasingSubsequenceTest extends FlatSpec with Matchers {

  "Longest Increasing Subsequence" should "pass a simple test" in {
    LongestIncreasingSubsequence.lengthOfLIS(Array(3,5,7,4,5,6)) shouldBe (4)
  }
}

package com.gypsytearss.scala_examples.leetcode

object LongestIncreasingSubsequence {
  import scala.util.Try

  /**
   * https://leetcode.com/problems/longest-increasing-subsequence
   */
  def lengthOfLIS(nums: Array[Int]): Int = {
    val maxes: Array[Int] = nums.map(_ => 1)

    for { i <- (0 until maxes.length)
          j <- (0 until i) } {
      if (nums(j) < nums(i) && maxes(i) < maxes(j) + 1)
        maxes(i) = maxes(j) + 1
    }
    Try(maxes.max).getOrElse(0)
  }

}

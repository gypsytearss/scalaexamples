package com.gypsytearss.scala_examples.leetcode

/**
 * Problem: Find the indices of two numbers in array that add up to target number
 * Leetcode: https://leetcode.com/problems/two-sum
 */
object TwoSum {
  /**
   * @param nums array of integer values with 1 guaranteed solution to problem
   * @param target target integer value for two-sum
   * @return array of size 2 containing indices of the two sum solution numbers
   */
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val numsWithIndex = nums.zipWithIndex
    val numsToIndices = numsWithIndex.groupBy(_._1).view.mapValues(_.map(_._2)).toMap

    numsWithIndex.collectFirst {
      case (n, idx) if numsToIndices.get(target - n).exists(_.exists(_ != idx)) =>
        Array(idx, numsToIndices(target - n).filter(_ != idx).head)
    }.get
  }
}

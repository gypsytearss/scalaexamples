package com.gypsytearss.scala_examples.leetcode

object TrappingRainWater {

  /**
   * https://leetcode.com/problems/trapping-rain-water/submissions/
   */

  /**
   * (1) Solution O(n) space and O(n) time
   */
  def trap(height: Array[Int]): Int = {
    import scala.math.min

    var leftMax = 0
    val leftVolumes = height.foldLeft(Array[Int]()) { (res, i) =>
      if (i > leftMax) {
        leftMax = i
        res :+ 0
      }
      else
        res :+ (leftMax - i)
    }

    var rightMax = 0
    height.zipWithIndex.foldRight(0) { (tup, res) =>
      val (i, idx) = tup
      if (i > rightMax)
        rightMax = i
      res + min(leftVolumes(idx), rightMax - i)
    }
  }

  /**
   * (2) Solution O(n) time O(1) space
   * */
  def trapII(height: Array[Int]): Int = {
    var lIdx = 0
    var rIdx = height.length - 1
    var lHeight = 0
    var rHeight = 0
    var sum = 0

    while (rIdx >= lIdx) {
      if (lHeight < rHeight) {
        if (height(lIdx) > lHeight)
          lHeight = height(lIdx)
        sum = sum + (lHeight - height(lIdx))
        lIdx = lIdx + 1
      } else {
        if (height(rIdx) > rHeight)
          rHeight = height(rIdx)
        sum = sum + (rHeight - height(rIdx))
        rIdx = rIdx - 1
      }
    }
    sum
  }

}

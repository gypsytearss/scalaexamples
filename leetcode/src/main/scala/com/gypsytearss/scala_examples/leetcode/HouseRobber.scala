package com.gypsytearss.scala_examples.leetcode

import scala.util.Try

object HouseRobber {

  /**
   * https://leetcode.com/problems/house-robber/
   */
  def rob(nums: Array[Int]): Int = {
    var maxes: Vector[Int] = Vector()
    for ((num, i) <- nums.zipWithIndex) {
      maxes.size match {
        case 0 | 1 => maxes = maxes :+ num
        case 2 => maxes = maxes :+ (maxes(0) + num)
        case _ =>
          maxes = maxes :+ (scala.math.max(maxes(i - 2), maxes(i - 3)) + num)
      }
    }
    Try(maxes.max).getOrElse(0)
  }

}

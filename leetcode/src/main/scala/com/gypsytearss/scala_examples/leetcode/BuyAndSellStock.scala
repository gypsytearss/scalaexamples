package com.gypsytearss.scala_examples.leetcode

/**
 * Problem: given array of daily prices, find single historical profit-maximizing transaction
 * Leetcode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
object BuyAndSellStock {

  case class IntermediateResult(lowest: Int = Int.MaxValue, max: Int = 0)

  /**
   * @param prices array of Int representing daily historical prices for period of time
   * @return the maximum profit possible a a single txn within this stretch
   */
  def maxProfit(prices: Array[Int]): Int = {
    val result = prices.foldLeft(IntermediateResult()) { (res, p) =>
      IntermediateResult(
        lowest = if (p < res.lowest) p else res.lowest,
        max = if (p - res.lowest > res.max) p - res.lowest else res.max
      )
    }
    result.max
  }

}

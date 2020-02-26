package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

private class BuyAndSellStockTest extends FlatSpec with Matchers {

  "BuyAndSellStock" should "pass a simple test" in {
    BuyAndSellStock.maxProfit(Array(7,1,5,3,6,4)) shouldBe 5
  }

}

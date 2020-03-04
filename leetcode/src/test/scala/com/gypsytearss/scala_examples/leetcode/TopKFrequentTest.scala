package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class TopKFrequentTest extends FlatSpec with Matchers {

  "Top K Frequent" should "pass simple test" in {
    TopKFrequent.topKFrequent(Array(1,2,3,2,3,2,3,1), 2) should contain only (2,3)
  }

}

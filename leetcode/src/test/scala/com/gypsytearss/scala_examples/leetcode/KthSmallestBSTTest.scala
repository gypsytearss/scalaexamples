package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class KthSmallestBSTTest extends FlatSpec with Matchers {

  "Kth Smallest BST" should "pass a simple test" in {
    KthSmallestBST.kthSmallest(List(3,1,4,null,2), 4) shouldBe 4
  }

}

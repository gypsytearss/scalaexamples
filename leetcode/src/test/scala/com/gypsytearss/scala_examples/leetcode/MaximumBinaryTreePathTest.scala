package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class MaximumBinaryTreePathTest extends FlatSpec with Matchers {

  "Maximum Binary Tree Path" should "pass a simple test" in {
    MaximumBinaryTreePath.maxPathSum(List(3, 2, 1)) shouldBe 6
  }

  it should "pass a more elaborate test" in {
    MaximumBinaryTreePath.maxPathSum(List(3,2,1,-1,null,null,7)) shouldBe 13
  }
}

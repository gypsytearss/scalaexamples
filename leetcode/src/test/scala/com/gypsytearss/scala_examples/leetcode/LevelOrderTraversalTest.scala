package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}
import com.gypsytearss.scala_examples.leetcode.util.TreeUtils.TreeNode

class LevelOrderTraversalTest extends FlatSpec with Matchers {

  "Level Order Traversal" should "pass simple test" in {
    LevelOrderTraversal.levelOrder(List(3,4,8,10,12)) shouldBe List(List(3), List(4,8), List(10,12))
  }
}

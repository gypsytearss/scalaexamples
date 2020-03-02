package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}
import com.gypsytearss.scala_examples.leetcode.util.TreeUtils.TreeNode

class InvertBinaryTreeTest extends FlatSpec with Matchers {

  "Invert Binary Tree" should "pass simple test" in {
    val testTree = TreeNode(
      3,
      TreeNode(4, TreeNode(5, null, null), null),
      TreeNode(
        6,
        TreeNode(7, null, null),
        TreeNode(8, null, null)
      )
    )
    val expected = TreeNode(
      3,
      TreeNode(
        6,
        TreeNode(8, null, null),
        TreeNode(7, null, null)
      ),
      TreeNode(
        4,
        null,
        TreeNode(
          5,
          null,
          null
        )
      )
    )

    InvertBinaryTree.invertTree(testTree).equals(expected) shouldBe true
  }

}

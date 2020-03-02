package com.gypsytearss.scala_examples.leetcode

import com.gypsytearss.scala_examples.leetcode.util.TreeUtils.TreeNode

object InvertBinaryTree {

  def invertTree(root: TreeNode): TreeNode = {
    if (Option(root).isEmpty)
      root
    else {
      val tmp = root.left
      root.left = invertTree(root.right)
      root.right = invertTree(tmp)

      root
    }
  }
}

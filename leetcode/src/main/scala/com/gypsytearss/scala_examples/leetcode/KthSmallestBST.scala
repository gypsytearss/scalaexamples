package com.gypsytearss.scala_examples.leetcode

import com.gypsytearss.scala_examples.leetcode.util.TreeUtils.TreeNode

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 */
object KthSmallestBST {

  def doKthSmallest(root: TreeNode, k: Int, leftWeight: Int): (Option[Int], Int) = {
    if (Option(root).isEmpty)
      return (None, leftWeight)

    val thisLeftRes = doKthSmallest(root.left, k, leftWeight)
    if (thisLeftRes._1.isDefined)
      thisLeftRes
    else {
      val thisLeftWeight = 1 + thisLeftRes._2

      if (thisLeftWeight == k)
        (Some(root.value), 0)
      else
        doKthSmallest(root.right, k, thisLeftWeight)
    }
  }

  def kthSmallest(root: TreeNode, k: Int): Int = {
    doKthSmallest(root, k, 0)._1.get
  }
}

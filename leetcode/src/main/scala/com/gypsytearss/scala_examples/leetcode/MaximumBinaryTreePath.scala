package com.gypsytearss.scala_examples.leetcode

import com.gypsytearss.scala_examples.leetcode.util.TreeUtils.TreeNode

import scala.collection.mutable

object MaximumBinaryTreePath {
  def _doMaxPathSum(root: TreeNode, pq: mutable.PriorityQueue[Int]): Int = {
    if (Option(root.left).isEmpty && Option(root.right).isEmpty) {
      pq += root.value
      root.value
    } else {
      val leftTreeVal = Option(root.left).map(_doMaxPathSum(_, pq)).getOrElse(0)
      val rightTreeVal = Option(root.right).map(_doMaxPathSum(_, pq)).getOrElse(0)

      val maxValSingleSubtree = Seq(
        root.value,
        root.value + leftTreeVal,
        root.value + rightTreeVal
      ).max

      val maxVal = scala.math.max(maxValSingleSubtree, root.value + leftTreeVal + rightTreeVal)

      pq += maxVal
      maxValSingleSubtree
    }
  }

  def maxPathSum(root: TreeNode): Int = {
    implicit val ordering: Ordering[Int] = (x: Int, y: Int) => {
      if (x > y) 1
      else if (y > x) -1
      else 0
    }
    val pq = mutable.PriorityQueue[Int]()(ordering)

    _doMaxPathSum(root, pq)

    pq.dequeue()
  }

}

package com.gypsytearss.scala_examples.leetcode

import com.gypsytearss.scala_examples.leetcode.util.TreeUtils.TreeNode

object LevelOrderTraversal {

  def levelOrder(root: TreeNode): List[List[Int]] = {
    Option(root) match {
      case Some(r) =>
        var queue: Vector[TreeNode] = Vector(r)
        var res: List[List[Int]] = List()

        while (queue.nonEmpty) {
          val levelQueue = queue
          queue = Vector()
          levelQueue.foreach { n =>
            val children = Vector(Option(n.left), Option(n.right)).flatMap(x=>x)
            queue = queue :++ children
          }
          res = res :+ levelQueue.toList.map{ _.value }
        }
        res

      case None =>
        List()
    }
  }

}

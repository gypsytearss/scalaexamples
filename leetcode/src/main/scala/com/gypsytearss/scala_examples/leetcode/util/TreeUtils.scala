package com.gypsytearss.scala_examples.leetcode.util

object TreeUtils {
  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null

    override def equals(obj: Any): Boolean = {
      obj match {
        case t: TreeNode =>
          Option(this.value) == Option(t.value) &&
            Option(this.left).forall(_.equals(t.left)) &&
            Option(this.right).forall(_.equals(t.right)) &&
            Option(t.left).forall(_.equals(this.left)) &&
            Option(t.right).forall(_.equals(this.right))
        case o => super.equals(o)
      }
    }
  }

  object TreeNode {

    import scala.language.implicitConversions

    def apply(value: Int, left: TreeNode, right: TreeNode): TreeNode = {
      val node = new TreeNode(value)
      node.left = left
      node.right = right
      node
    }

    implicit def array2TreeNode(list: List[Any]): TreeNode = {
      if (list.isEmpty)
        throw new RuntimeException("Parameter `list` must not be empty in implicit conversion List => TreeNode")

      var valueStack: List[Any] = list.tail
      val root = new TreeNode(list.head.asInstanceOf[Int])
      var nodeQueue: Array[TreeNode] = Array(root)

      while (nodeQueue.nonEmpty && valueStack.nonEmpty) {
        val thisRoot = nodeQueue.last
        nodeQueue = nodeQueue.slice(0, nodeQueue.length - 1)

        valueStack match {
          case l :: r :: t =>
            if (Option(l).isDefined) {
              thisRoot.left = new TreeNode(l.asInstanceOf[Int])
              nodeQueue = thisRoot.left +: nodeQueue
            }
            if (Option(r).isDefined) {
              thisRoot.right = new TreeNode(r.asInstanceOf[Int])
              nodeQueue = thisRoot.right +: nodeQueue
            }
            valueStack = t
          case _ =>
            throw new RuntimeException("This should never happen.")
        }
      }

      root
    }
  }

}

package com.gypsytearss.scala_examples.leetcode.util

object LinkedListUtils {
  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x

    override def equals(other: Any): Boolean = {
      other match {
        case l: ListNode =>
          this.x == l.x && Option(this.next).equals(Option(l.next))
        case o => super.equals(o)
      }
    }
  }

  object ListNode {
    def apply(_x: Int, _next: ListNode = null): ListNode = {
      val node = new ListNode(_x)
      node.next = _next
      node
    }
  }
}

package com.gypsytearss.scala_examples.leetcode

import com.gypsytearss.scala_examples.leetcode.util.LinkedListUtils._

object ReverseLinkedList {

  def reverseList(head: ListNode): ListNode = {
    var thisNode = Option(head)
    var nextNode: Option[ListNode] = null
    var prev: ListNode = null

    while (thisNode.isDefined) {
      nextNode = Option(thisNode.get.next)
      thisNode.map(_.next = prev)
      prev = thisNode.get
      thisNode = nextNode
    }

    prev
  }
}

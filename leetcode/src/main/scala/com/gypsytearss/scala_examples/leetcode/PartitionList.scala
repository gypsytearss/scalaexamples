package com.gypsytearss.scala_examples.leetcode

import com.gypsytearss.scala_examples.leetcode.util.LinkedListUtils.ListNode

object PartitionList {
  /**
   * https://leetcode.com/problems/partition-list/
   */
  def partition(head: ListNode, x: Int): ListNode = {
    Option(head) match {
      case Some(h) =>
        var ltail: ListNode = null
        var rtail: ListNode = null
        var lpartition: ListNode = null
        var rpartition: ListNode = null
        var thisNode: ListNode = h

        while (Option(thisNode).isDefined) {
          if (thisNode.x < x) {
            Option(ltail).map { n => n.next = thisNode }
            ltail = thisNode
            if (Option(lpartition).isEmpty)
              lpartition = thisNode
          } else {
            Option(rtail).map { n => n.next = thisNode }
            rtail = thisNode
            if (Option(rpartition).isEmpty)
              rpartition = thisNode
          }
          thisNode = thisNode.next
        }

        Option(rtail).foreach { rt => rt.next = null }
        if (Option(ltail).isDefined) {
          ltail.next = rpartition
          lpartition
        } else rpartition

      case None => null
    }
  }

}

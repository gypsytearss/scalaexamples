package com.gypsytearss.scala_examples.leetcode

import com.gypsytearss.scala_examples.leetcode.util.LinkedListUtils.ListNode

import scala.collection.mutable
import scala.util.Try

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
object MergeKSortedLists {
  def mergeKLists(lists: Array[ListNode]): ListNode = {
    implicit val ordering: Ordering[Int] = Ordering.fromLessThan((a, b) => a > b)

    var allValues: Vector[Int] = Vector()
    lists.foreach { list =>
      var headOption = Option(list)
      while (headOption.isDefined) {
        allValues = allValues :+ headOption.get.x
        headOption = Option(headOption.get.next)
      }
    }

    val pq = mutable.PriorityQueue.from(allValues)(ordering)

    var dequeued: Option[Int] = None
    var prevNode: Option[ListNode] = None
    var headNode: Option[ListNode] = None
    while ({ dequeued = Try(pq.dequeue()).toOption; dequeued.isDefined }) {
      val thisNode = new ListNode(dequeued.get)
      if (headNode.isEmpty) headNode = Some(thisNode)
      prevNode.map(_.next = thisNode)
      prevNode = Some(thisNode)
    }
    headNode.orNull
  }
}

package com.gypsytearss.scala_examples.leetcode

import com.gypsytearss.scala_examples.leetcode.util.LinkedListUtils.ListNode
import org.scalatest.{FlatSpec, Matchers}

class MergeKSortedListsTest extends FlatSpec with Matchers {

  "Merge K Sorted Lists" should "pass a simple test" in {
    val l1 = ListNode(3, ListNode(4))
    val l2 = ListNode(2, ListNode(3, ListNode(6)))
    val l3 = ListNode(4, ListNode(4))

    val expected = ListNode(2, ListNode(3, ListNode(3, ListNode(4, ListNode(4, ListNode(4, ListNode(6)))))))
    val res = MergeKSortedLists.mergeKLists(Array(l1, l2, l3))
    res.equals(expected) shouldBe true
  }

}

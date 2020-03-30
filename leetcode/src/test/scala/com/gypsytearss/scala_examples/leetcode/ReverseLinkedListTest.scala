package com.gypsytearss.scala_examples.leetcode

import com.gypsytearss.scala_examples.leetcode.util.LinkedListUtils.ListNode
import org.scalatest.{FlatSpec, Matchers}

class ReverseLinkedListTest extends FlatSpec with Matchers {

  "Reverse Linked List" should "pass a simple test" in {
    ReverseLinkedList.reverseList(ListNode(3, ListNode(2, ListNode(1, null)))) shouldBe (ListNode(1, ListNode(2, ListNode(3, null))))
  }

}

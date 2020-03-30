package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}
import com.gypsytearss.scala_examples.leetcode.util.LinkedListUtils.ListNode

class PartitionListTest extends FlatSpec with Matchers {

  "Partition List" should "pass simple test" in {
    val res = PartitionList.partition(ListNode(3, ListNode(6, ListNode(4))), 5)
    res equals ListNode(3, ListNode(4, ListNode(6))) shouldBe true
  }
}

package com.gypsytearss.scala_examples.leetcode

import scala.collection.mutable

/**
 * https://leetcode.com/problems/top-k-frequent-elements/
 */
object TopKFrequent {
  def topKFrequent(nums: Array[Int], k: Int): List[Int] = {
    implicit val ordering: Ordering[(Int, Int)] = Ordering.by(a => a._2)
    val pq = mutable.PriorityQueue.from(nums.groupBy(i=>i).mapValues(_.length).toList)
    (1 to k).toList.map(_ => pq.dequeue()._1)
  }
}

package com.gypsytearss.scala_examples.leetcode

object GroupAnagrams {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    strs.groupBy(str => str.toSeq.sorted.toString).values.map(_.toList).toList
  }

}

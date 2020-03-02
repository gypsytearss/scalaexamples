package com.gypsytearss.scala_examples.leetcode

object ValidAnagram {
  def isAnagram(s: String, t: String): Boolean = {
    if (s.size != t.size)
      false
    else
      s.groupBy(c=>c).mapValues(_.size).toMap == t.groupBy(c=>c).mapValues(_.size).toMap
  }
}

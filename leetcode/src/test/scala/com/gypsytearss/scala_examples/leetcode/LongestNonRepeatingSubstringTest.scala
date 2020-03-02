package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class LongestNonRepeatingSubstringTest extends FlatSpec with Matchers {

  "Longest NonRepeating Substring" should "pass simple test" in {
    LongestNonRepeatingSubstring.lengthOfLongestSubstring("aabdbdxyzaz") shouldBe(6)
  }
}

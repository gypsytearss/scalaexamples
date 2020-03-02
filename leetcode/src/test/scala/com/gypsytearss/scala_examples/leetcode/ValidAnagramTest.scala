package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

private class ValidAnagramTest extends FlatSpec with Matchers {

  "Valid Anagram" should "pass simple test" in {
    ValidAnagram.isAnagram("cat", "tac") shouldBe true
  }

  it should "fail when not anagram" in {
    ValidAnagram.isAnagram("thing", "ghit") shouldBe false
  }
}

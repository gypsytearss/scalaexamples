package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class WordSearchTest extends FlatSpec with Matchers {

  "Word Search" should "pass simple test" in {
    WordSearch.exist(Array(Array('a')), "a") shouldBe true
  }

  it should "pass another simple test" in {
    WordSearch.exist(
      Array(
        Array('c','d','e'),
        Array('a','e','c'),
        Array('g','h','j')
      ),
      "dehj"
    ) shouldBe true
  }

  it should "fail a simple test" in {
    WordSearch.exist(
      Array(
        Array('c','d','e'),
        Array('a','e','c'),
        Array('g','h','j')
      ),
      "dehh"
    ) shouldBe false
  }

}

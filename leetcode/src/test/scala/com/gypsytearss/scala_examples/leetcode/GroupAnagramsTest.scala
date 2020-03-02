package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class GroupAnagramsTest extends FlatSpec with Matchers {

  "Group Anagrams" should "pass simple test" in {
    val result = GroupAnagrams.groupAnagrams(Array("eat", "tea", "tan", "ate", "nat", "bat")).map(_.toSet)
    val expected = List(
      Set("eat", "tea", "ate"),
      Set("tan", "nat"),
      Set("bat")
    )

    result should contain only(expected: _*)
  }

}

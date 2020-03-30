package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class AddStringsTest extends FlatSpec with Matchers {

  "Add Strings" should "pass simple test" in {
    AddStrings.addStrings("55", "8") shouldBe "63"
    AddStrings.addStrings("55", "13") shouldBe "68"
  }

}

package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class CoursePrerequisitesTest extends FlatSpec with Matchers {

  "Course Prerequisite" should "pass a simple test" in {
    CoursePrerequisites.canFinish(3, Array(Array(2,1), Array(2, 0), Array(1, 0))) shouldBe true
  }

  it should "fail a bad graph" in {
    CoursePrerequisites.canFinish(2, Array(Array(0,1), Array(1,0))) shouldBe false
  }
}

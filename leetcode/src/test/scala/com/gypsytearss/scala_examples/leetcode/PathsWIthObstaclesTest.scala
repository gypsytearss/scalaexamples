package com.gypsytearss.scala_examples.leetcode

import org.scalatest.{FlatSpec, Matchers}

class PathsWIthObstaclesTest extends FlatSpec with Matchers {

  "Unique Paths with Obstacles" should "pass a simple test" in {
    PathsWIthObstacles.uniquePathsWithObstacles(Array(Array(0, 0, 0), Array(0, 1, 0), Array(0, 0, 0))) shouldBe 2
  }

}

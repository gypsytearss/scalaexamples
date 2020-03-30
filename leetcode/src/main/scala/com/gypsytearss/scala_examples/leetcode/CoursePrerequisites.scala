package com.gypsytearss.scala_examples.leetcode

object CoursePrerequisites {
  import scala.collection.mutable

  def dfs(k: Int, graph: Map[Int, List[Int]], visited: mutable.Map[Int, Int]): Boolean = {
    visited(k) match {
      case -1 => false
      case 1  => true
      case _  =>
        visited(k) = -1
        val res = graph(k).forall { n => dfs(n, graph, visited) }
        visited(k) = 1
        res
    }
  }

  def canFinish(numCourses: Int, prerequisites: Array[Array[Int]]): Boolean = {
    var graph = (0 until numCourses).map { _ ->  List.empty[Int] }.toMap
    graph = prerequisites.foldLeft(graph) { (res, p) => res.updated(p(0), p(1) +: res(p(0))) }

    val visited = mutable.Map[Int, Int]((0 until numCourses).map { i => i -> 0 }: _*)

    val res = (0 until numCourses).takeWhile { k =>
      dfs(k, graph, visited)
    }

    res.size == numCourses
  }
}

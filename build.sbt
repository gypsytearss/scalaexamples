lazy val commonSettings = Seq(
  organization := "com.gypsytearss",
  scalaVersion := "2.13.1",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  scalacOptions ++= Seq("-deprecation", "-feature")

)

lazy val leetcode = project.in(file("leetcode"))
  .settings(commonSettings: _*)

import Dependencies._

ThisBuild / scalaVersion     := "2.13.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "sbt-doc-reproducer"
  ).aggregate(a, b, c)

lazy val a = (project in file("a"))
  .settings(
    name := "sbt-doc-reproducer-a",
    libraryDependencies += scalaTest % Test
  ).dependsOn(b % "compile->compile;test->test", c)

lazy val b = (project in file("b"))
  .settings(
    name := "sbt-doc-reproducer-b"
  )

lazy val c = (project in file("c"))
  .settings(
    name := "sbt-doc-reproducer-c"
  )

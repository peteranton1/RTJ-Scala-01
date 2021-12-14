ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.0.2"

lazy val root = (project in file("."))
  .settings(
    name := "RTJ-Scala-01",
    idePackagePrefix := Some("org.example.app01")
  )

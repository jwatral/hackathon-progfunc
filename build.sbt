import sbt.Keys._

name := "hackathon-progfunc"

version := "0.0.1"

scalaVersion := "2.11.8"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test"

libraryDependencies += "com.typesafe.akka" %% "akka-http-core" % "2.4.7"

libraryDependencies += "com.typesafe.akka" %% "akka-http-experimental" % "2.4.7"

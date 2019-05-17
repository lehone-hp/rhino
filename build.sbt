name := """rhino"""
organization := "org.rhino"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += javaJdbc
libraryDependencies ++= Seq(evolutions, jdbc)
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"

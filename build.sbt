name := "play-slick"

version := "0.2.7-SNAPSHOT"

organization := "com.typesafe"

scalaVersion := "2.10.0-RC1" //RC1 to harmonize with Play RC1

libraryDependencies ++= Seq(
  "play" %% "play" % "2.1-RC1",
  "play" %% "play-jdbc" % "2.1-RC1",
  "com.typesafe" % "slick_2.10.0-RC1" % "0.11.2")


organization := "com.liferay"
name := "service-builder-dsl"
version := "1.0.0-SNAPSHOT"

scalaVersion := "2.12.2"

libraryDependencies += "com.beachape" %% "enumeratum" % "1.5.2"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"
libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.6"

libraryDependencies += "com.softwaremill.macwire" %% "macros" % "2.2.5" % "provided"

libraryDependencies += "com.lihaoyi" % "ammonite" % "0.8.4" % "test" cross CrossVersion.full
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test" 

initialCommands in (Test, console) := """ammonite.Main().run()"""

logBuffered in Test := false

scalacOptions := Seq("-encoding", "utf8", "-feature", "-deprecation", "-optimise", "-target:jvm-1.8", "-Ywarn-unused", "-Ywarn-dead-code", "-Ywarn-unused-import")

updateOptions := updateOptions.value.withCachedResolution(true)

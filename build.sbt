name := "scala-cookbook"

version := "1.0"

scalaVersion := "2.11.7"

scalacOptions in Test ++= Seq("-Yrangepos")

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
  "org.specs2" %% "specs2-core" % "3.6.4" % "test"
)




import sbt._
import Keys._

object $app_prefix;format="Camel"$Build extends Build {

  val $app_prefix$Settings = Seq(
    scalaVersion := "2.11.7",
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature"
    ),
    libraryDependencies ++= Seq(
      "org.scalatest" % "scalatest_2.11" % "2.2.4" % Test
    )
  )
  lazy val `$app_prefix$-app` = project.
    settings($app_prefix$Settings:_*).
    dependsOn(`$app_prefix$-lib`)

  lazy val `$app_prefix$-lib` = project.
    settings($app_prefix$Settings:_*)

  lazy val root = Project("$app_prefix$", file(".")).
    aggregate(
      `$app_prefix$-app`,
      `$app_prefix$-lib`
    )
}

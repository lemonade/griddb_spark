organization := "com.toshiba.mwcloud"
scalaVersion := "2.11.8"
version      := "0.1"
name         := "spark-griddb"

spName := "toshiba/spark-griddb"

sparkVersion := "2.1.0"

sparkComponents := Seq("core", "sql")

// This is necessary because of how we explicitly specify Spark dependencies
// for tests rather than using the sbt-spark-package plugin to provide them.
spIgnoreProvided := true

publishMavenStyle := true

spAppendScalaVersion := true

spIncludeMaven := true
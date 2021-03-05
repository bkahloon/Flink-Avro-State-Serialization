name := "flink-avro"

version := "0.1"

scalaVersion := "2.12.11"

val flinkVersion = "1.12.0"

val flinkDependencies = Seq(
  "org.apache.flink" %% "flink-scala" % flinkVersion % "provided",
  "org.apache.flink" %% "flink-streaming-scala" % flinkVersion % "provided",
  "com.sksamuel.avro4s" %% "avro4s-core" % "4.0.3")

lazy val root = (project in file(".")).
  settings(
    libraryDependencies ++= flinkDependencies
  )


// make run command include the provided dependencies
Compile / run  := Defaults.runTask(Compile / fullClasspath,
  Compile / run / mainClass,
  Compile / run / runner
).evaluated
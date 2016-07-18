lazy val root = (project in file(".")).
  settings(
    name := "coursier-zoo-test",
    version := "1.0",
    scalaVersion := "2.11.8",

    libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-server-resourcemanager" % "2.7.1"
  )

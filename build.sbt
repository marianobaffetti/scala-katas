lazy val katas = (project in file(".")).
  settings(
    name := "scala-katas",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
  ) 
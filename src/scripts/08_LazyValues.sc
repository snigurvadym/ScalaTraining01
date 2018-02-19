lazy val words = scala.io.Source.fromFile("/home/uadmin/IdeaProjects/ScalaProject01/src/words").mkString

print(words)
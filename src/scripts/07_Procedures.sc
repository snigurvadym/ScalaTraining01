
// example to define procedure
def box(s: String) {
  val border = "-"*s.length+"--\n"
  println(border+"|"+s+"|\n"+border)
}

// procedure full definition
def boxFullDefinition(s: String): Unit = {
  val border = "-"*s.length+"--\n"
  println(border+"|"+s+"|\n"+border)
}


box("Some my text!")

boxFullDefinition("TEXT")


def countDown(n:Int) : Unit = {
  var res = n;
  while(res>=0) {
    print(res+",")
    res=res-1
  }
}

countDown(10)
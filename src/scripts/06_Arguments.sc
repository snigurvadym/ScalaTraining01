
// named arguments and arguments by default

def decoration(str: String, leftDecor:String = "[", rightDecor:String = "]") = {
  leftDecor+str+rightDecor
}

decoration("My text")
decoration("Other text", "\\","\\")
decoration("Mix default arguments", rightDecor = ">>>]")

// multi arguments function
def arguments(args : Int*) = {
  var result = 0
  for (arg <- args ) {
    result+=arg
  }
  result
}

arguments(1,2,3,4,5)

arguments(1 to 5: _*)

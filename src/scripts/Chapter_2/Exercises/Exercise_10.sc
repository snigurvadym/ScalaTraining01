def product(s: String): Long = {
  if (s.tail != ""){
    s.head.toLong * product(s.tail)
  } else {
    s.head.toLong
  }
}

product("Hello")
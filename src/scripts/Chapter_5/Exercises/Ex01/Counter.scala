package scripts.Chapter_5

class Counter {
  private var value = 0;
  def increment() {
    if (value+1<=Int.MaxValue) {
      value+=1
    }
  }
  def current() = value
  //def current2 =  value

  def isLess(other: Counter) = (value < other.value)
  def other(other: Counter) = other.value
  //def isLess(other: Int): Boolean = value < other
}

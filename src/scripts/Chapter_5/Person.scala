package scripts.Chapter_5.Exercises

class Person {
  private var privateAge:Int = 0;

  def age = privateAge

  def _age (newValue:Int) = {
    if (newValue>privateAge) {
      privateAge = newValue
    }
  }


}

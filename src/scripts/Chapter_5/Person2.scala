package scripts.Chapter_5

import scala.beans.BeanProperty

class Person {
  private var privateAge:Int = 0;

  def age = privateAge

  @BeanProperty var name:String = _


  def _age (newValue:Int) = {
    if (newValue>privateAge) {
      privateAge = newValue
    }
  }

  def this(name:String) { // additional constructor
    this() // call to the main constructor
    this.name = name
  }

  def this(name: String, age:Int) {
    this(name) // call to the additional constructor
    //this age = age
    //this age = age
  }

}

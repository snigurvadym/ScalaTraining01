package scripts.Chapter_5.Exercises.Ex05

class Time(private var hours:Int = 0, private var minutes:Int = 0) {

  minutes = {
    hours+=minutes/60
    minutes%60
  }

  hours = {
    hours%24
  }

  def min: Int = {minutes}
  def hrs: Int = {hours}
  def before (other:Time): Boolean = {
    other.hours*60+other.minutes<this.hours*60+this.minutes
  }

  def this(minu:Int) {
    this(0,minu)
    println("Constructor: "+this.hours + ":" + this.minutes)
    this.hours=minu/60
    this.minutes = minu%60
  }

}

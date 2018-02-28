package scripts.Chapter_5.Exercises.Ex03

class Time(private var hours:Int = 0, private var minutes:Int = 0) {
//  minutes = minutes match {
//    case i:Int if i%60==0 => {hours += i/60; 0}
//    case i:Int if i<0 => {hours += (i/60 - 1); 60 + i%60}
//    case i:Int if i>59 => {hours += i/60; i%60}
//    case _ => minutes
//  }

  //  hours = hours match {
  //    case i:Int if i<0 => 24 + i%24
  //    case i:Int if i>23 => i%24
  //    case _ => hours
  //  }

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

}

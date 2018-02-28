import scripts.Chapter_5.Exercises.Ex03.Time

var time = new Time(9,90)

println(time.hrs+":"+time.min)

var timeOther01 = new Time(10,31)
var timeOther02 = new Time(10,29)

println(time.before(timeOther01))
println(time.before(timeOther02))

// this is 1 day 2 hours and 20 minutes
var timeIncorrectHoursMins = new Time(25,80)
println(timeIncorrectHoursMins.hrs+":"+timeIncorrectHoursMins.min)
import scripts.Chapter_5.Exercises.Ex04.Time

var time = new Time(9,90)

println("1. " + time.hrs+":"+time.min)

var timeOther01 = new Time(10,31)
var timeOther02 = new Time(10,29)

println("2. "+time.before(timeOther01))
println("3. "+time.before(timeOther02))

// this is 1 day 2 hours and 20 minutes
var timeIncorrectHoursMins = new Time(25,80)
println("4. "+timeIncorrectHoursMins.hrs+":"+timeIncorrectHoursMins.min)

var timeMinsOnly = new Time(70)
println("5. "+timeMinsOnly.hrs+":"+timeMinsOnly.min)
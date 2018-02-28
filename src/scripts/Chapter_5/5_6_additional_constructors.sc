import scripts.Chapter_5.Counter

var counter01 = new Counter
counter01.increment()

var counter02 = new Counter
counter02.increment()
counter02.increment()

counter01.isLess(counter02)
println(counter01.other(counter02))

//println(counter01.isLess(counter02.current()))

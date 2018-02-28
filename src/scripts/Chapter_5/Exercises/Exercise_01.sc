
// ex.1

var products01 = Map[String, Double]()
products01 = Map("cap"->5, "trouser"->100, "teeshort"->30, "swetter"->40)
val products01discount = for((k,v)<-products01) yield (k,v-v*10/100)
products01discount.foreach(println)

import java.util.Scanner

import scala.collection.immutable.{SortedMap, TreeMap}
import scala.collection.mutable

// ex.1

var products01 = Map[String, Double]()
products01 = Map("cap"->5, "trouser"->100, "teeshort"->30, "swetter"->40)

//val products01discount = Map[String,Double]

val products01discount = for((k,v)<-products01) yield (k,v-v*10/100)

products01discount.foreach(println)

// ex.2
val in = new Scanner(new java.io.File("/home/uadmin/IdeaProjects/ScalaProject01/src/words"))
var words =  mutable.Map[String, Int]()
while (in.hasNext) {
  var word = in.next()
  if (words.getOrElse(word,0)==0) {
    words += (word->1)
  } else {
    words(word) = words(word)+1
  }
}

words.foreach(print)

// ex.3
val in01 = new Scanner(new java.io.File("/home/uadmin/IdeaProjects/ScalaProject01/src/words"))
var words01 =  Map[String, Int]()
while (in01.hasNext) {
  var word = in01.next()
  if (words01.getOrElse(word,0)==0) {
    words01 += (word->1)
  } else {
    var value =words01(word)+1
    words01-=word
    words01=words01+(word->value)
  }
}
print("ex3. result")
words01.foreach(print)

// ex.4
val in02 = new Scanner(new java.io.File("/home/uadmin/IdeaProjects/ScalaProject01/src/words"))
var words02 =  SortedMap[String, Int]()
while (in02.hasNext) {
  var word = in02.next()
  if (words02.getOrElse(word,0)==0) {
    words02 += (word->1)
  } else {
    var value =words02(word)+1
    words02-=word
    words02=words02+(word->value)
  }
}
print("ex4. result")
words02.foreach(print)

// ex.5
val in05 = new Scanner(new java.io.File("/home/uadmin/IdeaProjects/ScalaProject01/src/words"))
var words05 =  TreeMap[String, Int]()
while (in05.hasNext) {
  var word = in05.next()
  if (words05.getOrElse(word,0)==0) {
    words05 += (word->1)
  } else {
    var value =words05(word)+1
    words05-=word
    words05=words05+(word->value)
  }
}
print("ex5. result")
words05.foreach(print)


// ex.6
val days = scala.collection.mutable.LinkedHashMap(
  "MONDAY" -> java.util.Calendar.MONDAY,
  "TUESDAY" -> java.util.Calendar.TUESDAY,
  "WEDNESDAY" -> java.util.Calendar.WEDNESDAY,
  "THURSDAY" -> java.util.Calendar.THURSDAY,
  "FRIDAY" -> java.util.Calendar.FRIDAY,
  "SATURDAY" -> java.util.Calendar.SATURDAY,
  "SUNDAY" -> java.util.Calendar.SUNDAY
)
days.foreach(print)
//assert(days == (for(d <- days) yield d))

// ex. 7
print(System.getProperties)
import scala.collection.JavaConversions.propertiesAsScalaMap
val props: scala.collection.Map[String, String] = System.getProperties

val maxLength = props.keys.maxBy(_.length).length

for((k,v) <- props) println(k + " " * (maxLength - k.length) + "|" + v)


// ex.8
def minmax(ar: Array[Int]) = (ar.min, ar.max)

println(minmax(Array(1,2,3,4,5)))

// ex.9
def lteqgt(ar: Array[Int], v:Int) = (ar.count(_<v), ar.count(_==v),ar.count(_>v))
println(lteqgt(Array(1,2,3,4,5,6,7,8),3))

// ex.10
println("hello".zip("world"))
val diff = "Hello world !".zip("hello world!").filter(t => t._1!=t._2)
println(diff)
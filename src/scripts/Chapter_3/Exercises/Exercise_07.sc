import java.awt.datatransfer._

import scala.collection.mutable.ArrayBuffer
import scala.collection.{JavaConverters, mutable}


// p 62
// ex. 1
val n = 10
val nums = new Array[Int](n)
val r = scala.util.Random
for(i<-0 until(nums.length)) {
  nums(i) += r.nextInt(100)
}
for(i<-0 until(nums.length)) {
  println(nums(i))
}

// ex.2
val switchEl = Array(2,1,3,4,5,0,1)
for(i<-0 until(switchEl.length - 1,2)) {
  var temp = switchEl(i)
  switchEl(i) = switchEl(i+1)
  switchEl(i+1) = temp
}
for(i<-0 until(switchEl.length)) {
  println(switchEl(i))
}

// ex.3
val switchEl3 = Array(2,1,3,4,5,0,7)
val switchEl3new = for(i<-0 until(switchEl3.length)) yield {
  if (i==switchEl3.length-1) switchEl3(i)
  else {
    if (i%2==0) switchEl3(i+1)
    else switchEl3(i-1)
  }
}
for(el<-switchEl3new) print(el+",")

// ex.4
val switchEl4 = Array(2,-1,3,-4,5,0,7,-6)
val switchEl41 = for(el<-switchEl4 if el>0) yield {
  el
}
val switchEl42 = for(el<-switchEl4 if el<=0) yield {
  el
}
for(el<-switchEl41++switchEl42) print(el+",")

// ex.5
val ar5 = Array[Double](2,1,3,4,5,0,7,6)
print(ar5.sum/ar5.length)

// ex.6
val ar6 = Array[Int](2,1,3,4,5,0,7,6)
for(el<-ar6.sortWith(_>_)) print(el+",")
val ar61 = ArrayBuffer[Int](2,1,3,4,5,0,7,6)
for(el<-ar61.sortWith(_>_)) print(el+",")

//ex.7
val ar7 = Array[Int](1,2,1,3,4,4,5,5,5,7,7,7)
for(el<-ar7.distinct)print(el+",")

// ex.8
//TODO

// ex.9
val ar9 = java.util.TimeZone.getAvailableIDs
val subStr: String = "America"
for(el<-ar9.filter(_.contains(subStr)).sorted)print(el.substring(subStr.length+1)+",")

// ex.10
val flavours = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
val ar10 = ArrayBuffer(flavours.getNativesForFlavor(DataFlavor.imageFlavor))
ar10.foreach(println)
//for(el<-ar10)println(el)

/**
  * Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with the call
  * val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  *
  * Then call the getNativesForFlavor method with parameter DataFlavor.imageFlavor and
  * get the return value as a Scala buffer.
  *
  * (Why this obscure class? It’s hard to find uses of java.util.List in the standard Java library.)
  */
//object Ex10 extends App {
println("----------------- 10 ----------------------")
val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
val flavorsBuffer: mutable.Buffer[String] = JavaConverters.asScalaBufferConverter(flavors.getNativesForFlavor(DataFlavor.imageFlavor)).asScala
flavorsBuffer.foreach(println)

//}
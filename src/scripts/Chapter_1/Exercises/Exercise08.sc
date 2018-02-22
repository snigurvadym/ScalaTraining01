import scala.math.BigInt._
import scala.util.Random

/**
  * One way to create random file or directory names is to produce a random BigInt and convert it to base 36,
  * yielding a string such as "qsnvbevtomcj38o06kul" .
  * Poke around Scaladoc to find a way of doing this in Scala.
  */

val fileName =probablePrime(100, Random)

println(fileName.toString(36))
println(fileName.toString())
println(fileName.toString(2))
println(fileName)
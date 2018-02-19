import scala.collection.immutable.StringOps

for (i<- 1 to 100) {
  print("%s,".format(i))
}

for (ch<- "Hello!") println(ch)
for (ch<- "this is me!") print(ch)

for (c<- "Hello!"; i<- 0 to 1) yield (c+i).toChar
for (i<- 0 to 1; c<- "Hello!") yield (c+i).toChar

for {i<- 1 to 3
from = 4 - i
j<- from to 3 } print((10*i+j)+" ")

for(i<- 1 to 3; j<-1 to 3; if i!=j) print((10*i+j)+" ")

for(i<- 0 to 10) print(i + " ")

for(i<- 0 to 10; from = 10-i) print(from + " ")

var res:Long = 1;
for (c<- "Hello") {
  res*=c.toLong
  //print (c.toInt+",")
}
println(">>"+res)

var so = new StringOps("Hello")
println(so)

var prod =1
so.foreach(prod*=_.toInt)
print(prod)

var s:Long = 1
"Hello".foreach(s *= _)
println(s)
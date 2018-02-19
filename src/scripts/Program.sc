import scala.io.StdIn

val pi = math.Pi

printf("Pi constant is %s;", pi)

val res01 = math.sqrt(3)

printf("sqrt(3) = %s;", res01)

val res02 = BigInt(2).pow(1024);

printf("2^1024 = %s;", res02)


//val name1 = readLine("Your name: ")

//val name2 = StdIn.readLine("Your name: ")

//print("Your age: ")

for (i<- 1 to 100) {
  print("%s,".format(i))
}

var i=0
while (i<100) {
    print(i+",")
    i += 1;
}

for (ch<- "Hello!") println(ch)
for (ch<- "this is me!") print(ch)

for (c<- "Hello!"; i<- 0 to 1) yield (c+i).toChar
for (i<- 0 to 1; c<- "Hello!") yield (c+i).toChar

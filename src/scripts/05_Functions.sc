

// example calculate module from x
def abs(x: Double) = if (x>=0) x else -x

// simple function to calc factorial
def fac(n:Int) = {
  var r = 1;
  for(i<- 1 to n) r=r*i;
  r
}

// function to calculate factorial using recursion
def fac1(n:Int) : Int = if (n<=0) 1 else n*fac(n-1)

def sign(x: Double) : Double = {
  if (x == 0) return 0
  if (x>0) return 1 else return -1
}

// Example tp call functions
fac(4)
fac(4)
abs(-3)
sign(5)
sign(0)
sign(-10)

// function to calculate x^n. For ex.: 2^3 = 8
def rep(x : Double, n : Int): Double = {
  var result:Double = 1;
  if (x == 0) {
    result = 1
  } else if (((n % 2) == 0)&&(n > 0)) {
    for(k<-1 to n) {
      result*=x
    }
  } else if (((n % 2) != 0)&&(n > 0)) {
    for(k<-1 to n) {
      result*=x
    }
  } else if (n < 0) {
    for(k<-1 to math.abs(n)) {
      result*=x
    }
    result = 1/result
  }
  result
}
print(rep(3,0)) // expect 3^0 = 1
print(rep(3,2)) // expect 3^2 = 9
print(rep(3,3)) // expect 3^3 = 27
print(rep(2,-1)) // expect 2^-1 = 0.5

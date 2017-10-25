/** 2.3 Curry */

  def curry[A,B,C](f: (A, B) => C): A => (B => C) =
    a => b => f(a, b)

def curry2[A,B,C,D](f: (A, B, C) => D): A => B => (C ⇒ D) =
  a => b => c ⇒ f(a, b, c)


//an example where A and B are Ints and C is a Boolean
val testCurry = curry((x: Int, y: Int) => x>y)
val step1 = testCurry(10)
val step2 = step1(3) //which equates to true as 10 > 3


//List[String] example
val testCurry12 = curry((xs: List[String], xs2: List[String]) ⇒ xs.length > xs2.length)
val stepOne = testCurry12(List("hello", "world", "red", "blue"))
val stepTwo = stepOne(List("hello"))


val testCurry2 = curry2((x: Int, y: Int, z: Int) ⇒ (x+y)>z)
val stepOne2 = testCurry2(3)
val stepTwo2 = stepOne2(4)
val stepThree2 = stepTwo2(5)



//def partial1[A,B,C](a: A, f: (A,B) => C): B => C =
//    a => b => f(a, b)
//Exercise 2.2 Check if an Array is sorted

case class ArrayA(x: Int)
case class ArrayB(x: Int, y: Int)
case class ArrayC(x: Int, y: Int, z: Int)

def orderedFunc(a: Int, b: Int): Boolean = a>b
val array: Array[Int] = Array(1,2,3,4)

def isSorted[Int](as: Array[Int], ordered: (Int,Int) ⇒ Boolean): Boolean = {

  def go(as: Array[Int], n: Int, ordered: Boolean): Boolean = {

    if (as(n) == as(n+1))
    }
  go(array, 1, orderedFunc(1, 2))

}


//val array: Array[Int] = Array(1,2,3,4)
//array(3)



//def  ordered(a: Int, b: Int): Boolean = a>b
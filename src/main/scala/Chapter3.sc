sealed trait List[+A]

case object Nil extends List[Nothing]

//case class Cons[+Int](head: Int, tail: List[Int]) extends List[Int]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def apply[Int](as: Int*): List[Int] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
}


  val a = List(1, 2, 3, 4, 5) match {
  case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => (x + y)

}

def sum(ints: List[Int]): Int = ints match {
  case Nil => 0
  case Cons(x,xs) => x + sum(xs)
}

//Exercise 3.2
def tailFunction[A](l: List[A]): List[A] = l match
{
  case Nil ⇒ Nil
  case Cons(h, Nil) ⇒ Nil
  case Cons(a, b) ⇒ b
}

val l = List[Int](1)

tailFunction(l)

//Exercise 3.3
def drop[A](l: List[A], n: Int): List[A] = l match {
  case Nil ⇒ Nil
  case Cons(a, b) ⇒ n match {
      case 0 ⇒ l
      case _ ⇒ {
        drop(b, n-1)
      }
  }
}

val alist = List[Int](1,2,3,4,5,6)
drop(alist, 2)
drop(alist, 1)
drop(alist, 10)


//Exercise 3.4
def dropWhile[A](l: List[A])(f: A => Boolean): List[A] = l match {
  case Nil ⇒ Nil
  case Cons(a, b) ⇒ f(a) match {
    case false ⇒ l
    case true ⇒ {
      dropWhile(b)(f)
    }
  }
}

println("Drop While Exercise")
dropWhile(alist)(x ⇒ x < 2)




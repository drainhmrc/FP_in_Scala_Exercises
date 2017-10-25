//Exercise 2.1: Fibonacci

def fib(n: Int): Int = {
  def go(a: Int, b: Int): Int = {
    a + b
  }
  if (n <= 0) 0
  else go(n-1, n-2)
}


fib(50)

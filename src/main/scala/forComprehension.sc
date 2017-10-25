//incomplete

def multiplyByTWo(a: Int): Int = a*2
def minusOne(b: Int): Int = b - 1



def comprehend(x: Int): Int = for {
  i ← x*2
  j ← i
} yield {
  if (j > 10) j
}


comprehend(1)
comprehend(6)

def compose[A,B,C](f: A ⇒ B, g: B => C): A => C



def compose2[A,B,C](f:A=>B,g:B=>C) :A=>C=
  a => g(f(a))


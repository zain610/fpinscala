object MyModule {
    // Exercise 2: Implement a polymorphic function to check whether
  // an `Array[A]` is sorted
  def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean =
    @annotation.tailrec
    def go(n: Int): Boolean =
      if n >= as.length-1 then true
      else if gt(as(n), as(n+1)) then false
      else go(n+1)
    
    go(0)

  def compose[A,B,C](f: B => C, g: A => B): A => C =
    (a: A) => f(g(a))

  
  @main def main(): Unit = {
    // println(isSorted(Array(1,2,3), (a, b) => a > b))
    println(compose(((foo:Int) => foo*100), ((bar:Int) => bar + 5))(1))
  }
}

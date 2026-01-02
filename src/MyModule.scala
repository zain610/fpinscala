object MyModule {
  def abs(n: Int): Int = 
    if(n < 0) -n
    else n

  def fib(n: Int): Int = 
    def go(n: Int): Int =
      if(n == 0 || n ==1) n
      else go(n-1) + go(n-2)
    go(n)

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def main(args: Array[String]): Unit =
    println(formatAbs(-42))
}


/**
 * fib (0) -> 0
 * fib (1) -> 1
 * fib (2) -> fib(1) + fib(1)
 * fib (3) -> fib (2) + 
 * * fib (4) -> 
 *
 *
 *
 */

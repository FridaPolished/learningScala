object MyModule {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      if(n == 0) prev
      else loop(n -1, cur, prev + cur)
    
    loop(n, 0, 1)
  }
  
  private def formatFib(x: Int) = {
    val msg = "The nth fib value of %d"
    msg.format(x, fib(x))
  } 
  
  def main(args: Array[String]): Unit =
    println(formatFib(5))
  //printing only the return value of fib function
  //notice the args are defined always as strings ???
  //  def main(args: Array[String]): Unit =
  //   println(fib(5))
}
object MyModule {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {

   def go(n: Integer): Boolean =
      if(n >= as.length-1) true
      else if( ordered(as(n), as(n+1))) false
      go(n+1)
    go(0)
  }
}
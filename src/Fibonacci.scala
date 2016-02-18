/**
  *
  * User : Jamil Rzayev
  *
  * Fibonacci class solves the problem of finding n-th Fibonacci number
  * The algorithm takes n as a parameter for the index of the Fibonacci number to be found
  *
  * Date : 17/02/16
  *
  *
  */

object Fibonacci {

  def f(n : Int) : Int = {

    if (n <= 1) return 1;

    return f(n - 1) + f(n - 2);
  }

  def main(args: Array[String]) = {

    val inputs = new Array[Int](4);

    inputs(0) = 4;
    inputs(1) = 8;
    inputs(2) = 10;
    inputs(3) = 0;

    for (x <- inputs) {
      println(f(x));
    }

  }

}

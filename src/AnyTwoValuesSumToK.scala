/**
  *
  * User : Jamil Rzayev
  *
  * Problem  - find out if any two values in a given array sum up to a provided value K
  *
  * We use mutable Set[Int] as a container to keep the values we are passing over
  *
  * Date : 17/02/16
  *
  */

object AnyTwoValuesSumToK {

  def find(x : Array[Int], k: Int) : Boolean = {

    val len = x.length;

    var set : Set[Int] = Set();

    for (value <- x) {

      if (set.contains(k - value))
        return true;

      set += value;
    }

    return false;
  }

  def main(args : Array[String]): Unit = {

    val x = Array(-10, 3, 0, 5, 2);

    val k  = 8;

    println(find(x, k));
  }

}

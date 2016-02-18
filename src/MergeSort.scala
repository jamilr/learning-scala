/**
  *
  * User : Jamil Rzayev
  *
  * MergeSort implements classical merge sort algorithm for an input of array type
  *
  * Date : 17/02/16
  *
  *
  */

object MergeSort {

  def sort(x : Array[Int])  : Array[Int] = {

    val len = x.length;

    if (len <= 1) return x;

    if (len == 2) {

      if (x(1) < x(0)) {

        val c : Int = x(0);
        x(0) = x(1);
        x(1) = c;
      }

      return x;
    }

    val mid = len / 2;

    var left : Array[Int] = new Array[Int](mid);

    var right : Array[Int] = new Array[Int](len - mid);

    Array.copy(x, 0, left, 0, mid);

    Array.copy(x, mid, right, 0, len - mid);

    left = sort(left);

    right = sort(right);

    return merge(left, right);
  }

  private def merge(x : Array[Int], y : Array[Int]) : Array[Int] = {

    val xLen = x.length;
    val yLen = y.length;

    val zLen = xLen + yLen;

    val z: Array[Int] = new Array[Int](zLen);

    var i: Int = 0;
    var j: Int = 0;
    var k: Int = 0;

    while( i < xLen && j < yLen) {

      if (x(i) < y(j)) {
        z(k) = x(i);
        i += 1;
      } else {
        z(k) = y(j);
        j += 1;
      }

      k += 1;
    }

    while (i < xLen) {
      z(k) = x(i);
      k += 1;
      i += 1;
    }

    while (j < yLen) {
      z(k) = y(j);
      k += 1;
      j += 1;
    }

    return z;
  }

  def main(args : Array[String]) = {

    val x = Array( -10, -40, 0, 10, 200, 300, -100, 30, 0, 100000);

    val result = sort(x);

    result.foreach(println);
  }
}

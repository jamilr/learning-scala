/**
  *
  * User : Jamil Rzayev
  *
  * QuickSort implements classical Quick Sort algorithm for sorting provided integer values array in an ascending order
  *
  * Date : 17/02/16
  *
  *
  */

object QuickSort {

  def sort(x : Array[Int] , l : Int, h : Int): Array[Int] = {

     doSort(x, 0, x.length -1)
  }

  def doSort(x : Array[Int], l : Int, h : Int) : Array[Int] = {

    var i : Int = l;
    var j : Int = h;

    var mid : Int = l + (h - l) / 2;

    while (i <= j) {

      while (x(i) < x(mid))
        i += 1

      while (x(mid) < x(j))
        j -= 1

      if (i <= j) {
        swap(x, i, j)
        i += 1
        j -= 1
      }
    }

    if (i < h)
      doSort(x, i, h)

    if (l < j)
      doSort(x, l, j)

    return x;
  }

  def swap(x: Array[Int], i : Int, j: Int): Unit = {
    val c  = x(i)
    x(i) = x(j)
    x(j) = c
  }

  def main(args : Array[String]): Unit = {

    val x = Array( -10, -40, 0, 10, 200, 300, -100, 30, 0, 100000)

    val result = sort(x, 0 ,x.length - 1)

    result.foreach(println)
  }
}

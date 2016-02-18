import scala.collection.immutable.HashMap

/**
  *
  * User : Jamil Rzayev
  *
  * Construct the histogram of value frequencies given the provided array of integer values
  *
  * Map is used to hold key-value pairs where keys are unique numeric values and values are calculated frequencies
  *
  * Date : 17/02/16
  *
  *
  */

object Histogram {

  def histogram(x: Array[Int]) : Map[Int, Int] = {

    var histo : Map[Int, Int] = Map()

    for (value <- x)
      histo += (value -> (if (histo.contains(value)) histo.get(value).get + 1 else 1))  //Ternary operator in Scala is much more readable comprared to that of in Java

    return histo;
  }

  def main(args : Array[String]) = {

    val x = Array(-5, 0, -5, 0, 2, 3, 2, 3, 10, 8, 10, 9, 8, 9, 8, -5, 0);

    val h = histogram(x);

    h.foreach(println)

  }
}

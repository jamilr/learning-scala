/**
  * User : Jamil Rzayev
  * Date : 29/05/16
  */
object FunctionalCombinators {

  /**
    *
    * doubleTheValue function - multiplies the provided int value by 2
    *
    * */
  def doubleTheValue(x: Int) : Int = {
    x*2;
  }

  def main( args: Array[String]): Unit = {

    println("Map function")

    val list  = List(1,2,3,4,5,6)

    /**
      *
      * map is applied to multiple every element in the list by 2
      *
      * */
    val doubledValueList = list.map(doubleTheValue);

    doubledValueList.foreach(println);

    println("Flatten function")

    val listA = List(1,3,5,7,9)
    val listB = List(2,4,6,8,10)

    /**
      *
      * flatten merges two or K int lists into one list
      *
      * */
    val mergedList = List(listA, listB).flatten

    mergedList.foreach(println)

    println("flatMap function")

    /**
      *
      * flatMap merges two or K int lists into one list
      * After merge, flatMap applies map function to every element in the merged list
      *
      * */
    val appliedMergedList = List(listA, listB).flatMap(x => x.map(doubleTheValue));

    appliedMergedList.foreach(println);

    println("Find function")

    /**
      *
      * find finds the first element in the array that satisfies the conditions of the predicate function
      *
      * */
    val foundValue = list.find((i : Int) => i > 5)  //  the return value is equal to 7 as it is the first value in the array higher than 5

    println(foundValue)

    println("Zip function")

    val numbers = List(1,2,3,4,5)

    val characters = List("a", "b", "c", "d", "e")

    /**
      *
      * zip merges two lists of the different type values by concatenating one element from each list together and creating a list of tuples
      *
      * */
    val numCharLists = numbers.zip(characters)

    numCharLists.foreach(println)

    println("Filter function")

    /**
      *
      * filter returns a list of values that satisfy the condition of the predicate function provided
      *
      * */
    val filteredList = listA.filter((x : Int) => x %2 == 0)

    filteredList.foreach(println)

    println("Partition function")

    val exampleList = List(listA, listB).flatten

    /**
      *
      * partition function partitions the list with a respect to the predicate function
      *
      * */
    val twoLists = exampleList.partition((x : Int) => x % 2 == 0)

    val list_1 = twoLists._1  // even numbers only
    val list_2 = twoLists._2  // odd numbers only
  }

}

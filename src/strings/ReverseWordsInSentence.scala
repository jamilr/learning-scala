package strings

/**
  * User : Jamil Rzayev
  *
  *
  * Reverse words in a sentence
  *
  * Date : 18/04/16
  *
  *
  */
object ReverseWordsInSentence {

  def reverseWords(x : String) : String = {

    val charArray = x.toCharArray;

    val len = charArray.length;

    reverse(charArray, 0, len -1);

    var wordStartIdx : Int = -1;

    var wordEndIdx : Int = 0;

    var idx : Int = 0;

    while(idx < len) {

      if (charArray(idx) == ' ') {
        wordEndIdx = idx;
        reverse(charArray, wordStartIdx, wordEndIdx -1)
        wordStartIdx = -1
      } else if (wordStartIdx == -1)
        wordStartIdx = idx;

      idx += 1
    }

    reverse(charArray, wordStartIdx, len-1)

    return new String(charArray);
  }

  def reverse(cha : Array[Char], l : Int, h : Int) : Unit = {

    var i = l;

    var j = h;

    while( i < j ) {

      var c = cha(i)
      cha(i) = cha(j)
      cha(j) = c

      i += 1
      j -= 1
    }
  }


  def main(args : Array[String]) = {

    val str = "I am learning Scala";

    println(reverseWords(str))
  }
}

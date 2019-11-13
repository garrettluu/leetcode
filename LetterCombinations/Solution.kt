class Solution {
  fun letterCombinations(digits: String): List<String> {
    var l1 : List<String> = mutableListOf<String>();
    if (digits.length > 0) {
      l1 =  getLetters(digits[0])
    }

    for (i in 0 until digits.length-1) {
      val l2 = getLetters(digits[i + 1])

      l1 = crossConcat(l1, l2)
    }

    return l1;
  }

  fun getLetters(digit : Char) : MutableList<String> {
    when (digit) {
      '2' -> {
        return mutableListOf("a", "b", "c")
      }
      '3' -> {
        return mutableListOf("d", "e", "f")
      }
      '4' -> {
        return mutableListOf("g", "h", "i")
      }
      '5' -> {
        return mutableListOf("j", "k", "l")
      }
      '6' -> {
        return mutableListOf("m", "n", "o")
      }
      '7' -> {
        return mutableListOf("p", "q", "r", "s")
      }
      '8' -> {
        return mutableListOf("t", "u", "v")
      }
      '9' -> {
        return mutableListOf("w", "x", "y", "z")
      }
    }

    return mutableListOf("stupid");
  }

  fun crossConcat(l1 : List<String>, l2 : List<String>) : MutableList<String> {
    var result = mutableListOf<String>();
    l1.forEach{
      val l1val = it
      l2.forEach{
        result.add(l1val + it)
      }
    }
    return result;
  }
}

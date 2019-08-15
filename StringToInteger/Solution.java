class Solution {
  public int myAtoi(String str) {
    char firstChar = 0;
    int firstIndex = 0;
    int lastIndex = str.length();
    boolean negative = false;

    int result = 0;

    for (int i = 0; i < str.length(); i++) {
      //Discard characters until whitespace is found
      if (str.charAt(i) != ' ') {
        firstChar = str.charAt(i);
        firstIndex = i;
        break;
      }
    }

    //if firstChar is not a digit, conversion failed, return 0
    if (firstChar > 57 || firstChar < 48 &&
        firstChar != '+' && firstChar != '-') {
      return 0;
    } else if (firstChar == '-') {
      negative = true;
      firstIndex++;
    } else if (firstChar == '+') {
      negative = false;
      firstIndex++;
    }

    //Find where the number ends
    for (int i = firstIndex; i < str.length(); i++) {
      if (str.charAt(i) > 57 || str.charAt(i) < 48) {
        lastIndex = i;
        break;
      }
    }

    for (int j = 0; j < lastIndex; j++) {
      //Go backwards through the string and read the digits
      int k = lastIndex - j - 1;

      if (negative) {
        result -= digitToInt(str.charAt(k)) * Math.pow(10, j);
      } else {
        result += digitToInt(str.charAt(k)) * Math.pow(10, j);
      }
    }

    if (result > Integer.MAX_VALUE) {
      result = Integer.MAX_VALUE;
    } else if (result < Integer.MIN_VALUE) {
      result = Integer.MIN_VALUE;
    }

    return result;
  }

  public int digitToInt(char digit) {
    switch(digit) {
      case '0':
        return 0;
      case '1':
        return 1;
      case '2':
        return 2;
      case '3':
        return 3;
      case '4':
        return 4;
      case '5':
        return 5;
      case '6':
        return 6;
      case '7':
        return 7;
      case '8':
        return 8;
      case '9':
        return 9;
      default:
        return 0;
    } 
  }
}

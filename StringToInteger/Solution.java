class Solution {
  public int myAtoi(String str) {
    char firstChar;
    int firstIndex = 0;
    boolean negative = false;
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

    for (int j = firstIndex
    
    
  }
}

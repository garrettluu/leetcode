class Solution {
  public int romanToInt(String s) {
    //Keeps track of the current largest to tell if we should subtract or add
    int currentLargest = 1;

    //The result that accumulates and gets returned in the end
    int result = 0;

    //Parse string from right to left
    for (int i = s.length() - 1; i >= 0; i--) {
      char current = s.charAt(i);
      switch (current) {
        case 'I':
          if (currentLargest == 1) {
            result++;
          } else {
            result--;
          }
          break;
        case 'V':
          currentLargest = 5;
          result += 5;
          break;
        case 'X':
          if (currentLargest <= 10) {
            currentLargest = 10;
            result += 10;
          } else {
            result -= 10;
          }
          break;
        case 'L':
          currentLargest = 50;
          result += 50;
          break;
        case 'C':
          if (currentLargest <= 100) {
            currentLargest = 100;
            result += 100;
          } else {
            result -= 100;
          }
          break;
        case 'D':
          currentLargest = 500;
          result += 500;
          break;
        case 'M':
          if (currentLargest <= 1000) {
            currentLargest = 1000;
            result += 1000;
          } else {
            result -= 1000;
          }
          break;
      }
    }
    return result;
  }
}

class Solution {
  public String longestPalindrome(String s) {
    //Weird solution but I think it works:
    //GO BACKWARDS, find the first palindrome
    int stringLength = s.length();
    for (int i = stringLength; i > 0; i--) {
      for (int j = 0; j <= stringLength - i; j++) {
        String sub = s.substring(j, j + i);
        if (isPalindrome(sub)) {
          return sub;
        }
      }
    }

    return "";
  }

  //Returns true if s is a palindrome
  public boolean isPalindrome(String s) {
    int stringLength = s.length();
    int start = 0;
    int end = stringLength - 1;

    if (stringLength == 1 || stringLength == 0) {
      return true;
    }

    while (start < end) {

      if (s.charAt(0) == s.charAt(end)) {
        start++;
        end--;
        continue;
      }

      return false;
    }

    return true;
  }
}

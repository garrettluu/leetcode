class Solution {
  public boolean isPalindrome(int x) {
    //Easy solution:
    //Convert to string first, then find palindrome
    String intAsString = "" + x;

    return isPalindrome(intAsString);
  }

  //Returns true if s is a palindrome
  public boolean isPalindrome(String s) {
    int stringLength = s.length();
    int start = 0;
    int end = stringLength - 1;

    //Check characters from outside in
    while (start < end) {

      if (s.charAt(start) == s.charAt(end)) {
        start++;
        end--;
        continue;
      }

      return false;
    }

    return true;
  }

}

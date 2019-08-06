class Solution {
  public String longestPalindrome(String s) {
    String longest = "";
    //Naive solution:
    //Check all possible substrings for palindromes
    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j <= s.length(); j++) {
        String sub = s.substring(i, j);
        if (isPalindrome(sub)) {
          if (sub.length() > longest.length()) {
            longest = sub;
          }
        }
      }
    }

    return longest;
  }

  //Returns true if s is a palindrome
  public boolean isPalindrome(String s) {
    int stringLength = s.length();
    //Recursive solution
    //Check if first and last character are identical, removed them, then
    //call isPalindrome on the resulting substring
    if (stringLength == 1 || stringLength == 0) {
      return true;
    }

    //If first and last char are the same
    if (s.charAt(0) == s.charAt(stringLength - 1)) {
      return isPalindrome(s.substring(1, stringLength - 1));
    }

    return false;
  }
}

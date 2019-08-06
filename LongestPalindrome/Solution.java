class Solution {
  public String longestPalindrome(String s) {
    //Naive solution:
    //Check all possible substrings for palindromes
    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; i < s.length(); j++) {
        String sub = s.substring(i, j);
        isPalindrome(sub);
      }
    }
  }

  //Returns true if s is a palindrome
  public boolean isPalindrome(String s) {
    //Recursive solution
    //Check if first and last character are identical, removed them, then
    //call isPalindrome on the resulting substring
  }
}

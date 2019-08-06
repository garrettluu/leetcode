class Solution {
  public int lengthOfLongestSubstring(String s) {
    String current = "";
    String longest = "";
    for (int i = 0; i < s.length(); i++) {
      if (!current.contains("" + s.charAt(i))) {
        current += s.charAt(i);
      } else {
        current = "" + s.charAt(i);
      }
    }
    return current.length();
  }
}

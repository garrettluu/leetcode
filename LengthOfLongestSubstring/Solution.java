class Solution {
  public int lengthOfLongestSubstring(String s) {
    String current = "";
    String longest = new String();

    for (int i = 0; i < s.length(); i++) {
      current = "" + s.charAt(i);
      for (int j = i + 1; j < s.length(); j++) {
        if (!current.contains("" + s.charAt(j))) {
          current += s.charAt(j);
        } else {
          current = "" + s.charAt(j);
        }

        if (current.length() > longest.length()) {
          longest = new String(current);
        }
      }
    }
    return longest.length();
  }
}

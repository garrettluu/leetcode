class Solution {
  public int lengthOfLongestSubstring(String s) {
    HashSet<Character> current = new HashSet<>();
    int i = 0;
    int j = 0;
    int result = 0;
    while (i < s.length() && j < s.length) {
      if (!current.contains(s.charAt(j)) {
        current.add(s.charAt(j));
        j++;
        result = (j - i > result) ? j - i : result;
      } else {
        current.remove(s.charAt(i));
        i++;
      }
    }

    return result;
  }
}

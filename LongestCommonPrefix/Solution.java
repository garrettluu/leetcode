class Solution {
  public String longestCommonPrefix(String[] strs) {
    //Base case: if no strings in array, return empty string
    if (strs.length == 0) {
      return "";
    }

    //Start with the first string and compare it
    String common = strs[0];

    int end = common.length();

    //Start scanning
    for (int i = 1; i < strs.length; i++) {
      //if the prefix is not found
      while (strs[i].indexOf(common) != 0) {
        //Shrink the common prefix and scan again
        end--;
        common = common.substring(0, end);
      }
    }

    return common;

  }
}

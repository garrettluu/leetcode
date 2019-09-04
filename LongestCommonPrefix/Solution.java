class Solution {
  public String longestCommonPrefix(String[] strs) {
    //IDEA:
    //Scan all strings simultaneously!
    //Keep going until we find a different char

    //First, find longest string
    int longestStringLength = 0;
    for (int i = 0; i < strs.length; i++) {
      if (strs[i].length() > longestStringLength) {
        longestStringLength = strs[i].length();
      }
    }

    String common = "";

    //Start scanning
    for (int i = 0; i < longestStringLength; i++) {
      for (int j = 0; j < strs.length; j++) {
        //How to compare characters?
      }
    }


  }
}

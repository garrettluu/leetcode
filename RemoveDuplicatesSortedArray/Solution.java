class Solution {
  public int removeDuplicates(int[] nums) {
    int origLength = nums.length;
    int deleted = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      //If we found a duplicate
      if (nums[i] == nums[i+1]) {
        int j = i + 1;
        //Keep going until we stop finding duplicates
        while (nums[j] == nums[j-1]) {
          j++;
        }
        
        
      }
    }
  }
}

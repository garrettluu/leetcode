class Solution {
  public int removeDuplicates(int[] nums) {
    int length = nums.length;
    for (int i = 0; i < length - 1; i++) {
      int deletedNow = 0;
      //If we found a duplicate
      if (nums[i] == nums[i+1]) {
        int j = i + 1;
        //Keep going until we stop finding duplicates
        while (j < length && nums[j] == nums[j-1]) {
          j++;
          deletedNow++;
        }

        //Move elements over
        int l = 1;
        for (int k = j; k < length; k++) {
          nums[i+l] = nums[k];
          l++;
        }

        //Update length of array
        length -= deletedNow;
      }
    }
    return length;
  }
}

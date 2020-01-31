class Solution {
  public int rob(int[] nums) {
    //dynamic programming
    if (nums.length == 0) {
      return 0;
    }

    if (nums.length == 1) {
      return nums[0];
    }

    int[] maxSums = nums.clone();

    maxSums[1] = Math.max(nums[0], nums[1]);

    for (int i = 2; i < nums.length; i++) {
      //Solving subproblems
      //Our target is always changing
      maxSums[i] = Math.max(maxSums[i-1], maxSums[i-2] + nums[i]);
    }

    return maxSums[nums.length - 1];
  }
}

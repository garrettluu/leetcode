class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    //Brute force solution?
    //Need a way to avoid duplicates
    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        for (int k = j; k < nums.length; k++) {
          if (nums[i] + nums[j] + nums[k] == 0) {
            List<Integer> triplet = new ArrayList<>();
            triplet.add(nums[i]);
            triplet.add(nums[j]);
            triplet.add(nums[k]);
            result.add(triplet);
          }
        }
      }
    }

    return result;
  }
}

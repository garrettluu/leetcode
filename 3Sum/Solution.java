class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    //Brute force solution?
    for (int i = 0; i < nums.length - 2; i++) {
      for (int j = i + 1; j < nums.length - 1; j++) {
        for (int k = j + 1; k < nums.length; k++) {
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

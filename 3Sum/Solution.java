class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    int n = nums.length;
    for (int i = 0; i < n - 1; i++) {
      int left = i + 1;
      int right = n - 1;
      while (left < right) {
        if (nums[i] == -(nums[left] + nums[right])) {
          List<Integer> triplet = new ArrayList<>();
          triplet.add(nums[i]);
          triplet.add(nums[left]);
          triplet.add(nums[right]);
          result.add(triplet);
        }
        left++;
      }

      left = i + 1;
      right = i + 2;
      while (right < n - 1) {
        if (nums[i] == -(nums[left] + nums[right])) {
          List<Integer> triplet = new ArrayList<>();
          triplet.add(nums[i]);
          triplet.add(nums[left]);
          triplet.add(nums[right]);
          result.add(triplet);
        }
        right++;
      }
    }
    return result;
  }
}

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        break;
      }
      int target = -nums[i];
      List<List<Integer>> sum = twoSum(nums, target, i + 1);
      if (sum != null) {
        for (List<Integer> pair : sum) {
          List<Integer> triplet = new ArrayList<>();
          triplet.add(-target);
          triplet.addAll(pair);
          if (!tripletIsInList(triplet, result)) {
            result.add(triplet);
          }
        }
      }
    }
    return result;
  }

  private List<List<Integer>> twoSum(int[] nums, int target, int start) {
    List<List<Integer>> result = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = start; i < nums.length; i++) {
      map.put(nums[i], i);
    }

    for (int i = start; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement) && map.get(complement) != i) {
        Integer[] pair = {complement, nums[i]};
        List<Integer> pairList = Arrays.asList(pair);
        result.add(pairList);
      }
    }

    if (result.size() == 0) {
      return null;
    }
    return result;
  }

  private boolean tripletIsInList(List<Integer> triplet,
      List<List<Integer>> list) {
    Collections.sort(triplet);
    return list.contains(triplet);
  }
}

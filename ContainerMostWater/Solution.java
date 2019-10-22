class Solution {
  public int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;

    int leftBest = left;
    int rightBest = right;

    int areaBest = Math.abs((left - right) *
        Math.min(height[left], height[right]));

    while (left < right) {
      int area = Math.abs((left - right) *
          Math.min(height[left], height[right]));
      if (area > areaBest) {
        areaBest = area;
      }
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }

    return areaBest;
  }
}

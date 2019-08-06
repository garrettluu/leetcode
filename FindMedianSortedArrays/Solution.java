/*
 * Finds the median of all ints in both array
 *
 * Runtime MUST be O(log(n + m)), in which n and m are the sizes of the arrays
 */
class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //Merge-sort algorithm, then find median
    int[] mergeSorted = new int[nums1.length + nums2.length];

    for (int i = 0; i < nums1.length; i++) {

    }
    
    //We can find median solely based on index in sorted array
    return medianOf(mergeSorted);
  }

  public double medianOf(int[] array) {
    //If we have an even-sized array
    if (array.length % 2 == 0) {
      return (array[array.length / 2] + array[array.length / 2 - 1]) / 2;
    }
    //If we have an odd-sized array
    else {
      return array[(array.length - 1) / 2];
    }
  }
}

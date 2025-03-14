package Median_of_Two_Sorted_Arrays;

class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n = nums1.length;
    int m = nums2.length;
    if (n > m) {
      return findMedianSortedArrays(nums2, nums1);
    }
    int start = 0;
    int end = n;
    while (start <= end) {
      int i = start + (end - start) / 2;
      int j = (n + m + 1) / 2 - i;
      int maxLeft1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
      int minRight1 = (i == n) ? Integer.MAX_VALUE : nums1[i];
      int maxLeft2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
      int minRight2 = (j == m) ? Integer.MAX_VALUE : nums2[j];
      if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
        if ((n + m) % 2 == 0) {
          return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
        } else {
          return Math.max(maxLeft1, maxLeft2);
        }
      } else if (maxLeft1 > minRight2) {
        end = i - 1;
      } else {
        start = i + 1;
      }
    }
    return 0.0;
  }
}
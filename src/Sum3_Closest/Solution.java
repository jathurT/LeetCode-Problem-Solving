package Sum3_Closest;

import java.util.Arrays;

class Solution {
  public int threeSumClosest(int[] nums, int target) {
    int currentSum = Integer.MAX_VALUE;
    int minDifference = Integer.MAX_VALUE;
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      int left = i + 1, right = nums.length - 1;
      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        int diff = Math.abs(target - sum);

        if (diff < minDifference) {
          minDifference = diff;
          currentSum = sum;
        }

        if (sum < target) {
          left++;
        } else if (sum > target) {
          right--;
        } else {
          return currentSum;
        }
      }
    }
    return currentSum;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {4, 0, 5, -5, 3, 3, 0, -4, -5};
    int target = -2;
    int result = solution.threeSumClosest(nums, target);
    System.out.println("The closest sum to " + target + " is: " + result);
  }
}
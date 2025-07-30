package Range_Sum_Query;

class NumArray {

  private int[] prefixSum;

  public NumArray(int[] nums) {
    int n = nums.length;
    prefixSum = new int[n + 1];
    for (int i = 0; i < n; i++) {
      prefixSum[i + 1] = prefixSum[i] + nums[i];
    }
  }

    public int sumRange(int left, int right) {
    if (left == 0) {
      return prefixSum[right + 1];
    }
    return prefixSum[right + 1] - prefixSum[left];
  }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
// Example usage:
public class Solution {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5};
    NumArray numArray = new NumArray(nums);
    System.out.println(numArray.sumRange(0, 3));
  }
}
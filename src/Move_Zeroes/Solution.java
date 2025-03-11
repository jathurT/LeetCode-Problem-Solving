package Move_Zeroes;

class Solution {
  public void moveZeroes(int[] nums) {
    int i = 0;
    for (int num : nums) {
      if (num != 0) {
        nums[i++] = num; // i++ is incrementing i after assigning the value
      }
    }
    while (i < nums.length) {
      nums[i++] = 0;
    }
  }
}



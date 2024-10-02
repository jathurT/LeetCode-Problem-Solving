package Majority_Element;

// Boyer-Moore Voting Algorithm
//The main idea is that non-majority elements are "canceled out" by majority
// elements. Because the majority element appears more than n / 2 times,
// it will always survive the canceling process and be left as the
// candidate in the end.
class Solution {
  public int majorityElement(int[] nums) {
    int count = 0;
    int candidate = 0;
    for (int num : nums) {
      if (count == 0) {
        candidate = num;
      }
      count += (num == candidate) ? 1 : -1;
    }
    return candidate;
  }
}
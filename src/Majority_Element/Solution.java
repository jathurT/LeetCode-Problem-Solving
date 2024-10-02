package Majority_Element;

import java.util.HashMap;
import java.util.Map;

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

// Time Complexity: O(n)
class Solution1 {
  public int majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }
    for (int num : nums) {
      if (map.get(num) > nums.length / 2) {
        return num;
      }
    }
    return -1;
  }
}
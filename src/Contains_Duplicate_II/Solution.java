package Contains_Duplicate_II;

// Naive Approach - Consider Sub-arrays Starting From Every Index
// Time Complexity: O(n^2)
//class Solution {
//  public boolean containsNearbyDuplicate(int[] nums, int k) {
//    int n = nums.length;
//    for (int i = 0; i < n; i++) {
//      for (int j = i + 1; j < n; j++) {
//        if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
//          return true;
//        }
//      }
//    }
//    return false;
//  }
//}


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// Optimized Sliding Window Approach
// Time Complexity: O(n)
class Solution {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    int n = nums.length;
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
      if (set.contains(nums[i])) {
        return true;
      }
      set.add(nums[i]);
      if (set.size() > k) {
        set.remove(nums[i - k]);
      }
    }
    return false;
  }
}

// Approach 3: Using HashMap
//class Solution {
//  public boolean containsNearbyDuplicate(int[] nums, int k) {
//    HashMap<Integer, Integer> map = new HashMap<>();
//    for (int i = 0; i < nums.length; i++) {
//      if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
//        return true;
//      }
//      map.put(nums[i], i);
//    }
//    return false;
//  }
//}

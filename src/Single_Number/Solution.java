package Single_Number;

import java.util.HashMap;
import java.util.Map;

// Time Complexity: O(n)
class Solution {
  public int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (int num : nums) {
      if (map.get(num) == 1) {
        return num;
      }
    }
    return -1;
  }
}

// Time Complexity: O(n)
class Solution1 {
  public int singleNumber(int[] nums) {
    Map<Integer, Integer> hashMap = new HashMap<>();
    for (int num : nums) {
      hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
    }
    return  hashMap.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(-1);
  }
}

// Time Complexity: O(n)
class Solution3 {
  static int xor(int n,int[] nums) {
    if(n >= nums.length) return 0;
    return nums[n] ^ xor(n+1,nums);
  }
  public int singleNumber(int[] nums) {
    return xor(0, nums);
  }
}
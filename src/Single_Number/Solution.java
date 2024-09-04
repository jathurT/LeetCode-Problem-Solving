package Single_Number;

import java.util.HashMap;
import java.util.Map;

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
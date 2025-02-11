package Valid_Anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Approach 1: Using HashMap
//class Solution {
//  public boolean isAnagram(String s, String t) {
//    Map<Character, Integer> map = new HashMap<>();
//    for (char c : s.toCharArray()) {
//      map.put(c, map.getOrDefault(c, 0) + 1);
//    }
//    for (char c : t.toCharArray()) {
//      map.put(c, map.getOrDefault(c, 0) - 1);
//    }
//    for (int count : map.values()) {
//      if (count != 0) {
//        return false;
//      }
//    }
//    return true;
//  }
//}

// Approach 2: Using Array sorting
class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    char[] sArray = s.toCharArray();
    char[] tArray = t.toCharArray();
    Arrays.sort(sArray);
    Arrays.sort(tArray);
    return Arrays.equals(sArray, tArray);
  }
}
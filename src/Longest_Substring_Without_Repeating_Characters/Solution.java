package Longest_Substring_Without_Repeating_Characters;

//class Solution {
//  public int lengthOfLongestSubstring(String s) {
//    int n = s.length();
//    int ans = 0;
//    int[] index = new int[128];
//    for (int j = 0, i = 0; j < n; j++) {
//      i = Math.max(index[s.charAt(j)], i);
//      ans = Math.max(ans, j - i + 1);
//      index[s.charAt(j)] = j + 1;
//    }
//    return ans;
//  }
//}


import java.util.HashSet;
import java.util.Set;

/// / Naive Approach - Consider Substrings Starting From Every Index
//class Solution {
//  public int lengthOfLongestSubstring(String s) {
//    int n = s.length();
//    int res = 0;
//    for (int i = 0; i < n; i++) {
//      Set<Character> visited = new HashSet<>();
//      for (int j = i; j < n; j++) {
//        if (visited.contains(s.charAt(j))) {
//          break;
//        } else {
//          res = Math.max(res, j - i + 1);
//          visited.add(s.charAt(j));
//        }
//      }
//    }
//    return res;
//  }
//}


// Optimized Sliding Window Approach
class Solution {
  public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int res = 0;
    Set<Character> visited = new HashSet<>();
    int left = 0, right = 0;
    while (right < n) {
      while (visited.contains(s.charAt(right))) {
        visited.remove(s.charAt(left));
        left++;
      }
      visited.add(s.charAt(right));
      res = Math.max(res, right - left + 1);
      right++;
    }
    return res;
  }
}
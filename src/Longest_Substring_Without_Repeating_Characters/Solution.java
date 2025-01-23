package Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int ans = 0;
    int[] index = new int[128];
    for (int j = 0, i = 0; j < n; j++) {
      i = Math.max(index[s.charAt(j)], i);
      ans = Math.max(ans, j - i + 1);
      index[s.charAt(j)] = j + 1;
    }
    return ans;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.lengthOfLongestSubstring("abcabcbb")); // 3
  }
}


//import java.util.HashSet;
//import java.util.Set;

//// Naive Approach - Consider Substrings Starting From Every Index
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
//          visited.add(s.charAt(j));
//        }
//      }
//      res = Math.max(res, visited.size());
//    }
//    return res;
//  }
//}


//// Optimized Sliding Window Approach
//class Solution {
//  public int lengthOfLongestSubstring(String s) {
//    int n = s.length();
//    int res = 0;
//    Set<Character> visited = new HashSet<>();
//    int left = 0, right = 0;
//    while (right < n) {
//      while (visited.contains(s.charAt(right))) {
//        visited.remove(s.charAt(left));
//        left++;
//      }
//      visited.add(s.charAt(right));
//      res = Math.max(res, right - left + 1);
//      right++;
//    }
//    return res;
//  }
//}
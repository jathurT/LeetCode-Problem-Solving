package Isomorphic_Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
//  Approach 1
//  public boolean isIsomorphic(String s, String t) {
/// /    Approach 1.1
/// /    Consume the runtime less
//
//    int[] sMap = new int[256];
//    int[] tMap = new int[256];
//    for (int i = 0; i < s.length(); i++) {
//      char sChar = s.charAt(i);
//      char tChar = t.charAt(i);
//      if (sMap[sChar] != tMap[tChar]) {
//        return false;
//      }
//      sMap[sChar] = i + 1;
//      tMap[tChar] = i + 1;
//    }
//    return true;

  /// /   Approach 1.2
  /// /    Consume the runtime more than 1.1 as it uses List
//
//    List<Integer> sMap = new ArrayList<>();
//      List<Integer> tMap = new ArrayList<>();
//      for (int i = 0; i < s.length(); i++) {
//        char sChar = s.charAt(i);
//        char tChar = t.charAt(i);
//        if (sMap.indexOf((int) sChar) != tMap.indexOf((int) tChar)) {
//          return false;
//        }
//        sMap.add((int) sChar);
//        tMap.add((int) tChar);
//
//    }
//    return true;
//}


//  Approach 2
// Using Mapping
  public boolean isIsomorphic(String s, String t) {
    return isIsomorphicHelper(s, t) && isIsomorphicHelper(t, s);
  }

  public boolean isIsomorphicHelper(String s, String t){
    Map<Character, Character> sMap = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);
      if (sMap.containsKey(sChar)) {
        if (sMap.get(sChar) != tChar) {
          return false;
        }
      } else {
        sMap.put(sChar, tChar);
      }
    }
    return true;
  }

}
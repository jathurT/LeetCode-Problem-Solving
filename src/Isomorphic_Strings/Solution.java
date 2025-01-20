package Isomorphic_Strings;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public boolean isIsomorphic(String s, String t) {
    int[] sMap = new int[256];
    int[] tMap = new int[256];
    for (int i = 0; i < s.length(); i++) {
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);
      if (sMap[sChar] != tMap[tChar]) {
        return false;
      }
      sMap[sChar] = i + 1;
      tMap[tChar] = i + 1;
    }
    return true;

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
  }
}
package Longest_Palindromic_Substring;


// Brute Force Approach
class Solution {
  public String longestPalindrome(String s) {
    int n = s.length();
    String res = "";
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j <= n; j++) {
        String sub = s.substring(i, j);
        if (isPalindrome(sub) && (sub.length() > res.length())) {
          res = sub;
        }
      }
    }
    return res;
  }

  private boolean isPalindrome(String sub) {
//    int i = 0, j = sub.length() - 1;
//    while (i < j) {
//      if (sub.charAt(i) != sub.charAt(j)) {
//        return false;
//      }
//      i++;
//      j--;
//    }
//    return true;
    return new StringBuilder(sub).reverse().toString().equals(sub);
  }
}
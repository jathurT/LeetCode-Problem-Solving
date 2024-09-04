package Valid_Palindrome;


// Time Complexity: O(n)
//Method: Two pointers
class Solution {
  public boolean isPalindrome(String s) {
    String result = convertToLowerCase(s);
    int left = 0;
    int right = result.length() - 1;
    while (left < right) {
      if (result.charAt(left) != result.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  private String convertToLowerCase(String s) {
    return s.replaceAll("[^A-za-z0-9]", "").toLowerCase();
  }
}

// Time Complexity: O(n)
class Solution1 {
  public boolean isPalindrome(String s) {
    int r = s.length() - 1;
    int l = 0;
    char rc;
    char lc;
    while (l < r) {
      lc = s.charAt(l);
      rc = s.charAt(r);
      if (lc >= 'A' && lc <= 'Z') lc += 32;
      if (rc >= 'A' && rc <= 'Z') rc += 32;
      if (isAlNum(lc)) {
        l++;
        continue;
      }
      if (isAlNum(rc)) {
        r--;
        continue;
      }
      if (lc != rc) {
        return false;
      } else {
        l++;
        r--;
      }
    }
    return true;
  }

  public static boolean isAlNum(char ch) {
    return (ch < '0' || ch > '9') && (ch < 'a' || ch > 'z');
  }
}
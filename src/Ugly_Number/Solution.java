package Ugly_Number;

class Solution {
  public boolean isUgly(int n) {
    if (n <= 0) {
      return false;
    }
    if (n == 1) {
      return true;
    }
    for (int i : new int[]{2, 3, 5}) {
      while (n % i == 0) {
        n /= i;
      }
    }
    return n == 1;
  }
}
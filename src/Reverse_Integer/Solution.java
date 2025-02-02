package Reverse_Integer;

class Solution {
  public int reverse(int x) {
    int result = 0;
    while (x != 0) {
      int pop = x % 10;
      x /= 10;
//      Max value of an integer is 2^31 - 1 = 2147483647
      if ((result > Integer.MAX_VALUE / 10) ||
          ((result == Integer.MAX_VALUE / 10) &&
              (pop > 7)))
        return 0;
//      Min value of an integer is -2^31 = -2147483648
      if ((result < Integer.MIN_VALUE / 10) ||
          ((result == Integer.MIN_VALUE / 10) &&
              (pop < -8)))
        return 0;
      result = result * 10 + pop;
    }
    return result;
  }
}
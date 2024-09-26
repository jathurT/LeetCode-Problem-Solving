package Rod_Cutting;


// Recursive solution
// Time Complexity: O(2^n)
public class Solution {
  int rodCutting(int[] price, int n) {
    if (n <= 0) {
      return 0;
    }
    int max_val = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      max_val = Math.max(max_val, price[i] + rodCutting(price, n - i - 1));
    }
    return max_val;
  }
}

// Memorized Recursive solution
class Solution1 {
  int rodCutting(int[] price, int n) {
    int[] val = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      val[i] = Integer.MIN_VALUE;
    }
    return rodCutting(price, n, val);
  }

  int rodCutting(int[] price, int n, int[] val) {
    if (n <= 0) {
      return 0;
    }
    if (val[n] != Integer.MIN_VALUE) {
      return val[n];
    }
    int max_val = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      max_val = Math.max(max_val, price[i] + rodCutting(price, n - i - 1, val));
    }
    val[n] = max_val;
    return max_val;
  }
}
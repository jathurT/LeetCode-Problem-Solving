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
//    Avoiding Index Out of Bounds Exception
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

// Dynamic Programming solution
// Bottom-up approach
// Time Complexity: O(n^2)
class Solution2 {
  int rodCutting(int[] price, int n) {
    int[] val = new int[n + 1];
    val[0] = 0;

    for (int i = 1; i <= n; i++) {
      int max_val = Integer.MIN_VALUE;
      for (int j = 0; j < i; j++) {
        max_val = Math.max(max_val, price[j] + val[i - j - 1]);
      }
      val[i] = max_val;
    }
    return val[n];
  }
}

// Dynamic Programming solution
// Unbounded Knapsack approach
// Time Complexity: O(n^2)
class Solution3 {
  int usingUnboundedKnapsack(int[] prices, int n) {
    int[] dp = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < prices.length; j++) {
        if (j + 1 <= i) {
          dp[i] = Math.max(dp[i], dp[i - (j + 1)] + prices[j]);
        }
      }
    }
    return dp[n];
  }
}
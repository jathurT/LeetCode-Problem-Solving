package Coin_Change;

import java.util.Arrays;

// Time Complexity: O(n * m)
class Solution {
  public int coinChange(int[] coins, int amount) {
    if (amount < 0)
      return 0;
    int[] minCoinsDP = new int[amount + 1];
    for (int i = 1; i <= amount; i++) {
      minCoinsDP[i] = Integer.MAX_VALUE;
      for (int coin : coins) {
        if (coin <= i && minCoinsDP[i - coin] != Integer.MAX_VALUE)
          minCoinsDP[i] = Math.min(minCoinsDP[i], 1 + minCoinsDP[i - coin]);
      }
    }
    if (minCoinsDP[amount] == Integer.MAX_VALUE)
      return -1;
    return minCoinsDP[amount];
  }
}

//recursion (top-down approach)
//TC = O(n^amount)
//n = length of coins array

class Solution1 {
  public int coinChange(int[] coins, int amount) {

    int ans = coinCount(coins, amount);
    return (ans == Integer.MAX_VALUE) ? -1 : ans;
  }

  int coinCount(int[] coins, int amount) {

    if (amount == 0) {
      return 0;
    }
    if (amount < 0) {
      return Integer.MAX_VALUE;
    }

    int minCoins = Integer.MAX_VALUE;

    for (int coin : coins) {
      int ans = coinCount(coins, amount - coin);

      if (ans != Integer.MAX_VALUE) {
        //we have returned 0 in ans, so now we are updating the ans count
        //hence 1 + ans
        minCoins = Math.min(minCoins, 1 + ans);
      }
    }
    return minCoins;
  }
}

//recursion with memoization (top-down approach)
//TC = O(n*amount)
//SC = O(amount)
class Solution2 {

  int[] dp;

  public int coinChange(int[] coins, int amount) {

    dp = new int[amount + 1];
    Arrays.fill(dp, -1);
    int ans = coinCount(coins, amount);
    return (ans == Integer.MAX_VALUE) ? -1 : ans;
  }

  int coinCount(int[] coins, int amount) {

    if (amount == 0) {
      return 0;
    }
    if (amount < 0) {
      return Integer.MAX_VALUE;
    }

    if (dp[amount] != -1) {
      return dp[amount];
    }

    int minCoins = Integer.MAX_VALUE;
    for (int coin : coins) {
      int ans = coinCount(coins, amount - coin);

      if (ans != Integer.MAX_VALUE) {

        //we have returned 0 in ans, so now we are updating the ans count
        //hence 1 + ans
        minCoins = Math.min(minCoins, 1 + ans);
      }
    }
    return dp[amount] = minCoins;
  }
}


//tabulation method (bottom-up approach)
//TC = O(n*amount)
//SC = O(amount)

class Solution3 {

  public int coinChange(int[] coins, int amount) {

    int[] dp = new int[amount + 1];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    for (int i = 1; i <= amount; i++) {
      for (int coin : coins) {

        if (i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
          dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
        }
      }
    }
    return (dp[amount] == Integer.MAX_VALUE) ? -1 : dp[amount];
  }
}

//tabulation method cannot be further space optimised in this case
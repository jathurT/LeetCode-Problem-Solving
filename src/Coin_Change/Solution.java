package Coin_Change;

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
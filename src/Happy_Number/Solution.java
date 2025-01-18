package Happy_Number;

class Solution {
  public boolean isHappy(int n) {
    int slow = n;
    int fast = n;
    do {
      slow = digitSquareSum(slow);
      fast = digitSquareSum(fast);  // Floyd's Cycle Detection Algorithm  (Tortoise and Hare)
      fast = digitSquareSum(fast);
    } while (slow != fast);
    return slow == 1;
  }

  private int digitSquareSum(int slow) {
    int sum = 0;
    while (slow != 0) {
      int digit = slow % 10;
      sum += digit * digit;
      slow /= 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.isHappy(19));
  }
}
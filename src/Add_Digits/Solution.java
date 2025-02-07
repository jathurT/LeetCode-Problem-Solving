package Add_Digits;

class Solution {
  public int addDigits(int num) {
    return 1 + (num - 1) % 9;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.addDigits(38));
  }
}
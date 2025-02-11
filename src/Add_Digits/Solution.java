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


// Approach 1 - Iterative
//class Solution {
//  public int addDigits(int num) {
//    while (num >= 10) {
//      int sum = 0;
//      while (num != 0) {
//        sum += num % 10;
//        num /= 10;
//      }
//      num = sum;
//    }
//    return num;
//  }
//
//  public static void main(String[] args) {
//    Solution solution = new Solution();
//    System.out.println(solution.addDigits(38));
//  }
//}
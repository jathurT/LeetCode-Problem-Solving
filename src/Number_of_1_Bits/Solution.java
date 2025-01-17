package Number_of_1_Bits;

class Solution {
  public int hammingWeight(int n) {
    int count = 0;
    while (n != 0) {
      count += n & 1; // n & 1 is the last bit of n
      n >>>= 1; // shift n to the right by 1 bit
    }
    return count;
  }
}
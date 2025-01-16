package Reverse_Bits;

public class Solution {
  // you need treat n as an unsigned value
  public int reverseBits(int n) {
    int result = 0;
    for (int i = 0; i < 32; i++) {
      result = (result << 1) | (n & 1); // n & 1 is the last bit of n and result << 1 means shift result to the left by 1 bit
      n >>= 1; // shift n to the right by 1 bit
    }
    return result;
  }
}
package String_to_Integer;

class Solution {
  public int myAtoi(String s) {
    s = s.trim(); // Remove leading and trailing whitespace
    if (s.isEmpty()) {
      return 0; // Return 0 if the string is empty after trimming
    }

    int sign = 1; // Default sign is positive
    int index = 0; // Start index for parsing
    long result = 0; // Use long to handle overflow

    // Check for optional sign
    if (s.charAt(index) == '-') {
      sign = -1;
      index++;
    } else if (s.charAt(index) == '+') {
      index++;
    }

    // Parse digits
    while (index < s.length() && Character.isDigit(s.charAt(index))) {
      result = result * 10 + (s.charAt(index) - '0');
      index++;

      // Check for overflow
      if (result * sign > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
      if (result * sign < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
    }

    return (int) (result * sign); // Return the final result with the correct sign

  }

  public static void main(String[] args) {
    String input = "   -42";
    System.out.println(input.length());
  }
}
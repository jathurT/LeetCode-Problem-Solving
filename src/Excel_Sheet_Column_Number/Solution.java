package Excel_Sheet_Column_Number;

import java.util.Scanner;

class Solution {
  public int titleToNumber(String columnTitle) {
    Scanner scanner = new Scanner(columnTitle);
    scanner.useDelimiter("");
    int result = 0;
    while (scanner.hasNext()) {
      result = result * 26 + (scanner.next().charAt(0) - 'A' + 1);
    }
    return result;
  }
}
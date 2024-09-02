package Pascals_Triangle_II;

import java.util.ArrayList;
import java.util.List;


// Time Complexity: O(n^2)
class Solution {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> row = new ArrayList<>();
    row.add(0, 1);
    for (int i = 1; i <= rowIndex; i++) {
      for (int j = i - 1; j > 0; j--) {
        row.set(j, row.get(j) + row.get(j - 1));
      }
      row.add(1);
    }
    return row;
  }
}

// Time Complexity: O(n)
class Solution1 {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> row = new ArrayList<>();
    long res = 1;
    row.add(1);
    int n = rowIndex + 1;
    if (rowIndex == 0) {
      return row;
    } else {
      for (int i = 1; i < n; i++) {
        res = res * (n - i) / i;
        row.add((int) res);
      }
      return row;
    }
  }
}
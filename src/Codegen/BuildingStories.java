package Codegen;

public class BuildingStories {
  public static int countArrangements(int n) {
    if (n == 1)
      return 1;
    if (n == 2)
      return 2;

    int prev1 = 2, prev2 = 1, current = 0;

    for (int i = 3; i <= n; i++) {
      current = prev1 + prev2;
      prev2 = prev1;
      prev1 = current;
    }

    return current;
  }

  public static void main(String[] args) {
    int stories = 10;  // Example input
    System.out.println("Possible arrangements: " + countArrangements(stories));
    // Output: Possible arrangements: 89
  }
}

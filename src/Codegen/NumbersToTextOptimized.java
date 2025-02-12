package Codegen;

public class NumbersToTextOptimized {
  public static String numbersToLetters(String input) {
    StringBuilder result = new StringBuilder();

    // Split words by '+'
    String[] words = input.split("\\+");

    for (String word : words) {
      if (!result.isEmpty()) result.append(" "); // Add space between words

      // Convert each number to a letter
      for (String numStr : word.trim().split(" ")) {
        result.append((char) ('A' + Integer.parseInt(numStr) - 1));
      }
    }
    return result.toString();
  }

  public static void main(String[] args) {
    String input = "20 5 19 20+4 15 13 5";
    System.out.println(numbersToLetters(input)); // Output: TEST DOME
  }
}

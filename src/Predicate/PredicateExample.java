package Predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Predicate<Integer> isEven = num -> num % 2 == 0;
    List<Integer> evenNumbers = numbers.stream().filter(isEven).toList();
    System.out.println("Even numbers: " + evenNumbers);

    Predicate<Integer> isOdd = isEven.negate();
    List<Integer> oddNumbers = numbers.stream().filter(isOdd).toList();
    System.out.println("Odd numbers: " + oddNumbers);

    Predicate<Integer> isGreaterThan5 = isEven.and(num -> num > 5);
    List<Integer> evenNumbersGreaterThan5 = numbers.stream().filter(isGreaterThan5).toList();
    System.out.println("Numbers greater than 5: " + evenNumbersGreaterThan5);

  }
}

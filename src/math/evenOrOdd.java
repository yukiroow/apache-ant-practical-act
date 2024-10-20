package math;
/**
 * Create a function that takes an integer as an argument
 * and returns "Even" for even numbers or "Odd" for odd numbers.
 */

public class EvenOrOdd {
    /**
     * Invoke EvenOrOdd Solution
     * @param number
     * @return Even or Odd
     */
    public static String solve(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}

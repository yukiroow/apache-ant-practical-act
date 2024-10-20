package math;
/**
 * Create a function that takes an integer as an argument
 * and returns "Even" for even numbers or "Odd" for odd numbers.
 */

public class EvenOrOdd {
    /**
     * Invoke EvenOrOdd Solution
     * @param number the input integer
     * @return Even if the number is even or Odd if it is odd
     */
    public static String solve(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}

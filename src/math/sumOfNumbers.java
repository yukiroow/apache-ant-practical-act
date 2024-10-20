package math;

/**
 * Given two integers a and b, which can be positive or
 * negative, find the sum of all the integers between
 * and including them and return it. If the two numbers
 * are equal return a or b.
 */

public class SumOfNumbers {

    /**
     * Invoke SumOfNumbers Solution
     * @param a
     * @param b
     * @return 
     */
    public int solve(int a, int b) {
        int sum = 0;

        if (a == b) {
            sum = a;
        }

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        sum = (max - min + 1) * (min + max) / 2;

        return sum;
    }

}

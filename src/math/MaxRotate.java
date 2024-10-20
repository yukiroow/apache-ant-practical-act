package math;
/**
 * Write function max_rot(n) which given a positive integer n returns the maximum number you got doing rotations similar to the above example.
 *
 * So max_rot (or maxRot or ... depending on the language) is such as:
 *
 * max_rot(56789) should return 68957
 *
 * max_rot(38458215) should return 85821534
 */

public class MaxRotate {
    /**
     * Invoke MaxRotate Solution
     * @param n original number to be rotated and maximized
     * @return  maximum value possible
     */
    public static long solve(long n) {

        String num = String.valueOf(n);

        for (int i = 0; i < num.length() - 1; i++) {
            num = num.substring(0, i) +
                    num.substring(i + 1) +
                    num.charAt(i);

            if (Long.parseLong(num) > n) {
                n = Long.parseLong(num);
            }
        }

        return n;
    }
}
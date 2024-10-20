package util;
/**
 * Convert number to reversed array of digits
 * Given a random non-negative number, you have to return the digits of this
 * number
 * within an array in reverse order.
 * Example(Input => Output):
 * 35231 => [1,3,2,5,3]
 * 0 => [0]
 */
public class ReversedDigits {
    public static int[] digitize(long n) {
        String str = Long.toString(n);

        // Handling the case where n is 0
        if (n == 0) {
            return new int[] { 0 };
        }

        int[] result = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(str.length() - 1 - i) - '0'; // Reverse the digits
        }

        return result;
    }
}

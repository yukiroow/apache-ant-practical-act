package util;

/**
 * A format for expressing an ordered list of integers is to use a comma
 * separated list of either individual integers or a range of integers denoted by 
 * the starting integer separated from the end integer in the range by a dash, '-'. 
 * The range includes all integers in the interval including both endpoints. It is not
 * considered a range unless it spans at least 3 numbers. 
 * For example "12,13,15-17"
 * Complete the solution so that it takes a list of integers in increasing order
 * and returns a correctly formatted string in the range format.
 *
 * Example:
 *
 * RangeExtractor.solve(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5,
 *                                  7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
 * # returns "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
 */
public class RangeExtractor {
    /**
     * Invoke RangeExtractor Solution
     */
    public static String solve(int[] arr) {

        StringBuilder formatted = new StringBuilder();
        int i = 0;

        while (i < arr.length) {
            int start = i;

            while (i < arr.length - 1 && arr[i] + 1 == arr[i + 1]) {
                i++;
            }

            if (i - start >= 2) {
                formatted.append(arr[start]).append("-").append(arr[i]);
            } else {

                for (int k = start; k <= i; k++) {
                    formatted.append(arr[k]);
                    if (k != i) {
                        formatted.append(",");
                    }
                }
            }

            i++;
            if (i < arr.length) {
                formatted.append(",");
            }
        }

        return formatted.toString();
    }
}

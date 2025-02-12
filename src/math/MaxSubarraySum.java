package math;
/**
 * The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
 *
 * Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
 * // should be 6: {4, -1, 2, 1}
 * Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.
 *
 * Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
 */

public class MaxSubarraySum {
    /**
     * Invoke MaxSubarraySum Solution
     * @param arr array of integers
     * @return maximum sum of any contiguous subarray within the given array
     */
    public static int solve(int[] arr) {
        int max = 0;
        int total = 0;

        for(int current : arr) {
            total += current;
            max = Math.max(max, total);
            total = total < 0 ? 0 : total;
        }

        return max;
    }
}
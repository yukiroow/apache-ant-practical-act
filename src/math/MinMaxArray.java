package math;
import java.util.Arrays;
/**
 * The highest profit wins!
 *
 * Write a function that returns both the minimum
 * and maximum number of the given list/array.
 */
public class MinMaxArray {
    /**
     * Invoke MinMaxArray Solution
     * @param arr  an array of integers
     * @return array of two integers (min and max values)
     */
    public static int[] solve(int[] arr) {
        Arrays.sort(arr);

        int[] minmax = { arr[0], arr[arr.length - 1] };

        return minmax;
    }
}

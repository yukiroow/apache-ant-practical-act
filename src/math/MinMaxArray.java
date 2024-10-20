package math;

/**
 * {7 kyu}
 * The highest profit wins!
 *
 * Write a function that returns both the minimum
 * and maximum number of the given list/array.
 */
import java.util.Arrays;

public class MinMaxArray {
    public static int[] solve(int[] arr) {
        Arrays.sort(arr);

        int[] minmax = { arr[0], arr[arr.length - 1] };

        return minmax;
    }
}

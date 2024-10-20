package math;
import java.util.List;
/**
 * Implement a function that returns the minimal and the maximal value of a list (in this order).
 */
public class MinMax {
    /**
     * Invoke MinMax Solution
     * @param list a list of integers
     * @return an array of two integers (minimum and maximum values)
     */
    public static int[] solve(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : list) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[] { min, max };
    }
}

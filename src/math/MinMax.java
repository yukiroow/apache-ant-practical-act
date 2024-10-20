package math;
import java.util.List;
/**
 * Implement a function that returns the minimal and the maximal value of a list (in this order).
 */
public static class MinMax {
    /**
     * Invoke MinMax Solution
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

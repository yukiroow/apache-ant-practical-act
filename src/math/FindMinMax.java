package math;
/**
 * [7 kyu]
 * Implement a function that returns the minimal and the maximal value of a list (in this order).
 */
import java.util.List;

public class FindMinMax {
    class MinMax {
        static int[] getMinMax(List<Integer> list) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int num : list) {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }
            return new int[] {min, max};
        }
    }
}

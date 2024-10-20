package util;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Write function smaller(arr) that given an array arr, you have to return the amount of numbers
 * that are smaller than arr[i] to the right.
 */

public class HowManyAreSmallerThanMe2 {
    /**
     * Invoke HowManyAreSmallerThanMe2 Solution
     */
    public static int[] smaller(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];


        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        Map<Integer, Integer> ranks = new HashMap<>();

        int rank = 0;
        for (int num : sortedArr) {
            if (!ranks.containsKey(num)) {
                ranks.put(num, rank++);
            }
        }

        int[] BIT = new int[ranks.size() + 1];

        for (int i = n - 1; i >= 0; i--) {
            int normalizedNum = ranks.get(arr[i]);
            result[i] = queryBIT(BIT, normalizedNum);
            updateBIT(BIT, normalizedNum + 1, 1);
        }

        return result;
    }

    /**
     * Update Method
     */
    private static void updateBIT(int[] BIT, int index, int value) {
        while (index < BIT.length) {
            BIT[index] += value;
            index += index & -index;
        }
    }

    /**
     * Query Method
     */
    private static int queryBIT(int[] BIT, int index) {
        int sum = 0;
        while (index > 0) {
            sum += BIT[index];
            index -= index & -index;
        }
        return sum;
    }

}

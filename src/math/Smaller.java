package math;

/**
 * This is a hard version of How many are smaller than me?. If you have
 * troubles solving this one, have a look at the easier kata first.
 * Write function smaller(arr) that given an array arr, you have to
 * return the amount of numbers that are smaller than arr[i] to the right.
 */
public class Smaller {
    /**
     * Invoke Smaller Solution
     * @param unsorted an array of integers
     * @return an array of counts of smaller elements to the right
     */
    public static int[] solve(int[] unsorted) {
        int n = unsorted.length;
        int[] result = new int[n];
        int[] indices = new int[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        mergeSortAndCount(unsorted, indices, result, 0, n - 1);
        return result;
    }

    /**
     * Recursive merge sort and count
     * @param nums original array of integers
     * @param indices array of indices of the original array
     * @param result array to store counts of smaller elements
     * @param l left index of the subarray
     * @param r right index of the subarray
     */
    private static void mergeSortAndCount(int[] nums, int[] indices, int[] result, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSortAndCount(nums, indices, result, l, m);
            mergeSortAndCount(nums, indices, result, m + 1, r);
            mergeAndCount(nums, indices, result, l, m, r);
        }
    }

    /**
     * Merge and Count
     * @param nums original array of integers
     * @param indices array of indices of the original array
     * @param result  array to store counts of smaller elements
     * @param l left index of the subarray
     * @param m the middle index
     * @param r right index of the second half
     */
    private static void mergeAndCount(int[] nums, int[] indices, int[] result, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        int[] LIndices = new int[n1];
        int[] RIndices = new int[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = nums[indices[l + i]];
            LIndices[i] = indices[l + i];
        }

        for (int j = 0; j < n2; ++j) {
            R[j] = nums[indices[m + 1 + j]];
            RIndices[j] = indices[m + 1 + j];
        }

        int i = 0, j = 0, k = l;
        int count = 0;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                result[LIndices[i]] += count;
                indices[k++] = LIndices[i++];
            } else {
                count++;
                indices[k++] = RIndices[j++];
            }
        }

        while (i < n1) {
            result[LIndices[i]] += count;
            indices[k++] = LIndices[i++];
        }

        while (j < n2) {
            indices[k++] = RIndices[j++];
        }
    }
}

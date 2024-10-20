package math;
/**
 * Sum of positive
 * You get an array of numbers, return the sum of all of the positives ones.
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 * Note: if there is nothing to sum, the sum is default to 0.
 * ArraysFundamentals
 */

public class SumOfPositive {

    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            if (num > 0) {
                total += num;
            }
        }
        return total;
    }

    public static void main(String[] args) {

        int[] array1 = {1, -4, 7, 12};
        System.out.println("Sum of positives in array1: " + sum(array1));

        int[] array2 = {-1, -2, -3, -4};
        System.out.println("Sum of positives in array2: " + sum(array2));

        int[] array3 = {0, 2, 4, -6, 8};
        System.out.println("Sum of positives in array3: " + sum(array3));
    }
}

package util;
/**
 * If we list all the natural numbers below 10 that are multiples of
 * 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Finish the solution so that it returns the sum of all the multiples
 * of 3 or 5 below the number passed in.
 */
public class Multiples3or5 {
    /**
     * Invoke Multiples3or5 Solution
     * @param number
     * @return 
     */
    public int solution(int number) {
        int multiple = 0;
        for (int i =0; i < number; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                multiple += i;
            }
        }
        return multiple;
    }
}


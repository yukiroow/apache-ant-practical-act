package math;
/**
 * Sean Aromin
 * Binary Addition 7 kyu
 *
 * Implement a function that adds two numbers together and returns their sum in
 * binary. The conversion can be done before, or after the addition.
 *
 * The binary number returned should be a string.
 *
 * Examples:(Input1, Input2 --> Output (explanation)))
 *
 * 1, 1 --> "10" (1 + 1 = 2 in decimal or 10 in binary)
 * 5, 9 --> "1110" (5 + 9 = 14 in decimal or 1110 in binary)
 */
public class BinaryAddition {
    public static String solve(int a, int b) {

        int sum = a + b;

        StringBuilder answer = new StringBuilder("");

        while (sum != 0) {
            answer.append(sum % 2);
            sum /= 2;
        }

        return answer.reverse().toString();
    }
}
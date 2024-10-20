package math;
import java.math.BigInteger;

/**
 * In this Kata, you will be given boolean values and boolean operators. Your task will be to return the number of
 * arrangements that evaluate to True.
 * Notice that the order of the boolean values and operators does not change. What changes is the position of braces.
 */
public class BooleanOrder {
    /**
     * Invoke Boolean Order Solution
     * @param operands string of boolean values
     * @param operators string of logical operators applied between the operands
     * @return number of ways to parenthesize the expression to make it evaluate to true
     */
    public static BigInteger solve(String operands, String operators) {
        int n = operands.length();
        BigInteger[][] dpTrue = new BigInteger[n][n];
        BigInteger[][] dpFalse = new BigInteger[n][n];

        for (int i = 0; i < n; i++) {
            dpTrue[i][i] = operands.charAt(i) == 't' ? BigInteger.ONE : BigInteger.ZERO;
            dpFalse[i][i] = operands.charAt(i) == 'f' ? BigInteger.ONE : BigInteger.ZERO;
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dpTrue[i][j] = BigInteger.ZERO;
                dpFalse[i][j] = BigInteger.ZERO;

                for (int k = i; k < j; k++) {
                    char op = operators.charAt(k);

                    BigInteger leftTrue = dpTrue[i][k];
                    BigInteger leftFalse = dpFalse[i][k];
                    BigInteger rightTrue = dpTrue[k + 1][j];
                    BigInteger rightFalse = dpFalse[k + 1][j];

                    switch (op) {
                        case '&':
                            dpTrue[i][j] = dpTrue[i][j].add(leftTrue.multiply(rightTrue));
                            dpFalse[i][j] = dpFalse[i][j].add(leftFalse.multiply(rightFalse))
                                    .add(leftTrue.multiply(rightFalse))
                                    .add(leftFalse.multiply(rightTrue));
                            break;
                        case '|':
                            dpTrue[i][j] = dpTrue[i][j].add(leftTrue.multiply(rightTrue))
                                    .add(leftTrue.multiply(rightFalse))
                                    .add(leftFalse.multiply(rightTrue));
                            dpFalse[i][j] = dpFalse[i][j].add(leftFalse.multiply(rightFalse));
                            break;
                        case '^':
                            dpTrue[i][j] = dpTrue[i][j].add(leftTrue.multiply(rightFalse))
                                    .add(leftFalse.multiply(rightTrue));
                            dpFalse[i][j] = dpFalse[i][j].add(leftTrue.multiply(rightTrue))
                                    .add(leftFalse.multiply(rightFalse));
                            break;
                    }
                }
            }
        }

        return dpTrue[0][n - 1];
    }
}
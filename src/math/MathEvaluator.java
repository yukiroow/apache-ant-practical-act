package math;
/**
 * Given a mathematical expression as a string you must return the result as a number.
 *
 * Numbers may be both whole numbers and/or decimal numbers. The same goes for the returned result.
 * 
 * You need to support the following mathematical operators:
 *
 * Multiplication *
 * Division / (as floating point division)
 * Addition +
 * Subtraction -
 * Operators are always evaluated from left-to-right, and * and / must be evaluated before + and -.
 *
 * Parentheses
 * You need to support multiple levels of nested parentheses, ex. (2 / (2 + 3.33) * 4) - -6
 *
 * Whitespace
 * There may or may not be whitespace between numbers and operators.
 *
 * An addition to this rule is that the minus sign (-) used for negating numbers and parentheses will never be separated by whitespace. I.e all of the following are valid expressions.
 *
 * 1-1    // 0
 * 1 -1   // 0
 * 1- 1   // 0
 * 1 - 1  // 0
 * 1- -1  // 2
 * 1 - -1 // 2
 * 1--1   // 2
 *
 * 6 + -(4)   // 2
 * 6 + -( -4) // 10
 * And the following are invalid expressions
 *
 * 1 - - 1    // Invalid
 * 1- - 1     // Invalid
 * 6 + - (4)  // Invalid
 * 6 + -(- 4) // Invalid
 * Validation
 * You do not need to worry about validation - you will only receive valid mathematical expressions following the above rules.
 *
 * Restricted APIs
 * NOTE: To keep up the difficulty of the kata, use of some classes and functions is disallowed. Their names cannot appear in the solution file, even in comments and variable names.
 */

import java.util.Stack;

public class MathEvaluator {
    /**
     * Invoke MathEvaluator Solution
     * @param expression a valid mathematical expression as a string
     * @return result of the evaluated expression as a double
     */
    public static double solve(String expression) {
        // Remove all whitespace from the expression
        expression = expression.replaceAll("\\s", "");

        // Create a stack for numbers and operators
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        // Iterate through the expression
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch) || ch == '.') {
                // Build the number
                StringBuilder sb = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    sb.append(expression.charAt(i++));
                }
                i--;
                numbers.push(Double.parseDouble(sb.toString()));
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                // Evaluate until the matching '('
                while (operators.peek() != '(') {
                    evaluateTop(numbers, operators);
                }
                operators.pop(); // Remove '('
            } else if (ch == '+' || ch == '-') {
                // Handle + and - with proper precedence
                while (!operators.isEmpty() && (operators.peek() == '*' || operators.peek() == '/' || operators.peek() == '+' || operators.peek() == '-')) {
                    evaluateTop(numbers, operators);
                }
                operators.push(ch);
            } else if (ch == '*' || ch == '/') {
                // Handle * and / with higher precedence
                while (!operators.isEmpty() && (operators.peek() == '*' || operators.peek() == '/')) {
                    evaluateTop(numbers, operators);
                }
                operators.push(ch);
            }
        }

        // Final evaluation of remaining operators
        while (!operators.isEmpty()) {
            evaluateTop(numbers, operators);
        }

        return numbers.pop();
    }

    /**
     * Evaluate Top
     * @param numbers
     * @param operators
     */
    private static void evaluateTop(Stack<Double> numbers, Stack<Character> operators) {
        char op = operators.pop();
        double b = numbers.pop();
        double a = numbers.pop();

        switch (op) {
            case '+':
                numbers.push(a + b);
                break;
            case '-':
                numbers.push(a - b);
                break;
            case '*':
                numbers.push(a * b);
                break;
            case '/':
                numbers.push(a / b);
                break;
        }
    }

}
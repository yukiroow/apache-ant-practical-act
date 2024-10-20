package string;
/**
 * Complete the solution so that the function will break up camel casing, using a space between words.
 *
 * Example
 * "camelCasing"  =>  "camel Casing"
 * "identifier"   =>  "identifier"
 * ""             =>  ""
 */

public class CamelCase {
    /**
     * Invoke CamelCase Solution
     * @param input input string
     * @return result string
     */
    public static String camelCase(String input) {

        String answer = "";
        for(char c : input.toCharArray()) {
            answer += Character.isUpperCase(c) ? " " + c : c;
        }
        return answer;
    }
}

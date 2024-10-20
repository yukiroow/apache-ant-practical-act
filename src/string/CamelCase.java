package string;
/**
 * Sean Aromin
 * Break camelCase 6 kyu
 *
 * Complete the solution so that the function will break up camel casing, using a space between words.
 *
 * Example
 * "camelCasing"  =>  "camel Casing"
 * "identifier"   =>  "identifier"
 * ""             =>  ""
 */

public class CamelCase {
    public static String camelCase(String input) {

        String answer = "";
        for(char c : input.toCharArray()) {
            answer += Character.isUpperCase(c) ? " " + c : c;
        }
        return answer;
    }
}

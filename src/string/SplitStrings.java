package string;
import java.util.ArrayList;
import java.util.List;
/**
 * Complete the solution so that it splits the string into pairs of two characters.
 * If the string contains an odd number of characters then it should replace the
 * missing second character of the final pair with an underscore ('_').
 */
public class SplitStrings {
    /**
     * Invoke SplitStrings Solution
     * @param s input string
     * @return split String array
     */
    public static String[] solution(String s) {
        List<String> pairs = new ArrayList<>();
        for (int i = 0; i < s.length(); i += 2) {
            if (i + 1 < s.length()) {
                pairs.add(s.substring(i, i + 2));
            } else {
                pairs.add(s.substring(i) + "_");
            }
        }
        return pairs.toArray(new String[0]);
    }
}



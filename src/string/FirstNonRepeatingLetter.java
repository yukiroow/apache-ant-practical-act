package string;
/**
 * [5 kyu]
 * Write a function named first_non_repeating_letter† that takes a string input,
 * and returns the first character that is not repeated anywhere in the string.
 * As an added challenge, upper- and lowercase letters are considered the same
 * character, but the function should return the correct case for the initial letter.
 */
public class FirstNonRepeatingLetter {
    public static String firstNonRepeatingLetter(String s){
        String lowerCaseString = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lowerCaseString.indexOf(Character.toLowerCase(c)) ==
                    lowerCaseString.lastIndexOf(Character.toLowerCase(c))) {
                return Character.toString(c);
            }
        }

        return "";
    }
}


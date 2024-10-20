package string;
/**
 * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
 *
 * The output should be two capital letters with a dot separating them.
 */
public class AbbreviateTwoWords {
    /**
     * Invoke AbbreviateTwoWords Solution
     */
    public static String abbrevName(String name) {
        String[]  words = name.split(" ");

        return words[0].substring(0,1).toUpperCase()+"."+words[1].substring(0,1).toUpperCase();
    }
}

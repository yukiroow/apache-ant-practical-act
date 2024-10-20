package string;
/**
 * [8 kyu]
 * Write a function to split a string and convert it into an array of words.
 */
public class StringToArray {
    public static String[] stringToArray(String s) {
        String [] words = s.split(" ");
        return words;
    }
}



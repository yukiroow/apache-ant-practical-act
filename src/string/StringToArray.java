package string;
/**
 * Write a function to split a string and convert it into an array of words.
 */
public class StringToArray {
    /**
     * Invoke StringToArray Solution
     * @param s
     * @return 
     */
    public static String[] stringToArray(String s) {
        String [] words = s.split(" ");
        return words;
    }
}



package string;

/**
 * Your task is to sort a given string. Each word in the string
 * will contain a single number. This number is the position
 * the word should have in the result.
 *
 * Note: Numbers can be from 1 to 9.
 * So 1 will be the first word (not 0).
 *
 * If the input string is empty, return an empty string.
 * The words in the input String will only contain valid
 * consecutive numbers.
 */

public class YourOrderPlease {
    /**
     * Invoke YourOrderPlease Solution
     * @param words
     * @return 
     */
    public static String order(String words) {
        // ...
        if (words == null || words.isEmpty()) {
            return "";
        }

        String[] Words = words.split(" ");
        String[] sortedWords = new String[Words.length];

        for (String word : Words) {
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    int position = Character.getNumericValue(c);
                    sortedWords[position - 1] = word;
                    break;
                }
            }
        }

        return String.join(" ", sortedWords);
    }

}

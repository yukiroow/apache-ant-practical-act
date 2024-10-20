package string;
/**
 * 6 kyu
 * Your task is to sort a given string. Each word in the string will contain a single number. This number is the
 * position the word should have in the result.
 *
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 *
 * If the input string is empty, return an empty string. The words in the input String will only contain valid
 * consecutive numbers.
 */
public class Order {
    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }

        String[] wordArray = words.split(" ");
        String[] result = new String[wordArray.length];

        for (String word : wordArray) {
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    int position = c - '0';
                    result[position - 1] = word;
                    break;
                }
            }
        }

        return String.join(" ", result);
    }
}
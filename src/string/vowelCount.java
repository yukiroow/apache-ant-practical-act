package string;

/**
 * Return the number (count) of vowels in the given string.
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 * The input string will only consist of lower case letters and/or spaces.
 */
public class VowelCount {
    /**
     * Invoke VowelCount Solution
     * @param str input string
     * @return no of vowels
     */
    public static int getCount(String str) {
        int vowelcount = 0;
        String vowels = "aeiou";

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (vowels.indexOf(letter) != -1) {
                vowelcount++;
            }
        }

        return vowelcount;
    }

}

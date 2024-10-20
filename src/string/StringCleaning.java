package string;

/**
 * Your boss decided to save money by purchasing some cut-rate optical character
 * recognition software for scanning in the text of old novels to your database.
 * At first it seems to capture words okay, but you quickly notice that it
 * throws in a lot of numbers at random places in the text.
 */
public class StringCleaning {
  /**
   * Invoke StringCleaning Solution
     * @param text
     * @return 
   */
  static String stringClean(final String text) {
    return text.replaceAll("\\d", "");
  }
}
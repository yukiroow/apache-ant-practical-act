package misc;

/**
 * Sean Aromin
 *
 * Make me slow 7 kyu
 *
 * Make me slow! Calling makeMeSlow() should take at least 7 seconds.
 */
public class MakeMeSlow {
    public static void makeMeSlow() {
        try {
            Thread.sleep(7000);
        } catch (Exception ex) {
        }
    }
}

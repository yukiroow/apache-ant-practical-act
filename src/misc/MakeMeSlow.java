package misc;

/**
 * Make me slow! Calling makeMeSlow() should take at least 7 seconds.
 */
public static class MakeMeSlow {
    /**
     * Invoke MakeMeSlow Solution
     */
    public static void makeMeSlow() {
        try {
            Thread.sleep(7000);
        } catch (Exception ignored) {}
    }
}

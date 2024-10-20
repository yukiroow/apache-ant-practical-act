package misc;

/**
 * Make a function that will return a greeting statement that uses an input;
 * your program should return, "Hello, [name] how are you doing today?".
 * [Make sure you type the exact thing I wrote or the program may not execute
 * properly]
 */
public class ReturningStrings {
    /**
     * Invoke ReturningStrings Solution
     * @param name name of the person to greet
     * @return string containing the greeting statement
     */
    public static String greet(String name) {
        String reply = "Hello, " + name + " how are you doing today?";
        return reply;
    }
}

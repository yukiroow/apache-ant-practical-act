package misc;

/**
 * {8 kyu}
 * Returning Strings
 * Make a function that will return a greeting statement that uses an input;
 * your program should return, "Hello, <name> how are you doing today?".
 * [Make sure you type the exact thing I wrote or the program may not execute
 * properly]
 */
public class returningStrings {
    public static String greet(String name) {
        // Your code here
        String reply = "Hello, " + name + " how are you doing today?";
        return reply;
    }
}

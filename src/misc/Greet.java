package misc;
/**
 * Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
 */
public static class Greet {
    /**
     * Invoke BinaryAddition Solution
     */
    public static String greet(String name, String owner) {
        if(name.equals(owner)) {
            return "Hello boss";
        }else{
            return "Hello guest";
        }
    }
}
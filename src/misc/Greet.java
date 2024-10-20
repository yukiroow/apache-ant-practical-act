package misc;
/**
 * 8 kyu
 * Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
 */
class Greet {
    static String greet(String name, String owner) {
        if(name.equals(owner)) {
            return "Hello boss";
        }else{
            return "Hello guest";
        }
    }
}
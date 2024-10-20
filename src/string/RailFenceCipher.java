package string;
/**
 * Create two functions to encode and then decode a string using the Rail Fence Cipher.
 * This cipher is used to encode a string by placing each character successively in a diagonal
 * along a set of "rails". First start off moving diagonally and down. When you reach the bottom,
 * reverse direction and move diagonally and up until you reach the top rail. Continue until you
 * reach the end of the string. Each "rail" is then read left to right to derive the encoded string.
 */
public class RailFenceCipher {
    /**
     * Invoke Encode Solution
     * @param s input string
     * @param n input size
     * @return encoded string
     */
    public static String encode(String s, int n) {
        if (n ==1){
            return s;
        }
        StringBuilder[] rail = new StringBuilder[n];
        for(int i=0; i < n; i++){
            rail[i] = new StringBuilder();
        }
        int index = 0;
        boolean down = true;
        for (char c: s.toCharArray()){
            rail[index].append(c);
            if(index == 0){
                down = true;
            }else if(index == n - 1){
                down = false;
            }
            index = down ? index + 1 : index - 1;
        }
        StringBuilder encoded = new StringBuilder();
        for(StringBuilder row : rail){
            encoded.append(row);
        }
        return encoded.toString();
    }

    /**
     * Invoke Decode Solution
     * @param s input string
     * @param n input size
     * @return decoded string
     */
    public static String decode(String s, int n) {
        if (n == 1) return s;
        boolean[] direction = new boolean[s.length()];
        int index = 0;
        boolean down = true;
        for (int i = 0; i < s.length(); i++) {
            direction[i] = (index == 0) ? true : (index == n - 1) ? false : down;
            if (direction[i]) {
                down = true;
            } else {
                down = false;
            }
            index = direction[i] ? index + 1 : index - 1;
        }
        char[][] rails = new char[n][s.length()];
        int strIndex = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < s.length(); j++) {
                if ((j % (2 * (n - 1)) == i || j % (2 * (n - 1)) == (2 * (n - 1)) - i) && strIndex < s.length()) {
                    rails[i][j] = s.charAt(strIndex++);
                }
            }
        }
        StringBuilder decoded = new StringBuilder();
        index = 0;
        down = true;
        for (int i = 0; i < s.length(); i++) {
            decoded.append(rails[index][i]);
            index = direction[i] ? index + 1 : index - 1;
        }
        return decoded.toString();
    }
}



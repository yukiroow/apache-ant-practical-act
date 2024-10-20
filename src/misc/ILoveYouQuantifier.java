package misc;

/**
 * {8 kyu}
 * I love you, a little , a lot, passionately ... not at all
 *
 * determine which phrase the girls would say at the last petal
 * for a flower of a given number of petals. The number of
 * petals is always greater than 0.
 */
public class ILoveYouQuantifier {
    public static String howMuchILoveYou(int nb_petals) {

        String answer = "";

        if (nb_petals % 6 == 1) {
            answer = "I love you";
        }
        if (nb_petals % 6 == 2) {
            answer = "a little";
        }
        if (nb_petals % 6 == 3) {
            answer = "a lot";
        }
        if (nb_petals % 6 == 4) {
            answer = "passionately";
        }
        if (nb_petals % 6 == 5) {
            answer = "madly";
        }
        if (nb_petals % 6 == 0)
            answer = "not at all";

        return answer;
    }

}

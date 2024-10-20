package misc;

/**
 * Middle Earth is about to go to war. The forces of good will have many battles
 * with the forces of evil. Different races will certainly be involved. Each
 * race has a certain worth when battling against others. On the side of good we
 * have the following races, with their associated worth:
 */
public class GoodVsEvil {
  /**
   * Invoke GoodVsEvil Solution
   * @param goodAmounts amounts of each race on the side of good
   * @param evilAmounts amounts of each race on the side of evil
   * @return string
   */
  public static String battle(String goodAmounts, String evilAmounts) {
    int goodScore = 0;
    int badScore = 0;

    String[] goodPpl = goodAmounts.split(" ");
    String[] badPpl = evilAmounts.split(" ");
    int goodHobbit = Integer.parseInt(goodPpl[0]) * 1;
    int goodMen = Integer.parseInt(goodPpl[1]) * 2;
    int goodElvs = Integer.parseInt(goodPpl[2]) * 3;
    int goodDwar = Integer.parseInt(goodPpl[3]) * 3;
    int goodEag = Integer.parseInt(goodPpl[4]) * 4;
    int goodWiz = Integer.parseInt(goodPpl[5]) * 10;
    goodScore = goodHobbit + goodMen + goodElvs + goodDwar + goodEag + goodWiz;

    int badOrc = Integer.parseInt(badPpl[0]) * 1;
    int badMen = Integer.parseInt(badPpl[1]) * 2;
    int badWargs = Integer.parseInt(badPpl[2]) * 2;
    int badGobs = Integer.parseInt(badPpl[3]) * 2;
    int badUruk = Integer.parseInt(badPpl[4]) * 3;
    int badTrolls = Integer.parseInt(badPpl[5]) * 5;
    int badWiz = Integer.parseInt(badPpl[6]) * 10;
    badScore = badOrc + badMen + badWargs + badGobs + badUruk + badTrolls + badWiz;

    if (goodScore == badScore)
      return "Battle Result: No victor on this battle field";
    return goodScore > badScore ? "Battle Result: Good triumphs over Evil"
        : "Battle Result: Evil eradicates all trace of Good";
  }
}

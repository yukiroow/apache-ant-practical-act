package util;
/**
 * This Class contains different CodeWars Katas that are related
 * to Dates and Time one way or another,
 */
public class DateKyu {
    /**
     * I have a cat and a dog. I got them at the same time as kitten/puppy. That was
     * humanYears years ago.
     * Return their respective ages now as [humanYears,catYears,dogYears]
     * NOTES:
     * humanYears >= 1
     * humanYears are whole numbers only
     */
    public static int[] humanYearsToCatYearsAndDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;
        for (int i = 1; i <= humanYears; i++) {
            if (i == 1) {
                catYears = 15;
                dogYears = 15;
            } else if (i == 2) {
                catYears += 9;
                dogYears += 9;
            } else {
                catYears += 4;
                dogYears += 5;
            }
        }
        return new int[] { humanYears, catYears, dogYears };
    }

    /**
     * Return the century of the input year. The input will always be a 4 digit
     * string, so there is no need for validation.
     */
    public static String whatCentury(int year) {
        int century = (year / 100) + 1;
        return year % 100 == 0 ? century - 1 + getEnding(century - 1) : century + getEnding(century);
    }

    /**
     * Get the ending characters for the specified year
     */
    private static String getEnding(int century) {
        int lastDigit = century % 10;
        switch (century) {
            case 11, 12, 13 -> {
                return "th";
            }
        }

        switch (lastDigit) {
            case 1 -> {
                return "st";
            }
            case 2 -> {
                return "nd";
            }
            case 3 -> {
                return "rd";
            }
        }

        return "th";
    }

    /**
     * The Chinese zodiac is a repeating cycle of 12 years, with each year being
     * represented by an animal and its reputed attributes. The lunar calendar is
     * divided into
     * cycles of 60 years each, and each year has a combination of an animal and an
     * element.
     * There are 12 animals and 5 elements; the animals change each year, and the
     * elements change every 2 years. The current cycle was initiated in the year of
     * 1984 which was
     * the year of the Wood Rat.Since the current calendar is Gregorian, I will only
     * be using
     * years from the epoch 1924. For simplicity I am counting the year as a whole
     * year and not
     * from January/February to the end of the year.
     */
    public static String chineseZodiac(int year) {
        String[] animal = { "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster",
                "Dog", "Pig" };
        String[] element = { "Wood", "Fire", "Earth", "Metal", "Water" };

        int elementIndex = ((year - 4) % 10) / 2;
        int animalIndex = (year - 4) % 12;

        return element[elementIndex] + " " + animal[animalIndex];
    }

    /**
     * Instructions: The cuckoo bird pops out of the cuckoo clock and chimes once on
     * the quarter hour, half hour, and three-quarter hour. At the beginning of each
     * hour (1-12), it chimes out the hour. Given the current time and a number n,
     * determine the time when the cuckoo bird has chimed n times.
     * Input Parameters: initial_time - a string in the format "HH:MM", where 1 ≤ HH
     * ≤ 12 and 0 ≤ MM ≤ 59, with leading 0’s if necessary.
     * n - an integer representing the target number of chimes, with 1 <= n <= 200.
     * Return Value: The time when the cuckoo bird has chimed n times - a string in
     * the same format as initial_time.
     * If the cuckoo bird chimes at initial_time, include those chimes in the count.
     * If the nth chime is reached on the hour, report the time at the start of that
     * hour (i.e. assume the cuckoo finishes chiming before the minute is up).
     */
    public static String cuckooClock(String inputTime, int chimes) {
        String[] timeParts = inputTime.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);

        int chimesCount = 0;

        // Move to the next quarter-hour or hour
        while (minute % 15 != 0) {
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour > 12) {
                    hour = 1; // Wrap around the hour after 12
                }
            }
        }

        // Now at a quarter-hour or an hour, start counting chimes
        while (chimesCount < chimes) {
            if (minute == 0) {
                // On the hour, it chimes the number of times equal to the hour (12 chimes if
                // it's 12)
                chimesCount += (hour == 12) ? 12 : hour;
            } else if (minute == 15 || minute == 30 || minute == 45) {
                // At quarter-hour, half-hour, and three-quarter-hour, it chimes once
                chimesCount++;
            }

            // If we've reached or exceeded the desired number of chimes, break
            if (chimesCount >= chimes) {
                break;
            }

            // Move forward 15 minutes
            minute += 15;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour > 12) {
                    hour = 1; // Wrap around the hour after 12
                }
            }
        }

        // Return the time in the required format "HH:MM"
        return String.format("%02d:%02d", hour, minute);
    }

    /**
     * Instructions: you should simply determine, whether a given year is a leap
     * year or not.
     * In case you don't know the rules, here they are:
     * Years divisible by 4 are leap years,
     * but years divisible by 100 are not leap years,
     * but years divisible by 400 are leap years.
     */
    public static boolean isLeapYear(int year) {
        return year % 100 == 0 ? year % 400 == 0 : year % 4 == 0;
    }

    /**
     * Given a month as an integer from 1 to 12, return to which quarter of the year
     * it belongs as an integer number.
     * For example: month 2 (February), is part of the first quarter; month 6
     * (June), is part of the second quarter;
     * and month 11 (November), is part of the fourth quarter.
     * 
     * Constraint:
     * 1 <= month <= 12
     */
    public static int getQuarterOfYear(int month) {
        if (month <= 3) {
            return 1;
        } else if (month <= 6) {
            return 2;
        } else if (month <= 9) {
            return 3;
        } else if (month <= 12) {
            return 4;
        }
        return month;
    }
}

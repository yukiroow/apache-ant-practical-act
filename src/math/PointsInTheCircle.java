package math;

/**
 * You have the radius of a circle with the center in point (0,0).
 * Write a function that calculates the number of points in the circle where
 * (x,y) - the cartesian coordinates of the points - are integers.
 */
public class PointsInTheCircle {
    /**
     * Invoke PointsInTheCircle Solution
     * @param radius radius of the circle
     * @return total number of integer points within and on the circle
     */
    public static int solve(int radius) {
        int count = 0;
        for (int x = -radius; x <= radius; x++) {
            int maxY = (int) Math.sqrt(radius * radius - x * x);
            count += 2 * maxY + 1;
        }
        return count;
    }
}
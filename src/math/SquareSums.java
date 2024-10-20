package math;

import java.util.*;

/**
 * Write function square_sums_row that, given integer
 * number N (in range 2..43), returns array of integers 1..N arranged in a way,
 * so sum of
 * each 2 consecutive numbers is a square.
 * 
 * Solution is valid if and only if following two criterias are met:
 * Each number in range 1..N is used once and only once.
 * Sum of each 2 consecutive numbers is a perfect square.
 */
public class SquareSums {
  private static Set<Integer> squares = new HashSet<>();
  private static List<List<Integer>> graph;

  /**
   * Invoke SquareSums Solution
   * 
   * @param n the upper limit for path elements
   * @return an array representing the path or null if no path exists
   */
  public static int[] solve(int n) {
    if (n < 2 || n > 43)
      return null;

    // Precompute squares
    for (int i = 1; i * i <= 2 * n; i++) {
      squares.add(i * i);
    }

    // Build graph
    graph = new ArrayList<>(n + 1);
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<>());
    }
    for (int i = 1; i <= n; i++) {
      for (int j = i + 1; j <= n; j++) {
        if (squares.contains(i + j)) {
          graph.get(i).add(j);
          graph.get(j).add(i);
        }
      }
    }

    // Try to find a path
    boolean[] used = new boolean[n + 1];
    for (int start = 1; start <= n; start++) {
      List<Integer> path = new ArrayList<>();
      path.add(start);
      used[start] = true;
      if (dfs(path, used, n)) {
        return path.stream().mapToInt(Integer::intValue).toArray();
      }
      used[start] = false;
    }

    return null;
  }

  /**
   * Depth-first Search Implementation
   * 
   * @param path the current path of integers
   * @param n upper limit for path length
   * @return true if a valid path is found
   */
  private static boolean dfs(List<Integer> path, boolean[] used, int n) {
    if (path.size() == n) {
      return true;
    }

    int last = path.get(path.size() - 1);
    for (int next : graph.get(last)) {
      if (!used[next]) {
        path.add(next);
        used[next] = true;
        if (dfs(path, used, n)) {
          return true;
        }
        path.remove(path.size() - 1);
        used[next] = false;
      }
    }

    return false;
  }
}

package misc;

/**
 * Write a function that will solve a 9x9 Sudoku puzzle. The function will take
 * one argument consisting of the 2D puzzle array, with the value 0 representing an unknown
 * square. The Sudokus tested against your function will be "easy" (i.e. determinable;
 * there will be no need to assume and test possibilities on unknowns) and can be solved with
 * a brute-force approach.
 */
public class SudokuSolver {
    /**
     * Invoke SudokuSolver Solution
     * @param puzzle 2D array representing the Sudoku puzzle
     * @return solved Sudoku puzzle as a 2D array
     */
    public static int[][] sudoku(int[][] puzzle) {
        solve(puzzle);
        return puzzle;
    }

    /**
     * Solve the given 2D Array puzzle
     * @param puzzle 2D array representing the Sudoku puzzle to be solved
     * @return True if the puzzle is solved successfully; false otherwise
     */
    private static boolean solve(int[][] puzzle) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (puzzle[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(puzzle, row, col, num)) {
                            puzzle[row][col] = num;
                            if (solve(puzzle)) {
                                return true;
                            } else {
                                puzzle[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Check if current state is valid
     * @param puzzle 2D array representing the current state of the Sudoku puzzle
     * @param row row index where the number is to be placed
     * @param col column index where the number is to be placed
     * @param num number to check for validity
     * @return True if placing the number is valid; false otherwise
     */
    private static boolean isValid(int[][] puzzle, int row, int col, int num) {
        // Check row
        for (int x = 0; x < 9; x++) {
            if (puzzle[row][x] == num) {
                return false;
            }
        }

        // Check column
        for (int x = 0; x < 9; x++) {
            if (puzzle[x][col] == num) {
                return false;
            }
        }

        // Check 3x3 box
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (puzzle[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}
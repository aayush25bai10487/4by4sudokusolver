public class SudokuSolver {
    private final SudokuValidator validator = new SudokuValidator();

    public boolean solve(SudokuBoard board) {
        for (int row = 0; row < SudokuBoard.SIZE; row++) {
            for (int column = 0; column < SudokuBoard.SIZE; column++) {

                if (board.getValue(row, column) == 0) {

                    for (int number = 1; number <= SudokuBoard.SIZE; number++) {

                        if (validator.isSafe(board, row, column, number)) {
                            board.setValue(row, column, number);

                            if (solve(board)) {
                                return true;
                            }

                            // Backtracking
                            board.setValue(row, column, 0);
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }
}

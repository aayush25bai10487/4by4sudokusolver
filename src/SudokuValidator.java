public class SudokuValidator {

    public boolean isValidBoard(SudokuBoard board) {
        for (int row = 0; row < SudokuBoard.SIZE; row++) {
            for (int column = 0; column < SudokuBoard.SIZE; column++) {
                int value = board.getValue(row, column);

                if (value != 0 && !isSafe(board, row, column, value)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isSafe(SudokuBoard board, int row, int column, int value) {
        for (int i = 0; i < SudokuBoard.SIZE; i++) {
            if (i != column && board.getValue(row, i) == value) {
                return false;
            }
        }

        for (int i = 0; i < SudokuBoard.SIZE; i++) {
            if (i != row && board.getValue(i, column) == value) {
                return false;
            }
        }

        int startRow = (row / 2) * 2;
        int startColumn = (column / 2) * 2;

        for (int i = startRow; i < startRow + 2; i++) {
            for (int j = startColumn; j < startColumn + 2; j++) {
                if ((i != row || j != column)
                        && board.getValue(i, j) == value) {
                    return false;
                }
            }
        }

        return true;
    }
}

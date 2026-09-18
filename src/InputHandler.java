import java.util.Scanner;

public class InputHandler {

    public static void readBoard(Scanner sc, SudokuBoard board)
            throws SudokuException {

        for (int row = 0; row < SudokuBoard.SIZE; row++) {
            System.out.print("Enter row " + (row + 1) + ": ");

            for (int column = 0; column < SudokuBoard.SIZE; column++) {
                if (!sc.hasNextInt()) {
                    throw new SudokuException(
                            "Please enter numbers only.");
                }

                int value = sc.nextInt();

                if (value < 0 || value > 4) {
                    throw new SudokuException(
                            "Only numbers 0 to 4 are allowed.");
                }

                board.setValue(row, column, value);
            }
        }
    }
}

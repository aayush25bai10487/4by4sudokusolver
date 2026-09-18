import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SudokuBoard board = new SudokuBoard();
        SudokuValidator validator = new SudokuValidator();
        SudokuSolver solver = new SudokuSolver();

        System.out.println("=================================");
        System.out.println("       4x4 SUDOKU SOLVER");
        System.out.println("=================================");
        System.out.println("Enter 4 rows with 4 numbers each.");
        System.out.println("Use 0 for an empty cell.\n");

        try {
            InputHandler.readBoard(sc, board);

            System.out.println("\nOriginal Sudoku:");
            board.display();

            if (!validator.isValidBoard(board)) {
                System.out.println("\nInvalid Sudoku puzzle.");
                System.out.println("A number is repeated in a row, column, or 2x2 box.");
                return;
            }

            if (solver.solve(board)) {
                System.out.println("\nSolved Sudoku:");
                board.display();
            } else {
                System.out.println("\nNo solution exists for this Sudoku puzzle.");
            }
        } catch (SudokuException e) {
            System.out.println("\nInput Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

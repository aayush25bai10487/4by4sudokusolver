public class SudokuBoard {
    public static final int SIZE = 4;
    private final int[][] grid;

    public SudokuBoard() {
        grid = new int[SIZE][SIZE];
    }

    public void setValue(int row, int column, int value) {
        grid[row][column] = value;
    }

    public int getValue(int row, int column) {
        return grid[row][column];
    }

    public void display() {
        System.out.println("+---+---+");
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                if (column == 2) {
                    System.out.print("| ");
                }
                System.out.print(grid[row][column] + " ");
            }
            System.out.println("|");
            if (row == 1) {
                System.out.println("+---+---+");
            }
        }
        System.out.println("+---+---+");
    }
}

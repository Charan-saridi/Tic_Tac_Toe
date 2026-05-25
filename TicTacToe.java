public class TicTacToe {

    // Method to place move
    public static void placeMove(char[][] board, int row, int col, char symbol) {

        board[row][col] = symbol;
    }

    // Method to print board
    public static void printBoard(char[][] board) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(board[i][j]);

                if (j < 2) {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            if (i < 2) {
                System.out.println("---------");
            }
        }
    }

    public static void main(String[] args) {

        // Create empty board
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        // Place X at row 1, col 1
        placeMove(board, 1, 1, 'X');

        // Print updated board
        printBoard(board);
    }
}
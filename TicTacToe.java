import java.util.Random;

public class TicTacToe {

    // Validation method
    public static boolean isValidMove(char[][] board, int row, int col) {

        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }

        return board[row][col] == ' ';
    }

    // Print board
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

    // Computer move
    public static void computerMove(char[][] board) {

        Random random = new Random();

        while (true) {

            // Random slot 1-9
            int slot = random.nextInt(9) + 1;

            // Convert slot
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            // Check move validity
            if (isValidMove(board, row, col)) {

                // Place O
                board[row][col] = 'O';

                System.out.println("Computer selected slot: " + slot);

                break;
            }
        }
    }

    public static void main(String[] args) {

        // Create board
        char[][] board = {
            {'X', ' ', ' '},
            {' ', 'O', ' '},
            {' ', ' ', 'X'}
        };

        // Computer turn
        computerMove(board);

        // Print updated board
        printBoard(board);
    }
}
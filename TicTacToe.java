public class TicTacToe {

    public static void main(String[] args) {

        // Create board
        char[][] board = new char[3][3];

        // Initialize board with '-'
        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {

                board[row][col] = '-';

            }
        }

        // Print board
        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {

                System.out.print(board[row][col] + " ");

            }

            System.out.println();
        }
    }
}
public class TicTacToe {

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

    // Check win
    public static boolean checkWin(char[][] board, char symbol) {

        for (int i = 0; i < 3; i++) {

            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {

                return true;
            }
        }

        return false;
    }

    // Check draw
    public static boolean isBoardFull(char[][] board) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
            {'X', 'X', 'X'},
            {'O', ' ', ' '},
            {' ', ' ', ' '}
        };

        boolean gameRunning = true;

        char currentPlayer = 'X';

        while (gameRunning) {

            printBoard(board);

            if (checkWin(board, currentPlayer)) {

                System.out.println(currentPlayer + " Wins!");

                gameRunning = false;
            }

            else if (isBoardFull(board)) {

                System.out.println("Game Draw!");

                gameRunning = false;
            }

            else {

                if (currentPlayer == 'X') {
                    currentPlayer = 'O';
                } else {
                    currentPlayer = 'X';
                }
            }
        }
    }
}
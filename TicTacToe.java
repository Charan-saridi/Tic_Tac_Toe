public class TicTacToe {

    // Winner check method
    public static boolean checkWin(char[][] board, char symbol) {

        // Rows
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {

                return true;
            }
        }

        // Columns
        for (int j = 0; j < 3; j++) {

            if (board[0][j] == symbol &&
                board[1][j] == symbol &&
                board[2][j] == symbol) {

                return true;
            }
        }

        // Main diagonal
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {

            return true;
        }

        // Reverse diagonal
        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {

            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        char[][] board = {
            {'X', 'X', 'X'},
            {'O', ' ', 'O'},
            {' ', ' ', ' '}
        };

        boolean result = checkWin(board, 'X');

        if (result) {
            System.out.println("X Wins!");
        } else {
            System.out.println("No Winner Yet");
        }
    }
}
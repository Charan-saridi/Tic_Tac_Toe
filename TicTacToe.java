public class TicTacToe {

    // Check if board is full
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
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
        };

        boolean draw = isBoardFull(board);

        if (draw) {

            System.out.println("Game Draw");

        } else {

            System.out.println("Moves Still Available");
        }
    }
}
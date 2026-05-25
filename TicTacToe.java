public class TicTacToe {

    // Validation method
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Boundary checking
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }

        // Check empty cell
        if (board[row][col] != ' ') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
            {'X', 'O', ' '},
            {' ', 'X', ' '},
            {'O', ' ', ' '}
        };

        int row = 1;
        int col = 0;

        boolean result = isValidMove(board, row, col);

        if (result) {
            System.out.println("Valid Move");
        } else {
            System.out.println("Invalid Move");
        }
    }
}
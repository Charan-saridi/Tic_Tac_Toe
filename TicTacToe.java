import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {

        // Create Random object
        Random random = new Random();

        // Toss result
        int toss = random.nextInt(2);

        // Game state variables
        char player1Symbol;
        char player2Symbol;

        String currentPlayer;
        char currentSymbol;

        // Toss logic
        if (toss == 0) {

            currentPlayer = "Player 1";

            player1Symbol = 'X';
            player2Symbol = 'O';

            currentSymbol = 'X';

        } else {

            currentPlayer = "Player 2";

            player1Symbol = 'O';
            player2Symbol = 'X';

            currentSymbol = 'X';
        }

        // Display result
        System.out.println("Toss Result: " + toss);

        System.out.println(currentPlayer + " starts first");

        System.out.println("Player 1 Symbol: " + player1Symbol);

        System.out.println("Player 2 Symbol: " + player2Symbol);

        System.out.println("Current Symbol: " + currentSymbol);
    }
}
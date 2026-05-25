import java.util.Scanner;

public class TicTacToe {

    // Method to get row index
    public static int getRow(int slot) {
        int position = slot - 1;
        return position / 3;
    }

    // Method to get column index
    public static int getCol(int slot) {
        int position = slot - 1;
        return position % 3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take slot input
        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();

        // Convert slot to row and column
        int row = getRow(slot);
        int col = getCol(slot);

        // Display indices
        System.out.println("Row Index: " + row);
        System.out.println("Column Index: " + col);

        sc.close();
    }
}
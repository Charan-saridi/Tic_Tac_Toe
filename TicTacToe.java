import java.util.Scanner;

public class TicTacToe {

    // Scanner object
    static Scanner scanner = new Scanner(System.in);

    // Method to get player input
    public static int getPlayerInput() {

        System.out.print("Enter slot number (1-9): ");

        int slot = scanner.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        // Call method
        int playerSlot = getPlayerInput();

        // Display selected slot
        System.out.println("Selected Slot: " + playerSlot);
    }
}
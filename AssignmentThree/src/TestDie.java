import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*  Luis Chavez CIS 166
 * TestDie.java runs a dice game, creates 2 objects of class die  and it rolls
 * two dice 20 times, tracking wins, and saving user wins with a nickname
 *  to "scores.txt".
 * Implementation File!!!!
 */
// TestDie class as requested on Rubric
public class TestDie {
    // Main method
    public static void main(String[] args) {
        // Prompt to ask user for number of sides.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides for the dice: ");
        int sides = scanner.nextInt();

        // Two dice objects as stated on rubric.
        Die ComputerDice = new Die(sides);
        Die UserDice = new Die(sides);
        
        // Initialize variables to count wins
        int ComputerWins = 0;
        int UserWins = 0;

        // Rolling rolling rolling......
        for (int i = 0; i < 20; i++) {
            ComputerDice.roll();
            UserDice.roll();

            // Conditionals to check if either PC wins or user wins!
            if (ComputerDice.getValue() > UserDice.getValue()) {
                // Computer wins!
                ComputerWins++;
            } else if (ComputerDice.getValue() < UserDice.getValue()) {
                // User wins!
                UserWins++;
            }
        }
        
        // Output the number of wins
        System.out.println("Computer wins: " + ComputerWins);
        System.out.println("User wins: " + UserWins);

        // Call Leaderboard method to write results to file
        if (UserWins > ComputerWins) {
            Leaderboard(UserWins);
        }

        // Close the Scanner
        scanner.close();
    }

    public static void Leaderboard(int wins) {
        Scanner scanner = new Scanner(System.in);
        String nickname;
        
        // Prompts user to enter its name....
        do {
            System.out.print("Enter your nickname (1-5 characters): ");
            nickname = scanner.next();
        } while (nickname.length() < 1 || nickname.length() > 5);

        // Writes the nickname and number of wins to the file.
        try (FileWriter writer = new FileWriter("scores.txt", true)) {
            writer.write(nickname + " " + wins + "\n");
        } catch (IOException e) {
            // Checks if an error occurred while filewriting....
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
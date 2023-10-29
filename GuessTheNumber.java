import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int low_limit = 1;
        int high_limit = 100;
        int max = 7;
        int rounds = 0;
        int totalAttempts = 0;

        System.out.println("Welcome to the Guess the Number game!");

        while (true) {
            int numberToGuess = random.nextInt(high_limit - low_limit + 1) + low_limit;
            int attempts = 0;

            System.out.println("Round " + (rounds + 1) + ":");
            System.out.println("Guess the number between " + low_limit + " and " + high_limit);

            while (attempts < max) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                    break;
                }
            }

            if (attempts == max) {
                System.out.println("You've reached the maximum number of attempts. The correct number was: " + numberToGuess);
            }

            System.out.print("Do you want to play another round? (AGAIN/EXIT): ");
            String playAgain = scanner.next();

            if (playAgain.equalsIgnoreCase("EXIT")) {
                break;
            }

            rounds++;
        }

        System.out.println("Game Over!");
        System.out.println("Total rounds played: " + (rounds + 1));
        System.out.println("Total attempts made: " + totalAttempts);

        scanner.close();
    }
}

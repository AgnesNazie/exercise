import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(500) + 1;

        Scanner scanner = new Scanner (System.in);
        int userGuess = 0;
        int guessCount = 0;

        while (userGuess != randomNumber){
            System.out.println("Enter your guess (between 1 and 500): ");
            userGuess = scanner.nextInt();
            guessCount ++;
            if (userGuess < randomNumber) {
                System.out.println("Your Guess was too small.");
            } else if ( userGuess > randomNumber) {
                System.out.println("Your Guess was too big");
            } else {
                System.out.println("Congratulations1 You guessed the correct number: " + randomNumber);
                System.out.println("it took you " + guessCount + " guesses.");
            }
        }
        scanner.close();

    }
}
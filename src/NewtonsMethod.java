import java.util.Scanner;

public class NewtonsMethod {
    public static void main(String[] args) {
        // Ask the user for the n value
        Scanner scanner = new Scanner(System.in);
        char input;
        // Do the following once, and continue as long as input is y
        do {
            System.out.println("Please enter your inital guess");
            double guess = scanner.nextDouble();
            double prevGuess = guess + 1;

            System.out.println(Math.abs(prevGuess - guess) < 0.0001);
            while (Math.abs(prevGuess - guess) > 0.000000001) {
                prevGuess = guess;
                double fx = 6 * Math.pow(guess, 4) - 13 * Math.pow(guess, 3) - 18 * Math.pow(guess, 2) + 7 * guess + 6;
                double fpx = 24 * Math.pow(guess, 3) - 39 * Math.pow(guess, 2) - 36 * guess + 7;
                guess = prevGuess - fx/fpx;
                System.out.println(guess);
            }

            // Print out the Root
            System.out.println("Your approximate root is " + guess);
            System.out.println("Do you want to try again?");
            input = scanner.next().toLowerCase().charAt(0);
        } while (input == 'y');
        scanner.close();
    }
}

import java.util.Scanner;
import java.util.StringTokenizer;


public class PolynomialEvaluator {
    public static void main(String[] args) {
        // Ask the user for the n value
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your polynomial: ");
        String polynomial = keyboard.nextLine();
        polynomial = polynomial.substring(5);

        StringTokenizer st = new StringTokenizer(polynomial, " ");
        System.out.println("Please enter your x value: ");
        double x = keyboard.nextDouble();
        
        while (st.hasMoreTokens()) {
            String current_token = st.nextToken();
            for (int i = 0; i < current_token.length(); i++) {
                char character = current_token.charAt(i);
            }
        }
        keyboard.close();
    }
}

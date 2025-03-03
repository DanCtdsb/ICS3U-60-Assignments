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
        double result = 0;
        
        while (st.hasMoreTokens()) {
            String current_token = st.nextToken();
            String coefficient = "";
            String exponent = "";
            boolean seen = false;
            for (int i = 0; i < current_token.length(); i++) {
                char character = current_token.charAt(i);
                if (character == '+' || character == '-') {
                    continue;
                }
                if (i + 1 == current_token.length()) {
                    exponent += character;
                    if (coefficient == "") {
                        result += character - '0';
                    } else if (!seen) {
                        result += Integer.parseInt(coefficient) * x;
                    } else {
                        result += Integer.parseInt(coefficient) * Math.pow(x, Integer.parseInt(exponent));
                    }
                } else if (Character.isDigit(character)) {
                    if (seen) {
                        exponent += character;
                    } else {
                        coefficient += character;
                    }
                } else if (character == '^') {
                    seen = true;
                }
            }
        }
        System.out.println("Result" + result);
        keyboard.close();
    }
}

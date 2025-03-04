import java.util.Scanner;
import java.util.StringTokenizer;


public class PolynomialEvaluator {
    public static void main(String[] args) {
        // Ask the user for the n value
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your polynomial (Format: f(x)= 3x^2 +3x +3): ");
        String polynomial = keyboard.nextLine();
        polynomial = polynomial.substring(5);

        StringTokenizer st = new StringTokenizer(polynomial, " ");
        System.out.println("Please enter your x value: ");
        double x = keyboard.nextDouble();
        double result = 0;
        
        while (st.hasMoreTokens()) {
            String current_token = st.nextToken();
            int coefficient = 1;
            int exponent = 0;
            int xIndex = current_token.indexOf('x');
            int expIndex = current_token.indexOf('^');
            if (xIndex != -1) {
                coefficient = (xIndex > 0) ? Integer.parseInt(current_token.substring(0, xIndex)) : 1;

                exponent = (expIndex != -1) ? Integer.parseInt(current_token.substring(expIndex + 1)) : 1;
            } else {
                coefficient = Integer.parseInt(current_token);
            }
                
            result += coefficient * Math.pow(x, (exponent));

        }  
        System.out.println("Result: " + result);
        keyboard.close();
    }
}

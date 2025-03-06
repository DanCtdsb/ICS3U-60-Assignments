import java.util.Scanner;
import java.util.StringTokenizer;


public class PolynomialEvaluator {
    public static void main(String[] args) {
        // Ask the user for the n value
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your polynomial (Format: f(x)= 3x^2 +3x +3): ");
        String polynomial = keyboard.nextLine().substring(5);

        // Tokenizes the polynomial
        StringTokenizer st = new StringTokenizer(polynomial);
        System.out.println("Please enter your x value: ");
        double x = keyboard.nextDouble();
        double result = 0;
        
        // Loop through each token
        while (st.hasMoreTokens()) {
            String current_Token = st.nextToken();
            double coefficient = 1;
            int exponent = 0;

            // Find index at certain symbols
            int xIndex = current_Token.indexOf('x');
            int expIndex = current_Token.indexOf('^');

            // Coefficient is the value before if x, otherwise the coefficient is the number itself
            coefficient = (xIndex != -1) ? Double.parseDouble(current_Token.substring(0, xIndex)) : Double.parseDouble(current_Token);
            
            // Exponent is the value after the ^, else if x the value is 1, else keep it at 0
            if (xIndex != -1) {
                exponent = (expIndex != -1) ? Integer.parseInt(current_Token.substring(expIndex + 1)) : 1;
            }
            
            // Formula to add the value of the current token to the overall result
            result += coefficient * Math.pow(x, exponent);
        }  

        System.out.println("f(" + x + ")= " + result);
        keyboard.close();
    }
}

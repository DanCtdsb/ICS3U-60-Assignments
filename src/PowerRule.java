import java.util.Scanner;

public class PowerRule {
    public static void main(String[] args) {
        // Ask the user for the n value
        Scanner keyboard = new Scanner(System.in);

        // Define the arrays
        System.out.println("Please enter your coefficients(seperated by space): ");
        String[] coefficients = keyboard.nextLine().split(" ");

        System.out.println("Please enter your exponents(seperated by space): ");
        String[] exponents = keyboard.nextLine().split(" ");

        String fstDerivative = "f'(x)=";
        String secDerivative = "f''(x)=";

        // Make the Derivatives
        for (int i = 0; i < coefficients.length; i++) {
            double coef = Double.parseDouble(coefficients[i]);
            int exp = Integer.parseInt(exponents[i]);
            double fstCoefficient = coef * exp;
            int fstExp = exp - 1;
            
            if (fstExp >= 0) {
                fstDerivative += ((fstCoefficient > 0 && i != 0) ? " +" : " ") + fstCoefficient;
                fstDerivative += ((fstExp > 0) ? "x^" : "") + fstExp;
            }

            double secCoefficient = fstCoefficient * fstExp;
            int secExp = fstExp - 1;
            
            if (secExp >= 0) {
                secDerivative += ((secCoefficient > 0 && i != 0) ? " +" : " ") + secCoefficient;
                secDerivative += ((secExp > 0) ? "x^" + secExp : "");
            }
        }
        System.out.println("Your first derivative is: " + fstDerivative);
        System.out.println("Your second derivative is: " + secDerivative);

        keyboard.close();
    }
}

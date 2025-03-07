import java.util.Scanner;

public class PowerRule {
    public static void main(String[] args) {
        // Ask the user for the n value
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your coefficients(seperated by space): ");
        String[] coefficients = keyboard.nextLine().split(" ");

        System.out.println("Please enter your exponents(seperated by space): ");
        String[] exponents = keyboard.nextLine().split(" ");

        String firstDerivative = "f'(x)=";
        String secondDerivative = "f''(x)=";
        for (int i = 0; i < coefficients.length; i++) {
            double coef = Double.parseDouble(coefficients[i]);
            int exp = Integer.parseInt(exponents[i]);
            double firstCoefficient =  coef * exp;
            int firstExp = exp - 1;
            firstDerivative += ((firstCoefficient > 0 && i != 0) ? " +" : " ") + firstCoefficient + ((firstExp != 0) ? "x^" : "") + firstExp;
            if (i < coefficients.length - 1) {
                double secondCoefficient = firstCoefficient * firstExp;
                int secondExp = firstExp - 1;
                secondDerivative += ((secondCoefficient > 0 && i != 0) ? " +" : " ") + secondCoefficient + ((secondExp != 0) ? "x^" : "") + secondExp;
            }
        }
        System.out.println("Your first derivative is: " + firstDerivative);
        System.out.println("Your second derivative is: " + secondDerivative);


        // Loop through each token
        keyboard.close();
    }
}

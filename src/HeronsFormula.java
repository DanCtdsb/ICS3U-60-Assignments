import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        // Ask the user for three sides of the triangle
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your a value: ");
        double a = keyboard.nextDouble();
        System.out.println("Please enter your b value: ");
        double b = keyboard.nextDouble();
        System.out.println("Please enter your c value: ");
        double c = keyboard.nextDouble();

        // Using HeronsFormula
        double area = Math.sqrt(4 * a * a * b * b - Math.pow(a * a + b * b - c * c, 2)) / 4;
        System.out.println("The area of the triangle is: " + area);
        keyboard.close();
    }
}

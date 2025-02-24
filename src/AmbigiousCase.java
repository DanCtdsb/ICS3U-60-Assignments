import java.util.Scanner;

public class AmbigiousCase {
    public static void main(String[] args) {
        // Ask the user for two sides and an angle
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the value of angle A(Degrees): ");
        double angle_A = keyboard.nextDouble();
        System.out.println("Please enter the value of side a: ");
        double side_a = keyboard.nextDouble();
        System.out.println("Please enter the value of side b: ");
        double side_b = keyboard.nextDouble();        
        keyboard.close();
        
        double h = Math.sin(Math.toRadians(angle_A)) * side_b;
        // Calculates what type of triangle is possible based on the values above
        if (angle_A <= 90) {
            if (side_a < h) {
                System.out.println("There is no triangle.");
            } else if (side_a == h) {
                System.out.println("The triangle is a right triangle.");
            } else if (side_a > side_b) {
                System.out.println("There is one triangle.");
            } else {
                System.out.println("There are two triangles(Ambigious Case).");
            } 
        } else {
            if (side_a < side_b || side_a == h) {
                System.out.println("There is no triangle.");
            } else {
                System.out.println("There is one triangle.");
            }
        }
    }
}

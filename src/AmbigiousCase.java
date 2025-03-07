import java.util.Scanner;

public class AmbigiousCase {
    public static void main(String[] args) {
        // Ask the user for two sides and an angle
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the value of angle A(Degrees): ");
        double angleA = keyboard.nextDouble();
        System.out.println("Please enter the value of side a: ");
        double sideA = keyboard.nextDouble();
        System.out.println("Please enter the value of side b: ");
        double sideB = keyboard.nextDouble();        
        keyboard.close();
        
        double h = Math.sin(Math.toRadians(angleA)) * sideB;
        // Calculates what type of triangle is possible based on the values above
        if (angleA < 90) {
            if (sideA < h) {
                System.out.println("There is no triangle.");
            } else if (sideA == h) {
                System.out.println("The triangle is a right triangle.");
            } else if (sideA > sideB) {
                System.out.println("There is one triangle.");
            } else if (h < sideA && sideA < sideB) {
                System.out.println("There are two triangles(Amibgious Case).");
            } 
        } else {
            if (sideA < sideB || sideA == sideB) {
                System.out.println("There is no triangle.");
            } else {
                System.out.println("There is one triangle.");
            }
        }
    }
}

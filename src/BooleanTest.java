import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) {
        // Ask the user or two boolean varibles
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your A value");
        boolean A = scanner.nextBoolean();
        System.out.println("Please enter your B value");
        boolean B = scanner.nextBoolean();
        System.out.println("Please enter your C value");
        boolean C = scanner.nextBoolean();
        System.out.println("Please enter your D value");
        boolean D = scanner.nextBoolean();
        
        // NAND output
        boolean output = (B && !D) || (!B && !C && D) || (!A && !B && !C) || (A && C && !D);
        System.out.println("Your value is " + output);
        scanner.close();

    }
}


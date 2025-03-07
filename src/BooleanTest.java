import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) {
        // Ask the user or two boolean varibles
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your A value");
        boolean a = scanner.nextBoolean();
        System.out.println("Please enter your B value");
        boolean b = scanner.nextBoolean();
        System.out.println("Please enter your C value");
        boolean c = scanner.nextBoolean();
        System.out.println("Please enter your D value");
        boolean d = scanner.nextBoolean();
        
        // NAND output
        boolean output = b && !d || !b && !c && d || !a && !b && !c || a && c && !d;
        System.out.println("Your value is " + output);
        scanner.close();

    }
}


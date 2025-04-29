package Inheritance;

public class Main {
    public static void main(String[] args) { 
        final double LIFTFORCE = 3780988.36;
        Airplane Boeing747 = new Airplane("Boeing747", 200, 244.444, 12801.6, 7.32);
        System.out.println("Lift Coefficient: " + Boeing747.liftCoefficient(LIFTFORCE));
        System.out.println("Drag Coefficient: " + Boeing747.dragCoefficient(LIFTFORCE));
        System.out.println("Drag Force: " + Boeing747.dragForce(LIFTFORCE));
        System.out.println("Excess Thrust: " + Boeing747.excessThrust(LIFTFORCE));
    }

}

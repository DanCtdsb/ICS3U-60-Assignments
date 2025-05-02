package Inheritance;

public class Main {
    public static void main(String[] args) {
        final double LIFTFORCE = 3780988.36;
        final double DISTANCE = 2000.0;
        Transportation aircraft = new Transportation("Aircraft", 100, 20);
        Aircraft airplane = new Aircraft("Airplane", 300, 200);
        Airplane boeing747 = new Airplane("Boeing747", 200, 244.444, 12801.6, 7.32);
        System.out.println("Lift Coefficient: " + boeing747.liftCoefficient(LIFTFORCE));
        System.out.println("Drag Coefficient: " + boeing747.dragCoefficient(LIFTFORCE));
        System.out.println("Drag Force: " + boeing747.dragForce(LIFTFORCE));
        System.out.println("Excess Thrust: " + boeing747.excessThrust(LIFTFORCE));
        System.out.println("Estimate time to reach " + airplane.getAltitute() + "m : " + airplane.EstTimeForAlt() + 's');
        System.out.println("Difference of altitute between " + boeing747.getName() + " and " + airplane.getName()
                + " is : " + airplane.DifferenceinAlt(boeing747) + 'm');
        System.out.println("Time to reach " + DISTANCE + "m : " + aircraft.time(DISTANCE) + 's');
        System.out.println("Comparing " + aircraft.getName() + " and " + boeing747.getName() + "..." + aircraft.compareSpeed(boeing747) + " is faster");
        System.out.println("Fuel used with 0.001L/m: " + aircraft.fuelUsed(0.001, DISTANCE) + 'L');
        aircraft.addFuel(20);
        System.out.println("Adding 20L of fuel... Successfully added");
        System.out.println("Amount of fuel: " + aircraft.getFuel());

    }

}

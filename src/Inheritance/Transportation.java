package Inheritance;

/**
* Description of Test
*
* @author Daniel Chen
* @version 1.0
*/


public class Transportation {
    /**  */
    protected String name;
    protected double amountOfFuel;
    protected double avgSpeed;

    /**  
    * Constructs a Transportation object with the given parameters
    *
    * @param name - the name of the transportation system
    * @param amountOfFuel - the amount of fuel remaining in the system
    * @param avgSpeed - the average speed of the system
    */
    public Transportation(String name, double amountOfFuel, double avgSpeed) {
        this.name = name;
        this.amountOfFuel = amountOfFuel;
        this.avgSpeed = avgSpeed;
    }

    public Transportation(String name, double avgSpeed) {
        this(name, 0, avgSpeed);
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected double getFuel() {
        return amountOfFuel;
    }

    protected void setFuel(double fuel) {
        this.amountOfFuel = fuel;
    }

    protected double getAvgSpeed() {
        return avgSpeed;
    } 

    protected void setAltitute(double avgSpeed) {
        this.avgSpeed = avgSpeed;
    } 

    protected double avgSpeed() {
        return avgSpeed;
    }

    protected double time(double distance) {
        return Math.abs(distance / avgSpeed);
    }

    protected double distance(double time) {
        return Math.abs(time * avgSpeed);
    }

    protected String compareSpeed(Transportation trans) {
        return (avgSpeed > trans.avgSpeed()) ? name : trans.getName();
    }

    protected double fuelUsed(double fuelConsumption, double distance) {
        return fuelConsumption * distance;
    }

    protected void addFuel(double fuel) {
        amountOfFuel += fuel;
    }
}

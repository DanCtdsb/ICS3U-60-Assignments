package Inheritance;


/**
* The Transportation class serves as the class for all classes related to movement of people/goods.
* It extends to specific subclasses such as Aircraft and Airplane.
*
* Provides common properties of all types of transportation, such as the amount of fuel,
* and the average speed.
*
* @author Daniel Chen
* @version 1.0
*/


public class Transportation {
    /** The name of the transportation system*/
    protected String name;

    /** The amount of fuel left remaining in the system, in L*/
    protected double amountOfFuel;

    /** The average speed the transportation usually moves at, in m/s*/
    protected double avgSpeed;

    /**  
    * Constructs a Transportation object with the given parameters
    *
    * @param name the name of the transportation system
    * @param amountOfFuel the amount of fuel remaining in the system, in L
    * @param avgSpeed the average speed of the system, in m/s
    */
    public Transportation(String name, double amountOfFuel, double avgSpeed) {
        this.name = name;
        this.amountOfFuel = amountOfFuel;
        this.avgSpeed = avgSpeed;
    }

    /**  
    * Constructs a Transportation object with no fuel 
    *
    * @param name the name of the transportation system
    * @param avgSpeed the average speed of the system, in m/s
    */
    public Transportation(String name, double avgSpeed) {
        this(name, 0, avgSpeed);
    }
    /**  
    * Gets the name of the transportation method
    *
    * @return the name of the transportation method
    */
    protected String getName() {
        return name;
    }
    /**  
    * Changes the name of the transportation method
    *
    * @param wingspan the new name of the transportation method
    */
    protected void setName(String name) {
        this.name = name;
    }
    /**  
    * Gets the amount of fuel left in the transportation method, in L
    *
    * @return the amount of fuel left, in L
    */
    protected double getFuel() {
        return amountOfFuel;
    }
    /**  
    * Changes the amount of fuel in the transportation method
    *
    * @param wingspan the new amount of fuel in the transportation method, in L
    */
    protected void setFuel(double fuel) {
        this.amountOfFuel = fuel;
    }
    /**  
    * Gets the average speed of the transportation method, in m/s
    *
    * @return the average speed of the transportation method, in m/s
    */
    protected double getAvgSpeed() {
        return avgSpeed;
    } 
    /**  
    * Changes the average speed of the transportation method
    *
    * @param wingspan the new average speed of in the transportation method, in m/s
    */
    protected void setAvgSpeed(double avgSpeed) {
        this.avgSpeed = avgSpeed;
    } 
    /**  
    * Finds the time it takes to get to a certain distance based on speed, in s
    *
    * @param distance distance between the object and the current location of the transportation method
    * @return time it takes to reach a certain distance, in s
    */
    protected double time(double distance) {
        return Math.abs(distance / avgSpeed);
    }
    /**  
    * Finds the distance between the object and the current location of the transportation method
    *
    * @param time the time it takes to reach this distance
    * @return the distance between the object and the transportation method, in m
    */
    protected double distance(double time) {
        return Math.abs(time * avgSpeed);
    }
    /**  
    * Compares the speed between two transportation methods.
    *
    * @param trans another transportation object
    * @return the name of the transportation method that has the higher average speed, in m/s
    */
    protected String compareSpeed(Transportation trans) {
        return (avgSpeed > trans.getAvgSpeed()) ? name : trans.getName();
    }
    /**  
    * Finds the amount of fuel used from a certain distance.
    *
    * @param fuelComsumption the fuel used per distance, in m
    * @param distance the distance travelled, in m
    * @return the amount of fuel used
    */
    protected double fuelUsed(double fuelConsumption, double distance) {
        return fuelConsumption * distance;
    }
    /**  
    * Adds fuel to the total amount of fuel in the transportation method.
    *
    * @param fuel fuel amount added to the amount of fuel
    */
    protected void addFuel(double fuel) {
        amountOfFuel += fuel;
    }
}

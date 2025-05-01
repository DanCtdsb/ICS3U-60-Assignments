package Inheritance;


/**
* The Aircraft class is a subclass of Transportation
* The Aircraft class describes a transportation method that is capable of flight, with propertities such as altitute
* The Aircraft class is intented to extend into specific types of aircrafts, such as airplanes
*
* @author Daniel Chen
* @version 1.0
*/

public class Aircraft extends Transportation {
    /** The current altitute of the aircraft, in m */
    protected double altitute;

    /**  
    * Constructs a Aircraft object with the given parameters
    *
    * @param name the name of the transportation system
    * @param amountOfFuel the amount of fuel remaining in the system
    * @param avgSpeed the average speed of the system
    * @param altitute the current altitute the aircraft is at, in m
    */
    public Aircraft(String name, double fuel, double avgSpeed, double altitute) {
        super(name, fuel, avgSpeed);
        this.altitute = altitute;
    }
    /**  
    * Constructs a Aircraft object without the altitute
    *
    * @param name the name of the transportation system
    * @param amountOfFuel the amount of fuel remaining in the system, in L
    * @param avgSpeed the average speed of the system, in m/s
    */
    public Aircraft(String name, double fuel, double avgSpeed) {
        this(name, fuel, avgSpeed, 9144.0);
    }
    /**  
    * Gets the current altitute of the aircraft
    *
    * @return the altitute, in m
    */
    protected double getAltitute() {
        return altitute;
    } 
    /**  
    * Changes the curent altitute of the aircraft
    *
    * @param altitute the new altitute of the airplane, in N
    */
    protected void setAltitute(double altitute) {
        this.altitute = altitute;
    } 
    /**  
    * Finds the estimated time to reach the current altitute if altitute is 0, using avgSpeed
    *
    * @return the estimated time to reach the current altitute, in s
    */
    protected double EstTimeForAlt() {
        return altitute / avgSpeed;
    }
    /**  
    * Finds the difference between the altitute between two aircrafts
    *
    * @param airplane another aircraft object
    * @return the difference in altitute between the two aircrafts, in m
    */
    protected double DifferenceinAlt(Aircraft aircraft) {
        return Math.abs(altitute - aircraft.getAltitute());
    }
}

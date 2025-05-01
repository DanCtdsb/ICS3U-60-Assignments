package Inheritance;
/**
* The Airplane class is a subclass of Aircraft.
* The Airplane class describes an fixed-wing aircraft that is propelled forward by thrust through engines.
*
* @author Daniel Chen
* @version 1.0
*/

public class Airplane extends Aircraft {

    /** The wingspan of the airplane, in m*/
    private double wingspan;

    /** The thrust of the airplane's engines, in N */
    private double thrust;

    /** The chord length of the airplane */
    private double chordLen;

    /**  
    * Constructs a Aircraft object with the given parameters
    *
    * @param name the name of the transportation system
    * @param amountOfFuel the amount of fuel remaining in the system, in L
    * @param avgSpeed the average speed of the system, in m/s
    * @param altitute the current altitute the aircraft is at, in m
    * @param wingspan the wingspan(length from one wing to the other) of the airplane, in m
    * @param thrust the thrust force of the engines, in lb
    * @param chordLen the chord length, in m
    */
    public Airplane(String name, double fuel, double avgSpeed, double altitute, double wingspan, double thrust,
            double chordLen) {
        super(name, fuel, avgSpeed, altitute);
        this.wingspan = wingspan;
        this.thrust = thrust;
        this.chordLen = chordLen;
    }
    /**  
    * Constructs a Aircraft object without wingspan or thrust
    *
    * @param name the name of the transportation system
    * @param amountOfFuel the amount of fuel remaining in the system, in L
    * @param avgSpeed the average speed of the system, in m/s
    * @param altitute the current altitute the aircraft is at, in m
    * @param chordLen the chord length, in m
    */
    public Airplane(String name, double fuel, double avgSpeed, double altitute, double chordLen) {
        this(name, fuel, avgSpeed, altitute, 50, 19800, chordLen);
    }
    /**  
    * Constructs a Aircraft object without thrust
    *
    * @param name the name of the transportation system
    * @param amountOfFuel the amount of fuel remaining in the system, in L
    * @param avgSpeed the average speed of the system, in m/s
    * @param altitute the current altitute the aircraft is at, in m
    * @param wingspan the wingspan(length from one wing to the other) of the airplane, in m
    * @param chordLen the chord length, in m
    */
    public Airplane(String name, double fuel, double avgSpeed, double altitute, double wingspan, double chordLen) {
        this(name, fuel, avgSpeed, altitute, wingspan, 19800, chordLen);
    }
    /**  
    * Finds the area of the wings
    *
    * @return the wing area
    */
    public double wingArea() {
        return wingspan * chordLen;
    }
    /**  
    * Finds the aspect ratio of the airplane
    *
    * @return the aspect ratio
    */
    public double aspectRatio() {
        return wingspan * wingspan / wingArea();
    }
    /**  
    * Finds the lift coefficient based on the lift force based on Cl = L / (A * .5 * r * V^2)
    *
    * @param liftForce the lift force, in N
    * @return the lift coefficient
    */
    public double liftCoefficient(double liftForce) {
        return liftForce / (wingArea() * 0.5 * 1.225 * avgSpeed * avgSpeed);
    }
    /**  
    * Finds the drag coefficient based on Cdi = (Cl^2) / (π * AR * e), where e is 1, and r is 1.225
    *
    * @param liftForce the lift force, in N
    * @return the drag coefficient
    */
    public double dragCoefficient(double liftForce) {
        return Math.pow(liftCoefficient(liftForce), 2) / (Math.PI * aspectRatio() * 1);
    }
    /**  
    * Finds the drag Force based on D = (1/2) * Cd * ρ * A * V^2
    *
    * @param liftForce the lift force, in N
    * @return the drag Force
    */
    public double dragForce(double liftForce) {
        return 0.5 * dragCoefficient(liftForce) * 1.225 * wingArea() * Math.pow(avgSpeed, 2);
    }
     /**  
    * Finds the excess Thrust based on the liftForce
    *
    * @param liftForce the lift force, in N
    * @return the excess thrust
    */
    public double excessThrust(double liftForce) {
        return thrust - dragForce(liftForce) / 4.448;
    }
    /**  
    * Gets the wingspan of the airplane
    *
    * @return the wingspan
    */
    protected double getWingSpan() {
        return wingspan;
    } 
    /**  
    * Changes the wingspan of the airplane
    *
    * @param wingspan the new wingspan of the airplane, in m
    */
    protected void setWingSpan(double wingspan) {
        this.wingspan = wingspan;
    } 
    /**  
    * Gets the thrust of the airplane's engines
    *
    * @return the thrust
    */
    protected double getThrust() {
        return thrust;
    } 
    /**  
    * Changes the thrust of the airplane
    *
    * @param thrust the new thrust of the airplane, in N
    */
    protected void setThrust(double thrust) {
        this.thrust = thrust;
    } 
    /**  
    * Gets the chord length of the airplane
    *
    * @return the chord length, in m
    */
    protected double getChordLen() {
        return chordLen;
    } 
    /**  
    * Changes the chord length of the airplane
    *
    * @param chordlen the new chord length of the airplane, in m
    */
    protected void setAltitute(double chordLen) {
        this.chordLen = chordLen;
    } 
}

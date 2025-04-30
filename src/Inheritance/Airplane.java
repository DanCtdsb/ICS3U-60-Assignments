package Inheritance;

public class Airplane extends Aircraft {
    private double wingspan;
    private double thrust;
    private double chordLen;

    /**  
    * Constructs a Aircraft object with the given parameters
    *
    * @param name the name of the transportation system
    * @param amountOfFuel the amount of fuel remaining in the system, in L
    * @param avgSpeed the average speed of the system, in m/s
    * @param altitute the current altitute the aircraft is at, in m
    * @param wingspan the wingspan(length from one wing to the other) of the airplane, in m
    * @param thrust the thrust force, in lb
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
    * @return 
    */
    public double wingArea() {
        return wingspan * chordLen;
    }

    public double aspectRatio() {
        return wingspan * wingspan / wingArea();
    }

    public double liftCoefficient(double liftForce) {
        return liftForce / (wingArea() * 0.5 * 1.225 * avgSpeed * avgSpeed);
    }

    public double dragCoefficient(double liftForce) {
        return Math.pow(liftCoefficient(liftForce), 2) / (Math.PI * aspectRatio() * 1);
    }
    // Cdi = (Cl^2) / (π * AR * e), Cl = L / (A * .5 * r * V^2)
    // e is 1 for ideal case, ask for l, r is about 1.225

    public double dragForce(double liftForce) {
        return 0.5 * dragCoefficient(liftForce) * 1.225 * wingArea() * Math.pow(avgSpeed, 2);
    }
    // D = (1/2) * Cd * ρ * A * V^2, p is density, 1.225, Cd is the dragcoeff

    public double excessThrust(double liftForce) {
        return thrust - dragForce(liftForce) / 4.448;
    }

    protected double getWingSpan() {
        return wingspan;
    } 

    protected void setWingSpan(double wingspan) {
        this.wingspan = wingspan;
    } 

    protected double getThrust() {
        return thrust;
    } 

    protected void setThrust(double thrust) {
        this.thrust = thrust;
    } 

    protected double getChordLen() {
        return chordLen;
    } 

    protected void setAltitute(double chordLen) {
        this.chordLen = chordLen;
    } 
}

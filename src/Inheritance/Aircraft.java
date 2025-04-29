package Inheritance;

public class Aircraft extends Transportation {
    protected double altitute;

    /**  
    * Constructs a Aircraft object with the given parameters
    *
    * @param name - the name of the transportation system
    * @param amountOfFuel - the amount of fuel remaining in the system
    * @param avgSpeed - the average speed of the system
    * @param altitute - the current altitute the aircraft is at, in m
    */
    public Aircraft(String name, double fuel, double avgSpeed, double altitute) {
        super(name, fuel, avgSpeed);
        this.altitute = altitute;
    }

    public Aircraft(String name, double fuel, double avgSpeed) {
        this(name, fuel, avgSpeed, 9144.0);
    }

    protected double getAltitute() {
        return altitute;
    } 

    protected void setAltitute(double altitute) {
        this.altitute = altitute;
    } 

    protected double EstTimeForAlt() {
        return altitute / avgSpeed;
    }

    protected double DifferenceinAlt(Airplane airplane) {
        return Math.abs(altitute - airplane.getAltitute());
    }
}

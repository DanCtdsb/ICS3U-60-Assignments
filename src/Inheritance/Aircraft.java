package Inheritance;

public class Aircraft extends Transportation {
    protected double altitute;

    public Aircraft(String name, double fuel, double avgSpeed, double altitute) {
        super(name, fuel, avgSpeed);
        this.altitute = altitute;
    }

    public Aircraft(String name, double fuel, double avgSpeed) {
        this(name, fuel, avgSpeed, 9144.0);
    }

    public double EstTimeForAlt() {
        return altitute / avgSpeed;
    }
}

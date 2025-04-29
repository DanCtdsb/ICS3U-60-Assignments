package Inheritance;

public class Airplane extends Aircraft {
    private double wingspan;
    private double thrust;

    public Airplane(String name, double fuel, double avgSpeed, double altitute, double wingspan, double thrust) {
        super(name, fuel, avgSpeed, altitute);
        this.wingspan = wingspan;
        this.thrust = thrust;
    }
    public Airplane(String name, double fuel, double avgSpeed, double altitute) {
        this(name, fuel, avgSpeed, altitute, 50, 9900);
    }

    public Airplane(String name, double fuel, double avgSpeed, double altitute, double wingspan) {
        this(name, fuel, avgSpeed, altitute, wingspan, 9900);
    }

    public double WingArea(double chordLen) {
        return wingspan * chordLen;
    }

    public double AspectRatio(double chordLen) {
        return Math.pow(liftForce / (WingArea(chordlen) * 0.5 * 1.225 * Math.pow(avgSpeed, 2)), 2) / (Math.PI * AspectRatio(chordlen) * 1);
    }
    //Cdi = (Cl^2) / (π * AR * e), Cl = L / (A * .5 * r * V^2)
    // e is 1 for ideal case, ask for l, r is about 1.225
}

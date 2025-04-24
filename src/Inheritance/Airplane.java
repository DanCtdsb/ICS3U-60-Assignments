package Inheritance;

public class Airplane extends Aircraft {
    private double wingpsan;
    private double thrust;

    public Airplane(String name, double fuel, double avgSpeed, double altitute, double wingspan, double thrust) {
        super(name, fuel, avgSpeed, altitute);
        this.wingpsan = wingspan;
        this.thrust = thrust;
    }
    public Airplane(String name, double fuel, double avgSpeed, double altitute) {
        this(name, fuel, avgSpeed, altitute, 50, 9900);
    }

    public Airplane(String name, double fuel, double avgSpeed, double altitute, double wingspan) {
        this(name, fuel, avgSpeed, altitute, wingspan, 9900);
    }
}

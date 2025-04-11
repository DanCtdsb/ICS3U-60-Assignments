package Point;

public class Point {
    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point difference(Point point) {
        return new Point(x - point.getX(), y - point.getY());
    }
    public void displayCoordinate() {
        System.out.println("Your X coordinate is " + x);
        System.out.println("Your Y coordinate is " + y);
    }
    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.getX() - x, 2) + Math.pow(point.getY() - y, 2));
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void linearEquation(Point point) {
        double yInt = yIntercept(point);
        double slope = slope(point);
        if (Double.isInfinite(slope)) {
            System.out.println("x = " + point.getX());
        } else if (slope == 0) {
            System.out.println("y = " + point.getY());
        } else {
            System.out.println("y = " + slope + "x" + ((yInt != 0) ? ((yInt >= 0) ? " +" : " ") + yInt : ""));
        }
    }
    public Point midpoint(Point point) {
        return new Point((x + point.getX()) / 2, (y + point.getY()) / 2);
    }
    public double slope(Point point) {
        return (point.getY() - y) / (point.getX() - x);

    }
    public Point sum(Point point) {
        return new Point(x + point.getX(), y + point.getY());
    }
    double yIntercept(Point point) {
        return point.getY() - (point.getX() * slope(point));
    }
}
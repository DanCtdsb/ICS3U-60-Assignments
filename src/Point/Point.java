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
        return new Point(this.x - point.getX(), this.y - point.getY());
    }
    public void displayCoordinate() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.getX() - this.x, 2) + Math.pow(point.getY() - this.y, 2));
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
        System.out.println("y = " + slope + "x" + ((yInt >= 0) ? " +" : " ") + yInt);
    }
    public Point midpoint(Point point) {
        return new Point((this.x + point.getX()) / 2, (this.y + point.getY()) / 2);
    }
    public double slope(Point point) {
        return (point.getY() - this.y) / (point.getX() - this.x);

    }
    public Point sum(Point point) {
        return new Point(this.x + point.getX(), this.y + point.getY());
    }
    double yIntercept(Point point) {
        return point.getY() - (point.getX() * slope(point));
    }
}
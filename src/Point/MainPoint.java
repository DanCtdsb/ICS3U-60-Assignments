package Point;

public class MainPoint {
    public static void main(String[] args) {
        Point point0 = new Point();
        Point point1 = new Point(1, 1);
        Point point2 = new Point(-1, 1);


        point0.displayCoordinate();

        Point difference = point1.difference(point2);
        System.out.println("Difference: ");
        difference.displayCoordinate();

        Point sum = point1.sum(point2);
        System.out.println("Sum: ");
        sum.displayCoordinate();

        Point midpoint = point1.midpoint(point2);
        System.out.println("Midpoint: ");
        midpoint.displayCoordinate();

        double slope = point1.slope(point2);
        System.out.println("Slope: " + slope);

        double distance = point1.distance(point2);
        System.out.println("Distance: " + distance);

        double yInt = point1.yIntercept(point2);
        System.out.println("Y-Intercept: " + yInt);

        point1.linearEquation(point2);
    }
}

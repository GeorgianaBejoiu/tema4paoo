import java.util.List;

public class AreaCalculator {
    public static double sumAreas(List<Shape> shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            System.out.println("Area " + shape.getClass().getSimpleName() + ": " + shape.getArea());
            total += shape.getArea();
        }
        return total;
    }
}

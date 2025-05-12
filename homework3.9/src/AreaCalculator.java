public class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.getArea();  // Delegate to the shape to calculate area
    }
}

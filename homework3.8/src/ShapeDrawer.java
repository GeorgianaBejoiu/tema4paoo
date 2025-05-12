public class ShapeDrawer implements Drawing{
    @Override
    public void drawShape(Shape shape) {
        shape.draw();  // Delegating drawing responsibility to the shape object
    }
}

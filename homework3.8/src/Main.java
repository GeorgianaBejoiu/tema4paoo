//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Drawing drawer = new ShapeDrawer();

        // Drawing shapes using the drawing interface
        drawer.drawShape(circle);  // Drawing Circle
        drawer.drawShape(rectangle);  // Drawing Rectangle
    }
}
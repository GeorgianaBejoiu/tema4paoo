import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Shape> shapesList = new ArrayList<>();
        shapesList.add(new Circle(2));
        shapesList.add(new Rectangle(1, 3));
        shapesList.add(new Circle(1));

        double totalArea = AreaCalculator.sumAreas(shapesList);

        System.out.println("Total Area: " + totalArea);
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);       // Circle with radius 5
        Shape square = new Square(4.0);       // Square with side 4
        Shape rectangle = new Rectangle(6.0, 3.0);  // Rectangle with length 6 and width 3

        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println("Area of Circle: " + areaCalculator.calculateArea(circle));        // Area = 78.54
        System.out.println("Area of Square: " + areaCalculator.calculateArea(square));        // Area = 16
        System.out.println("Area of Rectangle: " + areaCalculator.calculateArea(rectangle));  // Area = 18
    }
    }

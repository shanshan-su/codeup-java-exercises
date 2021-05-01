package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Please enter a radius for a circle.");
        double radius = Input.getDouble();
        Circle circle = new Circle(radius);

        double area = circle.getArea(radius);
        double circumference = circle.getCircumference(radius);
        System.out.printf("The circle's radius is %f.\nIts circumference is %f.\nIts area is %f.\n", radius, circumference, area);
    }
}

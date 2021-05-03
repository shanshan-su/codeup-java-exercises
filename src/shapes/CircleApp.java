package shapes;

import util.Input;

public class CircleApp {

    private static int count = 0;

    public static void main(String[] args) {
        do {
            System.out.println("Please enter a radius for a circle.");
            double radius = Input.getDouble();
            Circle circle = new Circle(radius);

            double area = circle.getArea(radius);
            double circumference = circle.getCircumference(radius);
            System.out.printf("The circle's radius is %f.\nIts circumference is %f.\nIts area is %f.\n", radius, circumference, area);
            Circle.addOne(count);
            System.out.println();
            System.out.print("Would you like to make another circle? ");
        } while(Input.yesNo());
        System.out.printf("You've created %d circles.\n", count);
    }
}

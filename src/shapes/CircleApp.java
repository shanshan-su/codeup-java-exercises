package shapes;

import util.Input;

public class CircleApp {

    private static int count;

    public static int getCount() {
        return count;
    }

    public static int addOne(int count) {
        return count + 1;
    }

    public static void main(String[] args) {
        Input input = new Input();
        do {
            System.out.println("Please enter a radius for a circle.");
            double radius = input.getDouble();
            Circle circle = new Circle(radius);

            double area = circle.getArea(radius);
            double circumference = circle.getCircumference(radius);
            System.out.printf("The circle's radius is %f.\nIts circumference is %f.\nIts area is %f.\n", radius, circumference, area);
            count = addOne(count);
            System.out.println();
            System.out.print("Would you like to make another circle? ");
        } while(input.yesNo());
        System.out.printf("You've created %d circles.\n", getCount());
    }
}

package shapes;

import java.util.Scanner;

public class Circle {
    private double radius() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public Circle(double radius) {
        System.out.printf("A circle with radius %f is created!\n", radius);
    }

    public double getArea() {
        return Math.PI * (this.radius() * this.radius());
    }

    public double getArea(double radius) {
        return Math.PI * (radius * radius);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius();
    }

    public double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static int addOne(int number) {
        return number + 1;
    }
}

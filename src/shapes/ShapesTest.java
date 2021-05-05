package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Box1 area: " + box1.getArea());
        System.out.println("Box1 perimeter: " + box1.getPerimeter());

        System.out.println();

        Rectangle box2 = new Square(5);
        System.out.println("Box2 area: " + box2.getArea());
        System.out.println("Box2 perimeter: " + box2.getPerimeter());

        // How can you determine which getArea and getPerimeter methods are being called on each object? -----> Adding @Override before the overridden methods in subclass. Use it every time you override a method for two benefits. Do it so that you can take advantage of the compiler checking to make sure you actually are overriding a method when you think you are. This way, if you make a common mistake of misspelling a method name or not correctly matching the parameters, you will be warned that you method does not actually override as you think it does. Secondly, it makes your code easier to understand because it is more obvious when methods are overwritten.
    }
}

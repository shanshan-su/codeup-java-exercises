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
    }
}

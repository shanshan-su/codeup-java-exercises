package shapes;

public class Square extends Rectangle {
    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea() {
        System.out.println("Side: " + this.side);
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }
}

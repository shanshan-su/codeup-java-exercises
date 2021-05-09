package shapes;

public class Square extends Quadrilateral {
    // using the superclass Quadrilateral constructor, we don't need to declare a variable named side since Square extends Quadrilateral
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }
}

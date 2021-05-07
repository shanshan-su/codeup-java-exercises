package shapes;

public class Square extends Quadrilateral {
    protected double side;

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;  // why only length or width work?
//        return (this.length + this.width) * 2;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
//        return this.length * this.width;
    }
}

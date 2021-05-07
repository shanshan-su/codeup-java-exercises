package shapes;

public class Square extends Quadrilateral {
    protected double side;

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
        return this.length * 4;  // why only length or width work --> got to go back to the superclass to use the same variable name from superclass
//        return (this.length + this.width) * 2;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
//        return this.length * this.width;
    }
}

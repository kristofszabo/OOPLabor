package geometry;

public class Square extends Shape {

    private double d;

    public Square(double d) {
        this.d = d;
    }

    @Override
    public double getArea() {
        return d * d;
    }

    @Override
    public double getPerimeter() {
        return 4 * d;
    }

    @Override
    public String toString() {
        return "Square - d: " + d;
    }
}

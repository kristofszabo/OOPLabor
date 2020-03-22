package geometry;

import java.lang.Math;

public class Circle extends Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return r * r * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * r * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle - r: " + r;
    }
}

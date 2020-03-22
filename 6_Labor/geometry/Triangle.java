package geometry;

import java.lang.Math;

public class Triangle extends Shape {

    private double a, b, c;
    private double s;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = (a + b + c) / 2;
    }

    @Override
    public double getArea() {
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return 2 * s;
    }

    @Override
    public String toString() {
        return "Triangle - a: " + a + ", b: " + b + ", c: " + c;
    }
}

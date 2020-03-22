package geometry;

import java.util.ArrayList;

public class Compound extends Shape {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void add(Shape s) {
        shapes.add(s);
    }

    public Shape get(int i) {
        return shapes.get(i);
    }

    public int size() {
        return shapes.size();
    }

    @Override
    public double getArea() {
        double sum = 0;
        for (int i = 0; i < size(); i++) {
            sum += get(i).getArea();
        }
        return sum;
    }

    @Override
    public double getPerimeter() {
        double sum = 0;
        for (int i = 0; i < size(); i++) {
            sum += get(i).getPerimeter();
        }
        return sum;
    }

    @Override
    public String toString() {
        String s = "";
        for (Shape shape : shapes) {
            s += shape + "\n";
        }
        return s;
    }
}

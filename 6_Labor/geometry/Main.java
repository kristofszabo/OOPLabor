package geometry;

public class Main {
    public static void main(String[] args) {
        Compound comp = new Compound();
        comp.add(new Square(3));
        comp.add(new Square(4));
        comp.add(new Circle(2.5));
        comp.add(new Triangle(3, 4, 5));

        Compound c1 = new Compound();
        c1.add(new Circle(2));
        c1.add(new Circle(3));

        Compound c2 = new Compound();
        c2.add(new Square(2));
        c2.add(new Square(5));

        comp.add(c1);
        comp.add(c2);

        for (int i = 0; i < comp.size(); i++) {
            System.out.println(comp.get(i) + " ~ terület: " + comp.get(i).getArea());
        }
        System.out.println("A teljes terület: " + comp.getArea());
        System.out.println(comp);

    }
}
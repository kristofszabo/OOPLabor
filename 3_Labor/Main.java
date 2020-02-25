package oop.labor3;



public class Main {

    public static void main(String[] args) {
        Time time = new Time(8,2);

        time = time.sub(new Time(11,59));

        Fraction fraction = new Fraction(1,2);
        Fraction fraction2 = new Fraction(1,4);
        System.out.println(fraction.div(fraction2.rec));
        System.out.println(fraction.sub(fraction2));
    }
}

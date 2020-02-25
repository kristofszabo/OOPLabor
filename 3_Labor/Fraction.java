package oop.labor3;

public class Fraction {


    private int num;
    private int den;

    public Fraction(){
        this(0,1);
    }

    public Fraction(int p){
        this(p,1);
    }

    public Fraction(int p, int q){
        num = p;
        den = q;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public double doubleValue(){
        return (double) num/den;
    }

    public Fraction reciprocal(){
        return new Fraction(this.den, this.num);
    }

    public Fraction add(Fraction f){
        return new Fraction(
                f.num * this.den + this.num*f.den,
                f.den * this.den);
    }

    public Fraction sub(Fraction f){
        return add(new Fraction(-f.num,f.den));
    }

    public Fraction mult(Fraction f){
        return new Fraction(
                f.num * this.num,
                f.den * this.den);
    }

    public Fraction div(Fraction f){
        return mult(new Fraction(f.den, f.num));
    }

    @Override
    public String toString(){
        return this.num+"/"+this.den;
    }

}

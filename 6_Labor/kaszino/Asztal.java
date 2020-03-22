package kaszino;

import java.util.ArrayList;
import java.util.Random;

public class Asztal {
    final private int SZEKEK = 10;
    private ArrayList<Jatekos> jatekosok = new ArrayList<>();
    private double tet;
    private int kor;
    private double goal;

    public void ujJatek() {
        tet = 0;
        kor = 0;
        Random rand = new Random();
        goal = rand.nextDouble() * 100;
    }

    public void addJatekos(Jatekos j) {
        if (jatekosok.size() < SZEKEK) {
            jatekosok.add(j);
            j.setAsztal(this);
        } else {
            System.out.println("Nincs szabad hely!");
        }
    }

    public int getKor() { return this.kor;}

    public void emel(double d) {
        this.tet += d;
    }

    public void kor() {
        this.kor++;
        int ind = 0;
        while (ind < this.jatekosok.size() && this.tet < this.goal) {
            System.out.print((ind + 1) + ". játékos jön: ");
            this.jatekosok.get(ind).lep();
            if (this.tet > this.goal * 1.1) {
                System.out.println("Nagyon túl ment a tét a célon, mindeki veszít! A cél " + this.goal + ". volt.");
            } else if (this.tet >= this.goal) {
                System.out.println("Nyert a(z) " + (ind + 1) + ". játékos, a cél " + this.goal + " volt.");
            }
            ind++;
        }
    }

    public double getTet() { return this.tet;}
}
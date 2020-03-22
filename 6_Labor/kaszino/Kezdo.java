package kaszino;

public class Kezdo extends Jatekos {

    private String nev;

    public Kezdo(String nev) {
        this.nev = nev;
    }

    @Override
    public void lep() {
        System.out.println(nev + " - " + asztal.getKor() + ". kör és a tét " + asztal.getTet() + ".");
        if (asztal.getKor() % 2 == 1) {
            System.out.println("Passzolt.");
        } else  {
            System.out.println("Adja meg mennyivel szeretne emelni: 1.0");
            asztal.emel(1);
        }
    }

    @Override
    public String toString() {
        return nev;
    }
}

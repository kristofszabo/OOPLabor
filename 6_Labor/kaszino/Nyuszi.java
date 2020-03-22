package kaszino;

public class Nyuszi extends Jatekos {

    private String szin;

    public Nyuszi(String szin) {
        this.szin = szin;
    }

    @Override
    public void lep() {
        System.out.println(szin + " Nyuszi " + " - " + asztal.getKor() + ". kör és a tét " + asztal.getTet() + ".");
        if (asztal.getTet() <= 50) {
            System.out.println("Adja meg mennyivel szeretne emelni: 5.0");
            asztal.emel(5);
        } else {
            System.out.println(asztal.getTet() + "! " + "Húha!");
        }
    }

    @Override
    public String toString() {
        return szin;
    }
}

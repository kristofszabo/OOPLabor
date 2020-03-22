package kaszino;

public class Mester extends Jatekos {

    private int fokozat;

    public Mester(int fokozat) {
        this.fokozat = fokozat;
    }

    @Override
    public void lep() {
        System.out.println("Mester " + fokozat + ". - " + asztal.getKor() + ". kör és a tét " + asztal.getTet() + ".");
        System.out.println("Adja meg mennyivel szeretne emelni: " + fokozat);
        asztal.emel(fokozat);
    }

    @Override
    public String toString() {
        return "Mester " + fokozat;
    }
}

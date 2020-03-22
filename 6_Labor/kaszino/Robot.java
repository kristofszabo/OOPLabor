package kaszino;

public class Robot extends Jatekos {

    public static int azonosito = 1;
    private String nev;

    public Robot() {
        this.nev = "Robot" + azonosito;
        azonosito++;
    }

    @Override
    public void lep() {
        System.out.println(nev + " - " + asztal.getKor() + ". kör és a tét " + asztal.getTet() + ".");
    }

    @Override
    public String toString() {
        return nev;
    }

}

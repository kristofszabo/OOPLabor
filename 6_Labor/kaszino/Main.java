package kaszino;

public class Main {
    public static void main(String[] args) {
        Asztal asztal = new Asztal();
        asztal.addJatekos(new Robot());
        asztal.addJatekos(new Kezdo("Jancsi"));
        asztal.addJatekos(new Robot());
        asztal.addJatekos(new Kezdo("Juli"));
        asztal.addJatekos(new Robot());
        asztal.addJatekos(new Mester(3));
        asztal.addJatekos(new Robot());
        asztal.addJatekos(new Nyuszi("Fehér"));
        asztal.addJatekos(new Robot());
        asztal.addJatekos(new Ember());
        asztal.ujJatek();

        for (int i = 0; i < 10; i++) {
            asztal.kor();
        }

    }
}

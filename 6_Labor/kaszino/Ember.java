package kaszino;

import java.util.Scanner;

public class Ember extends Jatekos {

    @Override
    public void lep() {
        System.out.println(asztal.getKor() + ". kör és a tét " + asztal.getTet() + ".");
        Scanner sc = new Scanner(System.in);
        System.out.println("Mit szeretne csinálni?" +
                "\n\t1 - Tétet emelni" +
                "\n\t2 - Passzolni");
        int valasz = sc.nextInt();
        if (valasz == 1) {
            System.out.print("Adja meg mennyivel szeretne emelni: ");
            double emeles = sc.nextDouble();
            asztal.emel(emeles);
        } else {
            System.out.println("Passzolt.");
        }
    }
}

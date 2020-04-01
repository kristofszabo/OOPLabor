package KollekcioKeretrendszer;

import java.util.ArrayList;
import java.util.Collections;

public class Search extends Command {

    public Search() {
        super("search");
    }

    @Override
    public void action(ArrayList<Beer> beers, String[] cmd) {
        if (cmd[1].equals("name")) {
            for (Beer b : beers) {
                if (b.getName().equals(cmd[2])) {
                    System.out.println(b);
                }
            }
        } else if (cmd[1].equals("style")) {
            for (Beer b : beers) {
                if (b.getStyle().equals(cmd[2])) {
                    System.out.println(b);
                }
            }
        } else if (cmd[1].equals("strength")) {
            double sgt = Double.parseDouble(cmd[2]);
            for (Beer b : beers) {
                if (b.getStrength() == sgt) {
                    System.out.println(b);
                }
            }
        }
    }
}
package KollekcioKeretrendszer;

import java.util.ArrayList;

public class Find extends Command {

    public Find() {
        super("find");
    }

    @Override
    public void action(ArrayList<Beer> beers, String[] cmd) {
        if (cmd[1].equals("name")) {
            for (Beer b : beers) {
                if (b.getName().contains(cmd[3])) {
                    System.out.println(b);
                }
            }
        } else if (cmd[1].equals("style")) {
            for (Beer b : beers) {
                if (b.getStyle().contains(cmd[2])) {
                    System.out.println(b);
                }
            }
        } else if (cmd[1].equals("strength")) {
            double sgt = Double.parseDouble(cmd[2]);
            for (Beer b : beers) {
                if (b.getStrength() >= sgt) {
                    System.out.println(b);
                }
            }
        } else if (cmd[1].equals("weaker")) {
            double wkr = Double.parseDouble(cmd[2]);
            for (Beer b : beers) {
                if (b.getStrength() <= wkr) {
                    System.out.println(b);
                }
            }
        }
    }
}
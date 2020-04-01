package KollekcioKeretrendszer;

import java.util.ArrayList;
import java.util.Collections;

public class List extends Command {

    public List() {
        super("list");
    }

    @Override
    public void action(ArrayList<Beer> beers, String[] cmd) {
        if (cmd.length > 1) {
            if (cmd[1].equals("name")) {
                Collections.sort(beers, new NameComparator());
            } else if (cmd[1].equals("style")) {
                Collections.sort(beers, new StyleComparator());
            } else if (cmd[1].equals("strength")) {
                Collections.sort(beers, new StrengthComparator());
            }
        }
        for (Beer b : beers) {
            System.out.println(b);
        }
    }
}
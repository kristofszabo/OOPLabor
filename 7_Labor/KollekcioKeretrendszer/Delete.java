package KollekcioKeretrendszer;

import java.util.ArrayList;

public class Delete extends Command {

    public Delete() {
        super("delete");
    }

    @Override
    public void action(ArrayList<Beer> beers, String[] cmd) {
        for (int i = 0; i < beers.size(); i++) {
            if (beers.get(i).getName().equals(cmd[1])) {
                beers.remove(i);
                break;
            }
        }
    }
}

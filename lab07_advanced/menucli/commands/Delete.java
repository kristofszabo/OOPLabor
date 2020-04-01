package menucli.commands;

import menucli.Beer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Delete extends Command {
    public Delete() {
        super("delete");
    }

    @Override
    public void action(ArrayList<Beer> beers, String[] cmd) {
        Beer sample = new Beer(cmd[1], "", 0);
        int index = Collections.binarySearch(beers, sample, new NameComparator());
        beers.remove(index);
        System.out.println(cmd[1] + " deleted!");
    }

    private class NameComparator implements Comparator<Beer> {
        @Override
        public int compare(Beer b1, Beer b2) {
            return b1.getName().compareTo(b2.getName());
        }
    }
}

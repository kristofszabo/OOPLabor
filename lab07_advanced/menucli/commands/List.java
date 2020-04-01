package menucli.commands;

import menucli.Beer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class List extends Command {

    private HashMap<String, Comparator<Beer>> comps;

    public List() {
        super("list");
        comps = new HashMap<>();
        comps.put("name", new NameComparator());
        comps.put("style", new StyleComparator());
        comps.put("strength", new StrengthComparator());
    }

    @Override
    public void action(ArrayList<Beer> beers, String[] cmd) {
        // Command format:
        // list OptionalArg => OptionalArg can be name, style, strength

        // If we have the optional parameter
        if(cmd.length > 1) {
            // And then if it is a valid parameter sort it
            try {
                beers.sort(comps.get(cmd[1]));
            } catch (NullPointerException err) {
                // If it wasn't a valid parameter then notify the user.
                System.err.println("Invalid list command flag: " + cmd[1]);
                System.err.println("Valid flags: " + comps.keySet().toString());
                return;
            }
        }

        for(Beer beer : beers) System.out.println(beer);
    }

    private class NameComparator implements Comparator<Beer> {
        @Override
        public int compare(Beer b1, Beer b2) {
            return b1.getName().compareTo(b2.getName());
        }
    }

    private class StyleComparator implements Comparator<Beer> {
        @Override
        public int compare(Beer b1, Beer b2) {
            return b1.getStyle().compareTo(b2.getStyle());
        }
    }

    private class StrengthComparator implements Comparator<Beer> {
        @Override
        public int compare(Beer b1, Beer b2) {
            // Later if it matters anything, we can implement
            // cheking with a very small epsilon value
            if(b1.getStrength() < b2.getStrength()) {
                return -1;
            } else if(b1.getStrength() > b2.getStrength()) {
                return 1;
            }
            return 0;
        }
    }

}

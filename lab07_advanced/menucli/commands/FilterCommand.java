package menucli.commands;

import menucli.Beer;

import java.util.ArrayList;
import java.util.function.BiFunction;

public abstract class FilterCommand extends Command {

    public FilterCommand(String name) {
        super(name);
    }

    protected void writeResults(ArrayList<Beer> beers, String query, BiFunction<Beer, String, Boolean> compare) {
        for (Beer beer : beers) {
            if (compare.apply(beer, query)) {
                System.out.println(beer);
            }
        }
    }

    protected abstract boolean compareByName(Beer beer, String query);
    protected abstract boolean compareByStyle(Beer beer, String query);
    protected abstract boolean compareByStrength(Beer beer, String query);
}

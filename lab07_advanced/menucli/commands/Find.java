package menucli.commands;

import menucli.Beer;

import java.util.ArrayList;


public class Find extends FilterCommand {
    public Find() {
        super("find");
    }

    @Override
    public void action(ArrayList<Beer> beers, String[] cmd) {
        // Command format:
        // search optional BeerName => optional can be name, style, strength

        // If we don't have the optional argument
        if(cmd.length < 3) {
            writeResults(beers, cmd[1], this::compareByName);
            return;
        }

        switch (cmd[1]) {
            case "name":
                writeResults(beers, cmd[2], this::compareByName);
                break;
            case "style":
                writeResults(beers, cmd[2], this::compareByStyle);
                break;
            case "strength":
                writeResults(beers, cmd[2], this::compareByStrength);
                break;
            case "weaker":
                writeResults(beers, cmd[2], this::compareByWeaker);
                break;
            default:
                System.err.println("Invalid flag:" + cmd[1]);
                break;
        }

    }

    @Override
    protected boolean compareByName(Beer beer, String query) {
        return beer.getName().contains(query);
    }

    @Override
    protected boolean compareByStyle(Beer beer, String query) {
        return beer.getStyle().contains(query);
    }

    @Override
    protected boolean compareByStrength(Beer beer, String query) {
        return beer.getStrength() >= Double.parseDouble(query);
    }

    private boolean compareByWeaker(Beer beer, String query) {
        return beer.getStrength() <= Double.parseDouble(query);
    }
}

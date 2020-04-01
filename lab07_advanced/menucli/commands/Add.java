package menucli.commands;

import menucli.Beer;

import java.util.ArrayList;

public class Add extends Command {

    public Add() {
        super("add");
    }


    @Override
    public void action(ArrayList<Beer> beers, String[] cmd) {
        // Command format:
        // add BeerName BeerStyle, BeerStrength
        beers.add(new Beer(cmd[1], cmd[2], Double.parseDouble(cmd[3])));
        System.out.println("Added!");
    }
}

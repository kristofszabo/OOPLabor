package menucli;

import menucli.commands.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class BeerRegister {

    private static HashMap<String, Command> commands = new HashMap<>();
    private static ArrayList<Beer> beers = new ArrayList<>();

    public static void main(String[] args) {
        init();

        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("Irj be egy parancsot!");
        System.out.println("------------------------------------");
        System.out.println("add Name Style Strength");
        System.out.println("list [type]");
        System.out.println("search [type] <query>");
        System.out.println("find [type] <query>");
        System.out.println("delete <name>");
        System.out.println("exit");
        System.out.println("[] optional, <> required");
        System.out.println("------------------------------------");

        while (true) {
            // Get the command from the user, and split it
            String[] cmd = input.nextLine().split(" ");

            // If it was exit, quit
            if(cmd[0].equals("exit")) break;

            // If it wasn't exit, perform the command's action
            try {
                commands.get(cmd[0].toLowerCase()).action(beers, cmd);
            } catch (NullPointerException err) {
                // well, if the command doesn't exist, that's a problem
                System.err.println("Nincs ilyen parancs: " + cmd[0]);
            }
        }
    }

    private static void init() {
        commands = new HashMap<>();
        beers = new ArrayList<>();

        commands.put("add", new Add());
        commands.put("list", new List());
        commands.put("search", new Search());
        commands.put("find", new Find());
        commands.put("delete", new Delete());
    }
}

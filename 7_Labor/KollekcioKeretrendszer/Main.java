package KollekcioKeretrendszer;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ArrayList<Beer> beers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        HashMap<String, Command> commands = new HashMap<>();
        commands.put("add", new Add());
        commands.put("list", new List());
        commands.put("search", new Search());
        commands.put("find", new Find());
        commands.put("delete", new Delete());

        beers.add(new Beer("Guinness", "stout", 4.2));
        beers.add(new Beer("Leffe_bruin", "brown_ale", 6.5));
        beers.add(new Beer("Dr_Eher", "pilsner", 5.2));

        while (true) {
            String[] input = sc.nextLine().split(" ");
            //System.out.println(input[0] + " " + input.length);
            if (input[0].equals("exit")) {
                break;
            } else {
                commands.get(input[0]).action(beers, input);
            }
        }
    }
}
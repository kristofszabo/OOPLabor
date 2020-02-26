package lukacsmate;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = inputNumbers();
        double avg = listAverage(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > avg) {
                System.out.print(list.get(i) + ", ");
            }
        }
    }

    public static ArrayList inputNumbers() {
        Scanner input = new Scanner(System.in);
        int n = 10;
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < n) {
            list.add(input.nextInt());
            i++;
        }
        return list;
    }

    public static double listAverage(ArrayList<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }
}

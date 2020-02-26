package lukacsmate;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Double> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(input.nextDouble());
        }
        arrayListOut(list);
        insertionSort(list);
        arrayListOut(list);
    }

    public static void arrayListOut(ArrayList<Double> list){
        for (double x : list) {
            System.out.print(x + ", ");
        }
        System.out.println();
    }

    public static void insertionSort(ArrayList<Double> list) {
        for (int i = 1; i < list.size(); i++) {
            int j = i;
            while (j > 0 && list.get(j - 1) > list.get(j)) {
                double temp = list.get(j);
                list.set(j, list.get(j - 1));
                list.set(j - 1, temp);
                j--;
            }
        }
    }
}

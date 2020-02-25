package lukacsmate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5)), b = new ArrayList<>(Arrays.asList(0, -1, 2, -3, 4, -5));
        arrayListOut(a, b);
        arrayListPositional(a, b);
        arrayListOut(a, b);
    }

    public static void arrayListOut(ArrayList<Integer> a, ArrayList<Integer> b){
        for (int x : a) {
            System.out.print(x + ", ");
        }
        System.out.println();
        for (int x : b) {
            System.out.print(x + ", ");
        }
        System.out.println();
    }

    public static void arrayListPositional(ArrayList<Integer> a, ArrayList<Integer> b){
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < 0) {
                a.set(i, a.get(i) * -1);
            }
        }
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i) < 0) {
                b.set(i, b.get(i) * -1);
            }
        }
        arrayListOut(a, b);
    }
}

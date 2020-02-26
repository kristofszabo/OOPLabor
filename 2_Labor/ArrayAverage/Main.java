package lukacsmate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = inputNumbers();
        double avg = arrayAverage(arr);
        for (int x : arr) {
            if (x > avg) {
                System.out.print(x + ", ");
            }
        }
    }

    public static int[] inputNumbers() {
        Scanner input = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];
        int i = 0;
        while (i < n) {
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }

    public static double arrayAverage(int[] arr) {
        double sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum / arr.length;
    }
}

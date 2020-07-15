package lukacsmate;

public class ArrayParameters {

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5}, b = {0, -1, 2, -3, 4, -5};
        arrayOut(a, b);
        arrayPositional(a, b);
        arrayOut(a, b);
    }

    public static void arrayOut(int[] a, int[] b){
        for (int x : a) {
            System.out.print(x + ", ");
        }
        System.out.println();
        for (int x : b) {
            System.out.print(x + ", ");
        }
        System.out.println();
    }

    public static void arrayPositional(int[] a, int[] b){
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] *= -1;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] < 0) {
                b[i] *= -1;
            }
        }
        arrayOut(a, b);
    }
}
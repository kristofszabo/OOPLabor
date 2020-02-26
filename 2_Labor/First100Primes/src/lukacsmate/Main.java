package lukacsmate;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; count < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
                count++;
            }
        }
    }

    public static int divisorCount(int num) {
        int count = 2;
        for (int i = 2; i < num / 2 + 1; i++) {
            if (num % i == 0) {
                count++;

            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        return divisorCount(num) == 2;
    }

}

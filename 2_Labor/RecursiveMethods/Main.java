package lukacsmate;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(20));
        System.out.println(fibonacci(10));
    }

    public static long factorial(long num) {
        if (num <= 1) {
            return 1;
        }
        try {
            if (num > Long.MAX_VALUE / factorial(num - 1)) {
                return 0;
            } else {
                return num * factorial(num - 1);
            }
        } catch (ArithmeticException  e) {
            return 0;
        }
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
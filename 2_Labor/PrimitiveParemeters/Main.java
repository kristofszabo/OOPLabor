package lukacsmate;

public class Main {

    public static void main(String[] args) {
	    int a = 11, b = 13;
	    outputTwo(a, b);
	    convertTwo(a, b);
        outputTwo(a, b);
    }

    public static void outputTwo(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    public static void convertTwo(int a, int b) {
        a *= -1;
        b *= -1;
        outputTwo(a, b);
    }

}

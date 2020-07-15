package lukacsmate;

public class TowerofHanoi {

    public static void main(String[] args) {
        hanoi(4, "A", "B", "C");
    }

    public static void hanoi(int n, String from, String helper, String to) {
        if (n == 0) {
            return;
        }
        hanoi(n - 1, from, to, helper);
        System.out.println(from + " -> " + to);
        hanoi(n - 1, helper, from, to);
    }
}

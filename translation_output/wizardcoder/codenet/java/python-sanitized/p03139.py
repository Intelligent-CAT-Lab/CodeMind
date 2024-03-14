import java.util.Scanner;

public class p03139 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(min(A, B) + " " + max(0, A + B - N));
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
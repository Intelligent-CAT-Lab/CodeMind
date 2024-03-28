import java.util.Scanner;

public class p00575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        int a = (int) Math.ceil(C / A);
        int s = 7 * A + B;
        int t = C / s;
        int u = C - s * t;
        int v = (int) Math.ceil(u / A);
        int b = 7 * t + v;
        if (v <= 7) {
            b = 7 * t + 7;
        }
        if (a > b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
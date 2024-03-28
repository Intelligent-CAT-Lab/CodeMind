import java.util.Scanner;

public class codeforces_569_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int s = sc.nextInt();
        int q = sc.nextInt();
        double v = (double)(q - 1) / q;
        int tm = 1;
        double t = (double)s / (1 - v);
        while (T - s > 0 && (T - s) / v - t > 0) {
            if ((T - s) / v - t < 1e-10) {
                break;
            }
            tm++;
            s += v * t;
            t = (double)s / (1 - v);
        }
        System.out.println(tm);
    }
}
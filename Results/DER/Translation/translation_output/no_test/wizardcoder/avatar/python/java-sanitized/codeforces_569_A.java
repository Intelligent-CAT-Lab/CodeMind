import java.util.Scanner;

public class codeforces_569_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, s, q, v, tm, t;
        T = sc.nextInt();
        s = sc.nextInt();
        q = sc.nextInt();
        v = (q - 1) / q;
        tm = 1;
        t = s / (1 - v);
        while ((T - s) / v - t > 0) {
            if ((T - s) / v - t < 1e-10) {
                break;
            }
            tm++;
            s += v * t;
            t = s / (1 - v);
        }
        System.out.println(tm);
    }
}
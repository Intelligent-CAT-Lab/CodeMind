import java.util.*;
public class codeforces_569_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, s, q;
        T = sc.nextInt();
        s = sc.nextInt();
        q = sc.nextInt();
        double v = (q - 1) / q;
        int tm = 1;
        double t = s / (1 - v);
        while ((T - s) / v - t > 0) {
            if ((T - s) / v - t < 1e-10) {
                break;
            }
            tm += 1;
            s += v * t;
            t = s / (1 - v);
        }
        System.out.println(tm);
    }
}
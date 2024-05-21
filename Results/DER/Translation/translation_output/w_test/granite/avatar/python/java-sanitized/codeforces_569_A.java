import java.util.*;

public class codeforces_569_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double T = sc.nextDouble();
        double s = sc.nextDouble();
        double q = sc.nextDouble();
        double v = (q - 1) / q;
        double tm = 1;
        double t = s / (1 - v);
        while ((T - s) / v - t > 0) {
            if ((T - s) / v - t < 1e-10) {
                break;
            }
            tm += 1;
            s += v * t;
            t = s / (1 - v);
        }
        System.out.println((int) tm);
    }
}
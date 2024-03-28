import java.util.Scanner;

public class codeforces_569_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        double v = (double)(q - 1) / q;
        int tm = 1;
        double t = (double)s / (1 - v);
        while (Math.abs((T - s) / v - t) > 1e-10) {
            tm += 1;
            s += (int)(v * t);
            t = s / (1 - v);
        }
        System.out.println(tm);
    }
}
import java.util.*;

public class codeforces_569_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int T = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int q = Integer.parseInt(input[2]);
        double v = (double) (q - 1) / q;
        double tm = 1;
        double t = (double) s / (1 - v);
        while (((double) (T - s)) / v - t > 0) {
            if (((double) (T - s)) / v - t < 1e-10) {
                break;
            }
            tm += 1;
            s += (int) (v * t);
            t = (double) s / (1 - v);
        }
        System.out.println((int) tm);
    }
}
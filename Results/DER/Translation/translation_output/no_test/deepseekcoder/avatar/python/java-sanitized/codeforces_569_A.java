import java.util.Scanner;

public class codeforces_569_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int T = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int q = Integer.parseInt(input[2]);
        double v = (double) (q - 1) / q;
        int tm = 1;
        double t = (double) s / (1 - v);
        while ((T - s) / v - t > 0) {
            if (Math.abs((T - s) / v - t) < 1e-10) {
                break;
            }
            tm += 1;
            s += (int) (v * t);
            t = (double) s / (1 - v);
        }
        System.out.println(tm);
    }
}
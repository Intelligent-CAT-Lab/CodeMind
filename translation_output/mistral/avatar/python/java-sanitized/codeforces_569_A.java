import java.util.Scanner;

public class codeforces_569_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T, s, q;
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        T = Integer.parseInt(split[0]);
        s = Integer.parseInt(split[1]);
        q = Integer.parseInt(split[2]);
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
        System.out.println(tm);
    }
}
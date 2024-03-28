import java.util.Scanner;

public class p02471 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            int y0, x0, gcd;
            y0 = x0 = gcd = 0;
            gcd = b;
            while (true) {
                int q = a / gcd;
                int r = a % gcd;
                if (r == 0) {
                    break;
                }
                int y, x;
                y = x = 0;
                y = x0;
                x = y0 - q * x0;
                a = gcd;
                b = r;
                x0 = x;
                y0 = y;
                gcd = r;
            }
            System.out.println(x0 + " " + y0);
        } else {
            int x0, y0, gcd;
            x0 = y0 = gcd = 0;
            gcd = a;
            while (true) {
                int q = b / gcd;
                int r = b % gcd;
                if (r == 0) {
                    break;
                }
                int y, x;
                y = x = 0;
                y = y0 - q * y0;
                x = x0 + q * y0;
                a = gcd;
                b = r;
                x0 = x;
                y0 = y;
                gcd = r;
            }
            System.out.println(x0 + " " + y0);
        }
    }
}
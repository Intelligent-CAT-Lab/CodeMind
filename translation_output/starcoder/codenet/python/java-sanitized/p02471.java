import java.util.*;

public class p02471 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b) {
            int x0 = 1, y0 = 0, gcd = b;
            while (a % gcd!= 0) {
                int q = a / gcd;
                int r = a % gcd;
                int x1 = y0 - q * x0;
                int y1 = x0;
                gcd = r;
                x0 = x1;
                y0 = y1;
            }
            System.out.println(x0 + " " + y0);
        } else {
            int x0 = 0, y0 = 1, gcd = a;
            while (b % gcd!= 0) {
                int q = b / gcd;
                int r = b % gcd;
                int x1 = y0 - q * x0;
                int y1 = x0;
                gcd = r;
                x0 = x1;
                y0 = y1;
            }
            System.out.println(x0 + " " + y0);
        }
    }
}
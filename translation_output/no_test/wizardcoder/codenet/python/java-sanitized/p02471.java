import java.util.Scanner;

public class p02471 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a < b) {
            int y0, x0, gcd;
            y0 = x0 = gcd = 0;
            gcd = rec(b, a, y0, x0, gcd);
        } else {
            int x0, y0, gcd;
            x0 = y0 = gcd = 0;
            gcd = rec(a, b, x0, y0, gcd);
        }

        int dx = b / gcd;
        int dy = -a / gcd;
        if (dx < 0) {
            dx = -dx;
            dy = -dy;
        }
        int x = x0;
        int y = y0;
        int mag = Math.abs(x) + Math.abs(y);

        while (true) {
            int x1 = x + dx;
            int y1 = y + dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 >= mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }

        while (true) {
            int x1 = x - dx;
            int y1 = y - dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 > mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }

        System.out.println(x + " " + y);
    }

    public static int rec(int a, int b, int y0, int x0, int gcd) {
        if (b == 0) {
            return gcd;
        }
        int q = a / b;
        int r = a % b;
        int y, x, g;
        y = x = g = 0;
        g = rec(b, r, y, x, g);
        y = y0 + x0 * q;
        x = x0 - y0 * q;
        gcd = g;
        return gcd;
    }
}
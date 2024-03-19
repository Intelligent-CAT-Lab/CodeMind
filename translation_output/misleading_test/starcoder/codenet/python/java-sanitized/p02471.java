import java.util.*;

public class p02471 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int x0 = 0, y0 = 1, gcd = 0;
        if (a < b) {
            int q = a / b;
            int r = a % b;
            x0 = y0 = 1;
            gcd = b;
            while (r!= 0) {
                int x1 = y0;
                int y1 = x0 - q * y0;
                int gcd1 = gcd;
                x0 = x1;
                y0 = y1;
                gcd = gcd1;
                q = a / b;
                r = a % b;
            }
        } else {
            int q = b / a;
            int r = b % a;
            x0 = y0 = 1;
            gcd = a;
            while (r!= 0) {
                int x1 = y0;
                int y1 = x0 - q * y0;
                int gcd1 = gcd;
                x0 = x1;
                y0 = y1;
                gcd = gcd1;
                q = b / a;
                r = b % a;
            }
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
}
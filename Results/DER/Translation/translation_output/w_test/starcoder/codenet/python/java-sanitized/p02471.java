import java.util.*;

public class p02471 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int x = 0, y = 1, gcd = 0;
        if (a < b) {
            int q = a / b;
            int r = a % b;
            x = q;
            y = 1;
            gcd = b;
        } else {
            int q = b / a;
            int r = b % a;
            x = 1;
            y = q;
            gcd = a;
        }
        while (r!= 0) {
            int q = a / b;
            int r = a % b;
            int x1 = y;
            int y1 = x - q * y;
            int gcd1 = b;
            a = b;
            b = r;
            x = x1;
            y = y1;
            gcd = gcd1;
        }
        int dx = b / gcd;
        int dy = -a / gcd;
        if (dx < 0) {
            dx = -dx;
            dy = -dy;
        }
        int x1 = x + dx;
        int y1 = y + dy;
        int mag = Math.abs(x1) + Math.abs(y1);
        while (true) {
            int x2 = x1 + dx;
            int y2 = y1 + dy;
            int mag1 = Math.abs(x2) + Math.abs(y2);
            if (mag1 >= mag) {
                break;
            }
            mag = mag1;
            x1 = x2;
            y1 = y2;
        }
        while (true) {
            int x2 = x1 - dx;
            int y2 = y1 - dy;
            int mag1 = Math.abs(x2) + Math.abs(y2);
            if (mag1 > mag) {
                break;
            }
            mag = mag1;
            x1 = x2;
            y1 = y2;
        }
        System.out.println(x1 + " " + y1);
    }
}
import java.util.Scanner;

public class p02471 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long x = 0, y = 0, gcd = 0;
        if (a < b) {
            long temp = a;
            a = b;
            b = temp;
        }
        while (b!= 0) {
            long q = a / b;
            long r = a % b;
            a = b;
            b = r;
            long tempX = x;
            x = y;
            y = tempX - q * y;
        }
        gcd = a;
        long dx = b / gcd;
        long dy = -a / gcd;
        if (dx < 0) {
            dx = -dx;
            dy = -dy;
        }
        x = x % gcd;
        if (x < 0) {
            x += gcd;
        }
        y = (a * x + b * y) / gcd;
        while (true) {
            long x1 = x + dx;
            long y1 = y + dy;
            if (Math.abs(x1) + Math.abs(y1) > Math.abs(x) + Math.abs(y)) {
                break;
            }
            x = x1;
            y = y1;
        }
        while (true) {
            long x1 = x - dx;
            long y1 = y - dy;
            if (Math.abs(x1) + Math.abs(y1) >= Math.abs(x) + Math.abs(y)) {
                break;
            }
            x = x1;
            y = y1;
        }
        System.out.println(x + " " + y);
    }
}
import java.util.Scanner;

public class p02471 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = 0, y = 0, gcd = 0;
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b!= 0) {
            int q = a / b;
            int r = a % b;
            a = b;
            b = r;
            int tempX = x;
            x = y;
            y = tempX - q * y;
        }
        gcd = a;
        int dx = b / gcd;
        int dy = -a / gcd;
        if (dx < 0) {
            dx = -dx;
            dy = -dy;
        }
        int x0 = x;
        int y0 = y;
        int mag = Math.abs(x0) + Math.abs(y0);
        while (true) {
            int x1 = x0 + dx;
            int y1 = y0 + dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 >= mag) {
                break;
            }
            mag = mag1;
            x0 = x1;
            y0 = y1;
        }
        while (true) {
            int x1 = x0 - dx;
            int y1 = y0 - dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 > mag) {
                break;
            }
            mag = mag1;
            x0 = x1;
            y0 = y1;
        }
        System.out.println(x0 + " " + y0);
    }
}
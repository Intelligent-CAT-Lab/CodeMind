import java.util.Scanner;

public class p02471 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int gcd = findGCD(a, b);
        int x = findX(a, b, gcd);
        int y = findY(a, b, gcd);
        System.out.println(x + " " + y);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static int findX(int a, int b, int gcd) {
        int x0 = a / gcd;
        int y0 = b / gcd;
        int x = x0;
        int y = y0;
        int mag = Math.abs(x) + Math.abs(y);

        while (true) {
            int x1 = x + gcd / b;
            int y1 = y - gcd / a;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 >= mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }

        return x;
    }

    public static int findY(int a, int b, int gcd) {
        int x0 = a / gcd;
        int y0 = b / gcd;
        int x = x0;
        int y = y0;
        int mag = Math.abs(x) + Math.abs(y);

        while (true) {
            int x1 = x - gcd / b;
            int y1 = y + gcd / a;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 > mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }

        return y;
    }
}
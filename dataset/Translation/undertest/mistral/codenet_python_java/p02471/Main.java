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
        int x0 = findX(b, a % b, gcd);
        if (a < b) {
            return x0;
        }
        return findX(a, b, gcd);
    }

    public static int findX(int b, int r, int gcd) {
        int q = r / b;
        int x = q * b - r;
        if (x < 0) {
            x += b;
        }
        return x;
    }

    public static int findY(int a, int b, int gcd) {
        int y0 = findY(b, a % b, gcd);
        if (a < b) {
            return y0;
        }
        return findY(a, b, gcd);
    }

    public static int findY(int b, int r, int gcd) {
        int q = r / b;
        int y = -q * b + r;
        if (y < 0) {
            y += b;
        }
        return y;
    }
}
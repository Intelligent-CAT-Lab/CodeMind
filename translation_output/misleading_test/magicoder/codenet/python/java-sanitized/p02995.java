import java.util.Scanner;

public class p02995 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        int lcm = c * d / gcd(c, d);
        int ans = b - a + 1 - (b / c - (a - 1) / c + b / d - (a - 1) / d - (b / lcm - (a - 1) / lcm));
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
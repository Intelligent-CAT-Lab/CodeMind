import java.util.Scanner;

public class p02995 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        int ans = calculate(a, b, c, d);
        System.out.println(ans);
        scanner.close();
    }

    public static int calculate(int a, int b, int c, int d) {
        int lcm = lcm(c, d);
        return (b - a + 1) - (divCount(b, c) - divCount(a - 1, c) +
                               divCount(b, d) - divCount(a - 1, d) -
                               (divCount(b, lcm) - divCount(a - 1, lcm)));
    }

    private static int divCount(int n, int divisor) {
        return n / divisor;
    }
    
    private static int lcm(int a, int b) {
        return a / gcd(a, b) * b; // to avoid overflow, divide before multiply
    }
    
    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
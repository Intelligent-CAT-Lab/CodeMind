import java.util.Scanner;

public class p01356 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        System.out.println(solve(n, m, a, b, p, q));
    }

    public static long solve(int n, int m, int a, int b, int p, int q) {
        if (a == 1 && b == 1) {
            if ((long)(p + q) * n <= m) {
                return m - (long)(p + q) * n;
            } else {
                long k = m / (p + q);
                return Math.min(m - k * (p + q), (k + 1) * (p + q) - m);
            }
        } else {
            long ans = m;
            for (int i = Math.min(n - 1, 40); i >= 0; i--) {
                long f = p * fastPow(a, i) + q * fastPow(b, i);
                if (m < f) {
                    ans = Math.min(ans, f - m);
                } else {
                    m -= f;
                }
                ans = Math.min(ans, m);
            }
            return ans;
        }
    }

    private static long fastPow(long base, int exponent) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= base;
            }
            base *= base;
            exponent /= 2;
        }
        return result;
    }
}
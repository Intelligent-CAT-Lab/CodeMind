import java.util.Scanner;

public class p01356 {
    public static void main(String[] args) {
        System.out.println(solve());
    }

    public static long solve() {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long p = scanner.nextLong();
        long q = scanner.nextLong();

        if (a == 1 && b == 1) {
            if ((p + q) * n <= m) {
                return m - (p + q) * n;
            } else {
                long k = m / (p + q);
                return Math.min(m - k * (p + q), (k + 1) * (p + q) - m);
            }
        } else {
            long ans = m;
            for (long i = Math.min(n - 1, 40); i >= 0; i--) {
                long f = p * (long) Math.pow(a, i) + q * (long) Math.pow(b, i);
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
}
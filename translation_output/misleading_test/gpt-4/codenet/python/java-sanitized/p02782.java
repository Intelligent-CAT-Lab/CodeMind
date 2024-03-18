import java.util.Scanner;

public class p02782 {
    private static final int mod = 1000000007;
    private static final int rng = 2000100;
    private static long[] fctr = new long[rng];

    static {
        fctr[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = fctr[i - 1] * i % mod;
        }
    }

    private static long finv(int x) {
        return pow(fctr[x], mod - 2);
    }

    private static long cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return fctr[n] * finv(n - k) % mod * finv(k) % mod;
        }
    }

    private static long pow(long a, int m) {
        if (m == 0) return 1;
        long p = pow(a, m / 2);
        p = (p * p) % mod;
        return m % 2 == 0 ? p : (a * p) % mod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        long result = (cmb(x2 + y2 + 2, x2 + 1) - cmb(x2 + y1 + 1, y1) - cmb(x1 + y2 + 1, x1) + cmb(x1 + y1, x1)) % mod;
        if (result < 0) {
            result += mod;
        }

        System.out.println(result);
        scanner.close();
    }
}
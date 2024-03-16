import java.util.Scanner;

public class p02782 {
    private static final int mod = (int) (1e9 + 7);
    private static final int rng = 2000100;
    private static long[] fctr = new long[rng];

    static {
        fctr[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = fctr[i - 1] * i % mod;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        scanner.close();

        System.out.println((cmb(x2 + y2 + 2, x2 + 1) - cmb(x2 + y1 + 1, y1) - cmb(x1 + y2 + 1, x1) + cmb(x1 + y1, x1) + mod) % mod);
    }

    public static long finv(int x) {
        return pow(fctr[x], mod - 2, mod);
    }

    public static long cmb(int n, int k) {
        if (n < 0 || k < 0 || k > n) {
            return 0;
        } else {
            return fctr[n] * finv(n - k) % mod * finv(k) % mod;
        }
    }

    public static long pow(long base, int exp, int modulo) {
        long result = 1;
        base %= modulo;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = result * base % modulo;
            base = base * base % modulo;
            exp >>= 1;
        }
        return result;
    }
}
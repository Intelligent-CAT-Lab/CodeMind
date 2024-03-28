import java.util.Scanner;

public class p02782 {
    static final int MOD = 1000000007;
    static final int RNG = 2000100;
    static long[] fctr = new long[RNG];

    static {
        fctr[0] = 1;
        for (int i = 1; i < RNG; i++) {
            fctr[i] = (fctr[i - 1] * i) % MOD;
        }
    }

    static long finv(int x) {
        return pow(fctr[x], MOD - 2, MOD);
    }

    static long cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return (fctr[n] * finv(n - k) % MOD * finv(k) % MOD) % MOD;
        }
    }

    static long pow(long x, int n, int m) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = (res * x) % m;
            }
            x = (x * x) % m;
            n >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        scanner.close();

        long result = (cmb(x2 + y2 + 2, x2 + 1) - cmb(x2 + y1 + 1, y1) - cmb(x1 + y2 + 1, x1) + cmb(x1 + y1, x1)) % MOD;
        System.out.println(result);
    }
}
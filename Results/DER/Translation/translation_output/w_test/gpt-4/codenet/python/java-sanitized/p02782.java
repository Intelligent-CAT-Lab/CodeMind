import java.util.Scanner;

public class p02782 {
    
    static final int MOD = 1000000007;
    static final int RNG = 2000100;
    static long[] fctr = new long[RNG];
    static {
        fctr[0] = 1;
        for (int i = 1; i < RNG; i++) {
            fctr[i] = fctr[i - 1] * i % MOD;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt(), y1 = scanner.nextInt(), x2 = scanner.nextInt(), y2 = scanner.nextInt();
        System.out.println((cmb(x2 + y2 + 2, x2 + 1) - cmb(x2 + y1 + 1, y1) - cmb(x1 + y2 + 1, x1) + cmb(x1 + y1, x1) + MOD) % MOD);
        scanner.close();
    }

    static long finv(int x) {
        return pow(fctr[x], MOD - 2);
    }

    static long pow(long base, long exponent) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exponent = exponent / 2;
        }
        return result % MOD;
    }

    static long cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return fctr[n] * finv(n - k) % MOD * finv(k) % MOD;
        }
    }
}
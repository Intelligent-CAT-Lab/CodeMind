import java.math.BigInteger;
import java.util.Scanner;

public class p02685 {
    static final int mod = 998244353;
    static final int MAX_N = (int)1e6;
    static long[] fact = new long[MAX_N + 4];
    static long[] fact_inv = new long[MAX_N + 4];

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        initializeFactorials(MAX_N);

        long ans = 0;

        for (int x = 0; x <= k; x++) {
            ans += m * modPow(m - 1, n - 1 - x, mod) * modCombK(n - 1, x, mod);
            ans %= mod;
        }

        if (ans < 0) {
            ans += mod;
        }

        System.out.println(ans);
    }

    static void initializeFactorials(int maxN) {
        fact[0] = 1;

        for (int i = 1; i <= maxN + 3; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }

        fact_inv[maxN + 3] = modPow(fact[maxN + 3], mod - 2, mod);
        for (int i = maxN + 2; i >= 0; i--) {
            fact_inv[i] = fact_inv[i + 1] * (i + 1) % mod;
        }
    }

    static long modCombK(int n, int k, int mod) {
        return fact[n] * fact_inv[k] % mod * fact_inv[n - k] % mod;
    }

    static long modPow(long base, int exponent, int mod) {
        return BigInteger.valueOf(base).modPow(BigInteger.valueOf(exponent), BigInteger.valueOf(mod)).longValue();
    }
}
import java.util.Scanner;

public class p02685 {
    private static final int MOD = 998244353;
    private static final int MAX_N = (int) 1e6;
    private static long[] fact;
    private static long[] fact_inv;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        // Precompute factorials and inverse factorials
        precomputeFactorials();

        long ans = 0;
        for (int x = 0; x <= k; x++) {
            ans += (m * modPow(m - 1, n - 1 - x, MOD) % MOD) * modCombK(n - 1, x, MOD) % MOD;
            ans %= MOD;
        }
        if (ans < 0) {
            ans += MOD;
        }
        System.out.println(ans);
    }

    private static void precomputeFactorials() {
        fact = new long[MAX_N + 4];
        fact_inv = new long[MAX_N + 4];
        
        fact[0] = 1;
        for (int i = 1; i <= MAX_N + 3; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        fact_inv[MAX_N + 3] = modPow(fact[MAX_N + 3], MOD - 2, MOD);
        for (int i = MAX_N + 2; i >= 0; i--) {
            fact_inv[i] = (fact_inv[i + 1] * (i + 1)) % MOD;
        }
    }

    private static long modCombK(int n, int k, int mod) {
        return fact[n] * (fact_inv[k] * fact_inv[n - k] % mod) % mod;
    }

    private static long modPow(long base, int exponent, int mod) {
        long result = 1;
        base %= mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exponent >>= 1;
        }
        return result;
    }
}
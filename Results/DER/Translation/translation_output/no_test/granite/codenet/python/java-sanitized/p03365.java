import java.io.*;
import java.util.*;

public class p03365 {
    static final int MOD = 100000007;

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = sc.nextInt();
        final long[] fact = new long[n + 1];
        final long[] ifact = new long[n + 1];
        fact[0] = 1;
        ifact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            ifact[i] = pow(fact[i], MOD - 2, MOD);
        }
        long ans = 0;
        long c0 = 0;
        for (int i = n / 2; i < n; i++) {
            final long c1 = (nCk(i - 1, n - 1 - i) * fact[i] * fact[n - i - 1] - c0 + MOD) % MOD;
            ans = (ans + c1 * i) % MOD;
            c0 = (c0 + c1) % MOD;
        }
        System.out.println(ans);
    }

    static long nCk(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        return (fact[n] * ifact[n - k] * ifact[k]) % MOD;
    }

    static long pow(long a, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            n /= 2;
        }
        return res;
    }
}
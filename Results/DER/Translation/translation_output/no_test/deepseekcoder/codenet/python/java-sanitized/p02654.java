import java.util.*;

public class p02654 {
    private static final long MOD = (long)Math.pow(10, 9) + 7;
    private static long[] factorials;
    private static long[] finvs;
    private static long[] invs;

    private static void prepare(int n) {
        factorials = new long[n + 1];
        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorials[i] = (factorials[i - 1] * i) % MOD;
        }

        finvs = new long[n + 1];
        finvs[n] powMod(factorials[n], MOD - 2, MOD);
        for (int i = n; i > 1; i--) {
            finvs[i - 1] = (finvs[i] * i) % MOD;
        }

        invs = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            invs[i] = (factorials[i - 1] * finvs[i]) % MOD;
        }
    }

    private static long powMod(long a, long b, long m) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = (res * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        prepare(n);
        System.out.println(solve(n, a));
    }

    private static long solve(int n, int a) {
        long ans = 0;
        int r = n - a;

        for (int l = 0; l < a; l++) {
            long tmp1 = (factorials[a] * finvs[l] % MOD * finvs[a - l]) % MOD;
            long tmp2 = (factorials[n - l - 1] * (a - l)) % MOD;
            ans = (ans + (((l & 1) == 0 ? 1 : -1) * tmp1 * tmp2) % MOD) % MOD;
        }

        for (int k = 1; k < a; k++) {
            for (int l = 0; l < k; l++) {
                long tmp1 = (factorials[k] * finvs[l] % MOD * finvs[k - l]) % MOD;
                long tmp2 = (factorials[n - l - 1] * (k - l) % MOD * invs[r + k - l]) % MOD;
                ans = (ans + (((l & 1) == 0 ? 1 : -1) * tmp1 * tmp2) % MOD) % MOD;
            }
        }

        return (ans + MOD) % MOD;
    }
}
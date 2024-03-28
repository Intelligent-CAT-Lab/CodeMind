import java.util.*;

public class p02654 {
    static long MOD = 1000000007;

    static long[] prepare(int n) {
        long[] factorials = new long[n + 1];
        long[] finvs = new long[n + 1];
        factorials[0] = 1;
        finvs[n] = pow(factorials[n], MOD - 2);
        for (int i = 1; i <= n; i++) {
            factorials[i] = factorials[i - 1] * i % MOD;
            finvs[n - i] = finvs[n - i + 1] * i % MOD;
        }
        return finvs;
    }

    static long pow(long x, long n) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        return res;
    }

    static long solve(int n, int a) {
        long[] finvs = prepare(n);
        long[] invs = new long[n + 1];
        invs[0] = 1;
        for (int i = 1; i <= n; i++) {
            invs[i] = factorials[i - 1] * finvs[i] % MOD;
        }
        int r = n - a;
        long ans = 0;
        for (int l = 0; l < a; l++) {
            long tmp1 = factorials[a] * finvs[l] % MOD * finvs[a - l] % MOD;
            long tmp2 = factorials[n - l - 1] * (a - l) % MOD;
            ans = (ans + (-1) * tmp1 * tmp2) % MOD;
        }
        for (int k = 1; k < a; k++) {
            for (int l = 0; l < k; l++) {
                long tmp1 = factorials[k] * finvs[l] % MOD * finvs[k - l] % MOD;
                long tmp2 = factorials[n - l - 1] * (k - l) % MOD * invs[r + k - l] % MOD;
                ans = (ans + (-1) * tmp1 * tmp2) % MOD;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(solve(n, a));
    }
}
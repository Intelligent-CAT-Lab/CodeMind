import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p02654 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int a = Integer.parseInt(args[1]);
        System.out.println(solve(n, a));
    }

    public static long solve(int n, int a) {
        long MOD = 1000000007;
        long[] factorials = new long[n + 1];
        Arrays.fill(factorials, 1);
        for (int i = 2; i <= n; i++) {
            factorials[i] = factorials[i - 1] * i % MOD;
        }
        long[] finvs = new long[n + 1];
        Arrays.fill(finvs, 1);
        finvs[n] = pow(factorials[n], MOD - 2, MOD);
        for (int i = n - 1; i >= 1; i--) {
            finvs[i - 1] = finvs[i] * i % MOD;
        }
        long[] invs = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            invs[i - 1] = factorials[i] * finvs[i] % MOD;
        }
        long r = n - a;

        long ans = 0;
        // aåããããã░«ã«ã¼ããæããªããã¿ã¼ã³
        for (int l = 0; l < a; l++) {
            long tmp1 = factorials[a] * finvs[l] % MOD * finvs[a - l] % MOD;
            long tmp2 = factorials[n - l - 1] * (a - l) % MOD;
            ans = (ans + (-1) << (l & 1) * tmp1 * tmp2) % MOD;
        }

        // aåä¸­k+1åç®ã§ã¯ããã¦èªå·±ã«ã¼ããæã¤ããããã¾ã§ã®kåã§å©¨ç¹ç¯ã§ãããã¿ã¼ã³
        for (int k = 1; k < a; k++) {
            for (int l = 0; l < k; l++) {
                long tmp1 = factorials[k] * finvs[l] % MOD * finvs[k - l] % MOD;
                long tmp2 = factorials[n - l - 1] * (k - l) % MOD * invs[r + k - l] % MOD;
                ans = (ans + (-1) << (l & 1) * tmp1 * tmp2) % MOD;
            }
        }
        return ans;
    }

    public static long pow(long a, long b, long mod) {
        long res = 1;
        long x = a % mod;
        while (b != 0) {
            if ((b & 1) == 1) {
                res = (res * x) % mod;
            }
            x = (x * x) % mod;
            b >>= 1;
        }
        return res;
    }
}
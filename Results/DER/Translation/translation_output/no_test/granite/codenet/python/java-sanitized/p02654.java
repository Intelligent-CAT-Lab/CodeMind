import java.util.*;

public class p02654 {
    static long MOD = 100000007;

    static long[] fact;
    static long[] finv;
    static long[] inv;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        sc.close();

        fact = new long[n + 1];
        finv = new long[n + 1];
        inv = new long[n + 1];

        comInit(n);
        long ans = 0;

        // aåãããããèªå·±ã«ã¼ããæããªããã¿ã¼ã³
        for (int l = 0; l < a; l++) {
            long tmp1 = fact[a] * finv[l] % MOD * finv[a - l] % MOD;
            long tmp2 = fact[n - l - 1] * (a - l) % MOD;
            ans = (ans + (-1) ^ (l & 1) * tmp1 * tmp2) % MOD;
        }

        // aåä¸­k+1åç®ã§ã¯ããã¦èªå·±ã«ã¼ããæã¤ããããã¾ãã
        for (int k = 1; k < a; k++) {
            for (int l = 0; l < k; l++) {
                long tmp1 = fact[k] * finv[l] % MOD * finv[k - l] % MOD;
                long tmp2 = fact[n - l - 1] * (k - l) % MOD * inv[r + k - l] % MOD;
                ans = (ans + (-1) ^ (l & 1) * tmp1 * tmp2) % MOD;
            }
        }

        System.out.println(ans);
    }

    static void comInit(int max) {
        fact[0] = fact[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;

        for (int i = 2; i <= max; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }
}
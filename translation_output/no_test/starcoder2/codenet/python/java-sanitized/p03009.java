import java.util.*;
import java.io.*;

public class p03009 {
    static int MOD = (int)1e9 + 7;
    static int N, H, D;
    static long[] fact, fact_cum, ap, ap_cum;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        H = sc.nextInt();
        D = sc.nextInt();
        fact = new long[N + 1];
        fact_cum = new long[N + 1];
        ap = new long[H + 1];
        ap_cum = new long[H + 1];
        fact[0] = 1;
        fact_cum[0] = 0;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            fact_cum[i] = (fact_cum[i - 1] + fact[i]) % MOD;
        }
        ap[0] = 1;
        ap_cum[0] = 1;
        for (int n = 1; n <= H; n++) {
            long x = ap_cum[n - 1];
            if (n > D) {
                x -= ap_cum[n - D - 1];
            }
            x *= fact_cum[N];
            x %= MOD;
            ap[n] = x;
            ap_cum[n] = (ap_cum[n - 1] + x) % MOD;
        }
        long ans = ap[H];
        ans *= fact[N];
        ans %= MOD;
        ans *= pow(fact_cum[N], MOD - 2, MOD);
        ans %= MOD;
        System.out.println(ans);
    }

    static long pow(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
}
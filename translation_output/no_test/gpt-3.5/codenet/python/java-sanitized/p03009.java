import java.util.*;

public class p03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int D = sc.nextInt();
        int MOD = 1000000007;

        long[] fact = new long[N+1];
        long[] fact_cum = new long[N+1];
        long[] ap = new long[H+1];
        long[] ap_cum = new long[H+1];

        fact[0] = 1;
        fact_cum[0] = 0;
        ap[0] = 1;
        ap_cum[0] = 1;

        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i-1] * i) % MOD;
            fact_cum[i] = (fact_cum[i-1] + fact[i]) % MOD;
        }

        for (int n = 1; n <= H; n++) {
            long x = ap_cum[n-1];
            if (n > D) {
                x -= ap_cum[n-D-1];
            }
            x = (x * fact_cum[N]) % MOD;
            ap[n] = x;
            ap_cum[n] = (ap_cum[n-1] + x) % MOD;
        }

        long ans = ap[H];
        ans = (ans * fact[N]) % MOD;
        ans = (ans * modInverse(fact_cum[N], MOD)) % MOD;

        System.out.println(ans);
    }

    public static long modInverse(long a, long m) {
        long m0 = m;
        long y = 0, x = 1;

        if (m == 1)
            return 0;

        while (a > 1) {
            long q = a / m;
            long t = m;

            m = a % m;
            a = t;
            t = y;

            y = x - q * y;
            x = t;
        }

        if (x < 0)
            x += m0;

        return x;
    }
}
import java.util.*;

public class p03009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int H = scanner.nextInt();
        int D = scanner.nextInt();
        long MOD = (long) Math.pow(10, 9) + 7;

        long[] fact = new long[N + 1];
        long[] fact_cum = new long[N + 1];
        fact[0] = 1;
        fact_cum[0] = 0;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            fact_cum[i] = (fact_cum[i - 1] + fact[i]) % MOD;
        }

        long[] ap = new long[H + 1];
        long[] ap_cum = new long[H + 1];
        ap[0] = 1;
        ap_cum[0] = 1;

        for (int n = 1; n <= H; n++) {
            long x = ap_cum[n - 1];
            if (n > D) {
                x -= ap_cum[n - D - 1];
            }
            x = (x * fact_cum[N]) % MOD;
            ap[n] = x;
            ap_cum[n] = (ap_cum[n - 1] + x) % MOD;
        }

        long ans = ap[H];
        ans = (ans * fact[N]) % MOD;
        ans = (ans * pow(fact_cum[N], MOD - 2, MOD)) % MOD;

        System.out.println(ans);
    }

    static long pow(long a, long b, long m) {
        if (b == 0) {
            return 1;
        }
        long p = pow(a, b / 2, m);
        p = (p * p) % m;
        if ((b & 1) != 0) {
            p = (p * a) % m;
        }
        return p;
    }
}
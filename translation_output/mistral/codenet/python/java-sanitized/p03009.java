import java.util.*;

public class p03009 {
    static int N, H, D;
    static long MOD = 1000000007;
    static long fact[] = new long[N+1];
    static long fact_cum[] = new long[N+1];
    static long ap[] = new long[H+1];
    static long ap_cum[] = new long[H+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        H = sc.nextInt();
        D = sc.nextInt();

        Arrays.fill(fact, 1);
        Arrays.fill(fact_cum, 0);
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i-1] * i) % MOD;
            fact_cum[i] = (fact_cum[i-1] + fact[i]) % MOD;
        }

        Arrays.fill(ap, 0);
        Arrays.fill(ap_cum, 0);
        ap[0] = 1;
        ap_cum[0] = 1;

        for (int n = 1; n <= H; n++) {
            long x = ap_cum[n-1];
            if (n > D) {
                x -=ap_cum[n-D-1];
            }
            x *= fact_cum[N];
            x %= MOD;
            ap[n] = x;
            ap_cum[n] = (ap_cum[n-1] + x)%MOD;
        }

        long ans = ap[H];
        ans *= fact[N];
        ans %= MOD;
        ans *= pow(fact_cum[N],MOD-2,MOD);
        ans %= MOD;

        System.out.println(ans);
    }
}
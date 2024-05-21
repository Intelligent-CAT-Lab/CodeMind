import java.util.Scanner;

public class p03009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int H = scanner.nextInt();
        int D = scanner.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

        long[] fact = new long[N + 1];
        fact[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        long[] fact_cum = new long[N + 1];
        fact_cum[0] = 0;
        for (int i = 1; i <= N; i++) {
            fact_cum[i] = (fact_cum[i - 1] + fact[i]) % MOD;
        }

        long[] ap = new long[H + 1];
        ap[0] = 1;
        for (int n = 1; n <= H; n++) {
            long x = ap_cum[n - 1];
            if (n > D) {
                x -= ap_cum[n - D - 1];
            }
            x *= fact_cum[N];
            x %= MOD;
            ap[n] = x;
        }

        long[] ap_cum = new long[H + 1];
        ap_cum[0] = 0;
        for (int n = 1; n <= H; n++) {
            ap_cum[n] = (ap_cum[n - 1] + ap[n]) % MOD;
        }

        long ans = ap[H];
        ans *= fact[N];
        ans %= MOD;
        ans *= pow(fact_cum[N], MOD - 2, MOD);
        ans %= MOD;

        System.out.println(ans);
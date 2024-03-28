import java.util.*;

public class p03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int D = sc.nextInt();
        long MOD = 1000000007;

        long[] fact = new long[N + 1];
        long[] factCum = new long[N + 1];
        Arrays.fill(fact, 1);
        Arrays.fill(factCum, 0);
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            factCum[i] = (factCum[i - 1] + fact[i - 1]) % MOD;
        }

        long[] ap = new long[H + 1];
        long[] apCum = new long[H + 1];
        ap[0] = 1;
        apCum[0] = 1;
        for (int n = 1; n <= H; n++) {
            long x = apCum[n - 1];
            if (n > D) {
                x -= apCum[n - D - 1];
            }
            x *= factCum[N];
            x %= MOD;
            ap[n] = x;
            apCum[n] = (apCum[n - 1] + x) % MOD;
        }

        long ans = ap[H];
        ans *= fact[N];
        ans %= MOD;
        ans *= Math.pow(factCum[N], MOD - 2);
        ans %= MOD;

        System.out.println(ans);
    }
}
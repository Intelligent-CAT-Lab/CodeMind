import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p02932 {
    static int MOD = 100000007;
    static int MAX = 600000;
    static long[] fact = new long[MAX + 1];
    static long[] inv = new long[MAX + 1];
    static long[] finv = new long[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        fact[0] = fact[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }

        long[] comb = new long[N - M + 1];
        comb[0] = 1;
        for (int i = 1; i <= N - M; i++) {
            comb[i] = comb[i - 1] * (N - M + i) % MOD * inv[i] % MOD;
            if (i % 2 == 1) {
                comb[i] = -comb[i];
            }
        }

        long[] P = new long[R + 1];
        for (int i = M; i <= N; i++) {
            for (int j = i; j <= R; j += i) {
                P[j] += comb[i - M];
                if (P[j] >= MOD) {
                    P[j] -= MOD;
                }
            }
        }

        for (int i = 1; i <= R; i++) {
            P[i] += P[i - 1];
            if (P[i] >= MOD) {
                P[i] -= MOD;
            }
        }

        long[] Q = new long[R + 1];
        for (int i = 0; i <= R; i++) {
            Q[i] = fact[N + i] * finv[N] % MOD * finv[i] % MOD;
        }

        long ans = 0;
        for (int i = 0; i <= R; i++) {
            ans += Q[i] * P[R - i] % MOD;
            if (ans >= MOD) {
                ans -= MOD;
            }
        }

        long total = fact[N + R] * finv[N] % MOD * finv[R] % MOD;
        ans = (total - ans + MOD) % MOD;
        System.out.println(ans);
    }
}
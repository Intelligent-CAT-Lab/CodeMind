import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class p04004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        final int MOD = 100000007;
        int[] x = new int[N + M];
        long[] power2 = new long[N + M];
        long[] power2_inv = new long[N + M];
        long[] power3 = new long[N + M];
        long[] power3_inv = new long[N + M];
        long[] fact = new long[N + M];
        long[] fact_inv = new long[N + M];

        power2[0] = 1;
        power2_inv[0] = 1;
        power3[0] = 1;
        power3_inv[0] = 1;
        fact[0] = 1;
        fact_inv[0] = 1;

        for (int i = 1; i < N + M; i++) {
            power2[i] = power2[i - 1] * 2 % MOD;
            power2_inv[i] = power(power2[i], MOD - 2, MOD);
            power3[i] = power3[i - 1] * 3 % MOD;
            power3_inv[i] = power(power3[i], MOD - 2, MOD);
            fact[i] = fact[i - 1] * i % MOD;
            fact_inv[i] = power(fact[i], MOD - 2, MOD);
        }

        for (int i = 1; i < N + M; i++) {
            x[i] = (int) (((-1) * power2[i - 1] * power3_inv[K + i - 1] % MOD) * fact[K + i - 1] % MOD * fact_inv[K + i - 2] % MOD * fact_inv[i] % MOD);
        }

        for (int i = 1; i < N + M; i++) {
            x[i] = (x[i] + x[i - 1]) % MOD;
        }

        long[] coef = new long[M + 1];
        for (int i = 0; i <= M; i++) {
            coef[i] = fact[N - 1 + i] * fact_inv[N - 2] % MOD * fact_inv[i] % MOD;
            coef[i] = coef[i] * power3[K + i - 1] % MOD;
        }

        long ans = 0;
        for (int i = 0; i <= M; i++) {
            ans = (ans + coef[i] * x[N - 1 + i]) % MOD;
        }

        System.out.println(ans);
    }

    public static long power(long x, long n, long mod) {
        if (n == 0) {
            return 1;
        }
        long half = power(x, n / 2, mod);
        if (n % 2 == 0) {
            return half * half % mod;
        } else {
            return half * half % mod * x % mod;
        }
    }
}
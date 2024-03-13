import java.util.*;

public class p03832 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;
        long[] fact = new long[N + 1];
        long[] frev = new long[N + 1];
        long[] dp = new long[N + 1];
        dp[0] = 1;
        fact[0] = 1;
        frev[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            frev[i] = pow(fact[i], MOD - 2, MOD);
        }
        long[] Y = new long[N + 1];
        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;
            long y = frev[g];
            for (int j = C; j <= Math.min(D, N / g); j++) {
                Y[p + j] = (pow(y, j, MOD) * frev[j]) % MOD;
            }
            for (int i = p; i <= N; i++) {
                long sum = 0;
                for (int j = p; j <= Math.min(q, i); j += g) {
                    sum = (sum + dp[i - j] * fact[N - i + j] * Y[j]) % MOD;
                }
                dp[i] = (dp[i] + frev[N - i] * sum) % MOD;
            }
        }
        System.out.println(dp[N] % MOD);
    }

    static long pow(long a, long b, long m) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return res;
    }
}
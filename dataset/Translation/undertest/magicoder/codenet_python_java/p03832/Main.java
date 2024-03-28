import java.util.*;

public class p03832 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;
        long[] fact = new long[N + 1];
        long[] frev = new long[N + 1];
        long[] dp = new long[N + 1];
        fact[0] = 1;
        frev[0] = 1;
        dp[0] = 1;
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

    private static long pow(long base, int exponent, int mod) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent >>= 1;
        }
        return result;
    }
}
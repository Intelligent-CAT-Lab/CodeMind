import java.util.*;

public class p03832 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        long MOD = (long)Math.pow(10, 9) + 7;

        long[] fact = new long[N + 1];
        long[] frev = new long[N + 1];
        long[] dp = new long[N + 1];
        dp[0] = 1;

        for (int i = 1; i <= N; i++) {
            long v = (fact[i - 1] * i) % MOD;
            fact[i] = v;
            frev[i] = pow(v, MOD - 2, MOD);
        }

        long[] Y = new long[N + 1];
        for (int g = A; g <= Math.min(N / C, B) + 1; g++) {
            int p = C * g;
            int q = D * g;
            long y = frev[g];
            for (int j = C; j <= Math.min(D, N / g) + 1; j++) {
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

    private static long pow(long a, long b, long m) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b = b / 2;
        }
        return result;
    }
}
import java.util.*;

public class p03832 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int MOD = (int)Math.pow(10, 9) + 7;
        long[] fact = new long[N + 1];
        long[] frev = new long[N + 1];
        fact[0] = 1;
        frev[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            frev[i] = pow(fact[i], MOD - 2, MOD);
        }
        long[] dp = new long[N + 1];
        dp[0] = 1;
        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;
            long y = frev[g];
            long[] Y = new long[N + 1];
            for (int i = p; i <= Math.min(q, N); i += g) {
                Y[i] = (pow(y, i / g, MOD) * frev[i / g]) % MOD;
            }
            for (int i = p; i <= N; i++) {
                dp[i] = (dp[i] + frev[N - i] * sum(dp[i - j] * fact[N - i + j] * Y[j]
                    for (int j = p; j <= Math.min(q, i); j += g)) % MOD;
            }
        }
        System.out.println(dp[N] % MOD);
    }

    public static long pow(long a, long b, int MOD) {
        long result = 1;
        a %= MOD;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            b /= 2;
        }
        return result;
    }

    public static long sum(long[] arr) {
        long result = 0;
        for (long num : arr) {
            result += num;
        }
        return result;
    }
}
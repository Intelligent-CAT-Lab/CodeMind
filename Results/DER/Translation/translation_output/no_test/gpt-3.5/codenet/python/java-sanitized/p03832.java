import java.util.Scanner;

public class p03832 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int MOD = 1000000007;
        long[] fact = new long[N + 1];
        long[] frev = new long[N + 1];
        long[] dp = new long[N + 1];
        dp[0] = 1;

        for (int i = 1; i <= N; i++) {
            long v = fact[i] = (fact[i - 1] * i) % MOD;
            frev[i] = pow(v, MOD - 2, MOD);
        }

        long[] Y = new long[N + 1];
        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;
            long y = frev[g];
            for (int j = C; j <= Math.min(D, N / g); j++) {
                for (int i = p; i <= N; i++) {
                    dp[i] = (dp[i] + frev[N - i] * sum(dp[i - j], fact[N - i + j], Y[j]) % MOD) % MOD;
                }
            }
        }

        System.out.println(dp[N]);
    }

    private static long sum(long a, long b, long c) {
        long res = a + b;
        res %= 1000000007;
        res += c;
        return res % 1000000007;
    }

    private static long pow(long base, long exp, long MOD) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }
        return result;
    }
}
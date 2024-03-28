import java.util.Scanner;

public class p00393 {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        long[] pow = new long[N + 1];
        long[] dp = new long[N + 1];

        pow[0] = 1;

        for (int i = 1; i <= N; i++) {
            pow[i] = pow[i - 1] * 2 % MOD;
        }

        dp[0] = 1;

        for (int i = 1; i <= M; i++) {
            dp[i] = pow[i] % MOD;
        }

        dp[M] -= 1;

        for (int i = M + 1; i <= N; i++) {
            dp[i] = (dp[i - 1] + (dp[i - 1] - dp[i - 1 - M])) % MOD;
        }

        long result = (pow[N] - dp[N] + MOD) % MOD;
        System.out.println(result);

        scanner.close();
    }
}
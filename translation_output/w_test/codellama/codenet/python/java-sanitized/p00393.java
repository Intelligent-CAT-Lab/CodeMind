import java.util.Scanner;

public class p00393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int MOD = 1000000007;

        int[] pow = new int[N + 1];
        int[] dp = new int[N + 1];

        pow[0] = 1;

        for (int i = 1; i <= N; i++) {
            pow[i] = pow[i - 1] * 2;
            pow[i] %= MOD;
        }

        dp[0] = 1;

        for (int i = 1; i <= M; i++) {
            dp[i] = pow[i];
        }

        dp[M] -= 1;

        for (int i = M + 1; i <= N; i++) {
            dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - 1 - M]);
            dp[i] %= MOD;
        }

        System.out.println((pow[N] - dp[N] + MOD) % MOD);
    }
}
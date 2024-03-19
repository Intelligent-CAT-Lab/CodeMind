import java.util.*;

public class p00393 {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        while (sc.hasNext()) {
            N = sc.nextInt();
            M = sc.nextInt();
            int ans = solve(N, M);
            System.out.println(ans);
        }
    }

    static int solve(int N, int M) {
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

        return (pow[N] - dp[N] + MOD) % MOD;
    }
}
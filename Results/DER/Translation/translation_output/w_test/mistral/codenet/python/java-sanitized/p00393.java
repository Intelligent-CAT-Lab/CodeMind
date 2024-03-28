import java.util.*;

public class p00393 {
    final static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        while (sc.hasNext()) {
            N = sc.nextInt();
            M = sc.nextInt();
            if (N < 1 || M < 1 || N > 1000 || M > 1000) {
                System.out.println("Input should be in the range [1, 1000]");
                continue;
            }
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

            int ans = (pow[N] - dp[N] + MOD) % MOD;
            System.out.println(ans);
        }
    }
}
import java.util.*;
import java.math.*;

public class p03832 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

        int[] fact = new int[N + 1];
        int[] frev = new int[N + 1];

        fact[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            frev[i] = pow(fact[i], MOD - 2, MOD);
        }

        int[] dp = new int[N + 1];
        dp[0] = 1;

        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;
            int y = frev[g];
            Arrays.fill(dp, p, Math.min(q, N) + 1, 0);
            for (int j = C; j <= Math.min(D, N / g); j++) {
                int k = (N - p + j - 1) / j;
                int l = (N - p + j - 1) % j;
                int z = pow(y, j, MOD) * frev[l];
                for (int i = p; i <= N; i += j) {
                    dp[i] = (dp[i] + z * dp[i - j] * fact[N - i + j]) % MOD;
                }
            }
        }

        System.out.println(dp[N]);
    }

    public static int pow(int a, int b, int mod) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
}
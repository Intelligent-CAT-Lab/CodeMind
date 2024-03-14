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
        int MOD = 1000000007;
        int[] fact = new int[N + 1];
        int[] frev = new int[N + 1];
        fact[0] = 1;
        frev[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            frev[i] = (int) Math.pow(fact[i], MOD - 2, MOD);
        }
        int[] Y = new int[N + 1];
        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;
            int y = frev[g];
            for (int j = C; j <= Math.min(D, N / g); j++) {
                Y[p + j - C] = (int) ((y * Math.pow(y, j, MOD)) % MOD * frev[j] % MOD);
            }
            for (int i = p; i <= N; i++) {
                int sum = 0;
                for (int j = p; j <= Math.min(q, i); j += g) {
                    sum = (sum + (int) (fact[N - i + j] * Y[j] % MOD) % MOD) % MOD;
                }
                dp[i] = (dp[i] + (int) (frev[N - i] * sum % MOD) % MOD) % MOD;
            }
        }
        System.out.println(dp[N]);
    }
}
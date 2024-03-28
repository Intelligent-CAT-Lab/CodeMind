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
        int[] dp = new int[N + 1];
        dp[0] = 1;
        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;
            int y = frev[g];
            int[] Y = new int[q - p + 1];
            for (int j = C; j <= Math.min(D, N / g); j++) {
                Y[j - p] = (int) ((Math.pow(y, j, MOD) * frev[j]) % MOD);
            }
            for (int i = p; i <= N; i++) {
                dp[i] = (dp[i] + frev[N - i] * (Arrays.stream(dp).limit(i - p).map(x -> (int) ((x * fact[N - i + p] * Arrays.stream(Y).limit(i - p).map(y -> y).reduce(0, (a, b) -> (a + b) % MOD)).reduce(0, (a, b) -> (a + b) % MOD))).reduce(0, (a, b) -> (a + b) % MOD))) % MOD;
            }
        }
        System.out.println(dp[N]);
    }
}
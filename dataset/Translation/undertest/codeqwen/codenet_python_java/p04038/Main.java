import java.util.Arrays;
import java.util.Scanner;

public class p04038 {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        if (K == 1) {
            System.out.println(1);
            return;
        }

        int[] fact = makeFact(N + 10);
        int[] factInv = makeFactInv(N + 10);

        int[] dp = new int[N + 1];
        dp[1] = 1;
        for (int n = 2; n <= N; n++) {
            int[] prev = Arrays.copyOf(dp, dp.length);
            Arrays.fill(dp, 0);
            int S = Arrays.stream(prev).sum() % MOD;
            for (int i = 1; i <= n; i++) {
                dp[i] = (S - prev[i - 1]) % MOD;
            }
            int[] coef = new int[K];
            coef[0] = fact[n * (K - 1) - 1];
            for (int i = 1; i < K; i++) {
                coef[i] = (coef[i - 1] * fact[n * (K - 1) - 1 - i]) % MOD;
            }
            for (int i = 1; i < K; i++) {
                coef[i] = (coef[i] * factInv[K - 2]) % MOD;
            }
            for (int i = 1; i < K; i++) {
                coef[i] = (coef[i] * factInv[(n - 1) * (K - 1) - i + 1]) % MOD;
            }
            for (int i = 0; i < K; i++) {
                dp[i
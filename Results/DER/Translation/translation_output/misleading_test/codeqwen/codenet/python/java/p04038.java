Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        if (K == 1) {
            System.out.println(1);
            return;
        }

        int MOD = (int) (1e9 + 7);

        int[] cumprod = cumprod(N + 10, K + 10, MOD);

        int[] fact = makeFact(N + 10, MOD);
        int[] factInv = makeFact(N + 10, MOD);

        int[] dp = new int[N + 1];
        dp[1] = 1;
        for (int n = 2; n <= N; n++) {
            int[] prev = Arrays.copyOf(dp, dp.length);
            Arrays.fill(dp, 0);
            int S = Arrays.stream(prev).sum() % MOD;
            for (int i = 1; i <= n; i++) {
                dp[i] = (S - prev[i - 1]) % MOD;
            }
            int[] coef = new int[n * K];
            for (int i = 0; i < n * K; i++) {
                coef[i] = fact[n * (K - 1) - 1 - i] * factInv[K - 2] % MOD;
                coef[i] = coef[i] * factInv[(n - 1) * (K - 1) - i + 2] % MOD;
            }
            for (int i = 0; i < n; i++) {
                dp[i + 1] = (dp[i + 1] + dp[i] * coef[i]) % MOD;
            }
        }

        int answer = Arrays.stream(dp).sum() % MOD;
        answer = (answer * fact

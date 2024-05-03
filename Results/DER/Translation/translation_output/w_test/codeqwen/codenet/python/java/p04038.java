Here is the Java version of the provided Python code:

```java
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

        long[] cumprod = cumprod(N + 10, K + 10, MOD);

        long[] fact = makeFact(N + 10, MOD);
        long[] factInv = makeFact(N + 10, MOD);

        long[] dp = new long[N + 1];
        dp[1] = 1;
        for (int n = 2; n <= N; n++) {
            long[] prev = dp.clone();
            dp = new long[n + 1];
            long S = 0;
            for (int i = 0; i < prev.length; i++) {
                S = (S + prev[i]) % MOD;
            }
            for (int i = 0; i < prev.length; i++) {
                dp[i + 1] = (S - prev[i]) % MOD;
            }
            long[] coef = new long[K];
            for (int i = 0; i < K; i++) {
                coef[i] = fact[n * (K - 1) - 1 - i] * factInv[K - 2] % MOD;
                coef[i] = coef[i] * factInv[(n - 1) * (K - 1) - i] % MOD;
            }
            for (int i = 0; i < dp.length; i++) {
                dp[i] = dp[i] * coef[i] % MOD;
            }
        }

        long answer = 0;
        for (long num : dp) {
            answer = (answer + num)

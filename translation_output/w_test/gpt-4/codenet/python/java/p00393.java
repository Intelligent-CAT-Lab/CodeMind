The following Java code corresponds to the provided Python code. Please note the handling of the Modulo operation on negative numbers in Java, as the `%` operator can return a negative result when the left-hand operand is negative. To address this, we add the `MOD` value before applying the modulo operation.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MOD = 1000000007;

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        long[] pow = new long[N + 1];
        long[] dp = new long[N + 1];

        pow[0] = 1;

        for (int i = 1; i <= N; ++i) {
            pow[i] = pow[i - 1] * 2;
            pow[i] %= MOD;
        }

        dp[0] = 1;

        for (int i = 1; i <= M; ++i) {
            dp[i] = pow[i];
        }

        dp[M] -= 1;

        for (int i = M + 1; i <= N; ++i) {
            dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - 1 - M]);
            dp[i] %= MOD;
        }

        System.out.println((pow[N] - dp[N] + MOD) % MOD);
    }
}
```

Notice that `Scanner` class is used to receive the input, and using `System.out.println` to print the output. The arrays for `pow` and `dp` are declared with a type of `long` to handle the potentially large intermediate values due to the power calculations and modulo operations. The explicit type casting to `int` is not needed here as Java automatically parses the input into the right type when using `nextInt()`.

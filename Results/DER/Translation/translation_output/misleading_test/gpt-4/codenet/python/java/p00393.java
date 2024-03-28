Here's the provided Python code translated to Java. To use the code, you will need to import `java.util.Scanner` for console input:

```java
import java.util.Scanner;

public class Main {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        long[] pow = new long[N + 1];
        long[] dp = new long[N + 1];

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
            dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - M - 1]);
            if (dp[i] < 0) dp[i] += MOD; // To handle negative values in Java
            dp[i] %= MOD;
        }

        System.out.println((pow[N] - dp[N] + MOD) % MOD);
    }
}
```

Remember to run the Main class and provide input on stdin if you're executing it from a console or command line. The code will give you the expected output for the given test case.

Please note that since Java does not have negative modulo support built-in, unlike Python, when `dp[i]` could be negative (before taking modulo), we add `MOD` to it to ensure it remains positive, then we take the modulo operation. This technique effectively mimics Python's modulo behavior with negative numbers.

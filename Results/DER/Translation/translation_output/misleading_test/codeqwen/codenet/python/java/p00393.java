Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

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
            dp[i] = (dp[i - 1] + (dp[i - 1] - dp[i - 1 - M])) % MOD;
        }

        System.out.println((pow[N] - dp[N] + MOD) % MOD);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and M from the standard input, calculates the power array pow and the dynamic programming array dp, and then prints the result. The main difference is that Java uses the Scanner class to read input, and it uses long data type instead of int for larger numbers.

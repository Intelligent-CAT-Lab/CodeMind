Here's the equivalent Java implementation of your Python code:

```java
import java.util.Scanner;

public class Main {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][][] dp = new int[2][n + 1][n + 1];
        dp[0][1][1] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[(i + 1) % 2][j][k] = 0;
                }
            }
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= j; k++) {
                    dp[(i + 1) % 2][Math.min(j + 1, n)][k] = (int)((dp[(i + 1) % 2][Math.min(j + 1, n)][k] + (long)dp[i % 2][j][k] * (n - j)) % MOD);
                    dp[(i + 1) % 2][j][k] = (int)((dp[(i + 1) % 2][j][k] + (long)dp[i % 2][j][k] * (j - k)) % MOD);
                    dp[(i + 1) % 2][j][j] = (int)((dp[(i + 1) % 2][j][j] + (long)dp[i % 2][j][k] * k) % MOD);
                }
            }
        }
        System.out.println(dp[m % 2][n][n]);
        scanner.close();
    }
}
```

This Java code initializes a 3-dimensional array `dp` and runs nested for loops similar to the Python code to calculate the number of ways. The `Math.min` function is used to avoid index out-of-bounds, and type casting is used to handle potential overflow while multiplying before taking the modulo. Note that Java uses `Scanner` for the input and `System.out.println` for the output to match your test case.

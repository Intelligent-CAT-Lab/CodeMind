Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int[][][] dp = new int[2][n + 1][n + 1];
        dp[0][1][1] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n + 1; j++) {
                for (int k = 0; k < n + 1; k++) {
                    dp[(i + 1) % 2][j][k] = 0;
                }
            }
            for (int j = 1; j < n + 1; j++) {
                for (int k = 1; k < j + 1; k++) {
                    dp[(i + 1) % 2][Math.min(j + 1, n)][k] += dp[i % 2][j][k] * (n - j) % mod;
                    dp[(i + 1) % 2][j][k] += dp[i % 2][j][k] * (j - k) % mod;
                    dp[(i + 1) % 2][j][j] += dp[i % 2][j][k] * k % mod;
                }
            }
        }
        System.out.println(dp[m % 2][n][n] % mod);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, creates a 3D array `dp`, and then fills it according to the rules of the problem. Finally, it prints the result modulo `mod`.

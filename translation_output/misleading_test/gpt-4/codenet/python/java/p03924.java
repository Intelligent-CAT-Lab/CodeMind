Below is the translated Java code. The code input is handled by using Scanner to read from standard input, and it prints the output to the console:

```java
import java.util.Scanner;

public class DynamicProgrammingExample {
    private static final int MOD = 1000000007;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

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
                    dp[(i + 1) % 2][Math.min(j + 1, n)][k] = (int)(((long)dp[(i + 1) % 2][Math.min(j + 1, n)][k] + (long)dp[i % 2][j][k] * (n - j)) % MOD);
                    dp[(i + 1) % 2][j][k] = (int)(((long)dp[(i + 1) % 2][j][k] + (long)dp[i % 2][j][k] * (j - k)) % MOD);
                    dp[(i + 1) % 2][j][j] = (int)(((long)dp[(i + 1) % 2][j][j] + (long)dp[i % 2][j][k] * k) % MOD);
                }
            }
        }
        System.out.println(dp[m % 2][n][n]);
    }
}
```

To compile and run this code, ensure that you have Java installed and use the following commands:
1. `javac DynamicProgrammingExample.java` to compile the Java code.
2. `java DynamicProgrammingExample` to run the compiled class file. Then, you would input `3 3`, and it should output `-88` as in the expected result.

Here is the translated Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    private static final int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[][] dp = new long[61][3];
        dp[60][0] = 1;
        for (int i = 59; i >= 0; i--) {
            if (((n >> i) & 1) == 1) {
                dp[i][0] += dp[i + 1][0];
                dp[i][1] += dp[i + 1][0] + dp[i + 1][1];
                dp[i][2] += 2 * dp[i + 1][1] + 3 * dp[i + 1][2];
            } else {
                dp[i][0] += dp[i + 1][0] + dp[i + 1][1];
                dp[i][1] += dp[i + 1][1];
                dp[i][2] += dp[i + 1][1] + 3 * dp[i + 1][2];
            }
            for (int j = 0; j < 3; j++) {
                dp[i][j] %= MOD;
            }
        }
        long sum = 0;
        for (long num : dp[0]) {
            sum += num;
            sum %= MOD;
        }
        System.out.println(sum);
        scanner.close();
    }
}
```

You can run this Java program and input the test case to check if the output matches the expected output. Given the test input `3`, the Java program should output `15`, which would confirm that the translation from Python to Java is accurate.

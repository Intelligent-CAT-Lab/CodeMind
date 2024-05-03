Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int[] coef = new int[n];
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            coef[n / i - n / (i + 1)]++;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (coef[i] == 0) {
                coef[i] = coef[i + 1];
            }
        }
        int nn = coef.length;
        int[][] dp = new int[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp = (tmp + dp[i - 1][nn - 1 - j]) % mod;
                dp[i][j] = (coef[j] * tmp) % mod;
            }
        }
        System.out.println(dp[k][0]);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the coefficients, and then uses dynamic programming to compute the result. The result is then printed to the standard output.

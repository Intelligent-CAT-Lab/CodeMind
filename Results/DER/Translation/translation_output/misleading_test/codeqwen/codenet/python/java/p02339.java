Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[][] dp = new int[n + 1][k + 1];
        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i + 1][j + 1] = (dp[i][j] + (j + 1) * dp[i][j + 1]) % 1000000007;
            }
        }

        System.out.println(dp[n][k]);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, creates a 2D array `dp` to store the intermediate results, and then calculates the final result. The final result is printed to the standard output.

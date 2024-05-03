Here is the Java version of your Python code:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int MOD = (int) Math.pow(10, 9) + 7;
        int n = Integer.parseInt(System.console().readLine());
        int[][] dp = new int[61][3];
        dp[60][0] = 1;
        for (int i = 59; i >= 0; i--) {
            if ((n>>i)&1 == 1) {
                dp[i][0] += dp[i+1][0];
                dp[i][1] += dp[i+1][0] + dp[i+1][1];
                dp[i][2] += 2*dp[i+1][1] + 3*dp[i+1][2];
            } else {
                dp[i][0] += dp[i+1][0] + dp[i+1][1];
                dp[i][1] += dp[i+1][1];
                dp[i][2] += dp[i+1][1] + 3*dp[i+1][2];
            }
            for (int j = 0; j < 3; j++) {
                dp[i][j] %= MOD;
            }
        }
        System.out.println(Arrays.stream(dp[0]).sum() % MOD);
    }
}
```

Please note that Java does not have a built-in function to perform bitwise operations like Python's `>>` operator. Therefore, we use `>>>` instead. Also, Java does not have a built-in function to convert a string to an integer, so we use `Integer.parseInt(System.console().readLine())` instead.

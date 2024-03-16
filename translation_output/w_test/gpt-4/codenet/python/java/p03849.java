Below is the translated Java code with the same functionality as the provided Python snippet. The test case provided includes an integer input of `3`, and the expected output is `5`.

```java
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        long[][] dp = new long[61][3];
        dp[60][0] = 1L;

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
        
        long result = 0;
        for (int j = 0; j < 3; j++) {
            result += dp[0][j];
            result %= MOD;
        }
        System.out.println(result);
    }
}
```

To implement this code, define a `Main` class with the `main` method. It uses a `Scanner` to read the input, then, it computes the dynamic programming solution and prints out the result. In Java, we use `long` instead of Python's arbitrary precision integers to handle large numbers and take care of potential overflow.

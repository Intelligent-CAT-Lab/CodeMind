Here is the equivalent Java code for your provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    private static final int MOD = (int) (1e9 + 7);
    private static final int MAX = 61;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[][] dp = new long[MAX][3];
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

        long result = 0;
        for (int j = 0; j < 3; j++) {
            result += dp[0][j];
            result %= MOD;
        }
        
        System.out.println(result);
        scanner.close();
    }
}
```

Make sure to have correct Java imports and the class structure. The `Scanner` class is used for reading input from the console, and due to Java's strong type system, you need to specify types for all variables explicitly. Also, Java's maximum array index is inclusive, so the `for` loop runs until `i` equals 0 rather than -1. The `%=` operator is used in Java for the modulus assignment as in Python.

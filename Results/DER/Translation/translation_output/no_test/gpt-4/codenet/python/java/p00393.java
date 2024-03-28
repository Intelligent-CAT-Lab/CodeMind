Here's the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MOD = 1000000007;
        
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        
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
            dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - M - 1]);
            dp[i] %= MOD;
        }
        
        System.out.println((pow[N] - dp[N] + MOD) % MOD);
        
        scanner.close();
    }
}
```

Note that in the Java version, we have used `long[]` for `pow` and `dp` to prevent integer overflow during calculations, as Java's `int` type has a maximum value of `2^31 - 1`. Moreover, it is important to specify the `final` keyword for constants in Java, and we must import `java.util.Scanner` for reading input. The `scanner.nextLine().split(" ")` is used to read the line and split it by spaces to parse the integers. Remember to close the scanner with `scanner.close()` to prevent resource leaks.

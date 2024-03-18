Below is the Java translation of the given Python code. The conversion involves changing the syntax to match Java's language constructs and utilizing Java standard classes such as `Scanner` for input.

```java
import java.util.Scanner;

public class Main {
    static final int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        long[][] dp = new long[N + 1][N];

        dp[1][0] = 1;
        for (int i = 0; i < M; i++) {
            long[][] dp_new = new long[N + 1][N];
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k < N; k++) {
                    dp_new[j][k] = (dp_new[j][k] + dp[j][k] * k) % mod;
                    if (k + 1 < N) {
                        dp_new[j][k + 1] = (dp_new[j][k + 1] + dp[j][k] * (N - j - k)) % mod;
                    }
                    if (j + k <= N) {
                        dp_new[j + k][0] = (dp_new[j + k][0] + dp[j][k] * j) % mod;
                    }
                }
            }
            dp = dp_new;
        }

        System.out.println(dp[N][0]);

        sc.close(); // Remember to close the scanner to avoid resource leaks
    }
}
```

To replicate the functionality of reading from `stdin` as in the original Python code, I've used `Scanner`. Note that Java is more verbose and required the explicit declaration of sizes for arrays, variable types, as well as the necessity to close the `Scanner` to avoid resource leaks.

To test the Java code with the provided test input, one would typically provide the input `3 3` when prompted, and the expected output should be `-26` as per the test case. Keep in mind that Java does not need to simulate end-of-file as the Python version does with the line reading function `input()`. Instead, it can handle user input directly via `Scanner`.

Here is the Java translation of your provided Python code:

```java
import java.util.Scanner;

public class Main {
    static final int MOD = 1000000000 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt() - 1;

        int[] dp = new int[1000]; // dp[i] = Number of ways to select from among i vertical bars
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < 1000; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        int[][] dp2 = new int[H + 1][W];
        dp2[0][0] = 1;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                dp2[i + 1][j] = (int) (((long) dp2[i + 1][j] + (long) dp2[i][j] * dp[j] % MOD * dp[W - j - 1] % MOD) % MOD);
                if (j - 1 >= 0) {
                    dp2[i + 1][j - 1] = (int) (((long) dp2[i + 1][j - 1] + (long) dp2[i][j] * dp[j - 1] % MOD * dp[W - j - 1] % MOD) % MOD);
                }
                if (j + 1 < W) {
                    dp2[i + 1][j + 1] = (int) (((long) dp2[i + 1][j + 1] + (long) dp2[i][j] * dp[j] % MOD * dp[W - j - 2] % MOD) % MOD);
                }
            }
        }
        System.out.println(dp2[H][K]);
        sc.close();
    }
}
```

Note that in the Java version:

- We are using `Scanner` to read input from standard input.
- We replaced python's `print` with Java's `System.out.println`.
- Arrays are statically typed, so we explicitly declared them as integer arrays.
- Type casting `(int)` and `(long)` were added to the calculation to avoid integer overflow. In Java, we have to be explicit about long integer arithmetic to prevent overflow when numbers exceed the range of the `int` type.
- The `mod` operator `%` is used in the same way as in Python for computing the modular arithmetic.
- We enclosed the main logic into the `main` method and used a `Scanner` object for input just as Python's `input().split()` function does.
- The 2D array is created with the second dimension's size being `W` instead of `W + 1` as it is not needed for `H + 1`.

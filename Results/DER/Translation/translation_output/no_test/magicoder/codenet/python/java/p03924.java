<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n, m = map(int,raw_input().split())
mod = 10 ** 9 + 7
dp=[[[0] * (n + 1) for _ in xrange(n + 1)] for _ in xrange(2)]
dp[0][1][1] = 1
for i in xrange(m):
    for j in xrange(n + 1):
        for k in xrange(n + 1):
            dp[(i+1)%2][j][k] = 0
    for j in xrange(1, n + 1):
        for k in xrange(1, j + 1):
            dp[(i+1)%2][min(j+1,n)][k] += dp[i%2][j][k] * (n - j) % mod
            dp[(i+1)%2][j][k] += dp[i%2][j][k] * (j - k) % mod
            dp[(i+1)%2][j][j] += dp[i%2][j][k] * k % mod
print dp[m%2][n][n] % mod

```

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long mod = (long) Math.pow(10, 9) + 7;
        long[][][] dp = new long[2][n + 1][n + 1];
        dp[0][1][1] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[(i + 1) % 2][j][k] = 0;
                }
            }
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= j; k++) {
                    dp[(i + 1) % 2][Math.min(j + 1, n)][k] += dp[i % 2][j][k] * (n - j) % mod;
                    dp[(i + 1) % 2][j][k] += dp[i % 2][j][k] * (j - k) % mod;
                    dp[(i + 1) % 2][j][j] += dp[i % 2][j][k] * k % mod;
                }
            }
        }
        System.out.println(dp[m % 2][n][n] % mod);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `m` from the standard input, calculates the modulo of 10^9 + 7, and then uses a 3D array `dp` to store intermediate results. The nested loops simulate the dynamic programming process. Finally, it prints the result modulo 10^9 + 7.<｜end▁of▁sentence｜>

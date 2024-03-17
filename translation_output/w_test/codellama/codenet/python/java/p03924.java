<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3

Expected output:
2


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
[/INST]

Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mod = 1000000007;
        int[][][] dp = new int[2][n + 1][n + 1];
        dp[0][1][1] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n + 1; j++) {
                for (int k = 0; k < n + 1; k++) {
                    dp[(i + 1) % 2][j][k] = 0;
                }
            }
            for (int j = 1; j < n + 1; j++) {
                for (int k = 1; k < j + 1; k++) {
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
Note that the `Math.min()` function is used to ensure that the index `j + 1` does not exceed the size of the array `dp`.</s>

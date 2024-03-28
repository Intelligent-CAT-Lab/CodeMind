```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int[][][] dp = new int[2][n + 1][n + 1];
        dp[0][1][1] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[(i + 1) % 2][j][k] = 0;
                }
            }
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= j; k++) {
                    dp[(i + 1) % 2][Math.min(j + 1, n)][k] = (dp[i % 2][j][k] * (n - j) % mod + dp[(i + 1) % 2][Math.min(j + 1, n)][k]) % mod;
                    dp[(i + 1) % 2][j][k] = (dp[i % 2][j][k] * (j - k) % mod + dp[(i + 1) % 2][j][k]) % mod;
                    dp[(i + 1) % 2][j][j] = (dp[i % 2][j][k] * k % mod + dp[(i + 1) % 2][j][j]) % mod;
                }
            }
        }
        System.out.println(dp[m % 2][n][n] % mod);
    }
}
```

Here is the Java version of your Python code:

```java
import java.io.*;
import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    static final int U = 2010;
    static long[][] C = new long[U][U];
    static long[][] dp = new long[U][U];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        K -= 1;
        C[0][0] = 1;
        for (int n = 1; n < U; n++) {
            C[n][0] = 1;
            for (int m = 1; m < U; m++) {
                C[n][m] = (C[n - 1][m - 1] + C[n - 1][m]) % MOD;
            }
        }
        dp[0][0] = 1;
        for (int n = 1; n < U; n++) {
            dp[n][n] = (dp[n - 1][n - 1] + dp[n - 1][n]) % MOD;
            for (int m = n + 1; m < U; m++) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % MOD;
            }
        }
        for (int n = U - 1; n >= 0; n--) {
            for (int m = n + 1; m < U; m++) {
                dp[n][m] -= dp[n - 1][m];
                dp[n][m] %= MOD;
            }
        }
        long ans = 0;
        if (K == N - 1) {
            for (int i = 0; i < N

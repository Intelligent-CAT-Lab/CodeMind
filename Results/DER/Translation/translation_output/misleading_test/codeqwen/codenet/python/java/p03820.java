Here is the Java version of the provided Python code:

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static final int MOD = 1000000007;
    static final int U = 2010;
    static long[][] C = new long[U][U];
    static long[][] dp = new long[U + 10][U + 10];

    public static void main(String[] args) throws Exception {
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
        for (int n = 1; n < U + 10; n++) {
            dp[n][n] = (dp[n - 1][n - 1] + dp[n - 1][n]) % MOD;
            for (int m = n + 1; m < U + 10; m++) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % MOD;
            }
        }
        for (int n = U + 9; n > 0; n--) {
            dp[n][n] -= dp[n - 1][n - 1];
            dp[n][n] %= MOD;
            for (int i = n - 1; i > 0; i--) {
                dp[n][i

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p03820 {
    static final int MOD = 1000000007;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        K -= 1;
        int U = 2010;
        long[][] C = new long[U][U];
        C[0][0] = 1;
        for (int n = 1; n < U; n++) {
            C[n][0] = 1;
            for (int m = 1; m < U; m++) {
                C[n][m] = (C[n - 1][m - 1] + C[n - 1][m]) % MOD;
            }
        }

        long[][] dp = new long[N + 10][N + 10];
        dp[0][0] = 1;
        for (int n = 1; n < N + 10; n++) {
            dp[n][n] = (dp[n - 1][n - 1] + dp[n - 1][n]) % MOD;
            for (int m = n + 1; m < N + 10; m++) {
                dp[n][m] = (dp[n - 1][m] + dp[n][m - 1]) % MOD;
            }
        }
        for (int n = N + 9; n > 0; n--) {
            dp[n][n] -= dp[n - 1][n - 1];
            dp[n][n] %= MOD;
            for (int m = n + 1; m < N + 10; m++) {
                dp[n][m] -= d
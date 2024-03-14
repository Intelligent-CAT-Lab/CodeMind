import java.util.*;
import java.io.*;

public class p02065 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int mod = (int)1e9 + 7;
        int[][] dp = new int[2*N][2*N];
        for (int i = 0; i < 2*N; i++) {
            Arrays.fill(dp[i], 0);
        }
        dp[0][0] = 1;
        for (int i = 0; i < 2*N-1; i++) {
            for (int j = 0; j < 2*N; j++) {
                for (int k = 0; k < 2*N; k++) {
                    if (j - k > K) continue;
                    dp[i+1][j+k] = (dp[i+1][j+k] + dp[i][j]) % mod;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < 2*N; i++) {
            res = (res + dp[2*N-1][i]) % mod;
        }
        System.out.println(res);
    }
}
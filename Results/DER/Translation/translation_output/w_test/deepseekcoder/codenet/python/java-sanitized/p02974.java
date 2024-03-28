import java.util.*;
import java.io.*;

public class p02974 {
    static int mod = (int)Math.pow(10, 9) + 7;
    static int[][][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        dp = new int[n+1][n+1][2*(n+1)*k+1];
        dp[0][0][0] = 1;

        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                for(int l=0; l<=k; l++) {
                    dp[i+1][j+1][l+2*(j+1)] = (dp[i+1][j+1][l+2*(j+1)] + dp[i][j][l]) % mod;
                    dp[i+1][j][l+2*j] = (dp[i+1][j][l+2*j] + dp[i][j][l]*(j*2+1)) % mod;
                    if(j!=0) {
                        dp[i+1][j-1][l+(j-1)*2] = (dp[i+1][j-1][l+(j-1)*2] + dp[i][j][l]*(int)Math.pow(j, 2)) % mod;
                    }
                }
            }
        }

        int ans = 0;
        for(int i=0; i<=n; i++) {
            ans = (ans + dp[n][i][k]) % mod;
        }

        System.out.println(ans);
    }
}
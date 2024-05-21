import java.util.*;
import java.io.*;

class Main {
    static int MOD = 100000007;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        long[][][] dp = new long[n+1][n+1][k+1];
        dp[0][0][0] = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                for(int l = 0; l <= k; l++){
                    dp[i+1][j+1][l+2*(j+1)] += dp[i][j][l];
                    dp[i+1][j+1][l+2*(j+1)]%=MOD;
                    dp[i+1][j][l+2*j] += dp[i][j][l]*(j*2+1);
                    dp[i+1][j][l+2*j] %= MOD;
                    if(j!= 0){
                        dp[i+1][j-1][l+(j-1)*2] += dp[i][j][l]*j*j;
                        dp[i+1][j-1][l+(j-1)*2]%=MOD;
                    }
                }
            }
        }
        System.out.println(dp[n][0][k]%MOD);
    }
}
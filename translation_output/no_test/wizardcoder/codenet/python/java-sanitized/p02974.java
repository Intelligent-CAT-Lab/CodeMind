import java.util.*;
import java.io.*;

public class p02974 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int[][][] dp = new int[n+1][n+1][2*(n+1)];
        dp[0][0][0] = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                for(int l=0; l<=k; l++){
                    dp[i+1][j+1][l+2*(j+1)] = (dp[i+1][j+1][l+2*(j+1)] + dp[i][j][l]) % 1000000007;
                    dp[i+1][j][l+2*j] = (dp[i+1][j][l+2*j] + dp[i][j][l]*(j*2+1)) % 1000000007;
                    if(j!=0){
                        dp[i+1][j-1][l+(j-1)*2] = (dp[i+1][j-1][l+(j-1)*2] + dp[i][j][l]*j*j) % 1000000007;
                    }
                }
            }
        }

        bw.write(dp[n][0][k] + "\n");

        bw.close();
        br.close();
    }
}
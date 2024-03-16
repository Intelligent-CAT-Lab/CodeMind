import java.util.*;
import java.io.*;

public class p03222 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int MOD=1000000000+7;
        int H=sc.nextInt();
        int W=sc.nextInt();
        int K=sc.nextInt()-1;
        int[][] dp=new int[1000][1000];
        dp[0][0]=1;
        dp[1][0]=1;
        dp[1][1]=1;
        dp[2][0]=2;
        dp[2][1]=2;
        dp[2][2]=2;
        for(int i=3;i<1000;i++){
            dp[i][0]=dp[i-1][0];
            dp[i][1]=dp[i-1][1];
            for(int j=2;j<i;j++){
                dp[i][j]=(dp[i-1][j]+dp[i-2][j])%MOD;
            }
        }
        int[][] dp2=new int[H+1][W+1];
        dp2[0][0]=1;
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                dp2[i+1][j]=(dp2[i+1][j]+dp2[i][j]*dp[j][W-j-1])%MOD;
                if(j-1>=0){
                    dp2[i+1][j-1]=(dp2[i+1][j-1]+dp2[i][j]*dp[j-1][W-j-1])%MOD;
                }
                if(j+1<W){
                    dp2[i+1][j+1]=(dp2[i+1][j+1]+dp2[i][j]*dp[j][W-j-2])%MOD;
                }
            }
        }
        System.out.println(dp2[H][K]);
    }
}
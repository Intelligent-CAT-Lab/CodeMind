import java.util.*;
import java.math.*;

public class p02636 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        int N=S.length();
        int mod=998244353;
        int[][][] dp=new int[N+1][N+1][N+1];
        int[][][] dpf=new int[N+1][N+1][N+1];
        int[][] g1=new int[N+1][N+1];
        int[][] g2=new int[N+1][N+1];
        int[][] inverse=new int[N+1][N+1];
        for(int i=0;i<=N;i++){
            g1[i][0]=1;
            g2[i][0]=1;
            inverse[i][0]=1;
        }
        for(int i=1;i<=N;i++){
            g1[i][i]=1;
            g2[i][i]=1;
            inverse[i][i]=1;
            for(int j=i-1;j>=1;j--){
                g1[i][j]=(g1[i-1][j-1]*j)%mod;
                inverse[i][j]=(inverse[mod%j][j]*(mod/j))%mod;
                g2[i][j]=(g2[i-1][j]*inverse[i][j])%mod;
            }
        }
        for(int i=0;i<=N;i++){
            for(int j=0;j<=N;j++){
                for(int k=0;k<=N;k++){
                    dp[i][j][k]=-1000000000;
                    dpf[i][j][k]=-1000000000;
                }
            }
        }
        dp[0][0][0]=1;
        dpf[0][0][0]=1;
        dp[1][0][1]=0;
        dp[1][1][0]=0;
        dpf[1][0][0]=2;
        int zero=1-S.charAt(0)+1-S.charAt(1);
        int one=S.charAt(0)+S.charAt(1);
        for(int i=2;i<=N;i++){
            zero+=1-S.charAt(i);
            one+=S.charAt(i);
            for(int j=zero+1;j>=0;j--){
                for(int k=one+1;k>=0;k--){
                    int a=1-S.charAt(i),b=S.charAt
import java.util.*;
import java.math.*;

public class p02636 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mod=998244353;
        int N=2*10**3;
        int[] g1=new int[N+1];
        int[] g2=new int[N+1];
        int[] inverse=new int[N+1];
        g1[0]=1;
        g2[0]=1;
        inverse[0]=1;
        for(int i=1;i<=N;i++){
            g1[i]=(g1[i-1]*i)%mod;
            inverse[i]=(inverse[mod%i]*(mod/i))%mod;
            g2[i]=(g2[i-1]*inverse[i])%mod;
        }
        inverse[0]=0;
        String S=sc.next();
        int N1=S.length();
        int[][][] dp=new int[N1+1][N1+2][N1+2];
        int[][][] dpf=new int[N1+1][N1+2][N1+2];
        for(int i=0;i<=N1;i++){
            for(int j=0;j<=N1+1;j++){
                for(int k=0;k<=N1+1;k++){
                    dp[i][j][k]=-1000000000;
                    dpf[i][j][k]=-1000000000;
                }
            }
        }
        dp[0][0][0]=1;
        dpf[0][0][0]=1;
        if(S.charAt(0)=='0'){
            dp[1][1][0]=0;
            dpf[1][1][0]=0;
        }
        if(S.charAt(1)=='0'){
            dp[1][1][0]=0;
            dpf[1][1][0]=0;
        }
        if(S.charAt(0)=='1'){
            dp[1][0][1]=0;
            dpf[1][0][1]=0;
        }
        if(S.charAt(1)=='1'){
            dp[1][0][1]=0;
            dpf[1][0][1]=0;
        }
        dpf[1][0][0]=2;
        int Zero=1-S.charAt(0)+1-S.charAt(1);
        int One=S.charAt(0)+S.charAt(1);
        for(int i=2;i<=N1;i++){
            Zero+=1-S.charAt(i);
            One+=S.charAt(i);
            for(int j=0;j<=Zero+1;j++){
                for
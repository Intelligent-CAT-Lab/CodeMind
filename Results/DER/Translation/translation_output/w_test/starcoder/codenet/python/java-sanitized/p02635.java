import java.util.*;
import java.lang.*;
import java.io.*;

public class p02635 {
    static int mod=998244353;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int K=sc.nextInt();
        K=Math.min(K,300);
        int[] a=new int[S.length()];
        int val=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='0'){
                a[i]=val;
                val=0;
            }else{
                val++;
            }
        }
        if(val!=0){
            a[S.length()-1]=val;
        }
        int m=a.length;
        K=Math.min(Arrays.stream(a).sum(),K);
        int[][][] dp=new int[m+1][K+1][K+1];
        for(int j=0;j<=K;j++){
            dp[m][j][j]=1;
        }
        int[] b=new int[m+1];
        int[] c=new int[m+1];
        for(int i=1;i<=m;i++){
            b[i]=b[i-1]+a[i-1];
        }
        for(int i=m-1;i>=0;i--){
            c[i]=c[i+1]+a[i];
        }
        for(int i=m-1;i>=0;i--){
            for(int k=Math.min(b[i],K)+1;k>=0;k--){
                for(int j=Math.min(K,k+c[i])+1;j>=0;j--){
                    int M=Math.max(k-j,-a[i]);
                    dp[i][j][k]=0;
                    for(int l=Math.max(0,M);l<=K-j;l++){
                        dp[i][j][k]+=dp[i+1][j+l][k];
                    }
                    for(int l=1;l<=Math.min(K-k,-M);l++){
                        dp[i][j][k]+=dp[i+1][j][k+l];
                    }
                    dp[i][j][k]%=mod;
                }
            }
        }
        System.out.println(dp[0][0][0]);
    }
}
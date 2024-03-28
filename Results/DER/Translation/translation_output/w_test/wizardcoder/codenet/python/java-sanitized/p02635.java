import java.util.*;
import java.math.*;

public class p02635 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int K=sc.nextInt();
        K=Math.min(K,300);
        int mod=998244353;
        int[] a=new int[S.length()];
        int val=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='0'){
                a[i]=val;
                val=0;
            }
            else{
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
            b[i]=a[i-1]+b[i-1];
        }
        for(int i=m-1;i>=1;i--){
            c[i]=a[i]+c[i+1];
        }
        for(int i=m-1;i>=0;i--){
            for(int k=0;k<=K;k++){
                for(int j=0;j<=k;j++){
                    int M=Math.max(k-j,-a[i]);
                    dp[i][j][k]=Arrays.stream(dp[i+1][j+M][k+M]).sum()+Arrays.stream(dp[i+1][j][k+1]).sum();
                    dp[i][j][k]%=mod;
                }
            }
        }
        System.out.println(dp[0][0][0]);
    }
}
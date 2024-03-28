import java.util.*;
public class p02608 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][][] dp=new int[101][101][101];
        for(int i=1;i<=100;i++){
            for(int j=1;j<=100;j++){
                for(int k=1;k<=100;k++){
                    dp[i][j][k]=i*i+j*j+k*k+i*j+j*k+k*i;
                }
            }
        }
        int[] cnt=new int[n+1];
        for(int i=1;i<=100;i++){
            for(int j=1;j<=100;j++){
                for(int k=1;k<=100;k++){
                    if(dp[i][j][k]<=n){
                        cnt[dp[i][j][k]]++;
                    }
                }
            }
        }
        for(int i=1;i<=n;i++){
            System.out.println(cnt[i]);
        }
    }
}
import java.util.*;
import java.io.*;
public class p01995 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        int mod=1000000007;
        int[][] dp=new int[l+1][l+1];
        dp[0][l]=1;
        int ans=0;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<=l;j++){
                int p=dp[i][j];
                if(p==0) continue;
                for(int k=0;k<26;k++){
                    int x=Arrays.binarySearch(memo[k],i);
                    int y=Arrays.binarySearch(memo[k],j-1);
                    if(x>y) continue;
                    ans=(ans+p)%mod;
                    if(x<y){
                        int mx=memo[k][x];
                        int my=memo[k][y];
                        dp[mx+1][my]=(dp[mx+1][my]+p)%mod;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
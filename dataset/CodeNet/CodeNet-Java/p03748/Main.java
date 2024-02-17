import java.util.*;
class Main{
  static int[][][] dp;
  static int mod = (int)1e9+7;
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    dp = new int[2][n+1][2];
    dp[0][0][1]=1;
    for(int i=1;i<=n;++i)dp[0][i][0]=1;
    for(int i=0;i<m;++i){
      for(int j=0;j<=n;++j){
		for(int k=0;k<2;++k){
          if(j==0){
            if(k==0)dp[(i+1)%2][0][0]=0;
            else dp[(i+1)%2][0][1] = (dp[i%2][0][1] + (dp[i%2][1][0] + dp[i%2][1][1])%mod)%mod;
          }else if(j==1){
            if(k==0){
              if(n<2)dp[(i+1)%2][j][k]=0;
              else dp[(i+1)%2][1][0] = (dp[i%2][1][0]+dp[i%2][2][0])%mod;
            }else{
              if(n<2)dp[(i+1)%2][1][1] = (dp[i%2][1][0] + (dp[i%2][1][1]+dp[i%2][0][1])%mod)%mod;
              else dp[(i+1)%2][1][1] = (((dp[i%2][1][0]+dp[i%2][0][1])%mod + dp[i%2][1][1]*2%mod)%mod + dp[i%2][2][1])%mod;
            }
          }else{
            dp[(i+1)%2][j][k] = (dp[i%2][j][k]+dp[i%2][j-1][k])%mod;
            if(j+1<=n)dp[(i+1)%2][j][k] = (dp[(i+1)%2][j][k] + (dp[i%2][j][k]+dp[i%2][j+1][k])%mod)%mod;
          }
        }
      }
    }
    long ans = 0;
    for(int i=0;i<=n;++i)ans = (ans + dp[m%2][i][1])%mod;
    System.out.println(ans);
  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long MOD = (long)Math.pow(10, 9) + 7;
    long[][][][] dp = new long[n][4][4][4];
    long ans = 0;
    if(n == 1) {
      ans = 4;
    } else if(n == 2) {
      ans = 16;
    } else {
      for(int i = 0; i < 4; i++) {
        for(int j = 0; j < 4; j++) {
          for(int k = 0; k < 4; k++) {
            if(!(((i == 0) && (j == 2) && (k == 1)) || ((i == 2) && (j == 0) && (k == 1)) || ((i == 0) && (j == 1) && (k == 2)))) {
              dp[2][i][j][k] = 1;
            }
          }
        }
      }
      for(int m = 3; m < n; m++) {
        for(int i = 0; i < 4; i++) {
          for(int j = 0; j < 4; j++) {
            for(int k = 0; k < 4; k++) {
              if((k == 0) || (k == 3)) {
                for(int t = 0; t < 4; t++) {
                  dp[m][i][j][k] = (dp[m][i][j][k] + dp[m - 1][t][i][j]) % MOD;
                }
              }
              if(k == 1) {
                if(!(((i == 0) && (j == 2)) || ((i == 2) && (j == 0)))) {
                  for(int t = 0; t < 4; t++) {
                    if(!(((t == 0) && (j == 2)) || ((t == 0) && (i == 2)))) dp[m][i][j][k] = (dp[m][i][j][k] + dp[m - 1][t][i][j]) % MOD;
                  }
                }
              }
              if(k == 2) {
                if(!((i == 0) && (j == 1))) {
                  for(int t = 0; t < 4; t++) {
                    dp[m][i][j][k] = (dp[m][i][j][k] + dp[m - 1][t][i][j]) % MOD;
                  }
                } 
              }
            }
          }
        }
      }
      for(int i = 0; i < 4; i++) {
        for(int j = 0; j < 4; j++) {
          for(int k = 0; k < 4; k++) {
            ans = (ans + dp[n - 1][i][j][k]) % MOD;
          }
        }
      }
    }
    System.out.println(ans);
  }
}
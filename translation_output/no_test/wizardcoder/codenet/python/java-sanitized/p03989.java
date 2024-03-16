import java.util.*;
import java.math.*;

public class p03989 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int mod = 924844033;
    int rng = 2010;
    int[] fctr = new int[rng];
    int[] finv = new int[rng];
    fctr[0] = 1;
    finv[0] = 1;
    for (int i = 1; i < rng; i++) {
      fctr[i] = (int) ((long) fctr[i-1] * i % mod);
      finv[i] = (int) pow(fctr[i], mod-2, mod);
    }
    int[][] dp = new int[n+1][n+1];
    for (int i = 0; i <= n; i++) {
      dp[i][0] = 1;
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        dp[i][j] = dp[i-1][j] + dp[i][j-1];
        dp[i][j] %= mod;
      }
    }
    int ans = 0;
    for (int i = 0; i <= n; i++) {
      ans += dp[n][i] * fctr[n-i];
      ans %= mod;
    }
    System.out.println(ans);
  }

  public static long pow(long a, long b, long mod) {
    if (b == 0) {
      return 1;
    }
    long res = pow(a, b/2, mod);
    res = (res * res) % mod;
    if (b % 2 == 1) {
      res = (res * a) % mod;
    }
    return res;
  }
}
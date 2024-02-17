import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static final long MOD = 998244353;

  public static void main(String[] args) {
    char[] S = sc.next().toCharArray();
    int N = S.length;
    boolean all = true;
    boolean any = false;
    int sum = S[N - 1] - '0';
    for (int i = 0; i < N - 1; i++) {
      if (S[i] != S[i + 1]) {
        all = false;
      } else {
        any = true;
      }
      sum += S[i] - '0';
    }
    sum %= 3;
    if (all) {
      System.out.println(1);
      return;
    }
    if (N == 2) {
      System.out.println(2);
      return;
    }
    if (N == 3 && !any && S[0] != S[2]) {
      System.out.println(3);
      return;
    }
    long[][][] dp = new long[3][3][N];
    for (int i = 0; i < 3; i++) {
      dp[i][i][0] = 1;
    }
    for (int i = 0; i < N - 1; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          for (int l = 0; l < 3; l++) {
            if (l == k) continue;
            dp[(j + l) % 3][l][i + 1] += dp[j][k][i];
            if (dp[(j + l) % 3][l][i + 1] >= MOD) dp[(j + l) % 3][l][i + 1] -= MOD;
          }
        }
      }
    }
    long ans = 1;
    for (int i = 0; i < N - 1; i++) {
      ans *= 3;
      ans %= MOD;
    }
    for (int i = 0; i < 3; i++) {
      ans += MOD - dp[sum][i][N - 1];
    }
    if (!any) ++ans;
    System.out.println(ans % MOD);
  }

}

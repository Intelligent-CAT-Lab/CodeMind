import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    long M = 1_000_000_007;

    long[][][] dp = new long[N + 1][N + 1][K + 1];
    dp[0][0][0] = 1;
    for (int i = 1; i <= N; i++)
      for (int j = 0; j <= i; j++)
          for (int k = 2 * j; k <= K; k++) {
              if (j > 0) dp[i][j][k] = dp[i - 1][j - 1][k - 2 * j];
              dp[i][j][k] += (2 * j + 1) * dp[i - 1][j][k - 2 * j] % M;
              if (dp[i][j][k] >= M) dp[i][j][k] -= M;
              if (j < N) dp[i][j][k] += (j + 1) * (j + 1) * dp[i - 1][j + 1][k - 2 * j] % M;
              if (dp[i][j][k] >= M) dp[i][j][k] -= M;
            }
    System.out.println(dp[N][0][K]);
  }
}

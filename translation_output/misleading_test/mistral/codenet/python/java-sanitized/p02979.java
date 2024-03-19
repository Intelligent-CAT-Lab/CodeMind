import java.util.*;

public class p02979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = sc.nextInt();

        int L = (N + 1) / 2 + 1;

        int[][][] dp = new int[N + 1][L + 1][L + 1];
        dp[0][0][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= L; j++) {
                dp[i + 1][j][0] = (dp[i + 1][j][0] + dp[i][j]) % M;
            }
        }

        for (int i = 1; i <= L; i++) {
            for (int j = 1; j <= L; j++) {
                if (i != j) {
                    dp[i][j][i + j] = (dp[i][j][i + j] + dp[i - 1][j - 1]) % M;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i <= L; i++) {
            for (int j = 0; j <= L; j++) {
                if (i != j) {
                    sum += dp[i][j][i + j];
                }
            }
        }

        sum %= M;
        System.out.println(sum);
    }
}
import java.util.Scanner;

public class p02979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = sc.nextInt();

        // limitã®æå¤§å¤ï¼limitãªãï¼
        int L = (N+1)/2+1;

        // dp[iã¾ã§ã¿ã][åã®jåãé£ç¶]
        int[][] dp = new int[N+1][K+1];
        dp[0][0] = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K + 1; j++) {
                dp[i+1][0] = (dp[i+1][0] + dp[i][j]) % M;
                // ç´åã«Kåé£ç¶ãã¦ããã¨ãã¯è¿½å ã§ããªã
                if (j != K) {
                    dp[i+1][j+1] = (dp[i+1][j+1] + dp[i][j]) % M;
                }
            }
        }

        int ret = 0;
        for (int x = 0; x < L + 1; x++) {
            for (int y = 0; y < L + 1; y++) {
                if (loop(x, y)) {
                    continue;
                }
                for (int z = max(x, y) + 1; z < L + 1; z++) {
                    if (dp[x][y][z] == 0) {
                        continue;
                    }
                    dp[y][x + 1][z] += dp[x][y][z];
                    dp[y][x + 1][z] %= M;
                    // zã®æ´æ°
                    // (1) y > x ã®ã¨ãã¯zãå¼ãç¶ã y <= x ã®ã¨ãã¯Lã«ãªã»ãã
                    // (2) â ã¿ãããªç¢å°ã
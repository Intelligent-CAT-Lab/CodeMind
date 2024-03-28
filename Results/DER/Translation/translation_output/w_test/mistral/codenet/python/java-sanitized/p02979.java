import java.util.*;

public class p02979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, K, M;
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        M = Integer.parseInt(input[2]);

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
                    dp[i][j + 1][j + 1] = (dp[i][j + 1][j + 1] + dp[i][j]) % M;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i <= L; i++) {
            for (int j = 0; j <= L; j++) {
                if (i != j) {
                    sum += dp[i][j][j];
                }
            }
        }

        sum %= M;

        if (K % 2 == 0) {
            System.out.println(sum * sum % M);
        } else {
            int[][] dp0 = new int[L + 1][L + 1][L + 1];
            dp0[0][0][L] = 1;

            for (int i = 0; i < N; i++) {
                int[][] dp1 = new int[L + 1][L + 1][L + 1];
                for (int x = 0; x <= L; x++) {
                    for (int y = 0; y <= L; y++) {
                        if (loop(x, y)) {
                            continue;
                        }
                        for (int z = max(x, y) + 1; z <= L; z += L + 1) {
                            if (dp0[x][y][z] == 0) {
                                continue;
                            }
                            dp1[y][x + 1][z] += dp0[x][y][z];
                            dp1[y][x + 1][z] %= M;
                            // zã®æ´æ°
                            // (1) y > x ã®ã¨ãã¯zãå¼ãç¶ã y <= x ã®ã¨ãã¯Lã«ãªã»ãã
                            // (2) â ã¿ãããªç
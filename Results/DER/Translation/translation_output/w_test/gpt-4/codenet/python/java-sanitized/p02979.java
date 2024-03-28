import java.util.Scanner;

public class p02979 {
    private static int N, K, M;
    private static int L;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        K = input.nextInt();
        M = input.nextInt();
        L = (N + 1) / 2 + 1;

        if (K % 2 == 0) {
            System.out.println(even(N / 2, K / 2) * even((N + 1) / 2, K / 2) % M);
        } else {
            int[][][] dp0 = new int[L + 1][L + 1][L + 1];
            dp0[0][0][L] = 1;

            for (int i = 0; i < N; i++) {
                int[][][] dp1 = new int[L + 1][L + 1][L + 1];
                for (int x = 0; x < L + 1; x++) {
                    for (int y = 0; y < L + 1; y++) {
                        if (loop(x, y)) continue;
                        for (int z = Math.max(x, y); z < L + 1; z++) {
                            if (dp0[x][y][z] == 0) continue;
                            dp1[y][x + 1][z] = (dp1[y][x + 1][z] + dp0[x][y][z]) % M;

                            int zz = y > x ? z : L;
                            if (2 * y >= K + 3 && x > 0) {
                                zz = Math.min(zz, 1 + y - x + K / 2);
                            }
                            dp1[y][0][zz] = (dp1[y][0][zz] + dp0[x][y][z]) % M;
                        }
                    }
                }
                dp0 = dp1;
            }

            int ret = 0;
            for (int x = 0; x < L + 1; x++) {
                for (int y = 0; y < L + 1; y++) {
                    if (loop(x, y)) continue;
                    for (int z = Math.max(x, y); z < L + 1; z++) {
                        ret = (ret + dp0[x][y][z]) % M;
                    }
                }
            }

            System.out.println(ret);
        }
    }

    private static int even(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];
        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i + 1][0] = (dp[i + 1][0] + dp[i][j]) % M;
                if (j != k) {
                    dp[i + 1][j + 1] = (dp[i + 1][j + 1] + dp[i][j]) % M;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i <= k; i++) {
            sum = (sum + dp[n][i]) % M;
        }
        return sum;
    }

    private static boolean loop(int x, int y) {
        return 2 * x >= K + 1 && 2 * y >= K + 3;
    }
}
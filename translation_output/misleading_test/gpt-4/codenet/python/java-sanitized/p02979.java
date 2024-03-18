import java.util.Scanner;

public class p02979 {

    // limitの最大値（limitなし）
    static int L;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int M = scanner.nextInt();
        L = (N + 1) / 2 + 1;

        if (K % 2 == 0) {
            System.out.println((long) even(N / 2, K / 2, M) * even((N + 1) / 2, K / 2, M) % M);
        } else {
            // 3D array for memoization
            long[][][] dp0 = new long[L + 1][L + 1][L + 1];
            dp0[0][0][L] = 1;

            for (int i = 0; i < N; i++) {
                long[][][] dp1 = new long[L + 1][L + 1][L + 1];
                for (int x = 0; x < L + 1; x++) {
                    for (int y = 0; y < L + 1; y++) {
                        if (loop(x, y, K)) continue;
                        for (int z = Math.max(x, y) + 1; z < L + 1; z++) {
                            if (dp0[x][y][z] == 0) continue;
                            dp1[y][x + 1][z] = (dp1[y][x + 1][z] + dp0[x][y][z]) % M;

                            int zz = (y > x) ? z : L;
                            if (2 * y >= K + 3 && x > 0) {
                                zz = Math.min(zz, y - x + K / 2 + 1);
                            }
                            dp1[y][0][zz] = (dp1[y][0][zz] + dp0[x][y][z]) % M;
                        }
                    }
                }
                dp0 = dp1;
            }

            long ret = 0;
            for (int x = 0; x < L + 1; x++) {
                for (int y = 0; y < L + 1; y++) {
                    if (loop(x, y, K)) continue;
                    for (int z = Math.max(x, y) + 1; z < L + 1; z++) {
                        ret = (ret + dp0[x][y][z]) % M;
                    }
                }
            }

            System.out.println(ret);
        }
    }

    static long even(int n, int k, int M) {
        long[][] dp = new long[n + 1][k + 1];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k + 1; j++) {
                dp[i + 1][0] = (dp[i + 1][0] + dp[i][j]) % M;
                if (j != k) {
                    dp[i + 1][j + 1] = (dp[i + 1][j + 1] + dp[i][j]) % M;
                }
            }
        }

        long sum = 0;
        for (int j = 0; j < k + 1; j++) {
            sum = (sum + dp[n][j]) % M;
        }

        return sum;
    }

    static boolean loop(int x, int y, int K) {
        return 2 * x >= K + 1 && 2 * y >= K + 3;
    }
}
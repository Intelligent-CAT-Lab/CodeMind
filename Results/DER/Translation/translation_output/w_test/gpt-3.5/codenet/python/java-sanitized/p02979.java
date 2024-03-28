import java.util.*;

public class p02979 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int M = scanner.nextInt();

        int L = (N + 1) / 2 + 1;

        if (K % 2 == 0) {
            System.out.println(even(N / 2, K / 2, M) * even((N + 1) / 2, K / 2, M) % M);
        } else {
            int[][][] dp0 = new int[L + 1][L + 1][L + 1];
            dp0[0][0][L] = 1;

            for (int i = 0; i < N; i++) {
                int[][][] dp1 = new int[L + 1][L + 1][L + 1];
                for (int x = 0; x <= L; x++) {
                    for (int y = 0; y <= L; y++) {
                        if (loop(x, y, K)) continue;
                        for (int z = Math.max(x, y) + 1; z <= L; z++) {
                            if (dp0[x][y][z] == 0) continue;
                            dp1[y][x + 1][z] += dp0[x][y][z];
                            dp1[y][x + 1][z] %= M;

                            int zz;
                            if (y > x) {
                                zz = z;
                            } else {
                                zz = L;
                            }
                            if (2 * y >= K + 3 && x > 0) {
                                zz = Math.min(zz, 1 + y - x + K / 2);
                            }
                            dp1[y][0][zz] += dp0[x][y][z];
                            dp1[y][0][zz] %= M;
                        }
                    }
                }
                dp0 = dp1;
            }

            int ret = 0;
            for (int x = 0; x <= L; x++) {
                for (int y = 0; y <= L; y++) {
                    if (loop(x, y, K)) continue;
                    for (int z = Math.max(x, y) + 1; z <= L; z++) {
                        ret += dp0[x][y][z];
                        ret %= M;
                    }
                }
            }

            System.out.println(ret);
        }
    }

    public static int even(int n, int k, int M) {
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
        for (int num : dp[n]) {
            sum = (sum + num) % M;
        }

        return sum;
    }

    public static boolean loop(int x, int y, int K) {
        return (2 * x >= K + 1 && 2 * y >= K + 3);
    }
}
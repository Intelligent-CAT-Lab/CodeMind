import java.util.*;

public class p01432 {
    static int mul(int n, int[][] A, int[][] B, int[][] C) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    static int fast_pow(int n, int[][] MA, int[][] A, int k) {
        int[][] R = new int[n][n];
        while (k != 0) {
            if (k % 2 == 1) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        R[i][j] = 0;
                        for (int k = 0; k < n; k++) {
                            R[i][j] += MA[i][k] * A[k][j];
                        }
                    }
                }
            }
            int[][] tmp = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    tmp[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        tmp[i][j] += R[i][k] * A[k][j];
                    }
                }
            }
            R = tmp;
            MA = tmp;
            k >>= 1;
        }
        return R;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S, N, K;
        S = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt();
        S = Math.abs(S);
        if (S == 0) {
            System.out.println(0);
            return;
        }
        if (N == 1) {
            if (S % K != 0) {
                System.out.println(-1);
            } else {
                System.out.printf("%.16f", (double) S / K);
            }
            return;
        }
        int M = N * K;
        int[][] dp = new int[M + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 1; i--) {
                dp[i] = 0;
                for (int j = 1; j <= N; j++) {
                    dp[i] += dp[i - j];
                }
            }
        }
        int sum = 0;
        for (int i = 0; i <= M; i++) {
            sum += dp[i];
        }
        int[][] mat = new int[M + 1][M + 2];
        mat[0][0] = 1;
        for (int i = 1; i <= M; i++) {
            int[] row = mat[i];
            for (int j = 0; j <= M; j++) {
                row[j] = 0;
                if (Math.abs(i - j) == 1) {
                    row[j] = dp[j];
                }
            }
            row[i] = sum - dp[i];
            for (int j = 0; j <= M; j++) {
                row[j] /= sum;
            }
            row[M + 1] = 1;
        }
        int[] C = new int[M];
        for (int i = M - 1; i >= 0; i--) {
            C[i] = mat[i][M + 1];
        }
        C[M] = 1;
        if (S <= M) {
            System.out.printf("%.16f", (double) C[M - S]);
            return;
        }
        int[][] mat2 = new int[M + 1][M];
        for (int i = 0; i <= M; i++) {
            mat2[0][i] = dp[i + 1] / sum;
        }
        for (int i = 1; i <= M - 1; i++) {
            mat2[i + 1][i] = 1;
        }
        mat2[0][M] = mat2[M][M] = 1;
        int[][] C1 = fast_pow(M +
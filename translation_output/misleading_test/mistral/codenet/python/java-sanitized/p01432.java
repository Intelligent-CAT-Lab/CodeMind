import java.util.*;

public class p01432 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S, N, K;
        S = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt();
        if (S == 0) {
            System.out.println("0");
            return;
        }
        if (N == 1) {
            if (S % K != 0) {
                System.out.println("-1");
            } else {
                System.out.printf("%.16f%n", (double) S / K);
            }
            return;
        }
        int M = N * K;
        int[] dp = new int[M + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 1; i--) {
                dp[i] = Arrays.stream(Arrays.range(1, N + 1))
                        .filter(j -> i >= j)
                        .mapToInt(j -> dp[i - j])
                        .sum();
            }
        }
        int s = Arrays.stream(dp).sum();
        int[][] mat = new int[M + 1][M + 2];
        mat[0][0] = 1;
        for (int i = 1; i < M + 1; i++) {
            int[] row = mat[i];
            for (int j = 0; j < M + 2; j++) {
                row[j] = (j == i) ? 0 : row[j - i];
            }
            row[i] = s - row[i];
            for (int j = 0; j < M + 2; j++) {
                row[j] /= s;
            }
            row[M + 1] = 1;
        }
        for (int i = 0; i < M; i++) {
            int v = mat[i][i];
            for (int j = 0; j < M + 2; j++) {
                mat[i][j] /= v;
            }
            for (int j = 0; j < M; j++) {
                int e = mat[j][i];
                for (int k = 0; k < M + 2; k++) {
                    mat[j][k] -= e * mat[i][k];
                }
            }
        }
        int[] C = new int[M];
        for (int i = M - 1; i >= 0; i--) {
            C[i] = mat[i][M + 1];
        }
        C[M] = 1;
        if (S <= M) {
            System.out.printf("%.16f%n", (double) C[M - S]);
            return;
        }
        int[][] mat2 = new int[M + 1][M + 1];
        for (int i = 0; i < M; i++) {
            mat2[0][i] = dp[i + 1] / s;
        }
        for (int i = 1; i < M; i++) {
            mat2[i + 1][i] = 1;
        }
        mat2[0][M] = mat2[M][M] = 1;
        int[] C1 = fastPow(M + 1, mat2, C, S - M);
        System.out.printf("%.16f%n", (double) C1[0]);
    }

    public static int[] fastPow(int n, int[][] MA, int[] A, int k) {
        int[] R = new int[n];
        while (k != 0) {
            if (k % 2 == 1) {
                A = multiply(A, MA);
            }
            multiply(MA, MA, R);
            MA = R;
            k >>= 1;
        }
        return R;
    }

    public static int[] multiply(int[][] A, int[][] B) {
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
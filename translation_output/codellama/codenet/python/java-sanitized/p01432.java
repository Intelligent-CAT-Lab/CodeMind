import java.util.Scanner;

public class p01432 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int N = sc.nextInt();
        int K = sc.nextInt();
        S = Math.abs(S);
        if (S == 0) {
            System.out.println("0");
            return;
        }
        if (N == 1) {
            if (S % K != 0) {
                System.out.println("-1");
            } else {
                System.out.println(S / K);
            }
            return;
        }
        int M = N * K;
        int[] dp = new int[M + 1];
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = N * K; i >= 0; i--) {
                dp[i] += dp[i - 1];
            }
        }
        int s = 0;
        for (int i = 0; i <= M; i++) {
            s += dp[i];
        }
        double[][] mat = new double[M + 1][M + 2];
        mat[0][0] = 1;
        for (int i = 1; i <= M; i++) {
            double[] mi = mat[i];
            for (int j = 0; j <= M; j++) {
                mi[Math.abs(i - j)] -= dp[j];
            }
            mi[i] += s;
            for (int j = 0; j <= M; j++) {
                mi[j] /= s;
            }
            mi[M + 1] = 1;
        }
        for (int i = 0; i <= M; i++) {
            double v = mat[i][i];
            for (int j = 0; j <= M + 1; j++) {
                mat[i][j] /= v;
            }
            for (int k = 0; k <= M; k++) {
                if (k == i) {
                    continue;
                }
                double e = mat[k][i];
                for (int j = 0; j <= M + 1; j++) {
                    mat[k][j] -= e * mat[i][j];
                }
            }
        }
        double[] C = new double[M + 1];
        for (int i = M; i >= 0; i--) {
            C[i] = mat[i][M + 1];
        }
        C[M] = 1;
        if (S <= M) {
            System.out.println(C[M - S]);
            return;
        }
        double[][] mat2 = new double[M + 1][M + 1];
        for (int i = 0; i < M; i++) {
            mat2[0][i] = dp[i + 1] / s;
        }
        for (int i = 0; i < M - 1; i++) {
            mat2[i + 1][i] = 1;
        }
        mat2[0][M] = mat2[M][M] = 1;
        double[] C1 = fastPow(mat2, C, S - M);
        System.out.println(C1[0]);
    }

    public static double[] fastPow(double[][] mat, double[] C, int k) {
        double[][] R = new double[mat.length][mat[0].length];
        while (k > 0) {
            if (k % 2 == 1) {
                C = mul(mat, C);
            }
            mat = mul(mat, mat);
            k >>= 1;
        }
        return C;
    }

    public static double[] mul(double[][] mat, double[] C) {
        double[] res = new double[C.length];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                res[i] += mat[i][j] * C[j];
            }
        }
        return res;
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p01432 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter wr = new PrintWriter(System.out);
    static StringTokenizer st;

    static int[][] mul(int n, int[][] A, int[][] B, int[][] C) {
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

    static int[][] fastPow(int n, int[][] MA, int[][] A, long k) {
        int[][] R = new int[n][n];
        while (k > 0) {
            if ((k & 1) == 1) {
                A = mul(n, MA, A, R);
            }
            MA = mul(n, MA, MA, R);
            k >>= 1;
        }
        return A;
    }

    static void solve() throws IOException {
        st = new StringTokenizer(br.readLine());
        int S = Math.abs(Integer.parseInt(st.nextToken()));
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        if (S == 0) {
            wr.println("0");
            return;
        }
        if (N == 1) {
            if (S % K != 0) {
                wr.println("-1");
            } else {
                wr.printf("%.16f\n", (double) S / K);
            }
            return;
        }
        int M = N * K;
        long[] dp = new long[M + 1];
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 0; i--) {
                dp[i] = Arrays.stream(dp, Math.max(0, i - N), Math.min(M + 1, i + 1)).sum();
            }
        }
        long s = Arrays.stream(dp).sum();
        int[][] mat = new int[M + 1][M + 2];
        mat[0][0] = 1;
        for (int i = 1; i <= M; i++) {
            int[] mi = mat[i];
            Arrays.fill(mi, 0);
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
            int v = mat[i][i];
            for (int j = 0; j <= M + 1; j++) {
                mat[i][j] /= v;
            }
            for (int k = 0; k <= M; k++) {
                if (k == i) continue;
                int e = mat[k][i];
                for (int j = 0; j <= M + 1; j++) {
                    mat[k][j] -= e * mat[i][j];
                }
            }
        }
        long[] C = new long[M + 1];
        for (int i = M; i >= 0; i--) {
            C[i] = mat[i][M + 1];
        }
        C[M] = 1;
        if (S <= M) {
            wr.printf("%.16f\n", (double) C[M - S]);
            return;
        }
        int[][] mat2 = new int[M + 1][M + 1];
        for (int i = 0; i < M; i++) {
            mat2[0][i] = (int) (dp[i + 1] / s);
        }
        for (int i = 0; i < M - 1; i++) {
            mat2[i + 1][i] = 1;
        }
        mat2[0][M] = mat2[M][M] = 1;
        int[] C1 = fastPow(M + 1, mat2, C, S - M);
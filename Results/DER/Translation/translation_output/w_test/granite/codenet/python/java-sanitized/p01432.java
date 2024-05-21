import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p01432 {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    static PrintWriter writer;

    static String nextToken() throws IOException {
        while (tokenizer == null ||!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    static void banana() throws IOException {
        int S = nextInt();
        int N = nextInt();
        int K = nextInt();
        S = Math.abs(S);
        if (S == 0) {
            writer.println(0);
            return;
        }
        if (N == 1) {
            if (S % K!= 0) {
                writer.println(-1);
            } else {
                writer.println(String.format("%.16f", (double) S / K));
            }
            return;
        }
        int M = N * K;
        int[] dp = new int[M + 1];
        dp[0] = 1;
        for (int t = 0; t < K; t++) {
            for (int i = M; i >= 0; i--) {
                for (int k = 1; k <= N; k++) {
                    if (i - k >= 0) {
                        dp[i] += dp[i - k];
                    }
                }
            }
        }
        int s = 0;
        for (int i = 0; i <= M; i++) {
            s += dp[i];
        }
        double[][] mat = new double[M + 1][M + 2];
        mat[0][0] = 1;
        for (int i = 1; i <= M; i++) {
            for (int j = 0; j <= M; j++) {
                mat[i][Math.abs(i - j)] -= dp[j] / (double) s;
            }
            mat[i][i] += s;
            for (int j = 0; j <= M; j++) {
                mat[i][j] /= mat[i][i];
            }
            mat[i][M + 1] = 1;
        }
        double[] C = new double[M + 1];
        C[M] = 1;
        if (S <= M) {
            writer.println(String.format("%.16f", C[M - S]));
            return;
        }
        double[][] mat2 = new double[M + 1][M + 1];
        for (int i = 0; i < M; i++) {
            mat2[0][i] = dp[i + 1] / (double) s;
        }
        for (int i = 0; i < M - 1; i++) {
            mat2[i + 1][i] = 1;
        }
        mat2[0][M] = mat2[M][M] = 1;
        double[] C1 = new double[M + 1];
        for (int i = 0; i <= M; i++) {
            C1[i] = C[i];
        }
        for (int i = 0; i < K; i++) {
            for (int j = 0; j <= M; j++) {
                C1[j] = 0;
                for (int k = 0; k <= M; k++) {
                    C1[j] += mat2[j][k] * C1[k];
                }
            }
            for (int j = 0; j <= M; j++) {
                C1[j] = C1[j] / mat2[M][M];
            }
        }
        writer.println(String.format("%.16f", C1[0]));
    }

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = null;
        writer = new PrintWriter(System.out);
        banana();
        reader.close();
        writer.close();
    }
}
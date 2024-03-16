import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03914 {
    static final int mod = 1000000007;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int M = sc.nextInt();

        long[][] dp = new long[N + 1][N];
        dp[1][0] = 1;

        for (int i = 0; i < M; i++) {
            long[][] dpNew = new long[N + 1][N];
            for (int j = 0; j < N + 1; j++) {
                for (int k = 0; k < N; k++) {
                    dpNew[j][k] = (dpNew[j][k] + dp[j][k] * k) % mod;
                    if (k + 1 < N) {
                        dpNew[j][k + 1] = (dpNew[j][k + 1] + dp[j][k] * (N - j - k)) % mod;
                    }
                    if (j + k <= N) {
                        dpNew[j + k][0] = (dpNew[j + k][0] + dp[j][k] * j) % mod;
                    }
                }
            }
            dp = dpNew;
        }

        System.out.println(dp[N][0]);
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
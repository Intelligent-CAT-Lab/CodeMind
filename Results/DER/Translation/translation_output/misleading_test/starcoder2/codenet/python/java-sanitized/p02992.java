import java.util.*;
import java.io.*;

public class p02992 {
    static int MOD = 1000000007;
    static int N, K;
    static int[] ns;
    static int[] l;
    static int[][] dp;
    static Map<Integer, Integer> m;

    static void solve() {
        ns = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            if (N < i * i) {
                break;
            }
            ns[i] = i;
            ns[N / i] = N / i;
        }
        Arrays.sort(ns);

        m = new HashMap<>();
        for (int i = 0; i < ns.length; i++) {
            m.put(ns[i], i);
        }

        l = new int[ns.length];
        for (int i = 0; i < ns.length - 1; i++) {
            l[i] = (N / ns[i]) - (N / ns[i + 1]);
        }

        dp = new int[K + 1][ns.length];
        dp[0][m.get(N)] = 1;

        for (int i = 0; i < K; i++) {
            for (int j = ns.length - 2; j >= 0; j--) {
                dp[i][j] += dp[i][j + 1];
            }
            for (int j = 0; j < ns.length; j++) {
                int nj = m.get(N / ns[j]);
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][nj] * l[j]) % MOD;
            }
        }

        int ans = 0;
        for (int i = 0; i < ns.length; i++) {
            ans += dp[K][i];
        }
        System.out.println(ans % MOD);
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        solve();
    }

    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;
        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }
        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
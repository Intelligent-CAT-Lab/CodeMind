import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p02668 {
    private static final long MOD = 100000007;

    public static void main(String[] args) {
        FastReader scanner = new FastReader();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long[] pow2 = new long[m + 10];
        long[] ipow2 = new long[m + 10];
        pow2[0] = 1;
        ipow2[0] = 1;
        for (int i = 1; i < m + 10; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
            ipow2[i] = (ipow2[i - 1] * ((MOD + 1) / 2)) % MOD;
        }

        long[] dp = new long[m + 1];
        dp[0] = 1;
        for (int i = 1; i < m + 1; i++) {
            dp[i] = (dp[i - 1] * 2) % MOD;
        }

        for (int i = 1; i < n; i++) {
            long[] next = new long[m + 1];
            for (int j = 1; j < m + 1; j++) {
                next[j] = (dp[j - 1] * (j + 1) + next[j - 1]) % MOD;
            }
            for (int j = 1; j < m + 1; j++) {
                dp[j] = (dp[j] * pow2[j - 1] + next[j]) % MOD;
            }
        }

        System.out.println(dp[m]);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null ||!st.hasMoreElements()) {
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

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
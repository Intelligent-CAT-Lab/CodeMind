import java.io.*;
import java.util.*;

public class p02339 {
    static final int MOD = (int) (1e9 + 7);

    static int I() {
        return Integer.parseInt(SS());
    }

    static double F() {
        return Double.parseDouble(SS());
    }

    static String SS() {
        return in.next();
    }

    static int[] LI(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = I();
        }
        return a;
    }

    static int[][] dp;

    public static void main(String[] args) {
        in = new FastScanner();
        resolve();
    }

    static FastScanner in;

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
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

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    static void resolve() {
        int n = I();
        int k = I();

        dp = new int[n + 1][k + 1];
        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i + 1][j + 1] = (dp[i][j] + (j + 1) * dp[i][j + 1]) % MOD;
            }
        }

        System.out.println(dp[n][k]);
    }
}
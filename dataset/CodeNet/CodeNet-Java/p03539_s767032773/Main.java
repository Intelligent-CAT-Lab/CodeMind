import java.io.*;
import java.util.*;

public class Main {
    private FastScanner in;
    private PrintWriter out;

    private void solve() {
        int n = in.nextInt();
        int k = in.nextInt();
        final int mod = (int) 1e9 + 7;
        int[][] dp = new int[n + 1][n * n + 10]; // [position][can be increased]
        dp[n][0] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int add = 0; add < dp[i + 1].length; add++) {
                int cur = dp[i + 1][add];
                if (cur == 0) {
                    continue;
                }
                for (int j = 0; j <= k; j++) {
                    int nadd = add;
                    if (j <= i + 1) {
                        int current = j + add;
                        while (current >= i + 1) {
                            nadd++;
                            current -= i + 1;
                        }
                    }
                    dp[i][nadd] += cur;
                    if (dp[i][nadd] >= mod) {
                        dp[i][nadd] -= mod;
                    }
                }
            }
        }
        long res = k * (k + 1) / 2;
        for (int i = 0; i + 1< n; i++) {
            res *= k + 1;
            res %= mod;
        }
        res = res * n % mod;
        for (int sub = 1; sub < dp[0].length; sub++) {
            res = res - sub * (long) dp[0][sub] % mod;
            if (res < 0) {
                res += mod;
            }
        }
        out.println(res);
    }

    private void run() {
        try {
            in = new FastScanner(new File("CF_17_Final_G.in"));
            out = new PrintWriter(new File("CF_17_Final_G.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void runIO() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    private class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
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

    public static void main(String[] args) {
        new Main().runIO();
    }
}
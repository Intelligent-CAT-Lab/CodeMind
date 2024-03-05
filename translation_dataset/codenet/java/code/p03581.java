import java.io.*;
import java.util.*;

public class p03581 {
    private FastScanner in;
    private PrintWriter out;

    void solve() {
        final int mod = (int) 1e9 + 7;
        final int M = 2222;
        int[][] c = new int[M][M];
        c[0][0] = 1;
        for (int i = 1; i < M; i++) {
            c[i][0] = 1;
            for (int j = 1; j < M; j++) {
                c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
                if (c[i][j] >= mod) {
                    c[i][j] -= mod;
                }
            }
        }
        int[] pow2 = new int[M];
        pow2[0] = 1;
        for (int i = 1; i < M; i++) {
            pow2[i] = pow2[i - 1] + pow2[i - 1];
            if (pow2[i] >= mod) {
                pow2[i] -= mod;
            }
        }
        long[][] dp2 = new long[M][M];
        for (int x = 0; x < M; x++) {
            for (int y = 0; y < M; y++) {
                if (x == 0 || y == 0) {
                    dp2[x][y] = 1;
                } else {
                    dp2[x][y] = dp2[x - 1][y - 1] + dp2[x][y - 1];
                    if (dp2[x][y] >= mod) {
                        dp2[x][y] -= mod;
                    }
                }
            }
        }
        long[][] dp2Pref = new long[M][M];
        for (int x = 0; x < M; x++) {
            for (int y = 0; y < M; y++) {
                dp2Pref[x][y] = dp2[x][y];
                if (x > 0) {
                    dp2Pref[x][y] += dp2Pref[x - 1][y];
                    if (dp2Pref[x][y] >= mod) {
                        dp2Pref[x][y] -= mod;
                    }
                }
            }
        }
        int[][] dp = new int[M][M];
        for (int red = 0; red < M; red++) {
            for (int blue = 0; blue < M; blue++) {
                if (red == 0 || blue == 0) {
                    dp[red][blue] = 1;
                } else {
                    dp[red][blue] += dp2Pref[red][blue - 1];
                    if (dp[red][blue] >= mod) {
                        dp[red][blue] -= mod;
                    }
                }
            }
        }
        long res = 0;
        int a = in.nextInt();
        int b = in.nextInt();
        for (int startRed = 0; startRed <= a; startRed++) {
            for (int cntBlue = 1; cntBlue <= b; cntBlue++) {
                int curC = c[b - 1][cntBlue - 1];
                int redStay = a - startRed - (b - cntBlue);
                if (redStay < 0) {
                    continue;
                }
                long add = curC * 1L * dp[redStay][b - cntBlue] % mod;
                res += add;
            }
        }
        out.println(res % mod);
    }

    private void run() {
        try {
            in = new FastScanner(new File("p03581.in"));
            out = new PrintWriter(new File("p03581.out"));

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
        new p03581().runIO();
    }
}
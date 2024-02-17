import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    final int mod = (int) 1e9 + 7;

    int add(int x, int y) {
        x += y;
        if (x >= mod) {
            x -= mod;
        }
        return x;
    }

    void solve() {
        char[] s = in.next().toCharArray();
        int[][] go = new int[][]{{0, 0}, {2, 2}, {1, 3}, {2, 0}, {5, 5}, {4, 6}, {5, 3}, {8, 8}, {7, 9}, {8, 6}};
        int start = go.length - 1;
        String win = "W?W?L?W?L?";
        int states = win.length();
        int[] dp = new int[states];
        dp[start] = 1;
        int[] ndp = new int[states];
        for (char c : s) {
            Arrays.fill(ndp, 0);
            for (int st = 0; st < states; st++) {
                if (c == '0' || c == '?') {
                    int next = go[st][0];
                    ndp[next] = add(ndp[next], dp[st]);
                }
                if (c == '1' || c == '?') {
                    int next = go[st][1];
                    ndp[next] = add(ndp[next], dp[st]);
                }
            }
            int[] tmp = dp;
            dp = ndp;
            ndp = tmp;
        }
        long res = 0;
        for (int i = 0; i < states; i++) {
            if (dp[i] == 0) {
                continue;
            }
            char w = win.charAt(i);
            if (w == '?') {
                throw new AssertionError();
            }
            if (w == 'W') {
                res += dp[i];
            }
        }
        out.println(res % mod);
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
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
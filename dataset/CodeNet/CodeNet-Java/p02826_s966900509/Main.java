import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    FastScanner in;
    PrintWriter out;
    int mod;

    public static void main(String[] args) {
        new Main().runIO();
    }

    int add(int x, int y) {
        x += y;
        return x >= mod ? (x - mod) : x;
    }

    void solve() {
        int n = in.nextInt();
        mod = in.nextInt();
        int firstHalf = (n + 1) / 2;
        int secondHalfStart = n - firstHalf + 1;
        int[] dp = new int[n];
        dp[n - 1] = 1;
        int[] ndp = new int[n];
        for (int pos = 1; pos < n; pos++) {
            Arrays.fill(ndp, 0);
            int toFirstHalf = Math.max(0, firstHalf - pos);
            int toLastHalf = n - Math.max(secondHalfStart, pos);
            int cost = toLastHalf - toFirstHalf;
            if (cost < 0) {
                throw new AssertionError();
            }
            for (int more = 0; more < dp.length; more++) {
                int ways = dp[more];
                if (ways == 0) {
                    continue;
                }
                for (int cnt = 0; cnt * (cost + 1) <= more; cnt++) {
                    int nMore = more - cnt * (cost + 1);
                    ndp[nMore] = add(ndp[nMore], ways);
                }
            }
            int[] tmp = dp;
            dp = ndp;
            ndp = tmp;
        }
        int res = 0;
        for (int more = 0; more < dp.length; more++) {
            int ways = dp[more];
            res = add(res, mul(ways, 1 + more));
        }
        out.println(res % mod);
    }

    int mul(int x, int y) {
        return (int) (x * 1L * y % mod);
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
}

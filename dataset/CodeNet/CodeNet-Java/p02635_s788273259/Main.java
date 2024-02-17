import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    void solve() {
        char[] s = in.next().toCharArray();
        int k = in.nextInt();
        List<Integer> pos0 = new ArrayList<>();
        int n = s.length;
        for (int i = 0; i < n; i++) {
            if (s[i] == '0') {
                pos0.add(i);
            }
        }
        List<Integer> lens = new ArrayList<>();
        for (int i = 0; i < pos0.size(); i++) {
            int from = i == 0 ? -1 : (pos0.get(i - 1));
            int to = pos0.get(i);
            lens.add(to - from - 1);
        }
        int tot1 = 0;
        for (char c : s) {
            if (c == '1') {
                tot1++;
            }
        }
//        System.err.println(lens + " " + tot1);
        int[][] dp = new int[tot1 + 1][tot1 + 1];
        // old cost, used ones -> ways
        dp[0][0] = 1;
        int[][] ndp = new int[tot1 + 1][tot1 + 1];
        int[][] tempDP = new int[tot1 + 1][tot1 + 1];
        int seenOnes = 0;
        for (int i = 0; i < lens.size(); i++) {
            int curLen = lens.get(i);
            for (int j = 0; j < ndp.length; j++) {
                Arrays.fill(ndp[j], 0);
                Arrays.fill(tempDP[j], 0);
            }
            seenOnes += curLen;
            for (int wasCost = 0; wasCost < dp.length; wasCost++) {
                for (int used = 0; used < dp[wasCost].length; used++) {
                    int cur = dp[wasCost][used];
                    if (cur == 0) {
                        continue;
                    }
                    for (int here = 0; here < curLen; here++) {
                        if (here + used > tot1) {
                            continue;
                        }
                        if (curLen - here > used) {
                            continue;
                        }
                        ndp[wasCost][used + here] = add(ndp[wasCost][used + here], cur);
                    }
                    if (curLen + used <= tot1) {
                        tempDP[wasCost][used + curLen] = add(tempDP[wasCost][used + curLen], cur);
                    }
                }
            }
            for (int wasCost = 0; wasCost < dp.length; wasCost++) {
                for (int used = 0; used < dp[wasCost].length; used++) {
                    int cur = tempDP[wasCost][used];
                    if (cur == 0) {
                        continue;
                    }
                    if (used + 1 <= tot1) {
                        tempDP[wasCost + 1][used + 1] = add(tempDP[wasCost + 1][used + 1], cur);
                    }
                    ndp[wasCost][used] = add(ndp[wasCost][used], cur);
                }
            }
            for (int wasCost = 0; wasCost < dp.length; wasCost++) {
                for (int used = 0; used < seenOnes; used++) {
                    ndp[wasCost][used] = 0;
                }
            }
            int[][] tmp = dp;
            dp = ndp;
            ndp = tmp;
        }
        int res = 0;
        for (int wasCost = 0; wasCost < dp.length; wasCost++) {
            for (int used = 0; used < dp[wasCost].length; used++) {
                int cur = dp[wasCost][used];
                if (cur == 0) {
                    continue;
                }
                if (wasCost <= k) {
                    res = add(res, cur);
                }
            }
        }
        out.println(res);
    }

    final int mod = 998244353;

    int mul(int x, int y) {
        return (int) ((x * 1L * y) % mod);
    }

    int add(int x, int y) {
        x += y;
        return x >= mod ? (x - mod) : x;
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
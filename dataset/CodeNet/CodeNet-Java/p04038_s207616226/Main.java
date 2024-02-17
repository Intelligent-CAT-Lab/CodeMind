import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        static final long MODULO = (long) (1e9 + 7);

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            if (k == 1) {
                out.println(1);
                return;
            }
            long[] invs = new long[k + 1];
            invs[1] = 1;
            for (int i = 2; i < invs.length; ++i) {
                invs[i] = (MODULO - (MODULO / i) * invs[((int) (MODULO % i))] % MODULO) % MODULO;
            }
            long invProd = 1;
            for (int i = 1; i <= k - 2; ++i) {
                invProd = invProd * invs[i] % MODULO;
            }
            long[] ways = new long[]{1};
            long[] sufProds = new long[k - 1];
            for (int i = 1; i < n; ++i) {
                long[] nways = new long[ways.length + 1];
                long sum = 0;
                long prefProd = 1;
                int upto = Integer.MIN_VALUE;
                for (int newZ = nways.length; newZ >= 1; --newZ) {
                    if (newZ > 1) {
                        sum += ways[newZ - 2];
                        sum %= MODULO;
                    }
                    int need = (i + 1) * k - newZ - 1;
                    if (upto < (need - (k - 2))) {
                        upto = need;
                        sufProds[0] = 1;
                        for (int j = 1; j < sufProds.length; ++j) {
                            sufProds[j] = sufProds[j - 1] * (upto - j + 1) % MODULO;
                        }
                        prefProd = 1;
                    } else {
                        prefProd *= need;
                        prefProd %= MODULO;
                    }
                    nways[newZ - 1] = (nways[newZ - 1] + sum * prefProd % MODULO * sufProds[upto - (need - (k - 2))] % MODULO * invProd % MODULO) % MODULO;
                }
                ways = nways;
            }
            long res = 0;
            for (long x : ways) res += x;
            res %= MODULO;
            for (int i = 1; i <= n; ++i) {
                res = res * i % MODULO;
            }
            out.println(res);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}


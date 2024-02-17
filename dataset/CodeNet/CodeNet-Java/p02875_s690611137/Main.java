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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        static final long MODULO = 998244353;
        static int[] invs;
        static int[] facts;
        static int[] invfacts;

        static {
            int k = (int) 1.1e7;
            invs = new int[k + 2];
            invs[1] = 1;
            for (int i = 2; i <= k + 1; ++i) {
                invs[i] = (int) ((MODULO - (MODULO / i) * (long) invs[(int) (MODULO % i)] % MODULO) % MODULO);
            }
            facts = new int[k + 2];
            invfacts = new int[k + 2];
            facts[0] = 1;
            invfacts[0] = 1;
            for (int i = 1; i <= k + 1; ++i) {
                facts[i] = (int) (facts[i - 1] * (long) i % MODULO);
                invfacts[i] = (int) (invfacts[i - 1] * (long) invs[i] % MODULO);
            }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long res = 1;
            for (int i = 0; i < n; ++i) {
                res = res * 3 % MODULO;
            }

            long p2 = 2;
            for (int na = 0; na < n / 2; ++na) {
                res = (res - facts[n] * (long) invfacts[na] % MODULO * invfacts[n - na] % MODULO * p2) % MODULO;
                p2 = p2 * 2 % MODULO;
            }
            if (res < 0) res += MODULO;
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


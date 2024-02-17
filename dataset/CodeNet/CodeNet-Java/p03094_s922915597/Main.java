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
        static final long MODULO = (long) 1e9 + 7;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] invs = new long[Math.max(3, n) + 1];
            invs[1] = 1;
            for (int i = 2; i < invs.length; ++i) {
                invs[i] = (MODULO - invs[((int) (MODULO % i))] * (MODULO / i) % MODULO) % MODULO;
                if (invs[i] * i % MODULO != 1) throw new RuntimeException();
            }

            long[] e = new long[n + 1];
            long s = 0;
            for (int k = n; k >= 1; --k) {
                s = (s + invs[n] * invs[k]) % MODULO;
                e[k] = s;
            }

            long res = 0;
            long pw = 1;
            for (int k = 1; k <= n; ++k) {
                long g = e[k];
                if (k < n)
                    g -= e[k + 1];
                g += MODULO;
                g %= MODULO;
                pw = pw * 3 % MODULO;
                res = (res + g * pw) % MODULO;
            }
            for (int i = 1; i <= n + 1; ++i) {
                res = res * invs[3] % MODULO;
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


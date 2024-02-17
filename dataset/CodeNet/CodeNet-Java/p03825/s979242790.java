import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        static final int MODULO = (int) (1e9 + 7);

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int zeroes = in.nextInt();
            int ones = in.nextInt();
            int k = in.nextInt();
            int depth = (zeroes + ones - 1) / (k - 1);
            int[] ways = new int[ones + 1];
            ways[0] = 1;
            long res = 0;
            boolean[] nice = new boolean[ones + 1];
            for (int i = 1; i <= depth; ++i) {
                Arrays.fill(nice, false);
                for (int extra = 0; i + extra <= depth; ++extra) {
                    int now = ones - extra * (k - 1);
                    if (now >= 0) {
                        nice[now] = true;
                    }
                }
                for (int old = ones; old >= 0; --old)
                    if (ways[old] != 0) {
                        for (int cur = 1; cur < k && old + cur <= ones; ++cur) {
                            if (nice[old + cur]) {
                                res += ways[old];
                                if (res >= MODULO) res -= MODULO;
                            }
                            ways[old + cur] += ways[old];
                            if (ways[old + cur] >= MODULO) ways[old + cur] -= MODULO;
                        }
                    }
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


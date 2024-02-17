import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Set;
import java.util.Random;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        static final long MAX = (long) 1e15;
        static final int BUBEN = 5000;
        Random random = new Random(543535151L);

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = 1;
            long[][] a = new long[n][n];
            Set<Long> have = new HashSet<>();
            outer:
            while (true) {
                long[] plus = new long[n + n];
                long[] minus = new long[n + n];
                for (int i = 0; i < n + n; ++i) {
                    do {
                        plus[i] = random.nextInt(BUBEN) + 2;
                    } while (!have.add(plus[i]));
                    do {
                        minus[i] = random.nextInt(BUBEN) + 2;
                    } while (!have.add(minus[i]));
                }
                for (int i = 0; i < n; ++i) {
                    for (int j = 0; j < n; ++j) {
                        if ((i + j) % 2 == 0) {
                            long got = plus[i + j] * minus[i + n - j];
                            long r = got;
                            while (r <= MAX && have.contains(r)) r += got;
                            if (r > MAX) continue outer;
                            have.add(r);
                            a[i][j] = r;
                        }
                    }
                }
                for (int i = 0; i < n; ++i) {
                    for (int j = 0; j < n; ++j) {
                        if ((i + j) % 2 != 0) {
                            long got = 1;
                            if (i > 0) got = lcm(got, a[i - 1][j]);
                            if (i + 1 < n) got = lcm(got, a[i + 1][j]);
                            if (j > 0) got = lcm(got, a[i][j - 1]);
                            if (j + 1 < n) got = lcm(got, a[i][j + 1]);
                            long r = got + 1;
                            while (r <= MAX && have.contains(r)) r += got;
                            if (r > MAX) continue outer;
                            have.add(r);
                            a[i][j] = r;
                        }
                    }
                }
                break;
            }
            for (long[] x : a) {
                for (long y : x) out.print(y + " ");
                out.println();
            }
        }

        long lcm(long a, long b) {
            if (a == 0 || b == 0) throw new RuntimeException();
            b /= gcd(a, b);
            if (a <= MAX / b) return a * b;
            else return MAX + 1;
        }

        long gcd(long a, long b) {
            while (b > 0) {
                long t = a % b;
                a = b;
                b = t;
            }
            return a;
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


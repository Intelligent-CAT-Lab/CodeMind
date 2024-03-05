import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class p03431 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public static final int mod = 998244353;
        int n;
        int k;
        long[] fact;
        long[] ifact;

        long comb(int n, int k) {
            if (k < 0 || k > n) return 0;
            return fact[n] * ifact[k] % mod * ifact[n - k] % mod;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            n = in.nextInt();
            k = in.nextInt();
            long[][] x = Factorials.getFIF(500010, mod);
            fact = x[0];
            ifact = x[1];

            long ans = 0;
            for (int diff = k % 2; diff <= k; diff += 2) {
                int nr = (k + diff) / 2;
                int nb = k - nr;
                if (nr < n) continue;

            if (diff == 0) {
                ans += comb(k-1, nr);
                if (ans >= mod) ans -= mod;
                ans -= comb(k-1, nb-1-(nr-n+1));
                if (ans < 0) ans += mod;
                continue;
            }
                int r2 = (k - diff) / 2 - Math.min(k - diff, nr - n) - 1;
                int b2 = k - r2;

                ans += comb(nr + nb, nb) - comb(r2 + b2, r2);
                ans %= mod;
                if (ans < 0) ans += mod;
            }

            out.println(ans);
        }

    }

    static class Factorials {
        public static long[][] getFIF(int max, int mod) {
            long[] fact = new long[max];
            long[] ifact = new long[max];
            long[] inv = new long[max];
            inv[1] = 1;
            for (int i = 2; i < max; i++) {
                inv[i] = (mod - mod / i) * inv[mod % i] % mod;
            }
            fact[0] = 1;
            ifact[0] = 1;
            for (int i = 1; i < max; i++) {
                fact[i] = fact[i - 1] * i % mod;
                ifact[i] = ifact[i - 1] * inv[i] % mod;
            }
            return new long[][]{fact, ifact, inv};
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }
}


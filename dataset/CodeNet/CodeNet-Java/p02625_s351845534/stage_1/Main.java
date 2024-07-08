import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "KharYusuf", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastReader in = new FastReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            ENEQ solver = new ENEQ();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class ENEQ {
        final long mod = (long) 1e9 + 7;
        long[] fac;

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt();
            fac = new long[m + 1];
            fac[0] = 1;
            for (int i = 1; i <= m; i++) {
                fac[i] = fac[i - 1] * i;
                fac[i] %= mod;
            }
            long ans = 0;
            for (int i = 0; i <= n; i++) {
                long res = combi(n, i) * perm(m, i);
                long can = perm(m - i, n - i);
                res %= mod;
                res *= can;
                res %= mod;
                res *= can;
                res %= mod;
                //if (n == 2) w.println(res);
                if ((i & 1) == 0) {
                    ans += res;
                    ans %= mod;
                } else {
                    ans += mod - res;
                    ans %= mod;
                }
            }
            w.println(ans);
        }

        long combi(int n, int m) {
            long ans = fac[n] * func.power(fac[m], mod - 2, mod);
            ans %= mod;
            ans *= func.power(fac[n - m], mod - 2, mod);
            return ans %= mod;
        }

        long perm(int n, int m) {
            long ans = fac[n] * func.power(fac[n - m], mod - 2, mod);
            return ans %= mod;
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public int nextInt() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class func {
        public static long power(long x, long y, long p) {
            long res = 1;
            x %= p;
            while (y > 0) {
                if ((y & 1) == 1) {
                    res *= x;
                    res %= p;
                }
                y >>= 1;
                x *= x;
                x %= p;
            }
            return res;
        }

    }
}


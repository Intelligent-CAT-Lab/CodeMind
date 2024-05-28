import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class p03009 {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            TaskE solver = new TaskE();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskE {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int h = in.readInt();
            int d = in.readInt();
            NumberTheory.Modular mod = new NumberTheory.Modular(1e9 + 7);
            NumberTheory.Factorial fact = new NumberTheory.Factorial(n, mod);
            int[] dp = new int[h + 1];
            dp[0] = fact.fact(n);
            int factSum = 0;
            for (int i = 1; i <= n; i++) {
                factSum = mod.plus(factSum, fact.fact(i));
            }
            int[] preDpSum = new int[h + 1];
            preDpSum[0] = dp[0];
            for (int i = 1; i <= h; i++) {
                dp[i] = preDpSum[i - 1];
                if (i - d - 1 >= 0) {
                    dp[i] = mod.subtract(dp[i], preDpSum[i - d - 1]);
                }
                if (i < h) {
                    dp[i] = mod.mul(dp[i], factSum);
                }
                preDpSum[i] = mod.plus(preDpSum[i - 1], dp[i]);
            }

            out.println(dp[h]);
        }

    }
    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    bufLen = -1;
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }
    static class NumberTheory {
        public static class Modular {
            int m;

            public Modular(int m) {
                this.m = m;
            }

            public Modular(long m) {
                this.m = (int) m;
                if (this.m != m) {
                    throw new IllegalArgumentException();
                }
            }

            public Modular(double m) {
                this.m = (int) m;
                if (this.m != m) {
                    throw new IllegalArgumentException();
                }
            }

            public int valueOf(int x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return x;
            }

            public int valueOf(long x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return (int) x;
            }

            public int mul(int x, int y) {
                return valueOf((long) x * y);
            }

            public int plus(int x, int y) {
                return valueOf(x + y);
            }

            public int subtract(int x, int y) {
                return valueOf(x - y);
            }

            public String toString() {
                return "mod " + m;
            }

        }

        public static class InverseNumber {
            int[] inv;

            public InverseNumber(int[] inv, int limit, NumberTheory.Modular modular) {
                this.inv = inv;
                inv[1] = 1;
                int p = modular.m;
                for (int i = 2; i <= limit; i++) {
                    int k = p / i;
                    int r = p % i;
                    inv[i] = modular.mul(-k, inv[r]);
                }
            }

            public InverseNumber(int limit, NumberTheory.Modular modular) {
                this(new int[limit + 1], limit, modular);
            }

        }

        public static class Factorial {
            int[] fact;
            int[] inv;
            NumberTheory.Modular modular;

            public Factorial(int[] fact, int[] inv, NumberTheory.InverseNumber in, int limit,
                            NumberTheory.Modular modular) {
                this.modular = modular;
                this.fact = fact;
                this.inv = inv;
                fact[0] = inv[0] = 1;
                for (int i = 1; i <= limit; i++) {
                    fact[i] = modular.mul(fact[i - 1], i);
                    inv[i] = modular.mul(inv[i - 1], in.inv[i]);
                }
            }

            public Factorial(int limit, NumberTheory.Modular modular) {
                this(new int[limit + 1], new int[limit + 1], new NumberTheory.InverseNumber(limit, modular), limit,
                                modular);
            }

            public int fact(int n) {
                return fact[n];
            }

        }

    }
    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput println(int c) {
            cache.append(c).append('\n');
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        public String toString() {
            return cache.toString();
        }

    }
}


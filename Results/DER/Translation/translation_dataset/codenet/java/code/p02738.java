import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class p02738 {
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
            DMergeTriplets solver = new DMergeTriplets();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class DMergeTriplets {
        Modular mod;
        Combination comb;
        int zero;
        int[][] f;

        public int f(int i, int j) {
            if (i == 0) {
                return j == zero ? 1 : 0;
            }
            if (i < 0 || j >= f[i].length || j < 0) {
                return 0;
            }
            if (f[i][j] == -1) {
                f[i][j] = f(i - 1, j - 1);
                f[i][j] = mod.plus(f[i][j], mod.mul(i - 1, f(i - 2, j + 1)));
                f[i][j] = mod.plus(f[i][j], mod.mul(pick2(i - 1), f(i - 3, j)));
            }
            return f[i][j];
        }

        public int pick2(int n) {
            return mod.mul(n, (n - 1));
        }

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt() * 3;
            mod = new Modular(in.readInt());
            comb = new Combination(n, mod);
            zero = n;
            f = new int[n + 1][n + n + 1];
            SequenceUtils.deepFill(f, -1);

            int ans = 0;
            for (int i = 0; i <= n; i++) {
                ans = mod.plus(ans, f(n, i + zero));
            }

            out.println(ans);
        }

    }

    static class Modular {
        int m;

        public int getMod() {
            return m;
        }

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

        public String toString() {
            return "mod " + m;
        }

    }

    static class Factorial {
        int[] fact;
        int[] inv;
        Modular modular;

        public Modular getModular() {
            return modular;
        }

        public Factorial(int[] fact, int[] inv, InverseNumber in, int limit, Modular modular) {
            this.modular = modular;
            this.fact = fact;
            this.inv = inv;
            fact[0] = inv[0] = 1;
            for (int i = 1; i <= limit; i++) {
                fact[i] = modular.mul(fact[i - 1], i);
                inv[i] = modular.mul(inv[i - 1], in.inv[i]);
            }
        }

        public Factorial(int limit, Modular modular) {
            this(new int[limit + 1], new int[limit + 1], new InverseNumber(limit, modular), limit, modular);
        }

    }

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput append(CharSequence csq) {
            cache.append(csq);
            return this;
        }

        public FastOutput append(CharSequence csq, int start, int end) {
            cache.append(csq, start, end);
            return this;
        }

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput append(char c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(int c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(int c) {
            return append(c).println();
        }

        public FastOutput println() {
            cache.append(System.lineSeparator());
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

    static class SequenceUtils {
        public static void deepFill(Object array, int val) {
            if (!array.getClass().isArray()) {
                throw new IllegalArgumentException();
            }
            if (array instanceof int[]) {
                int[] intArray = (int[]) array;
                Arrays.fill(intArray, val);
            } else {
                Object[] objArray = (Object[]) array;
                for (Object obj : objArray) {
                    deepFill(obj, val);
                }
            }
        }

    }

    static class InverseNumber {
        int[] inv;

        public InverseNumber(int[] inv, int limit, Modular modular) {
            this.inv = inv;
            inv[1] = 1;
            int p = modular.getMod();
            for (int i = 2; i <= limit; i++) {
                int k = p / i;
                int r = p % i;
                inv[i] = modular.mul(-k, inv[r]);
            }
        }

        public InverseNumber(int limit, Modular modular) {
            this(new int[limit + 1], limit, modular);
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 20];
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

    static class Combination {
        final Factorial factorial;
        final Modular modular;

        public Combination(Factorial factorial) {
            this.factorial = factorial;
            this.modular = factorial.getModular();
        }

        public Combination(int limit, Modular modular) {
            this(new Factorial(limit, modular));
        }

    }
}


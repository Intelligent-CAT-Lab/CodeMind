import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
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
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);
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
            DSecretPassage solver = new DSecretPassage();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class DSecretPassage {
        Debug debug = new Debug(false);

        public void solve(int testNumber, FastInput in, FastOutput out) {
            char[] s = in.readString().toCharArray();
            int n = s.length;
            for (int i = 0; i < n; i++) {
                s[i] -= '0';
            }

            Modular mod = new Modular(998244353);
            Combination comb = new Combination(n, mod);

            int[] cnts = new int[2];
            for (int i = 0; i < n; i++) {
                cnts[s[i]]++;
            }
            char[] rev = s.clone();
            SequenceUtils.reverse(rev);
            IntegerPreSum ps = new IntegerPreSum(i -> rev[i], n);
            int a = cnts[0];
            int b = cnts[1];
            int[][][] dp = new int[a + 1][b + 1][n + 1];
            dp[0][0][0] = 1;
            for (int i = 0; i <= a; i++) {
                for (int j = 0; j <= b; j++) {
                    for (int k = 0; k <= i + j; k++) {
                        int plus = dp[i][j][k];
                        if (plus == 0) {
                            continue;
                        }
                        //add 0
                        if (i + 1 <= a) {
                            int next = k;
                            if (next < n && rev[next] == 0) {
                                next++;
                            }
                            dp[i + 1][j][next] = mod.plus(dp[i + 1][j][next], plus);
                        }
                        //add 1
                        if (j + 1 <= b) {
                            int next = k;
                            if (next < n && rev[next] == 1) {
                                next++;
                            }
                            dp[i][j + 1][next] = mod.plus(dp[i][j + 1][next], plus);
                        }
                    }
                }
            }

            for (int i = 0; i <= a; i++) {
                for (int j = 0; j <= b; j++) {
                    for (int k = n - 1; k >= 0; k--) {
                        dp[i][j][k] = mod.plus(dp[i][j][k], dp[i][j][k + 1]);
                    }
                }
            }

            //debug.debug("dp", dp);

            int ans = 0;

            boolean[][][] maybe = new boolean[n + 1][n + 1][n + 1];
            maybe[0][0][0] = true;
            for (int i = 0; i <= n; i++) {
                for (int j = n; j >= 0; j--) {
                    for (int k = n; k >= 0; k--) {
                        if (!maybe[i][j][k]) {
                            continue;
                        }
                        //get first
                        if (i + 2 <= n) {
                            int head = s[i];
                            int next = s[i + 1];
                            maybe[i + 2][j + 1 - head][k + head] = true;
                            maybe[i + 2][j + 1 - next][k + next] = true;
                        }
                        //pop first
                        if (j + k > 0 && i + 1 <= n) {
                            maybe[i + 1][j][k] = true;
                        }
                        //pop 0
                        if (j > 0 && i + 1 <= n) {
                            int head = s[i];
                            maybe[i + 1][j - 1 + 1 - head][k + head] = true;
                        }
                        //pop 1
                        if (k > 0 && i + 1 <= n) {
                            int head = s[i];
                            maybe[i + 1][j + 1 - head][k - 1 + head] = true;
                        }
                        //just pop
                        if (j + k >= 2) {
                            if (j > 0) {
                                maybe[i][j - 1][k] = true;
                            }
                            if (k > 0) {
                                maybe[i][j][k - 1] = true;
                            }
                        }
                    }
                }
            }


            //debug.debug("maybe", maybe);
            int[][] min = new int[n + 1][n + 1];
            SequenceUtils.deepFill(min, n + 1);
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    for (int k = 0; k <= n; k++) {
                        if (!maybe[i][j][k]) {
                            continue;
                        }
                        int remain = n - i;
                        int c0 = remain - ps.prefix(remain - 1);
                        int c1 = ps.prefix(remain - 1);
                        c0 += j;
                        c1 += k;
                        min[c0][c1] = Math.min(min[c0][c1], remain);
                    }
                }
            }

            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    if (min[j][k] >= n + 1) {
                        continue;
                    }


                    int remain = min[j][k];

                    debug.debug("remain", remain);
                    debug.debug("j", j);
                    debug.debug("k", k);
                    debug.debug("total", j + k + remain);
                    int c0 = j;
                    int c1 = k;
                    int way = dp[c0][c1][remain];
                    debug.debug("way", way);
                    ans = mod.plus(ans, dp[c0][c1][remain]);
                }
            }

            out.println(ans);
        }

    }

    static class SequenceUtils {
        public static void swap(char[] data, int i, int j) {
            char tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }

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

        public static void reverse(char[] data, int l, int r) {
            while (l < r) {
                swap(data, l, r);
                l++;
                r--;
            }
        }

        public static void reverse(char[] data) {
            reverse(data, 0, data.length - 1);
        }

    }

    static class IntegerPreSum {
        private int[] pre;
        private int n;

        public IntegerPreSum(int n) {
            pre = new int[n];
        }

        public void populate(IntToIntegerFunction a, int n) {
            this.n = n;
            if (n == 0) {
                return;
            }
            pre[0] = a.apply(0);
            for (int i = 1; i < n; i++) {
                pre[i] = pre[i - 1] + a.apply(i);
            }
        }

        public IntegerPreSum(IntToIntegerFunction a, int n) {
            this(n);
            populate(a, n);
        }

        public int prefix(int i) {
            if (i < 0) {
                return 0;
            }
            return pre[Math.min(i, n - 1)];
        }

    }

    static interface IntCombination {
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

    static class ModPrimeInverseNumber implements InverseNumber {
        int[] inv;

        public ModPrimeInverseNumber(int[] inv, int limit, Modular modular) {
            this.inv = inv;
            inv[1] = 1;
            int p = modular.getMod();
            for (int i = 2; i <= limit; i++) {
                int k = p / i;
                int r = p % i;
                inv[i] = modular.mul(-k, inv[r]);
            }
        }

        public ModPrimeInverseNumber(int limit, Modular modular) {
            this(new int[limit + 1], limit, modular);
        }

        public int inverse(int x) {
            return inv[x];
        }

    }

    static class FastInput {
        private final InputStream is;
        private StringBuilder defaultStringBuf = new StringBuilder(1 << 13);
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

        public String readString(StringBuilder builder) {
            skipBlank();

            while (next > 32) {
                builder.append((char) next);
                next = read();
            }

            return builder.toString();
        }

        public String readString() {
            defaultStringBuf.setLength(0);
            return readString(defaultStringBuf);
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
                inv[i] = modular.mul(inv[i - 1], in.inverse(i));
            }
        }

        public Factorial(int limit, Modular modular) {
            this(new int[limit + 1], new int[limit + 1], new ModPrimeInverseNumber(limit, modular), limit, modular);
        }

    }

    static interface IntToIntegerFunction {
        int apply(int x);

    }

    static class Debug {
        private boolean offline;
        private PrintStream out = System.err;

        public Debug(boolean enable) {
            offline = enable && System.getSecurityManager() == null;
        }

        public Debug debug(String name, int x) {
            if (offline) {
                debug(name, "" + x);
            }
            return this;
        }

        public Debug debug(String name, String x) {
            if (offline) {
                out.printf("%s=%s", name, x);
                out.println();
            }
            return this;
        }

    }

    static interface InverseNumber {
        int inverse(int x);

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

    static class Combination implements IntCombination {
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


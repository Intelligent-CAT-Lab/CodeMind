
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean local = false;
        boolean async = false;

        Charset charset = Charset.forName("ascii");

        FastIO io = local ? new FastIO(new FileInputStream("D:\\DATABASE\\TESTCASE\\Code.in"), System.out, charset) : new FastIO(System.in, System.out, charset);
        Task task = new Task(io, new Debug(local));

        if (async) {
            Thread t = new Thread(null, task, "dalt", 1 << 27);
            t.setPriority(Thread.MAX_PRIORITY);
            t.start();
            t.join();
        } else {
            task.run();
        }

        if (local) {
            io.cache.append("\n\n--memory -- \n" + ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) >> 20) + "M");
        }

        io.flush();
    }

    public static class Task implements Runnable {
        final FastIO io;
        final Debug debug;
        int inf = (int) 1e8;
        Modular mod = new Modular((int) 1e9 + 7);
        Log2 log2 = new Log2();
        Power power = new Power(mod);

        public Task(FastIO io, Debug debug) {
            this.io = io;
            this.debug = debug;
        }

        @Override
        public void run() {
            solve();
//            for (int i = 1; i < 100; i++) {
//                for (int j = 1; j <= i; j++) {
//                    debug.debug("l", j);
//                    debug.debug("r", i);
//                    debug.assertTrue(bruteForce(j, i) == solve(j, i));
//                }
//            }
        }

        int[][][][] dp;
        boolean[] lBits;
        boolean[] rBits;


        public int bruteForce(long l, long r) {
            int sum = 0;
            for (long i = l; i <= r; i++) {
                for (long j = l; j <= i; j++) {
                    if (Long.highestOneBit(i) == Long.highestOneBit(j)
                            && (i & j) == j) {
                        sum++;
                    }
                }
            }
            return sum;
        }

        public void solve() {
            long l = io.readLong();
            long r = io.readLong();
            io.cache.append(solve(l, r));
        }

        public int solve(long l, long r) {
            lBits = new boolean[64];
            rBits = new boolean[64];
            toBits(lBits, 0, l);
            toBits(rBits, 0, r);
            reverse(lBits);
            reverse(rBits);

            //1st chosen, up bound, low bound
            int[][][][] dp = new int[2][2][2][64];
            dp[0][1][1][0] = 1;
            for (int i = 1; i < 64; i++) {
                //000
                dp[1][0][0][i] = mod.plus(dp[1][0][0][i], dp[0][0][0][i - 1]);
                dp[0][0][0][i] = mod.plus(dp[0][0][0][i], dp[0][0][0][i - 1]);

                //001
                if (lBits[i]) {
                    dp[1][0][1][i] = mod.plus(dp[1][0][1][i], dp[0][0][1][i - 1]);
                } else {
                    dp[1][0][0][i] = mod.plus(dp[1][0][0][i], dp[0][0][1][i - 1]);
                    dp[0][0][1][i] = mod.plus(dp[0][0][1][i], dp[0][0][1][i - 1]);
                }

                //010

                //011
                if (rBits[i] && lBits[i]) {
                    dp[1][1][1][i] = mod.plus(dp[1][1][1][i],
                            dp[0][1][1][i - 1]);
                } else if (rBits[i]) {
                    dp[1][1][0][i] = mod.plus(dp[1][1][0][i],
                            dp[0][1][1][i - 1]);
                    dp[0][0][1][i] = mod.plus(dp[0][0][1][i],
                            dp[0][1][1][i - 1]);
                } else if (lBits[i]) {

                } else {
                    dp[0][1][1][i] = mod.plus(dp[0][1][1][i], dp[0][1][1][i - 1]);
                }

                //100
                dp[1][0][0][i] = mod.plus(dp[1][0][0][i], mod.mul(3, dp[1][0][0][i - 1]));

                //101
                if (lBits[i]) {
                    dp[1][0][1][i] = mod.plus(dp[1][0][1][i], dp[1][0][1][i - 1]);
                } else {
                    dp[1][0][1][i] = mod.plus(dp[1][0][1][i], mod.mul(2, dp[1][0][1][i - 1]));
                    dp[1][0][0][i] = mod.plus(dp[1][0][0][i], dp[1][0][1][i - 1]);
                }

                //110
                if (rBits[i]) {
                    dp[1][1][0][i] = mod.plus(dp[1][1][0][i], mod.mul(2, dp[1][1][0][i - 1]));
                    dp[1][0][0][i] = mod.plus(dp[1][0][0][i], dp[1][1][0][i - 1]);
                } else {
                    dp[1][1][0][i] = mod.plus(dp[1][1][0][i], dp[1][1][0][i - 1]);
                }

                //111
                if (lBits[i] && rBits[i]) {
                    dp[1][1][1][i] = mod.plus(dp[1][1][1][i], dp[1][1][1][i - 1]);
                } else if (rBits[i]) {
                    dp[1][1][0][i] = mod.plus(dp[1][1][0][i], dp[1][1][1][i - 1]);
                    dp[1][1][1][i] = mod.plus(dp[1][1][1][i], dp[1][1][1][i - 1]);
                    dp[1][0][1][i] = mod.plus(dp[1][0][1][i], dp[1][1][1][i - 1]);
                } else if (lBits[i]) {

                } else {
                    dp[1][1][1][i] = mod.plus(dp[1][1][1][i], dp[1][1][1][i - 1]);
                }
            }

            int sum = 0;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    sum = mod.plus(dp[1][i][j][63], sum);
                }
            }

            return sum;
        }

        public int valueOf(boolean x) {
            return x ? 1 : 0;
        }

        public void reverse(boolean[] data) {
            int l = 0;
            int r = data.length - 1;
            while (l < r) {
                boolean tmp = data[l];
                data[l] = data[r];
                data[r] = tmp;
                l++;
                r--;
            }
        }

        public void toBits(boolean[] bits, int i, long x) {
            if (x == 0) {
                return;
            }
            bits[i] = (x & 1) == 1;
            toBits(bits, i + 1, x >>> 1);
        }

    }

    /**
     * Mod operations
     */
    public static class Modular {
        int m;

        public Modular(int m) {
            this.m = m;
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

        public int mul(long x, long y) {
            x = valueOf(x);
            y = valueOf(y);
            return valueOf(x * y);
        }

        public int plus(int x, int y) {
            return valueOf(x + y);
        }

        public int plus(long x, long y) {
            x = valueOf(x);
            y = valueOf(y);
            return valueOf(x + y);
        }

        @Override
        public String toString() {
            return "mod " + m;
        }
    }


    /**
     * Bit operations
     */
    public static class BitOperator {
        public int bitAt(int x, int i) {
            return (x >> i) & 1;
        }

        public int bitAt(long x, int i) {
            return (int) ((x >> i) & 1);
        }

        public int setBit(int x, int i, boolean v) {
            if (v) {
                x |= 1 << i;
            } else {
                x &= ~(1 << i);
            }
            return x;
        }

        public long setBit(long x, int i, boolean v) {
            if (v) {
                x |= 1L << i;
            } else {
                x &= ~(1L << i);
            }
            return x;
        }

        /**
         * Determine whether x is subset of y
         */
        public boolean subset(long x, long y) {
            return intersect(x, y) == x;
        }

        /**
         * Merge two set
         */
        public long merge(long x, long y) {
            return x | y;
        }

        public long intersect(long x, long y) {
            return x & y;
        }

        public long differ(long x, long y) {
            return x - intersect(x, y);
        }
    }

    /**
     * Power operations
     */
    public static class Power {
        final Modular modular;

        public Power(Modular modular) {
            this.modular = modular;
        }

        public int pow(int x, long n) {
            if (n == 0) {
                return 1;
            }
            long r = pow(x, n >> 1);
            r = modular.valueOf(r * r);
            if ((n & 1) == 1) {
                r = modular.valueOf(r * x);
            }
            return (int) r;
        }

        public int inverse(int x) {
            return pow(x, modular.m - 2);
        }

        public int pow2(int x) {
            return x * x;
        }

        public long pow2(long x) {
            return x * x;
        }

        public double pow2(double x) {
            return x * x;
        }
    }

    /**
     * Log operations
     */
    public static class Log2 {
        public int ceilLog(int x) {
            return 32 - Integer.numberOfLeadingZeros(x - 1);
        }

        public int floorLog(int x) {
            return 31 - Integer.numberOfLeadingZeros(x);
        }

        public int ceilLog(long x) {
            return 64 - Long.numberOfLeadingZeros(x - 1);
        }

        public int floorLog(long x) {
            return 63 - Long.numberOfLeadingZeros(x);
        }
    }


    public static class FastIO {
        public final StringBuilder cache = new StringBuilder(1 << 13);
        private final InputStream is;
        private final OutputStream os;
        private final Charset charset;
        private StringBuilder defaultStringBuf = new StringBuilder(1 << 13);
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastIO(InputStream is, OutputStream os, Charset charset) {
            this.is = is;
            this.os = os;
            this.charset = charset;
        }

        public FastIO(InputStream is, OutputStream os) {
            this(is, os, Charset.forName("ascii"));
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException(e);
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

        public long readLong() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            long val = 0;
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

        public double readDouble() {
            boolean sign = true;
            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+';
                next = read();
            }

            long val = 0;
            while (next >= '0' && next <= '9') {
                val = val * 10 + next - '0';
                next = read();
            }
            if (next != '.') {
                return sign ? val : -val;
            }
            next = read();
            long radix = 1;
            long point = 0;
            while (next >= '0' && next <= '9') {
                point = point * 10 + next - '0';
                radix = radix * 10;
                next = read();
            }
            double result = val + (double) point / radix;
            return sign ? result : -result;
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

        public int readLine(char[] data, int offset) {
            int originalOffset = offset;
            while (next != -1 && next != '\n') {
                data[offset++] = (char) next;
                next = read();
            }
            return offset - originalOffset;
        }

        public int readString(char[] data, int offset) {
            skipBlank();

            int originalOffset = offset;
            while (next > 32) {
                data[offset++] = (char) next;
                next = read();
            }

            return offset - originalOffset;
        }

        public int readString(byte[] data, int offset) {
            skipBlank();

            int originalOffset = offset;
            while (next > 32) {
                data[offset++] = (byte) next;
                next = read();
            }

            return offset - originalOffset;
        }

        public char readChar() {
            skipBlank();
            char c = (char) next;
            next = read();
            return c;
        }

        public void flush() throws IOException {
            os.write(cache.toString().getBytes(charset));
            os.flush();
            cache.setLength(0);
        }

        public boolean hasMore() {
            skipBlank();
            return next != -1;
        }
    }

    public static class Debug {
        private boolean allowDebug;

        public Debug(boolean allowDebug) {
            this.allowDebug = allowDebug;
        }

        public void assertTrue(boolean flag) {
            if (!allowDebug) {
                return;
            }
            if (!flag) {
                fail();
            }
        }

        public void fail() {
            throw new RuntimeException();
        }

        public void assertFalse(boolean flag) {
            if (!allowDebug) {
                return;
            }
            if (flag) {
                fail();
            }
        }

        private void outputName(String name) {
            System.out.print(name + " = ");
        }

        public void debug(String name, int x) {
            if (!allowDebug) {
                return;
            }

            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, long x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, double x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, int[] x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.toString(x));
        }

        public void debug(String name, long[] x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.toString(x));
        }

        public void debug(String name, double[] x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.toString(x));
        }

        public void debug(String name, Object x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println("" + x);
        }

        public void debug(String name, Object... x) {
            if (!allowDebug) {
                return;
            }
            outputName(name);
            System.out.println(Arrays.deepToString(x));
        }
    }
}

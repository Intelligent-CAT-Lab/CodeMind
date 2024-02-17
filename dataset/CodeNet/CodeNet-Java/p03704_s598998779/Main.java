import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author daltao
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "daltao", 1 << 27);
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
            long total = 0;
            for (int i = 1; i <= 9; i += 1) {
                total += count(new int[i], n, 0, i * 2);
                total += count(new int[i + 1], n, 0, i * 2 + 1);
            }
            out.println(total);
        }

        public long count(int[] diff, long sum, int i, int digitNum) {
            if (i == diff.length) {
                if (sum != 0) {
                    return 0;
                }
                long ways = 1;
                for (int j = 0; j < diff.length; j++) {
                    long localWay = 0;
                    for (int k = j == 0 ? 1 : 0; k < 10; k++) {
                        int t = k + diff[j];
                        if (t < 0 || t >= 10) {
                            continue;
                        }
                        localWay++;
                    }
                    ways *= localWay;
                }
                return ways;
            }

            int v;
            if (sum >= 0) {
                v = 10 - DigitUtils.digitOn(sum, i);
            } else {
                v = DigitUtils.digitOn(sum, i);
            }
            long ans = 0;
            diff[i] = v;
            ans += count(diff, sum + DigitUtils.setDigitOn(0, i, diff[i]) - DigitUtils.setDigitOn(0, digitNum - 1 - i, diff[i]),
                    i + 1, digitNum);
            diff[i] = v - 10;
            ans += count(diff, sum + DigitUtils.setDigitOn(0, i, diff[i]) - DigitUtils.setDigitOn(0, digitNum - 1 - i, diff[i]),
                    i + 1, digitNum);
            return ans;
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

        public FastOutput println(long c) {
            cache.append(c).append('\n');
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
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

    }

    static class DigitUtils {
        private static final long[] DIGIT_VALUES = new long[19];

        static {
            DIGIT_VALUES[0] = 1;
            for (int i = 1; i < 19; i++) {
                DIGIT_VALUES[i] = DIGIT_VALUES[i - 1] * 10;
            }
        }

        private DigitUtils() {
        }

        public static int digitOn(long x, int i) {
            if (x < 0) {
                return digitOn(-x, i);
            }
            x /= DIGIT_VALUES[i];
            return (int) (x % 10);
        }

        public static long setDigitOn(long x, int i, int newDigit) {
            if (x < 0) {
                return -setDigitOn(-x, i, newDigit);
            }
            return x + (newDigit - digitOn(x, i)) * DIGIT_VALUES[i];
        }

    }
}


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
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
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
            EBinaryProgramming solver = new EBinaryProgramming();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class EBinaryProgramming {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int[] s = new int[(int) 2e5];
            int n = in.readString(s, 0);
            for (int i = 0; i < n; i++) {
                s[i] -= '0';
            }

            IntegerPreSum[] ips = new IntegerPreSum[2];
            ips[0] = new IntegerPreSum(i -> i % 2 == 0 && s[i] == 1 ? 1 : 0, n);
            ips[1] = new IntegerPreSum(i -> i % 2 == 1 && s[i] == 1 ? 1 : 0, n);
            long ans = 0;
            boolean[] used = new boolean[n];
            boolean[] star = new boolean[n];
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (s[i] == 1) {
                    used[i] = true;
                    star[i] = true;
                    cnt++;
                    ans += cnt;
                    if (i + 1 < n) {
                        used[i + 1] = true;
                        ans += cnt;
                        i++;
                    }
                }
            }
            IntegerPreSum occur = new IntegerPreSum(i -> used[i] ? 1 : 0, n);

            for (int i = n - 1; i >= 0; i--) {
                if (used[i]) {
                    if (star[i]) {
                        cnt--;
                    }
                    continue;
                }
                ans += cnt;
                if (occur.prefix(i - 1) % 2 == 0) {
                    ans += ips[i % 2].post(i);
                } else {
                    ans += ips[1 - i % 2].post(i);
                }
            }

            out.println(ans);
        }

    }

    static interface IntToIntegerFunction {
        int apply(int x);

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

        public int post(int i) {
            return pre[n - 1] - prefix(i - 1);
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

        public FastOutput append(long c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(long c) {
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

        public int readString(int[] data, int offset) {
            skipBlank();

            int originalOffset = offset;
            while (next > 32) {
                data[offset++] = (char) next;
                next = read();
            }

            return offset - originalOffset;
        }

    }
}


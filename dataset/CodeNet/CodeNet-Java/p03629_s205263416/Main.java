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
            EDontBeASubsequence solver = new EDontBeASubsequence();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class EDontBeASubsequence {
        int charset = 'z' - 'a' + 1;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int[] s = new int[(int) 2e5];
            int n = in.readString(s, 0);
            int[][] next = new int[charset][n + 2];
            for (int i = 0; i < n; i++) {
                s[i] -= 'a';
            }

            for (int j = 0; j < charset; j++) {
                next[j][n] = n + 1;
                next[j][n + 1] = n + 1;
            }
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < charset; j++) {
                    next[j][i] = next[j][i + 1];
                }
                next[s[i]][i] = i + 1;
            }

            int[] dp = new int[n + 2];
            dp[n + 1] = 0;
            for (int i = n; i >= 0; i--) {
                dp[i] = n;
                for (int j = 0; j < charset; j++) {
                    int go = next[j][i];
                    dp[i] = Math.min(dp[i], 1 + dp[go]);
                }
            }

            int index = 0;
            while (index <= n) {
                int step = 0;
                for (int j = 0; j < charset; j++) {
                    int go = next[j][index];
                    if (dp[go] < dp[next[step][index]]) {
                        step = j;
                    }
                }
                out.append((char) (step + 'a'));
                index = next[step][index];
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


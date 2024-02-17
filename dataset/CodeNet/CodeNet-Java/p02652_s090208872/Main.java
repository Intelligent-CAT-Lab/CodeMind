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
            B01Unbalanced solver = new B01Unbalanced();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class B01Unbalanced {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            char[] s = new char[(int) 1e6];
            int n = in.readString(s, 0);

            int[][] l2r = new int[2][n];
            int[][] r2l = new int[2][n];
            int ans1 = solve(s, n, '0', l2r[0], r2l[0]);
            int ans2 = solve(s, n, '1', l2r[1], r2l[1]);
            int ans3 = 1;


            int[][] suffix = new int[2][2];
            for (int i = n - 1; i >= 0; i--) {
                if (s[i] != '?') {
                    if (ans1 == ans2 && l2r[0][i] == ans1 &&
                            suffix[1][(i & 1)] > 0) {
                        ans3 = Math.max(ans1 + 1, ans3);
                    }
                    if (l2r[0][i] == ans1 &&
                            suffix[0][(ans1 & 1) ^ (i & 1)] > 0) {
                        ans3 = Math.max(ans1 + 1, ans3);
                    }
                    if (l2r[1][i] == ans2 &&
                            suffix[1][(ans2 & 1) ^ (i & 1)] > 0) {
                        ans3 = Math.max(ans2 + 1, ans3);
                    }
                    if (ans1 == ans2 && l2r[1][i] == ans2 &&
                            suffix[0][(i & 1)] > 0) {
                        ans3 = Math.max(ans2 + 1, ans3);
                    }

                    if (r2l[0][i] == ans1) {
                        suffix[0][i & 1]++;
                    }
                    if (r2l[1][i] == ans2) {
                        suffix[1][i & 1]++;
                    }

                    continue;
                }
                int l = i;
                while (l > 0 && s[l - 1] == '?') {
                    l--;
                }

                if (i + 1 < n && l > 0 && s[l - 1] == s[i + 1] && (i - l + 1) % 2 == 0) {
                    ans3 = Math.max(ans3, 2);
                }
                i = l;
            }

            int ans = Math.max(ans1, ans2);
            ans = Math.max(ans, ans3);
            out.println(ans);
        }

        public int solve(char[] s, int n, int c, int[] l2r, int[] r2l) {
            int ans = 0;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (s[i] == c) {
                    cnt++;
                } else {
                    cnt = Math.max(cnt - 1, 0);
                }
                l2r[i] = cnt;
                ans = Math.max(cnt, ans);
            }
            cnt = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (s[i] == c) {
                    cnt++;
                } else {
                    cnt = Math.max(cnt - 1, 0);
                }
                r2l[i] = cnt;
            }

            return ans;
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

        public int readString(char[] data, int offset) {
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
}


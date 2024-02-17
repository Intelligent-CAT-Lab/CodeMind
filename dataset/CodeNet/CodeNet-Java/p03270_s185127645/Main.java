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
 *
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        arc102e solver = new arc102e();
        solver.solve(1, in, out);
        out.close();
    }

    static class arc102e {
        int mod = 998244353;
        long[][] cdp = new long[4001][4001];
        long[][] idp = new long[2001][1001];

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int k = in.nextInt();
            int n = in.nextInt();

            cdp[0][0] = 1;
            for (int i = 1; i <= 4000; i++) {
                cdp[i][0] = 1;
                for (int j = 1; j <= 4000; j++) {
                    cdp[i][j] = cdp[i - 1][j] + cdp[i - 1][j - 1];
                    cdp[i][j] %= mod;
                }
            }

            idp[0][0] = 1;
            idp[2][0] = 1;
            idp[2][1] = 2;

            for (int i = 4; i <= 2000; i += 2) {
                idp[i][0] = 1;
                for (int j = 1; j <= i / 2; j++) {
                    idp[i][j] = idp[i - 2][j] + idp[i - 2][j - 1] * 2;
                    idp[i][j] %= mod;
                }
            }

            long[] ans = new long[2 * k + 1];

            for (int i = 2; i <= 2 * k; i++) {
                int ni = Math.min(i - 1, k) - Math.max(i - k, 1) + 1;
                if (i % 2 == 1) {
                    assert ni % 2 == 0;
                    for (int j = 0; j <= ni / 2; j++) {
                        int nn = n - j;
                        int nk = k - ni + j;

                        if (nn < 0) {
                            continue;
                        }

                        ans[i] += cdp[nn + nk - 1][nn] * idp[ni][j];
                        ans[i] %= mod;
                    }
                } else {
                    assert ni % 2 == 1;
                    {
                        //Selecting middle
                        for (int j = 0; j <= (ni - 1) / 2; j++) {
                            int nn = n - j - 1;
                            int nk = k - ni + j;

                            if (nn < 0) {
                                continue;
                            }

                            ans[i] += cdp[nn + nk - 1][nn] * idp[ni - 1][j];
                            ans[i] %= mod;
                        }
                    }
                    {
                        //Not
                        for (int j = 0; j <= (ni - 1) / 2; j++) {
                            int nn = n - j;
                            int nk = k - ni + j;

                            if (nn < 0) {
                                continue;
                            }

                            ans[i] += cdp[nn + nk - 1][nn] * idp[ni - 1][j];
                            ans[i] %= mod;
                        }
                    }
                }
            }

            for (int i = 2; i <= 2 * k; i++) {
                out.println(ans[i]);
            }
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
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


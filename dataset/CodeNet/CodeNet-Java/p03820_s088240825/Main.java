import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
 * @author Egor Kulikov (egor@egork.net)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        long[][] answer;
        long[][] sum;
        int base;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int k = in.readInt();
            base = n - k + 1;
            answer = new long[n + 1][n + 1];
            sum = new long[n + 1][n + 1];
            ArrayUtils.fill(answer, -1);
            ArrayUtils.fill(sum, -1);
            long answer = go(n, n) * IntegerUtils.power(2, Math.max(n - k - 1, 0), MiscUtils.MOD7) % MiscUtils.MOD7;
            out.printLine(answer);
        }

        private long go(int n, int lim) {
            lim = Math.min(lim, n);
            if (answer[n][lim] != -1) {
                return answer[n][lim];
            }
            if (n == base) {
                return answer[n][lim] = 1;
            }
            return answer[n][lim] = (go(n - 1, lim) + goSum(n - 1, lim - 1)) % MiscUtils.MOD7;
        }

        private long goSum(int n, int lim) {
            if (sum[n][lim] != -1) {
                return sum[n][lim];
            }
            if (lim <= 1) {
                return sum[n][lim] = 0;
            }
            return sum[n][lim] = (go(n, lim) + goSum(n, lim - 1)) % MiscUtils.MOD7;
        }

    }

    static class ArrayUtils {
        public static void fill(long[][] array, long value) {
            for (long[] row : array) {
                Arrays.fill(row, value);
            }
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

        public int readInt() {
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

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

        public void printLine(long i) {
            writer.println(i);
        }

    }

    static class IntegerUtils {
        public static long power(long base, long exponent, long mod) {
            if (base >= mod) {
                base %= mod;
            }
            if (exponent == 0) {
                return 1 % mod;
            }
            long result = power(base, exponent >> 1, mod);
            result = result * result % mod;
            if ((exponent & 1) != 0) {
                result = result * base % mod;
            }
            return result;
        }

    }

    static class MiscUtils {
        public static final int MOD7 = (int) (1e9 + 7);

    }
}


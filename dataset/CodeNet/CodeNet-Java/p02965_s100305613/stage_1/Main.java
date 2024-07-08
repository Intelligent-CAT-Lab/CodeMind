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
 * @author Egor Kulikov (egor@egork.net)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int m = in.readInt();
            Combinations c = new Combinations(n + 3 * m, MiscUtils.MODF);
            long answer = 0;
            for (int i = 2 * m; i <= 3 * m; i += 2) {
                answer += c.c(n - 1 + i / 2, n - 1) * c.c(n, 3 * m - i) % MiscUtils.MODF;
            }
            long delta = 0;
            for (int i = 2 * m + 1; i <= 3 * m; i++) {
                delta += c.c(n + 3 * m - i - 2, n - 2);
            }
            delta %= MiscUtils.MODF;
            answer -= delta * n;
            answer %= MiscUtils.MODF;
            answer += MiscUtils.MODF;
            answer %= MiscUtils.MODF;
            out.printLine(answer);
        }

    }

    static class Combinations {
        private final long mod;
        private final long[] factorial;
        private final long[] reverseFactorial;

        public Combinations(int length, long mod) {
            this.mod = mod;
            factorial = IntegerUtils.generateFactorial(length, mod);
            reverseFactorial = IntegerUtils.generateReverseFactorials(length, mod);
        }

        public long c(int n, int k) {
            if (k < 0 || k > n) {
                return 0;
            }
            return factorial[n] * reverseFactorial[k] % mod * reverseFactorial[n - k] % mod;
        }

    }

    static class MiscUtils {
        public static final int MODF = 998_244_353;

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

    static class IntegerUtils {
        public static long[] generateFactorial(int count, long module) {
            long[] result = new long[count];
            if (module == -1) {
                if (count != 0) {
                    result[0] = 1;
                }
                for (int i = 1; i < count; i++) {
                    result[i] = result[i - 1] * i;
                }
            } else {
                if (count != 0) {
                    result[0] = 1 % module;
                }
                for (int i = 1; i < count; i++) {
                    result[i] = (result[i - 1] * i) % module;
                }
            }
            return result;
        }

        public static long[] generateReverse(int upTo, long module) {
            long[] result = new long[upTo];
            if (upTo > 1) {
                result[1] = 1;
            }
            for (int i = 2; i < upTo; i++) {
                result[i] = (module - module / i * result[((int) (module % i))] % module) % module;
            }
            return result;
        }

        public static long[] generateReverseFactorials(int upTo, long module) {
            long[] result = generateReverse(upTo, module);
            if (upTo > 0) {
                result[0] = 1;
            }
            for (int i = 1; i < upTo; i++) {
                result[i] = result[i] * result[i - 1] % module;
            }
            return result;
        }

    }
}


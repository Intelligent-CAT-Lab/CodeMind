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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int h = in.readInt();
            int w = in.readInt();
            int a = in.readInt();
            int b = in.readInt();
            BinomialCalculator c = new BinomialCalculator(h + w, MiscUtils.MOD7);
            long answer = 0;
            for (int i = 0; i < h - a; i++) {
                answer += c.c(b - 1 + i, i) * c.c(w - b - 1 + h - i - 1, w - b - 1) % MiscUtils.MOD7;
            }
            answer %= MiscUtils.MOD7;
            out.printLine(answer);
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

    static class BinomialCalculator {
        private long mod;
        private long[] fact;
        private long[] revFact;

        public BinomialCalculator(int n, long mod) {
            this.mod = mod;
            fact = IntegerUtils.generateFactorial(n + 1, mod);
            revFact = IntegerUtils.generateReverseFactorials(n + 1, mod);
        }

        public long c(int n, int m) {
            if (m < 0 || m > n) {
                return 0;
            }
            return fact[n] * revFact[m] % mod * revFact[n - m] % mod;
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

    static class MiscUtils {
        public static final int MOD7 = (int) (1e9 + 7);

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
}


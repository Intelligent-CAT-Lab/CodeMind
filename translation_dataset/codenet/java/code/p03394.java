import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class p03394 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        AC_GC_22_B solver = new AC_GC_22_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class AC_GC_22_B {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            if (n == 3) {
                out.println("2 5 63");
                return;
            } else if (n == 4) {
                out.println("2 5 20 63");
                return;
            }

            List<Integer> ans = new ArrayList<>();
            long _2 = 0;
            long _3 = 0;
            int _23 = 0;
            int i;
            for (i = 2; ans.size() < n - 2; i++) {
                int num = i;
                if (num % 2 == 0 && num % 3 == 0) {
                    _23++;
                } else if (num % 2 == 0) {
                    _2 += num;
                } else if (num % 3 == 0) {
                    _3 += num;
                }

                if (num % 2 == 0 || num % 3 == 0) {
                    ans.add(num);
                }
            }

            int k = i;
            int sn = -1;
            for (; ; i++) {
                int num = i;
                if (num % 2 == 0 && (_2 % 3 == 0 || num % 3 != 0) && (_2 + num) % 3 == 0) {
                    sn = num;
                    ans.add(num);
                    break;
                }
            }

            i = k;
            for (; ; i++) {
                int num = i;
                if (num % 3 == 0 && (_3 % 2 == 0 || num % 2 != 0) && num != sn && (_3 + num) % 2 == 0) {
                    ans.add(num);
                    break;
                }
            }

            for (int j = 0; j < ans.size(); j++) {
                out.print(ans.get(j));
                out.print(' ');
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

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void print(char i) {
            writer.print(i);
        }

        public void close() {
            writer.close();
        }

        public void print(int i) {
            writer.print(i);
        }

    }
}


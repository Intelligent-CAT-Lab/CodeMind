import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMultipleOf2019 solver = new DMultipleOf2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMultipleOf2019 {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            char[] c = s.next().toCharArray();
            int n = c.length;
            int[] d = new int[n + 1];
            int cur = 1;
            long ans = 0;
            int[] f = new int[2019];
            f[0]++;
            for (int i = n - 1; i >= 0; i--) {
                d[i] = (c[i] - '0') * cur + d[i + 1];
                cur *= 10;
                d[i] %= 2019;
                cur %= 2019;
                ans += f[d[i]];
                f[d[i]]++;
            }
            w.println(ans);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public String next() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            StringBuilder res = new StringBuilder();

            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


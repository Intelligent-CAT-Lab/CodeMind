import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Spandan
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FDivisionOrSubtraction solver = new FDivisionOrSubtraction();
        solver.solve(1, in, out);
        out.close();
    }

    static class FDivisionOrSubtraction {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long n = in.readLong();
            // no of divisors of n-1
            // if k(simulate 2 to sqrt n) divisible by n , add +1

            int n1 = (n == 2) ? 0 : 1;

            for (long i = 2L; i*i <= (n - 1); i++)
                if ((n - 1) % i == 0) {
                    if (i*i == (n - 1))
                        n1++;
                    else
                        n1 += 2;
                }


            int n2 = 1;
            for (long i = 2L; i*i <= (n); i++) {
                if (n % i == 0) {
                    long tmp = n;
                    while (tmp % i == 0) {
                        tmp /= i;
                    }
                    if (tmp % i == 1) n2++;
                }
            }

            System.out.println(n1 + n2);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new RuntimeException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public long readLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}


<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3 2 2

Expected output:
Y+G
1 11
1 -4 }1
:x;5"

```
// package atcoder.agc.agc016;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class p03689 {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int r = in.nextInt();
        int c = in.nextInt();
        int h = in.nextInt();
        int w = in.nextInt();

        if (r % h == 0 && c % w == 0) {
            out.println("No");
            out.flush();
            return;
        }

        int mcnt = (r / h) * (c / w);
        int space = r * c - ((r / h) * h) * ((c / w) * w);

        long plusNumber = ((mcnt + space) / space) + 1;
        long minusNumber = -(plusNumber * (h * w - 1) + 1);


        out.println("Yes");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                long num = ((i+1) % h == 0 && (j+1) % w == 0) ? minusNumber : plusNumber;
                if (j >= 1) {
                    out.print(' ');
                }
                out.print(num);
            }
            out.println();
        }
        out.flush();
    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int[] nextInts(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

        private int[][] nextIntTable(int n, int m) {
            int[][] ret = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ret[i][j] = nextInt();
                }
            }
            return ret;
        }

        private long[] nextLongs(int n) {
            long[] ret = new long[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextLong();
            }
            return ret;
        }

        private long[][] nextLongTable(int n, int m) {
            long[][] ret = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ret[i][j] = nextLong();
                }
            }
            return ret;
        }

        private double[] nextDoubles(int n) {
            double[] ret = new double[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextDouble();
            }
            return ret;
        }

        private int next() {
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

        public char nextChar() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            if ('a' <= c && c <= 'z') {
                return (char) c;
            }
            if ('A' <= c && c <= 'Z') {
                return (char) c;
            }
            throw new InputMismatchException();
        }

        public String nextToken() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c-'0';
                c = next();
            } while (!isSpaceChar(c));
            return res*sgn;
        }

        public long nextLong() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c-'0';
                c = next();
            } while (!isSpaceChar(c));
            return res*sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}

```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = -1

    def next(self):
        if self.numChars == -1:
            raise InputMismatchException()
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.read(self.buf)
            except IOError:
                raise InputMismatchException()
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar++]

    def nextChar(self):
        c = self.next()
        while self.isSpaceChar(c):
            c = self.next()
        if 'a' <= c <= 'z' or 'A' <= c <= 'Z':
            return chr(c)
        raise InputMismatchException()

    def nextToken(self):
        c = self.next()
        while self.isSpaceChar(c):
            c = self.next()
        res = ''
        while not self.isSpaceChar(c):
            res += chr(c)
            c = self.next()
        return res

    def nextInt(self):
        c = self.next()
       

<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
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
 * @author gaidash
 */
public class p02859 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        ACircle solver = new ACircle();
        solver.solve(1, in, out);
        out.close();
    }

    static class ACircle {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int r = in.nextInt();

            out.println(r * r);
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

        public void println(int i) {
            writer.println(i);
        }

    }
}


```
[/INST]
```python
import sys

def solve(r):
    print(r**2)

if __name__ == '__main__':
    input = sys.stdin
    output = sys.stdout
    solver = ACircle()
    solver.solve(1, input, output)
    output.close()

class ACircle:
    def solve(self, testNumber, input, output):
        r = input.readline().strip()

        output.write(r**2)
        output.write('\n')

class InputReader:
    def __init__(self, stream):
        self.stream = stream

    def read(self):
        self.numChars = self.stream.read(self.buf)
        self.curChar = 0
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

    def nextInt(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        res = 0
        while not self.isSpaceChar(c):
            if c < '0' or c > '9':
                raise InputMismatchException()
            res *= 10
            res += c - '0'
            c = self.read()
        return res * sgn

    def isSpaceChar(self, c):
        if self.filter is not None:
            return self.filter.isSpaceChar(c)
        return self.isWhitespace(c)

    def isWhitespace(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

class OutputWriter:
    def __init__(self, outputStream):
        self.writer = PrintWriter(outputStream, flush=True)

    def close(self):
        self.writer.close()

    def println(self, i):
        self.writer.write(str(i))
        self.writer.write('\n')


```</s>

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
 */
public class p03337 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            out.println(Math.max(Math.max(a + b, a - b), a * b));
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
}


```
[/INST]
```python
import sys

def solve(a, b):
    return max(max(a+b, a-b), a*b)

def main():
    input = sys.stdin
    output = sys.stdout
    solver = TaskA()
    solver.solve(1, input, output)

class TaskA:
    def solve(self, testNumber, input, output):
        a = input.readline().strip().split()[0]
        b = input.readline().strip().split()[0]
        output.write(str(max(max(int(a)+int(b), int(a)-int(b)), int(a)*int(b))))
        output.write("\n")

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = -1
        self.filter = None

    def read(self):
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
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream
        self.writer = sys.stdout.buffer

    def write(self, s):
        self.writer.write(s.encode())

    def flush(self):
        self.writer.flush()


if __name__ == '__main__':
    main()
```</s>

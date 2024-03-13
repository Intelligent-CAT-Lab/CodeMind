<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import sys

class InputReader:
    def __init__(self, input_stream):
        self.stream = input_stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise ValueError()
        if self.curChar >= self.numChars:
            self.curChar = 0
            num_chars = self.stream.readinto(self.buf)
            if num_chars <= 0:
                return -1
            self.numChars = num_chars
        return self.buf[self.curChar]

    def next_int(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.read()
        res = 0
        while True:
            if c < ord('0') or c > ord('9'):
                raise ValueError()
            res *= 10
            res += c - ord('0')
            c = self.read()
            if not self.is_space_char(c):
                break
        return res * sgn

    def is_space_char(self, c):
        return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t') or c == -1

class OutputWriter:
    def __init__(self, output_stream):
        self.writer = output_stream

    def close(self):
        self.writer.close()

    def println(self, i):
        self.writer.write(str(i) + '\n')

class TaskA:
    def solve(self, test_number, in_reader, out_writer):
        a = in_reader.next_int()
        b = in_reader.next_int()
        out_writer.println(max(a + b, a - b, a * b))

def main():
    in_reader = InputReader(sys.stdin)
    out_writer = OutputWriter(sys.stdout)
    solver = TaskA()
    solver.solve(1, in_reader, out_writer)
    out_writer.close()

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the maximum of their sum, difference, and product, and writes the result to the standard output.<｜end▁of▁sentence｜>

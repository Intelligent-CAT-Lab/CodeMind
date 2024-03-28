<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 10 20

Expected output:
66
116
92
262
285
726
1261
2619
5053
10271

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
 * @author prakharjain
 */
public class p03036 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        BAlgae solver = new BAlgae();
        solver.solve(1, in, out);
        out.close();
    }

    static class BAlgae {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long r = in.nextInt();


            long d = in.nextInt();

            long x = in.nextInt();

            for (int i = 0; i < 10; i++) {
                x = r * x - d;

                out.println(x);
            }
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

        public void println(long i) {
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
}


```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class BAlgae:
    def solve(self, test_number, inp, out):
        r = inp.next_int()
        d = inp.next_int()
        x = inp.next_int()

        for i in range(10):
            x = r * x - d
            out.println(x)

class OutputWriter:
    def __init__(self, output_stream):
        self.writer = PrintWriter(BufferedWriter(OutputStreamWriter(output_stream)))

    def close(self):
        self.writer.close()

    def println(self, i):
        self.writer.println(i)

class InputReader:
    def __init__(self, input_stream):
        self.stream = input_stream
        self.buf = bytearray(1024)
        self.cur_char = 0
        self.num_chars = -1
        self.filter = None

    def read(self):
        if self.num_chars == -1:
            raise InputMismatchException()
        if self.cur_char >= self.num_chars:
            self.cur_char = 0
            try:
                self.num_chars = self.stream.read(self.buf)
            except IOException:
                raise InputMismatchException()
            if self.num_chars <= 0:
                return -1
        return self.buf[self.cur_char++]

    def next_int(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        res = 0
        while not self.is_space_char(c):
            if c < '0' or c > '9':
                raise InputMismatchException()
            res *= 10
            res += c - '0'
            c = self.read()
        return res * sgn

    def is_space_char(self, c):
        if self.filter is not None:
            return self.filter.is_space_char(c)
        return is_whitespace(c)

    def is_whitespace(c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

if __name__ == '__main__':
    inp = InputReader(sys.stdin)
    out = OutputWriter(sys.stdout)
    solver = BAlgae()
    solver.solve(1, inp, out)
    out.close()
```
Note that this code is not tested and may contain errors.</s>

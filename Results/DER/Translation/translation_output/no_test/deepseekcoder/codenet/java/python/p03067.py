<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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
 *
 * @author L_aka_ryuga
 */
public class p03067 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        AOnTheWay solver = new AOnTheWay();
        solver.solve(1, in, out);
        out.close();
    }

    static class AOnTheWay {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int a = in.ni(), b = in.ni(), c = in.ni();
            if ((c >= a && c <= b) || (c >= b && c <= a)) out.println("Yes");
            else out.println("No");
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

        public int ni() {
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

        public void close() {
            writer.close();
        }

    }
}


```

### Response:
```python
import sys

class InputReader:
    def __init__(self, input_stream = sys.stdin):
        self.stream = input_stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = -1

    def read(self):
        if self.numChars == -1:
            raise Exception("InputMismatchException")
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.readinto(self.buf)
            except:
                raise Exception("InputMismatchException")
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar++]

    def ni(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.read()
        res = 0
        while not self.isSpaceChar(c):
            if c < ord('0') or c > ord('9'):
                raise Exception("InputMismatchException")
            res *= 10
            res += c - ord('0')
            c = self.read()
        return res * sgn

    def isSpaceChar(self, c):
        return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t') or c == -1

class OutputWriter:
    def __init__(self, output_stream = sys.stdout):
        self.writer = output_stream

    def print(self, *objects):
        for i in range(len(objects)):
            if i != 0:
                print(' ', end='', file=self.writer)
            print(objects[i], end='', file=self.writer)

    def println(self, *objects):
        self.print(objects)
        print('', file=self.writer)

    def close(self):
        self.writer.close()

class AOnTheWay:
    def solve(self, testNumber, inp, out):
        a = inp.ni()
        b = inp.ni()
        c = inp.ni()
        if (c >= a and c <= b) or (c >= b and c <= a): 
            out.println("Yes")
        else: 
            out.println("No")

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    inp = InputReader(input_stream)
    out = OutputWriter(output_stream)
    solver = AOnTheWay()
    solver.solve(1, inp, out)
    out.close()

if __name__ == "__main__":
    main()
```
<|EOT|>

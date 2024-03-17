<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

Expected output:
1.2000000000


```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class p03888 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        AEquivalentResistance solver = new AEquivalentResistance();
        solver.solve(1, in, out);
        out.close();
    }

    static class AEquivalentResistance {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            double r1 = in.doubles(), r2 = in.doubles();
            out.ans(1 / (1 / r1 + 1 / r2), 10).ln();
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(double x, int n) {
            if (!breaked) {
                print(' ');
            }
            if (x < 0) {
                print('-');
                x = -x;
            }
            x += Math.pow(10, -n) / 2;
            print(Long.toString((long) x)).print('.');
            x -= (long) x;
            for (int i = 0; i < n; i++) {
                x *= 10;
                print((char) ('0' + ((int) x)));
                x -= (int) x;
            }
            return this;
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public double doubles() {
            return Double.parseDouble(string());
        }

    }
}


```

@@ Response
```python
import sys

class LightScanner:
    def __init__(self, inp):
        self.inp = inp

    def string(self):
        return self.inp.readline().strip()

    def doubles(self):
        return float(self.string())

class LightWriter:
    def __init__(self, out):
        self.out = out

    def print(self, s):
        self.out.write(s)

    def ans(self, x, n):
        if x < 0:
            self.out.write('-')
            x = -x
        x += pow(10, -n) / 2
        self.out.write(str(int(x)))
        self.out.write('.')
        x -= int(x)
        for _ in range(n):
            x *= 10
            self.out.write(str(int(x)))
            x -= int(x)

    def ln(self):
        self.out.write('\n')

def solve(testNumber, inp, out):
    r1 = inp.doubles()
    r2 = inp.doubles()
    out.ans(1 / (1 / r1 + 1 / r2), 10)
    out.ln()

def main():
    inp = LightScanner(sys.stdin)
    out = LightWriter(sys.stdout)
    solve(1, inp, out)
    out.out.close()

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two double values from the standard input, calculates the equivalent resistance, and writes the result to the standard output. The `LightScanner` class is used to read input, and the `LightWriter` class is used to write output. The `solve` function is the main logic of the program, and it is called in the `main` function.<｜end▁of▁sentence｜>

<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def solve(test_number, in, out):
    out.write(1 / (1 / in.doubles() + 1 / in.doubles()))
    out.write('\n')

def main():
    in = sys.stdin
    out = sys.stdout
    solver = AEquivalentResistance()
    solver.solve(1, in, out)

class AEquivalentResistance:
    def solve(self, test_number, in, out):
        out.write(1 / (1 / in.doubles() + 1 / in.doubles()))
        out.write('\n')

class LightWriter:
    def __init__(self, out):
        self.out = out

    def print(self, c):
        self.out.write(c)
        self.breaked = False

    def print(self, s):
        self.out.write(s)
        self.breaked = False

    def ans(self, x, n):
        if not self.breaked:
            self.print(' ')
        if x < 0:
            self.print('-')
            x = -x
        x += 1e-9
        self.print(str(int(x))) + '.'
        x -= int(x)
        for i in range(n):
            x *= 10
            self.print(chr(ord('0') + i))
            x -= int(x)
        self.breaked = True

    def ln(self):
        self.print('\n')
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except Exception as e:
                raise e

    def close(self):
        try:
            self.out.close()
        except Exception as e:
            raise e

class LightScanner:
    def __init__(self, in):
        self.reader = in

    def string(self):
        if self.tokenizer is None or not self.tokenizer.has_more_tokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readline())
            except Exception as e:
                raise e
        return self.tokenizer.next_token()

    def doubles(self):
        return float(self.string())

if __name__ == '__main__':
    main()
```</s>

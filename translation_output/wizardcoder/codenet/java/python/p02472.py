Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class p02472 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        NTL_2_A solver = new NTL_2_A();
        solver.solve(1, in, out);
        out.close();
    }

    static class NTL_2_A {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            out.ansln(in.bigints().add(in.bigints()).toString());
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

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ansln(String... n) {
            for (String n1 : n) {
                ans(n1).ln();
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
            if (tokenizer == null ||!tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public BigInteger bigints() {
            return new BigInteger(string());
        }

    }
}



```

### Response:
```python
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.InputStream;

class LightWriter:
    def __init__(self, out):
        self.out = out
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        try:
            self.out.write(c)
            self.breaked = False
        except IOException as ex:
            raise UncheckedIOException(ex)
        return self

    def print(self, s):
        try:
            self.out.write(s, 0, s.length())
            self.breaked = False
        except IOException as ex:
            raise UncheckedIOException(ex)
        return self

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        return self.print(s)

    def ansln(self, *n):
        for n1 in n:
            self.ans(n1).ln()
        return self

    def ln(self):
        self.print(System.lineSeparator())
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except IOException as ex:
                raise UncheckedIOException(ex)
        return self

    def close(self):
        try:
            self.out.close()
        except IOException as ex:
            raise UncheckedIOException(ex)

class LightScanner:
    def __init__(self, in_):
        self.reader = BufferedReader(InputStreamReader(in_))
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except IOException as e:
                raise UncheckedIOException(e)
        return self.tokenizer.nextToken()

    def bigints(self):
        return BigInteger(self.string())

class NTL_2_A:
    def solve(self, testNumber, in_, out_):
        out_.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP)
        out_.ansln(in_.bigints().add(in_.bigints()).toString())

def main(args):
    inputStream = System.in
    outputStream = System.out
    in_ = LightScanner(inputStream)
    out_ = LightWriter(outputStream)
    solver = NTL_2_A()
    solver.solve(1, in_, out_)
    out_.close()

if __name__ == '__main__':
    main(None)
```<|endoftext|>

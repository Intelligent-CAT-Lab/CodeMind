<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7

Expected output:
2 3 4 5 6 7
5 3 1 6 4 7
2 7 4 1 5 6
2 1 7 5 3 6
1 4 3 7 6 2
2 5 7 3 4 1
2 6 1 4 5 3
S

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
public class p03896 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        I3y3sChallenge solver = new I3y3sChallenge();
        solver.solve(1, in, out);
        out.close();
    }

    static class I3y3sChallenge {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints();
            if (n == 2) {
                out.ans(-1).ln();
                return;
            }
            int[][] ans = new int[n][n - 1];
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (i == j) {
                        ans[i][j] = n;
                    } else {
                        ans[i][j] = j + 1;
                    }
                }
            }
            for (int i = 0; i < n - 1; i++) {
                ans[n - 1][i] = (i + 1) % (n - 1) + 1;
            }
            for (int i = 0; i < n; i++) {
                out.ans(ans[i]).ln();
            }
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

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
        }

        public LightWriter ans(int... n) {
            for (int n1 : n) {
                ans(n1);
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

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}


```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class LightScanner:
    def __init__(self, in_stream):
        self.reader = in_stream
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except UncheckedIOException as e:
                raise e
        return self.tokenizer.nextToken()

    def ints(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out_stream):
        self.out = out_stream
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        try:
            self.out.write(c)
            self.breaked = False
        except UncheckedIOException as e:
            raise e
        return self

    def print(self, s):
        try:
            self.out.write(s, 0, len(s))
            self.breaked = False
        except UncheckedIOException as e:
            raise e
        return self

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        return self.print(s)

    def ans(self, i):
        return self.ans(str(i))

    def ans(self, *n):
        for n1 in n:
            self.ans(n1)
        return self

    def ln(self):
        self.print(sys.lineSeparator())
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except UncheckedIOException as e:
                raise e
        return self

    def close(self):
        try:
            self.out.close()
        except UncheckedIOException as e:
            raise e

class I3y3sChallenge:
    def solve(self, test_number, in_stream, out_stream):
        in_scanner = LightScanner(in_stream)
        out_writer = LightWriter(out_stream)
        n = in_scanner.ints()
        if n == 2:
            out_writer.ans(-1).ln()
            return
        ans = [[0] * (n - 1) for _ in range(n)]
        for i in range(n - 1):
            for j in range(n - 1):
                if i == j:
                    ans[i][j] = n
                else:
                    ans[i][j] = j + 1
        for i in range(n - 1):
            ans[

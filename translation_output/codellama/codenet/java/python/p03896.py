<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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



Translate the above java code to python.

python code:

[/INST]
```python
import sys

class LightScanner:
    def __init__(self, inp):
        self.reader = inp

    def string(self):
        if not self.tokenizer or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except IOException as e:
                raise UncheckedIOException(e)
        return self.tokenizer.nextToken()

    def ints(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out):
        self.out = out
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        try:
            self.out.write(c)
            self.breaked = False
        except IOException as e:
            raise UncheckedIOException(e)
        return self

    def print(self, s):
        try:
            self.out.write(s, 0, len(s))
            self.breaked = False
        except IOException as e:
            raise UncheckedIOException(e)
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
            except IOException as e:
                raise UncheckedIOException(e)
        return self

    def close(self):
        try:
            self.out.close()
        except IOException as e:
            raise UncheckedIOException(e)

class I3y3sChallenge:
    def solve(self, testNumber, inp, out):
        # out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP)
        n = inp.ints()
        if n == 2:
            out.ans(-1).ln()
            return
        ans = [[0] * (n - 1) for _ in range(n)]
        for i in range(n - 1):
            for j in range(n - 1):
                if i == j:
                    ans[i][j] = n
                else:
                    ans[i][j] = j + 1
        for i in range(n - 1):
            ans[n - 1][i] = (i + 1) % (n - 1) + 1
        for i in range(n):
            out.ans(ans[i]).ln()

if __name__ == '__main__':
    inp = LightScanner(sys.stdin)
    out = LightWriter(sys.stdout)
    solver = I3y3sChallenge()
    solver.solve(1, inp, out)
    out.close()
```
This is the Python translation of the Java code. It uses the same classes and

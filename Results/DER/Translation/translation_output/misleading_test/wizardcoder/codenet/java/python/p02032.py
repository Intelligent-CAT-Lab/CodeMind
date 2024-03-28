Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
18

Expected output:
2 5 -56

```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.regex.Pattern;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class p02032 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        CDivisorGame solver = new CDivisorGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDivisorGame {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Debug.enable("src");
            long n = in.longs();
            Map<Long, Integer> pf = new HashMap<>();
            for (long i = 2; i * i <= n; i++) {
                int c = 0;
                while (n % i == 0) {
                    n /= i;
                    c++;
                }
                if (c > 0) {
                    pf.put(i, c);
                }
            }
            if (n > 1) {
                pf.put(n, 1);
            }

            long ans = 1;
            for (Map.Entry<Long, Integer> ent : pf.entrySet()) {
                ans *= (ent.getValue() + 1L);
            }
            out.ans(pf.size()).ans(ans - 1).ln();
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

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
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

        public long longs() {
            return Long.parseLong(string());
        }

    }

    static class Debug {
        private static final String DEBUG_CALL_PATTERN = "^.+\\.debug\\((.+)\\);.*$";
        private static Pattern debugRegex;
        private static boolean enabled = false;
        private static String src;

        public static void enable(String s) {
            enabled = true;
            src = s;
            if (debugRegex == null) {
                debugRegex = Pattern.compile(DEBUG_CALL_PATTERN);
            }
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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.io.Writer;
import java.io.UncheckedIOException;
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

    def ans(self, l):
        return self.ans(str(l))

    def ans(self, i):
        return self.ans(str(i))

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
    def __init__(self, in):
        self.reader = BufferedReader(InputStreamReader(in))
        self.tokenizer = None

    def string(self):
        if self.tokenizer == None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except IOException as e:
                raise UncheckedIOException(e)
        return self.tokenizer.nextToken()

    def longs(self):
        return Long.parseLong(self.string())

class CDivisorGame:
    def solve(self, testNumber, in, out):
        Debug.enable("src")
        n = in.longs()
        pf = HashMap()
        for i in range(2, int(n**0.5)+1):
            c = 0
            while n % i == 0:
                n /= i
                c += 1
            if c > 0:
                pf.put(i, c)
        if n > 1:
            pf.put(n, 1)

        ans = 1
        for ent in pf.entrySet():
            ans *= (ent.getValue() + 1)
        out.ans(pf.size()).ans(ans - 1).ln()

class Debug:
    DEBUG_CALL_PATTERN = "^.+\\.debug\\((.+)\\);.*$"
    debugRegex = None
    enabled = False
    src = None

    @staticmethod
    def enable(s):
        enabled = True
        src = s
        if Debug.debugRegex == None:
            Debug.debugRegex = Pattern.compile(Debug.DEBUG_CALL_PATTERN)

if __name__ == '__main__':
    inputStream = System.in
    outputStream = System.out
    in = LightScanner(inputStream)
    out = LightWriter(outputStream)
    solver = CDivisorGame()
    solver.solve(1, in, out)
    out.close()
```<|endoftext|>

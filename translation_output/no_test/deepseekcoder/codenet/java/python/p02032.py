<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
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
import sys
import re
import math
from collections import defaultdict

class LightScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.tokens = None

    def string(self):
        while True:
            if self.tokens is None or len(self.tokens) == 0:
                self.tokens = self.inp.readline().split()
            if len(self.tokens) > 0:
                return self.tokens.pop(0)

    def longs(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out=sys.stdout):
        self.out = out
        self.breaked = True

    def print(self, *args, **kwargs):
        sep = kwargs.get('sep', ' ')
        end = kwargs.get('end', '\n')
        output = sep.join(map(str, args)) + end
        self.out.write(output)
        self.out.flush()
        self.breaked = False

    def ans(self, *args, **kwargs):
        if not self.breaked:
            self.print(' ', end='')
        self.print(*args, **kwargs)

    def ln(self):
        self.print('\n')
        self.breaked = True

class CDivisorGame:
    def solve(self, testNumber, inp, out):
        n = inp.longs()
        pf = defaultdict(int)
        for i in range(2, int(math.sqrt(n)) + 1):
            while n % i == 0:
                n //= i
                pf[i] += 1
        if n > 1:
            pf[n] += 1

        ans = 1
        for ent in pf.values():
            ans *= (ent + 1)
        out.ans(len(pf)).ans(ans - 1).ln()

def main():
    inp = LightScanner()
    out = LightWriter()
    solver = CDivisorGame()
    solver.solve(1, inp, out)
    out.ln()

if __name__ == "__main__":
    main()
```
<|EOT|>

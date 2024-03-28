<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1 1 0 0 0 0

Expected output:
63

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class p03840 {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static int iinf = 0xfffffff;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        long ai = in.nextInt();
        long ao = in.nextInt();
        long at = in.nextInt();
        long aj = in.nextInt();
        long al = in.nextInt();
        long as = in.nextInt();
        long az = in.nextInt();
        long ans = 0;
        ans += ao;
        if (ai % 2 + aj % 2 + al % 2 == 3) {
            ans += ai + aj + al;
        } else if (ai % 2 + aj % 2 + al % 2 == 2) {
            if (ai != 0 && aj != 0 && al != 0) {
                ans += ai + aj + al - 1;
            } else {
                ans += ai + aj + al - 2;
            }
        } else if (ai % 2 + aj % 2 + al % 2 == 1) {
            ans += ai + aj + al - 1;
        } else {
            ans += ai + aj + al;
        }
        out.println(ans);
    }

    public static void main(String[]$) {
        new p03840().solve();
        out.flush();
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[][] nextCharArray(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}

```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class In:
    def __init__(self):
        self.reader = sys.stdin
        self.tokenizer = None

    def next(self):
        try:
            while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
                self.tokenizer = self.reader.readline()
        except IOError:
            pass
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextCharArray(self, n, m):
        a = []
        for i in range(n):
            a.append(self.next().toCharArray())
        return a

    def nextIntArray(self, n):
        a = []
        for i in range(n):
            a.append(self.nextInt())
        return a

    def nextIntArray(self, n, op):
        a = []
        for i in range(n):
            a.append(op.applyAsInt(self.nextInt()))
        return a

    def nextLongArray(self, n):
        a = []
        for i in range(n):
            a.append(self.nextLong())
        return a

    def nextLongArray(self, n, op):
        a = []
        for i in range(n):
            a.append(op.applyAsLong(self.nextLong()))
        return a

class Out:
    def __init__(self):
        self.out = sys.stdout
        self.autoFlush = False

    def println(self, *a):
        joiner = " ".join(a)
        self.out.println(joiner)
        if self.autoFlush:
            self.out.flush()

    def println(self, a):
        joiner = " ".join(a)
        self.out.println(joiner)
        if self.autoFlush:
            self.out.flush()

    def println(self, a):
        joiner = " ".join(a)
        self.out.println(joiner)
        if self.autoFlush:
            self.out.flush()

    def flush(self):
        self.out.flush()

in = In()
out = Out()
mod = 1000000007
iinf = 0xfffffff
inf = 0xfffffffffffffffL

def solve():
    ai = in.nextInt()
    ao = in.nextInt()
    at = in.nextInt()
    aj = in.nextInt()
    al = in.nextInt()
    as = in.nextInt()
    az = in.nextInt()
    ans = 0
    ans += ao


<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 2 4

Expected output:
1


```
import java.util.*;
import java.io.*;
import java.util.function.*;

class p02823 {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        long n = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        if (a > b) {
            long t = b;
            b = a;
            a = t;
        }
        if ((b - a) % 2 == 1) {
            long ans1 = a - 1 + (b - a + 1) / 2;
            a = n - a + 1;
            b = n - b + 1;
            if (a > b) {
                long t = b;
                b = a;
                a = t;
            }
            long ans2 = a - 1 + (b - a + 1) / 2;
            out.println(Math.min(ans1, ans2));
        } else {
            out.println((b - a) / 2);
        }
    }

    public static void main(String[]$) {
        new p02823().solve();
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
    private static PrintWriter out = new PrintWriter(System.out);

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
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
        a = [[0] * m for _ in range(n)]
        for i in range(n):
            a[i] = self.next().toCharArray()
        return a

    def nextIntArray(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.nextInt()
        return a

    def nextIntArray(self, n, op):
        a = [0] * n
        for i in range(n):
            a[i] = op(self.nextInt())
        return a

    def nextLongArray(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.nextLong()
        return a

    def nextLongArray(self, n, op):
        a = [0] * n
        for i in range(n):
            a[i] = op(self.nextLong())
        return a

class Out:
    def __init__(self):
        self.out = sys.stdout

    def println(self, *a):
        joiner = " ".join(map(str, a))
        self.out.write(joiner + "\n")

    def flush(self):
        self.out.flush()

class p02823:
    def __init__(self):
        self.in = In()
        self.out = Out()
        self.mod = 1000000007
        self.inf = 0xfffffffffffffffL

    def solve(self):
        n = self.in.nextLong()
        a = self.in.nextLong()
        b = self.in.nextLong()
        if a > b:
            t = b
            b = a
            a = t
        if (b - a) % 2 == 1:
            ans1 = a - 1 + (b - a + 1) / 2
            a = n - a + 1
            b = n - b + 1
            if a > b:
                t = b
                b = a
                a = t
            ans2 = a - 1 + (b - a + 1) / 2
            self.out.println(min(ans1, ans2))
        else:
            self.out.println((b - a) / 2)

if __name__ == "__main__":
    p02823().solve()
    out.flush()
```
Note that the Python code uses the `sys` module to read input from `stdin` and write output to `stdout`. The `In` and `Out` classes are used to encapsulate the input and output operations, respectively. The `p02823` class is the main class that contains the `solve` method, which is the entry point of the program.</s>

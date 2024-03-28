<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
3


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class p02722 {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        long n = in.nextLong();
        long ans = 0;
        Map<Long, Integer> primeFactors2 = getPrimeFactors(n - 1);
        for (long p = 2; p * p <= n; p++) {
            if (p * p == n) {
                ans++;
                continue;
            }
            if (n % p == 0) {
                if (check(p, n)) {
                    ans++;
                }
                if (check(n / p, n)) {
                    ans++;
                }
            }
        }
        long a1 = 1;
        for (Map.Entry<Long, Integer> entry : primeFactors2.entrySet()) {
            a1 *= entry.getValue() + 1;
        }
        out.println(a1 + ans);
    }

    static boolean check(long p, long n) {
        while (n % p == 0) {
            n /= p;
            if (n % p == 1) {
                return true;
            }
        }
        return false;
    }

    static Map<Long, Integer> getPrimeFactors(long n) {
        Map<Long, Integer> primeFactors = new HashMap<>();
        long c = n;
        for (long i = 2; i * i <= n && 1 < c; i++) {
            int count = 0;
            while (c % i == 0) {
                count++;
                c /= i;
            }
            if (count > 0) {
                primeFactors.put(i, count);
            }
        }
        if (c > 1) {
            primeFactors.put(c, 1);
        }
        return primeFactors;
    }

    public static void main(String[]$) {
        new p02722().solve();
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
        except:
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
        self.autoFlush = False

    def println(self, *a):
        joiner = " ".join(str(obj) for obj in a)
        self.out.println(joiner)
        if self.autoFlush:
            self.out.flush()

    def println(self, a):
        joiner = " ".join(str(i) for i in a)
        self.out.println(joiner)
        if self.autoFlush:
           

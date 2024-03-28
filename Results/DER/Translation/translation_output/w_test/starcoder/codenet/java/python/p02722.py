<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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
            while (tokenizer == null ||!tokenizer.hasMoreTokens()) {
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

python code:<fim_suffix><fim_middle>

```python
import sys

class In:
    def __init__(self):
        self.lines = sys.stdin.readlines()
        self.index = 0

    def next(self):
        self.index += 1
        return self.lines[self.index - 1].strip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextFloat(self):
        return float(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextChar(self):
        return self.next()

    def nextCharArray(self, n):
        return [self.next() for _ in range(n)]

    def nextIntArray(self, n):
        return [int(x) for x in self.next().split()]

    def nextLongArray(self, n):
        return [long(x) for x in self.next().split()]

    def nextFloatArray(self, n):
        return [float(x) for x in self.next().split()]

    def nextDoubleArray(self, n):
        return [float(x) for x in self.next().split()]

class Out:
    def __init__(self):
        self.lines = []

    def println(self, *objects):
        self.lines.append(" ".join(map(str, objects)))

    def flush(self):
        print("\n".join(self.lines))

in_ = In()
out = Out()

def getPrimeFactors(n):
    primeFactors = {}
    c = n
    for i in range(2, int(n ** 0.5) + 1):
        count = 0
        while c % i == 0:
            count += 1
            c /= i
        if count > 0:
            primeFactors[i] = count
    if c > 1:
        primeFactors[c] = 1
    return primeFactors

def check(p, n):
    while n % p == 0:
        n /= p
        if n % p == 1:
            return True
    return False

def solve():
    n = in_.nextLong()
    ans = 0
    primeFactors2 = getPrimeFactors(n - 1)
    for p in range(2, int(n ** 0.5) + 1):
        if p * p == n:
            ans += 1
            continue
        if n % p == 0:
            if check(p, n):
                ans += 1
            if check(n / p, n):
                ans += 1
    a1 = 1
    for p, c in primeFactors2.items():
        a1 *= c + 1
    out.println(a1 + ans)

solve()
out.flush()
```

'''
<|endoftext|>

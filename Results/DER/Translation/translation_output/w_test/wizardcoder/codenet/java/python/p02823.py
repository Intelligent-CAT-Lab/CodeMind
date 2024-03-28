Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import java.util.*;
import java.io.*;
import java.util.function.*;

class p02823:
    def __init__(self):
        self.in_ = java.util.Scanner(System.in)
        self.out = java.io.PrintWriter(System.out)
        self.mod = 1000000007
        self.inf = 0xfffffffffffffffL

    def solve(self):
        n = self.in_.nextLong()
        a = self.in_.nextLong()
        b = self.in_.nextLong()
        if a > b:
            a, b = b, a
        if (b - a) % 2 == 1:
            ans1 = a - 1 + (b - a + 1) // 2
            a = n - a + 1
            b = n - b + 1
            if a > b:
                a, b = b, a
            ans2 = a - 1 + (b - a + 1) // 2
            self.out.println(min(ans1, ans2))
        else:
            self.out.println((b - a) // 2)

    def __del__(self):
        self.in_.close()
        self.out.close()

if __name__ == '__main__':
    p = p02823()
    p.solve()
    p.out.flush()
```<|endoftext|>

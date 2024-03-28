

```python
import sys

def solve():
    n, d1, d2 = map(int, sys.stdin.readline().split())
    d1s = 0
    d2s = 0
    while (d1 & 3) == 0:
        d1s += 1
        d1 >>= 2
    while (d2 & 3) == 0:
        d2s += 1
        d2 >>= 2
    need = n * n
    for i in range(2 * n):
        for j in range(2 * n):
            if (d1 & 3) == 1 and (((i >> d1s) ^ (j >> d1s)) & 1) != 0:
                continue
            if (d1 & 3) == 2 and ((i >> d1s) & 1) != 0:
                continue
            if (d2 & 3) == 1 and (((i >> d2s) ^ (j >> d2s)) & 1) != 0:
                continue
            if (d2 & 3) == 2 and ((i >> d2s) & 1) != 0:
                continue
            print(i, j)
            need -= 1
            if need == 0:
                return
    raise AssertionError()

solve()
```

## p03335

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 1000000000000000000

Expected output:
1000000000000000000


```
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p03335 {

    static void solve() throws Exception {
        long a = scanLong();
        long b = scanLong();
        long c = a + b;
        if (c < 0) {
            c = -c;
        }
        out.println(c);
    }

    static int scanInt() throws IOException {
        return parseInt(scanString());
    }

    static long scanLong() throws IOException {
        return parseLong(scanString());
    }

    static String scanString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        } catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}
```

python code:

```python
import sys

def solve():
    a, b = map(int, sys.stdin.readline().split())
    c = a + b
    if c < 0:
        c = -c
    print(c)

solve()
```

## p03336

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 1000000000000000000

Expected output:
1000000000000000000


```
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p03336 {

    static void solve() throws Exception {
        long a = scanLong();
        long b = scanLong();
        long c = a - b;
        if (c < 0) {
            c = -c;
        }
        out.println(c);
    }

    static int scanInt() throws IOException {
        return parseInt(scanString());
    }

    static long scanLong() throws IOException {
        return parseLong(scanString());
    }

    static String scanString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        } catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}
```

python code:

```python
import sys

def solve():
    a, b = map(int, sys.stdin.readline().split())

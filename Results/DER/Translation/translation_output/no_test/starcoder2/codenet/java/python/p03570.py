
```
import sys

s = sys.stdin.readline().strip()
d = [len(s)] * (1 << 26)
d[0] = 0
mask = 0
ans = len(s)
for i in range(len(s)):
    c = ord(s[i]) - ord('a')
    mask ^= 1 << c
    for j in range(-1, 26):
        m = 0 if j < 0 else 1 << j
        cur = 1 + d[m ^ mask]
        d[mask] = min(d[mask], cur)
        if i == len(s) - 1:
            ans = min(ans, cur)
print(ans)
```

## 1000000000000000000

```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class p03571 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[] d = new int[1 << 20];
            Arrays.fill(d, 1000000000);
            d[0] = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 20; j++) {
                    int m = 1 << j;
                    int cur = 1 + d[m ^ a[i]];
                    d[a[i]] = Math.min(d[a[i]], cur);
                }
            }
            out.println(d[0]);
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

```

python code:
```
import sys

n = int(sys.stdin.readline().strip())
a = [int(x) for x in sys.stdin.readline().strip().split()]
d = [1000000000] * (1 << 20)
d[0] = 0
for i in range(n):
    for j in range(20):
        m = 1 << j
        cur = 1 + d[m ^ a[i]]
        d[a[i]] = min(d[a[i]], cur)
print(d[0])
```


```

python code:
```
import sys

n = int(sys.stdin.readline().strip())
a = [int(x) for x in sys.stdin.readline().strip().split()]
d = [1000000000] * (1 << 20)
d[0] = 0
for i in range(n):
    for j in range(20):
        m = 1 << j
        cur = 1 + d[m ^ a[i]]
        d[a[i]] = min(d[a[i]], cur)
print(d[0])
```

## 1000000000000000000

```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class p03571 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[] d = new int[1 << 20];
            Arrays.fill(d, 1000000000);
            d[0] = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 20; j++) {
                    int m = 1 << j;
                    int cur = 1 + d[m

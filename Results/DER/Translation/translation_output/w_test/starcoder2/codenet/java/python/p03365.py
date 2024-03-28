

```python
import math

def c(n, k):
    return math.factorial(n) // math.factorial(k) // math.factorial(n - k)

n = int(input())

md = [0] * n

rm = n - 2
lx = n - 2
while rm >= 0:
    md[lx + 1] = c(rm, lx)
    rm -= 2
    lx -= 1

res = 0
prev = 0
for m in range(1, n):
    cur = math.factorial(m) * math.factorial(n - m - 1) % 1000000007
    cur = cur * (md[m]) % 1000000007

    res += (cur - prev + 1000000007) * m % 1000000007
    prev = cur

print(res % 1000000007)
```

## Problem D

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class p03366 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScan in = new MyScan(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, MyScan in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }
            int[] c = new int[n];
            for (int i = 0; i < n; i++) {
                c[i] = in.nextInt();
            }
            int[] d = new int[n];
            for (int i = 0; i < n; i++) {
                d[i] = in.nextInt();
            }
            int[] e = new int[n];
            for (int i = 0; i < n; i++) {
                e[i] = in.nextInt();
            }
            int[] f = new int[n];
            for (int i = 0; i < n; i++) {
                f[i] = in.nextInt();
            }
            int[] g = new int[n];
            for (int i = 0; i < n; i++) {
                g[i] = in.nextInt();
            }
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = in.nextInt();
            }
            int[] i = new int[n];
            for (int j = 0; j < n; j++) {
                i[j] = in.nextInt();
            }
            int[] j = new int[n];
            for (int k = 0; k < n; k++) {
                j[k] = in.nextInt();
            }
            int[] k = new int[n];
            for (int l = 0; l < n; l++) {
                k[l] = in.nextInt();
            }
            int[] l = new int[n];
            for (int m = 0; m < n; m++) {
                l[m] = in.nextInt();
            }
            int[] m = new int[n];
            for

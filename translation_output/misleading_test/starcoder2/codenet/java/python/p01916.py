
```python
s = input()
a = [0] * 26
b = [0] * 1111
for i in range(len(s)):
    a[ord(s[i]) - ord('a')] += 1
for i in range(26):
    b[a[i]] += 1
for i in range(999, -1, -2):
    if b[i] > 0:
        b[i] -= 1
        break
m = 0
for i in range(1, 1000, 2):
    m += b[i]
if m % 2 == 0:
    print(m // 2)
else:
    print(m // 2 + 1)
```


```

python code:
```python
n = int(input())
a = [0] * n
for i in range(n):
    a[i] = int(input())
a.sort()
for i in range(n):
    print(a[i])
```
/p01914.md
# p01914

## Problem

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
1
2
3

Expected output:
1
2
3

```
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class p01914 implements Runnable {
    int n;
    int[] a;

    public void solve() {
        n = nextInt();
        a = new int[n];

        for(int i = 0;i < n;i++){
            a[i] = nextInt();
        }

        Arrays.sort(a);

        for(int i = 0;i < n;i++){
            out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        new Thread(null, new p01914(), "", 64 * 1024 * 1024).start();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[2048];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    @Override
    public void run() {
        out.flush();
        new p01914().solve();
        out.close();

    }
}/p01915.md
# p01915

## Problem

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
1 2 3

Expected output:
6

```
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class p01915 implements Runnable {
    int n;
    int[] a;

    public void solve() {
        n = nextInt();
        a = new int[n];

        for(int i = 0;i < n;i++){
            a[i] = nextInt();
        }

        int m = 0;

        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++){
                m += a[i]*a[j];
            }
        }

        out.println(m

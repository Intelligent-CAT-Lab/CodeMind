

```python
A, B, N = map(int, input().split())
ans = abs(A - B)
for i in range(1, N + 1):
    for j in range(1, N + 1):
        if i * B % j != 0:
            continue
        ans = min(ans, abs(A - i * B // j))
print(ans)
```

## 01893

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 10 10

Expected output:
100


```
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class p01893 {
    int A,B,C,D;
    public void solve() {
        A = nextInt();
        B = nextInt();
        C = nextInt();
        D = nextInt();

        int ans = 0;
        for(int i = 1;i <= A;i++){
            for(int j = 1;j <= B;j++){
                for(int k = 1;k <= C;k++){
                    for(int l = 1;l <= D;l++){
                        if(i * j == k * l)ans++;
                    }
                }
            }
        }

        out.println(ans);

    }

    public static void main(String[] args) {
        out.flush();
        new p01893().solve();
        out.close();
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
}
```

python code:

```python
A, B, C, D = map(int, input().split())
ans = 0
for i in range(1, A + 1):
    for j in range(1, B + 1):
        for k in range(1, C + 1):
            for l in range(1, D + 1):
                if i * j == k * l:
                    ans += 1
print(ans)
```

## 01894

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 10 10

Expected output:
100


```
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class p01894 {
    int A,B,C,D;
    public void solve() {
        A = nextInt();
        B = nextInt();
        C = nextInt();
        D = nextInt();

        int ans = 0;
        for(int i = 1;i <= A;i++){
            for(int j = 1;j <= B;j++){
                for(int k = 1;k <= C;k++){
                    for(int l = 1;l <= D;l++){
                        if(i * j == k * l)ans++;
                    }
                }
            }
        }

        out.println(ans);

    }

    public static void main(String[] args) {
        out.flush();
        new p01894().solve();
        out.close();
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
        while (

<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

// Template for atcoder
public class p02624 {

    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;
    boolean eof;
    final long MOD = 1000L * 1000L * 1000L + 7;
    private static final int[] dx = {0, -1, 0, 1};
    private static final int[] dy = {1, 0, -1, 0};

    void solve() throws IOException {
        int LIMIT = 1000 * 10000 + 10;
        int[] div = new int[LIMIT];
        Arrays.fill(div, 1);
        for (int i = 2; i < LIMIT; i++) {
            for (int j = i; j < LIMIT; j += i) {
                div[j]++;
            }
        }

        long res = 0;
        int n = nextInt();
        for (int i = 1; i <= n; i++) {
            res += 1L * i * div[i];
        }
        outln(res);
    }

    void shuffle(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            int tmp = a[i];
            a[i] = a[r];
            a[r] = tmp;
        }
    }
    private void outln(Object o) {
        out.println(o);
    }
    private void out(Object o) {
        out.print(o);
    }
    public p02624() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
    public static void main(String[] args) throws IOException {
        new p02624();
    }

    public long[] nextLongArr(int n) throws IOException{
        long[] res = new long[n];
        for(int i = 0; i < n; i++)
            res[i] = nextLong();
        return res;
    }
    public int[] nextIntArr(int n) throws IOException {
        int[] res = new int[n];
        for(int i = 0; i < n; i++)
            res[i] = nextInt();
        return res;
    }
    public String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                eof = true;
                return null;
            }
        }
        return st.nextToken();
    }
    public String nextString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            eof = true;
            return null;
        }
    }
    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
    public double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }
}

```

### Response:
```python
import sys

# Template for atcoder
class p02624:

    MOD = 1000 * 1000 * 1000 + 7
    dx = [0, -1, 0, 1]
    dy = [1, 0, -1, 0]

    def solve(self):
        LIMIT = 1000 * 10000 + 10
        div = [1] * LIMIT
        for i in range(2, LIMIT):
            for j in range(i, LIMIT, i):
                div[j] += 1

        res = 0
        n = int(sys.stdin.readline())
        for i in range(1, n + 1):
            res += 1 * i * div[i]
        print(res)

    def shuffle(self, a):
        n = len(a)
        for i in range(n):
            r = i + int(n * random.random())
            a[i], a[r] = a[r], a[i]

    def out(self, o):
        sys.stdout.write(str(o))

    def outln(self, o):
        sys.stdout.write(str(o) + '\n')

    def __init__(self):
        self.solve()

    def nextLongArr(self, n):
        return list(map(int, sys.stdin.readline().split()))

    def nextIntArr(self, n):
        return list(map(int, sys.stdin.readline().split()))

    def nextToken(self):
        return sys.stdin.readline().strip()

    def nextString(self):
        return sys.stdin.readline()

    def nextInt(self):
        return int(self.nextToken())

    def nextLong(self):
        return long(self.nextToken())

    def nextDouble(self):
        return float(self.nextToken())

if __name__ == "__main__":
    p02624()
```

Please note that the `nextLong` and `nextDouble` functions are not available in Python's `sys.stdin.readline()`. You may need to replace them with equivalent functions if you are using Python 2.7. Also, Python 2.x does not have a `long` type, so you should use `int` instead.
<|EOT|>

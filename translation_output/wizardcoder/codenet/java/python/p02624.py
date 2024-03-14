Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
        while (st == null ||!st.hasMoreTokens()) {
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
import java.util.*;
import java.io.*;

class p02624:
    def __init__(self):
        self.br = BufferedReader(InputStreamReader(System.in))
        self.out = PrintWriter(System.out)
        self.eof = False
        self.MOD = 1000L * 1000L * 1000L + 7
        self.dx = [0, -1, 0, 1]
        self.dy = [1, 0, -1, 0]
        self.solve()
        self.out.close()

    def solve(self):
        LIMIT = 1000 * 10000 + 10
        div = [1] * LIMIT
        for i in range(2, LIMIT):
            for j in range(i, LIMIT, i):
                div[j] += 1

        res = 0
        n = self.nextInt()
        for i in range(1, n+1):
            res += i * div[i]
        self.outln(res)

    def shuffle(self, a):
        n = len(a)
        for i in range(n):
            r = i + int(random() * (n - i))
            a[i], a[r] = a[r], a[i]

    def outln(self, o):
        self.out.println(o)

    def out(self, o):
        self.out.print(o)

    def nextLongArr(self, n):
        res = [0] * n
        for i in range(n):
            res[i] = self.nextLong()
        return res

    def nextIntArr(self, n):
        res = [0] * n
        for i in range(n):
            res[i] = self.nextInt()
        return res

    def nextToken(self):
        while self.st == None or not self.st.hasMoreTokens():
            try:
                self.st = StringTokenizer(self.br.readLine())
            except Exception:
                self.eof = True
                return None
        return self.st.nextToken()

    def nextString(self):
        try:
            return self.br.readLine()
        except IOException:
            self.eof = True
            return None

    def nextInt(self):
        return Integer.parseInt(self.nextToken())

    def nextLong(self):
        return Long.parseLong(self.nextToken())

    def nextDouble(self):
        return Double.parseDouble(self.nextToken())

p02624()
```<|endoftext|>

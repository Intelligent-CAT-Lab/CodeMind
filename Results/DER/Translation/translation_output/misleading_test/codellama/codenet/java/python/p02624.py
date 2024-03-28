<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
-10

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys
import math

# Template for atcoder
class p02624:

    def __init__(self):
        self.br = sys.stdin
        self.out = sys.stdout
        self.st = None
        self.eof = False
        self.MOD = 1000 * 1000 * 1000 + 7
        self.dx = [0, -1, 0, 1]
        self.dy = [1, 0, -1, 0]

    def solve(self):
        LIMIT = 1000 * 10000 + 10
        div = [1] * LIMIT
        for i in range(2, LIMIT):
            for j in range(i, LIMIT, i):
                div[j] += 1

        res = 0
        n = int(self.next_token())
        for i in range(1, n + 1):
            res += i * div[i]
        self.out.write(str(res) + "\n")

    def shuffle(self, a):
        n = len(a)
        for i in range(0, n):
            r = i + int(math.random() * (n - i))
            tmp = a[i]
            a[i] = a[r]
            a[r] = tmp

    def next_token(self):
        while self.st is None or not self.st.hasMoreTokens():
            try:
                self.st = StringTokenizer(self.br.readLine())
            except Exception as e:
                self.eof = True
                return None
        return self.st.nextToken()

    def next_string(self):
        try:
            return self.br.readLine()
        except Exception as e:
            self.eof = True
            return None

    def next_int(self):
        return int(self.next_token())

    def next_long(self):
        return long(self.next_token())

    def next_double(self):
        return float(self.next_token())

if __name__ == "__main__":
    p02624()
```
Note that this code is not tested and may contain errors.</s>

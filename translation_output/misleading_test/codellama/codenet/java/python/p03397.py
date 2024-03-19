<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1??00

Expected output:
-94

```
import java.io.*;
import java.util.*;

public class p03397 {
    FastScanner in;
    PrintWriter out;

    final int mod = (int) 1e9 + 7;

    int add(int x, int y) {
        x += y;
        if (x >= mod) {
            x -= mod;
        }
        return x;
    }

    void solve() {
        char[] s = in.next().toCharArray();
        int[][] go = new int[][]{{0, 0}, {2, 2}, {1, 3}, {2, 0}, {5, 5}, {4, 6}, {5, 3}, {8, 8}, {7, 9}, {8, 6}};
        int start = go.length - 1;
        String win = "W?W?L?W?L?";
        int states = win.length();
        int[] dp = new int[states];
        dp[start] = 1;
        int[] ndp = new int[states];
        for (char c : s) {
            Arrays.fill(ndp, 0);
            for (int st = 0; st < states; st++) {
                if (c == '0' || c == '?') {
                    int next = go[st][0];
                    ndp[next] = add(ndp[next], dp[st]);
                }
                if (c == '1' || c == '?') {
                    int next = go[st][1];
                    ndp[next] = add(ndp[next], dp[st]);
                }
            }
            int[] tmp = dp;
            dp = ndp;
            ndp = tmp;
        }
        long res = 0;
        for (int i = 0; i < states; i++) {
            if (dp[i] == 0) {
                continue;
            }
            char w = win.charAt(i);
            if (w == '?') {
                throw new AssertionError();
            }
            if (w == 'W') {
                res += dp[i];
            }
        }
        out.println(res % mod);
    }

    void run() {
        try {
            in = new FastScanner(new File("p03397.in"));
            out = new PrintWriter(new File("p03397.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new p03397().runIO();
    }
}
```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class FastScanner:
    def __init__(self, file):
        self.file = file
        self.br = open(file, 'r')
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            s = self.br.readline()
            if s is None:
                return None
            self.st = StringTokenizer(s)
        return self.st.nextToken()

    def hasMoreTokens(self):
        while self.st is None or not self.st.hasMoreTokens():
            s = self.br.readline()
            if s is None:
                return False
            self.st = StringTokenizer(s)
        return True

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

class p03397:
    def __init__(self):
        self.in = FastScanner(sys.stdin)
        self.out = FastScanner(sys.stdout)

    def add(self, x, y):
        x += y
        if x >= mod:
            x -= mod
        return x

    def solve(self):
        s = self.in.next().toCharArray()
        go = [[0, 0], [2, 2], [1, 3], [2, 0], [5, 5], [4, 6], [5, 3], [8, 8], [7, 9], [8, 6]]
        start = len(go) - 1
        win = "W?W?L?W?L?"
        states = len(win)
        dp = [0] * states
        dp[start] = 1
        ndp = [0] * states
        for c in s:
            Arrays.fill(ndp, 0)
            for st in range(states):
                if c == '0' or c == '?':
                    next = go[st][0]
                    ndp[next] = self.add(ndp[next], dp[st])
                if c == '1' or c == '?':
                    next = go[st][1]
                    ndp[next] = self.add(ndp[next], dp[st])
            tmp = dp
            dp = ndp
            ndp = tmp
        res = 0
        for i in range(states):
            if dp[i] == 0:
                continue
            w = win[i]
            if w == '?':
                raise AssertionError()
            if w == 'W':
                res += dp[i]
        self.out.println(res % mod)

    def run(self):
        try:
            self.in = FastScanner(open("p03397.in", 'r'))
            self.out = FastScanner(open("p03397.out", 'w'))

            self.solve()

            self.out.close()
        except FileNotFoundException as e:
            e.printStackTrace()

    def runIO(self):
        self.in = FastScanner(sys.stdin)
        self.out = FastScanner(sys.stdout)

        self.solve()

        self.out.close()

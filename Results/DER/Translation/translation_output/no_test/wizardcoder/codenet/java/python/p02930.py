Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```

public class p02930 {
  private static void solve() {
    int n = ni();

    int[][] ret = new int[n][n];
    dfs(0, n, 1, ret);

    for (int i = 0; i < n - 1; i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = i + 1; j < n; j++) {
        sb.append(ret[i][j] + " ");
      }
      out.println(sb.substring(0, sb.length() - 1));
    }
  }

  private static void dfs(int left, int right, int level, int[][] ret) {
    if (left + 1 >= right)
      return;

    int center = (left + right) / 2;

    for (int i = left; i < center; i++) {
      for (int j = center; j < right; j++) {
        ret[i][j] = level;
        ret[j][j] = level;
      }
    }

    dfs(left, center, level + 1, ret);
    dfs(center, right, level + 1, ret);
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = args.length > 0? args[0] : null;
        if (debug!= null) {
          try {
            is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
        solve();
        out.flush();
        tr((System.currentTimeMillis() - start) + "ms");
      }
    }, "", 64000000).start();
  }

  private static java.io.InputStream is = System.in;
  private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
  private static java.util.StringTokenizer tokenizer = null;
  private static java.io.BufferedReader reader;

  public static String next() {
    while (tokenizer == null ||!tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }

  private static double nd() {
    return Double.parseDouble(next());
  }

  private static long nl() {
    return Long.parseLong(next());
  }

  private static int[] na(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = ni();
    return a;
  }

  private static char[] ns() {
    return next().toCharArray();
  }

  private static long[] nal(int n) {
    long[] a = new long[n];
    for (int i = 0; i < n; i++)
      a[i] = nl();
    return a;
  }

  private static int[][] ntable(int n, int m) {
    int[][] table = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[i][j] = ni();
      }
    }
    return table;
  }

  private static int[][] nlist(int n, int m) {
    int[][] table = new int[m][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[j][i] = ni();
      }
    }
    return table;
  }

  private static int ni() {
    return Integer.parseInt(next());
  }

  private static void tr(Object... o) {
    if (is!= System.in)
      System.out.println(java.util.Arrays.deepToString(o));
  }
}

```

### Response:
```python
import sys

class p02930:
    def __init__(self):
        self.n = None
        self.ret = None
        self.dfs_left = None
        self.dfs_right = None
        self.dfs_level = None
        self.dfs_ret = None

    def solve(self):
        self.n = int(input())
        self.ret = [[0] * self.n for _ in range(self.n)]
        self.dfs(0, self.n, 1, self.ret)
        for i in range(self.n - 1):
            sb = []
            for j in range(i + 1, self.n):
                sb.append(str(self.ret[i][j]))
            print(" ".join(sb))

    def dfs(self, left, right, level, ret):
        if left + 1 >= right:
            return
        center = (left + right) // 2
        for i in range(left, center):
            for j in range(center, right):
                ret[i][j] = level
                ret[j][j] = level
        self.dfs(left, center, level + 1, ret)
        self.dfs(center, right, level + 1, ret)

    def main(self):
        if len(sys.argv) > 1:
            with open(sys.argv[1], "r") as f:
                self.is = f.read()
        else:
            self.is = sys.stdin.read()
        self.reader = self.is.split("\n")
        self.solve()

    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader.pop(0).split()
        return self.tokenizer.pop(0)

    def nd(self):
        return float(self.next())

    def nl(self):
        return int(self.next())

    def na(self, n):
        return [int(self.next()) for _ in range(n)]

    def ns(self):
        return self.next().strip().encode("utf-8")

    def nal(self, n):
        return [int(self.next()) for _ in range(n)]

    def ntable(self, n, m):
        return [[int(self.next()) for _ in range(m)] for _ in range(n)]

    def nlist(self, n, m):
        return [[int(self.next()) for _ in range(n)] for _ in range(m)]

    def ni(self):
        return int(self.next())

    def tr(self, *o):
        pass

p02930().main()
```<|endoftext|>

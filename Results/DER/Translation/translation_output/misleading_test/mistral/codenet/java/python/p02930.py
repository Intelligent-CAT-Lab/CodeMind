<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1

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
        String debug = args.length > 0 ? args[0] : null;
        if (debug != null) {
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
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
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
    if (is != System.in)
      System.out.println(java.util.Arrays.deepToString(o));
  }
}

```
[/INST]
```python
def solve():
    n = int(input())
    ret = [[0 for _ in range(n)] for _ in range(n)]
    dfs(0, n, 1, ret)

    for i in range(n - 1):
        sb = StringBuilder()
        for j in range(i + 1, n):
            sb.append(ret[i][j] + " ")
        print(sb.strip())

def dfs(left, right, level, ret):
    if left + 1 >= right:
        return

    center = (left + right) // 2

    for i in range(left, center):
        for j in range(center, right):
            ret[i][j] = level
            ret[j][j] = level

    dfs(left, center, level + 1, ret)
    dfs(center, right, level + 1, ret)

if __name__ == "__main__":
    import threading
    import sys
    import time

    def main():
        start = time.time()
        debug = sys.argv[1] if len(sys.argv) > 1 else None
        if debug:
            try:
                is = open(debug, 'r')
            except Exception as e:
                raise RuntimeError(e)
        reader = sys.stdin
        solve()
        print(f"{time.time() - start:.3f}s")

    main()

def next():
    while tokenizer is None or not tokenizer.hasMoreTokens():
        try:
            tokenizer = reader.readline().split()
        except Exception as e:
            raise RuntimeError(e)
    return tokenizer[0]

def nd():
    return float(next())

def nl():
    return int(next())

def na(n):
    a = [int(next()) for _ in range(n)]
    return a

def ns():
    return next().split()

def nal(n):
    a = [int(next()) for _ in range(n)]
    return a

def ntable(n, m):
    table = [[int(next()) for _ in range(m)] for _ in range(n)]
    return table

def nlist(n, m):
    table = [[int(next()) for _ in range(n)] for _ in range(m)]
    return table

def ni():
    return int(next())

def tr(*args):
    if is != sys.stdin:
        print(" ".join(str(x) for x in args))

# Sample test case
n = int(input())
print(int(nd()))
```</s>

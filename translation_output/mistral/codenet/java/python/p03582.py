<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p03582 {

  private static void solve() {
    int[] a = na(3);
    List<String> list = new ArrayList<>();
    for (int j = 0; j < 3; j ++) {
      for (int i = 0; i < a[j]; i ++)
        list.add("" + (char)('a' + j));
    }

    while (list.size() > 1) {
      Collections.sort(list);
      int last = list.size() - 1;
      String s = list.get(0) + list.get(last);
      list.set(0, s);
      list.remove(last);
    }
    System.out.println(list.get(0));
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = System.getProperty("debug");
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
import java.util.ArrayList
import java.util.Collections
import java.util.List

def solve():
    a = [na(3)]
    list = ArrayList()
    for j in range(3):
        for i in range(a[j]):
            list.append("" + (char)(ord('a') + j))

    while len(list) > 1:
        Collections.sort(list)
        last = len(list) - 1
        s = list[0] + list[last]
        list[0] = s
        list.pop()

    print(list[0])

def main():
    thread = Thread(target=run, args=("", 64000000))
    thread.start()

def run():
    start = time.time()
    debug = os.environ.get("debug")
    if debug:
        try:
            is = open(os.path.join(debug, "input.txt"), "rb")
        except Exception as e:
            raise RuntimeError(e)
    reader = BufferedReader(InputStreamReader(is), 32768)
    solve()
    out.flush()
    tr((time.time() - start) * 1000)

is = sys.stdin
out = sys.stdout
tokenizer = None
reader = None

def next():
    while tokenizer is None or not tokenizer.has_more_tokens():
        try:
            tokenizer = StringTokenizer(reader.readline())
        except Exception as e:
            raise RuntimeError(e)
    return tokenizer.next_token()

def nd():
    return float(next())

def nl():
    return int(next())

def na(n):
    a = [ni() for _ in range(n)]
    return a

def ns():
    return next().to_char_array()

def nal(n):
    a = [nl() for _ in range(n)]
    return a

def ntable(n, m):
    table = [[ni() for _ in range(m)] for _ in range(n)]
    return table

def nlist(n, m):
    table = [[ni() for _ in range(n)] for _ in range(m)]
    return table

def ni():
    return int(next())

def tr(*args):
    if is != sys.stdin:
        print(args)

# Your code here
```</s>

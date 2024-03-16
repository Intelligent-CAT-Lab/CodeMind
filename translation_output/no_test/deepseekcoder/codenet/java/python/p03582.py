<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys
import time
import threading
import io
import re
import collections

class p03582:
    def __init__(self):
        self.start_time = 0
        self.debug = False
        self.reader = None
        self.out = None
        self.tokenizer = None
        self.is_ = None

    def solve(self):
        a = self.na(3)
        list_ = []
        for j in range(3):
            for i in range(a[j]):
                list_.append(chr(ord('a') + j))

        while len(list_) > 1:
            list_.sort()
            last = len(list_) - 1
            s = list_[0] + list_[last]
            list_[0] = s
            list_.pop(last)

        print(list_[0])

    def main(self):
        self.is_ = sys.stdin
        self.out = io.StringIO()
        self.reader = io.BufferedReader(io.InputStreamReader(self.is_), 32768)
        self.start_time = time.time()
        self.solve()
        print(self.out.getvalue())
        print(f"{(time.time() - self.start_time) * 1000}ms")

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                line = self.reader.readLine()
                self.tokenizer = re.split(r'\s+', line)
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.nextToken()

    def nd(self):
        return float(self.next())

    def nl(self):
        return int(self.next())

    def na(self, n):
        a = [0]*n
        for i in range(n):
            a[i] = self.ni()
        return a

    def ns(self):
        return self.next().toCharArray()

    def nal(self, n):
        a = [0]*n
        for i in range(n):
            a[i] = self.nl()
        return a

    def ntable(self, n, m):
        table = [[0]*m for _ in range(n)]
        for i in range(n):
            for j in range(m):
                table[i][j] = self.ni()
        return table

    def nlist(self, n, m):
        table = [[0]*n for _ in range(m)]
        for i in range(n):
            for j in range(m):
                table[j][i] = self.ni()
        return table

    def ni(self):
        return int(self.next())

    def tr(self, *o):
        if self.is_ != sys.stdin:
            print(o)

if __name__ == "__main__":
    p03582().main()
```
<|EOT|>

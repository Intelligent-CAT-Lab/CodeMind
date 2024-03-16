<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys
import time
import string

def solve():
    a = [int(i) for i in input().split()]
    list = []
    for j in range(3):
        for i in range(a[j]):
            list.append(string.ascii_lowercase[j])

    while len(list) > 1:
        list.sort()
        last = len(list) - 1
        s = list[0] + list[last]
        list[0] = s
        list.pop(last)
    print(list[0])

if __name__ == "__main__":
    start = time.time()
    solve()
    print(f"{(time.time() - start) * 1000}ms")
```

This Python code does the same thing as the Java code. It reads three integers from the input, creates a list of characters based on these integers, sorts the list, and then repeatedly combines the first and last elements of the list until there is only one element left. The time taken to execute the code is also measured and printed.<｜end▁of▁sentence｜>

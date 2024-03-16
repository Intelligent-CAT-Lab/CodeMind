<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def solve():
    n = ni()

    ret = [[0]*n for _ in range(n)]
    dfs(0, n, 1, ret)

    for i in range(n - 1):
        print(' '.join(map(str, ret[i][i+1:])))

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

def main():
    start = time.time()
    debug = sys.argv[1] if len(sys.argv) > 1 else None
    if debug:
        global is
        is = open(debug, 'r')
    solve()
    print(f"{(time.time() - start) * 1000}ms")

if __name__ == "__main__":
    import time
    import io
    import os
    import sys
    import math
    import re
    import itertools
    import collections
    import heapq
    import bisect
    import functools
    import operator
    import array
    import string
    import random
    import timeit
    import contextlib
    import cProfile
    import pstats
    import threading
    import queue
    import copy
    import pickle
    import copyreg
    import types
    import weakref
    import collections.abc
    import builtins
    import decimal
    import fractions
    import statistics
    import functools
    import contextlib
    import contextvars
    import inspect
    import enum
    import keyword
    import tokenize
    import token
    import keyword
    import re
    import os
    import sys
    import io
    import time
    import math
    import re
    import itertools
    import collections
    import heapq
    import bisect
    import functools
    import operator
    import array
    import string
    import random
    import timeit
    import contextlib
    import cProfile
    import pstats
    import threading
    import queue
    import copy
    import pickle
    import copyreg
    import types
    import weakref
    import collections.abc
    import builtins
    import decimal
    import fractions
    import statistics
    import functools
    import contextlib
    import contextvars
    import inspect
    import enum
    import keyword
    import tokenize
    import token
    import keyword
    import re
    import os
    import sys
    import io
    import time
    import math
    import re
    import itertools
    import collections
    import heapq
    import bisect
    import functools
    import operator
    import array
    import string
    import random
    import timeit
    import contextlib
    import cProfile
    import pstats
    import threading
    import queue
    import copy
    import pickle
    import copyreg
    import types
    import weakref
    import collections.abc
    import builtins
    import decimal
    import fractions
    import statistics
    import functools
    import contextlib
    import contextvars
    import inspect
    import enum
    import keyword
    import tokenize
    import token
    import keyword
    import re
    import os
    import sys
    import io
    import time
    import math
    import re
    import itertools
    import collections
    import heapq



public class Main {
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
var newVariable_0 = java.nio.file.Paths.get(debug);            is = java.nio.file.Files.newInputStream(newVariable_0);
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
        solve();
        out.flush();
var newVariable_1 = System.currentTimeMillis();        tr((newVariable_1 - start) + "ms");
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
var newVariable_2 = reader.readLine();        tokenizer = new java.util.StringTokenizer(newVariable_2);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
var newVariable_3 = tokenizer.nextToken();    return newVariable_3;
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

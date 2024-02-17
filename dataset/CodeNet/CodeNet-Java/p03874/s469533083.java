
public class Main {
  private static void solve() {
    System.out.println(solve(nl()));
  }

  private static String solve(long k) {
    int m = "FESTIVAL".length();

    int n = 600;
    int l = m - 1;
    long[][] dp = new long[n + 1][l + 1];
    for (int i = 0; i < n; i++) {
      dp[i][0] = 1;
      for (int j = 0; j < l; j++) {
        for (int p = 0; p <= i; p++) {
          for (int q = 0; q <= j; q++) {
            dp[i + 1][j + 1] += dp[p][q];
          }
        }
      }
    }

    long[] a = new long[n + 1];
    for (int i = n; i >= 1; i--) {
      a[i] = k / dp[i][l];
      k -= a[i] * dp[i][l];
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= n; i++) {
      sb.append("FESTIVA");
      for (int j = 0; j < a[i]; j++) {
        sb.append("L");
      }
    }
    return sb.toString();
  }



  private static long check(String s) {
    String t = "FESTIVAL";
    int m = t.length();
    int[] map = new int[26];
    for (int i = 0; i < m; i++) {
      map[t.charAt(i) - 'A'] = i;
    }

    int n = s.length();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = map[s.charAt(i) - 'A'];
    }

    long[][] dp = new long[n + 1][m + 1];
    dp[0][0] = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= m; j++) {
        dp[i + 1][j] = dp[i][j];
      }
      dp[i + 1][a[i] + 1] += dp[i][a[i]];
    }

    return dp[n][m];
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


public class Main {
  private static void solve() {
    int n = ni();
    int m = ni();
    int mod = 1000000000 + 7;

    long ret = 0;

    // dp[m][blue]
    long[][][] dp = new long[2][n + 1][2];
    for (int k = 0; k <= n; k ++) {
      dp[0][k][k == 0 ? 1 : 0] = 1;
    }
    for (int i = 0; i < m; i++) {
      int from = i % 2;
      int to = from ^ 1;
      
      for (int j = 0; j <= n; j++) {
        dp[to][j][0] = dp[to][j][1] = 0;
      }
      for (int j = 0; j <= n; j++) {
        for (int k = 0; k < 2; k ++) {
          // blue red or blue blue
          if (j > 0) {
            if (j > 1) {
              dp[to][j][k] += dp[from][j][k];
              dp[to][j][k] %= mod;
              dp[to][j - 1][k] += dp[from][j][k];
              dp[to][j - 1][k] %= mod;
            } else {
              dp[to][j][1] += dp[from][j][k];
              dp[to][j][1] %= mod;
              dp[to][j - 1][1] += dp[from][j][k];
              dp[to][j - 1][1] %= mod;
            }
          }
          // red blue or red red
          if (j < n) {
            dp[to][j][k] += dp[from][j][k];
            dp[to][j][k] %= mod;
            dp[to][j + 1][k] += dp[from][j][k];
            dp[to][j + 1][k] %= mod;
          }
        }
      }
    }
    for (int i = 0; i <= n; i ++) {
      ret += dp[m % 2][i][1];
      ret %= mod;
    }
    System.out.println(ret);
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

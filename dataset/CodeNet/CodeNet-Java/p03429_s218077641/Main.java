
import java.util.Arrays;

public class Main {
  private static void solve() {
    int n = ni();
    int m = ni();
    //<>
    int a = ni();
    //^
    //v
    int b = ni();

    char[][] map = new char[n][m];
    for (char[] v : map) Arrays.fill(v, '.');
    if (m % 2 == 1) {
      for (int i = 1; b > 0 && i < n; i += 2, b --) {
        map[i - 1][m - 1] = '^';
        map[i - 0][m - 1] = 'v';
      }
    }
    if (n % 2 == 1) {
      for (int j = 1; a > 0 && j < m; j += 2, a --) {
        map[n - 1][j - 1] = '<';
        map[n - 1][j - 0] = '>';
      }
    }

    for (int i = 1; i < n; i += 2) {
      for (int j = 1; j < m; j += 2) {
        if (a >= 2) {
          map[i - 1][j - 1] = map[i - 0][j - 1] = '<';
          map[i - 1][j - 0] = map[i - 0][j - 0] = '>';
          a -= 2;
        } else if (b >= 2) {
          map[i - 1][j - 1] = map[i - 1][j - 0] = '^';
          map[i - 0][j - 0] = map[i - 0][j - 1] = 'v';
          b -= 2;
        } else if (a >= 1) {
          map[i - 1][j - 1] = '<';
          map[i - 1][j - 0] = '>';
          a --;
        } else if (b >= 1) {
          map[i - 1][j - 1] = '^';
          map[i - 0][j - 1] = 'v';
          b --;
        }
      }
    }
    if (n % 2 == 1 && m % 2 == 1 && b == 1 && map[n - 2][m - 2] == '.') {
      map[n - 3][m - 2] = '<';
      map[n - 3][m - 1] = '>';

      map[n - 2][m - 1] = '^';
      map[n - 1][m - 1] = 'v';

      map[n - 3][m - 3] = '^';
      map[n - 2][m - 3] = 'v';
      b --;
    }

    if (a == 0 && b == 0) {
      out.println("YES");
      for (char[] line : map) {
        out.println(line);
      }
    } else {
      out.println("NO");
    }
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

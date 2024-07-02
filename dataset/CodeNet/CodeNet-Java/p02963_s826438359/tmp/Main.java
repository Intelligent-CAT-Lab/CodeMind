
public class Main {

  private static void solve() {
    long s = nl();

    // x1y2 - x2y1=s

    long sq = sqrtL(s); // x1, y2

    if (sq * sq == s) {
      System.out.println(sq + " " + 0 + " " + 0 + " " + sq + " " + 0 + " " + 0);

    } else {
      long t = sq * sq - s;

      System.out.println(sq + " " + 1 + " " + t + " " + sq + " " + 0 + " " + 0);
    }
  }


  public static long sqrtL(long N) {
    long ng = 1;
    long ok = (long) Math.sqrt(N) + 1;
System.out.println("[INST]23;None;Math.sqrt(N);"+Math.sqrt(N));

    while (ok - ng > 1) {
      long mid = (ng + ok) / 2;
      if (mid * mid >= N) {
        ok = mid;
      } else {
        ng = mid;
      }
    }
    return ok;
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
System.out.println("[INST]40;start;System.currentTimeMillis();"+start);
        String debug = args.length > 0 ? args[0] : null;
        if (debug != null) {
          try {
            is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
System.out.println("[INST]44;is;java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));"+is);
System.out.println("[INST]44;None;java.nio.file.Paths.get(debug);"+java.nio.file.Paths.get(debug));
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
        solve();
        out.flush();
System.out.println("[INST]51;None;out.flush();"+out.flush());
        tr((System.currentTimeMillis() - start) + "ms");
System.out.println("[INST]52;None;System.currentTimeMillis();"+System.currentTimeMillis());
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
System.out.println("[INST]65;None;reader.readLine();"+reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
System.out.println("[INST]70;None;tokenizer.nextToken();"+tokenizer.nextToken());
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


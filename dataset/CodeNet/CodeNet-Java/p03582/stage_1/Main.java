
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  private static void solve() {
    int[] a = na(3);
    List<String> list = new ArrayList<>();
    for (int j = 0; j < 3; j ++) {
      for (int i = 0; i < a[j]; i ++)
var newVariable_0 = list.add("" + (char)('a' + j));    }

var newVariable_1 = list.size();    while (newVariable_1 > 1) {
      Collections.sort(list);
var newVariable_2 = list.size();      int last = newVariable_2 - 1;
var newVariable_3 = list.get(0);var newVariable_4 = list.get(last);      String s = list.get(0) + newVariable_4;
var newVariable_5 = list.set(0, s);var newVariable_6 = list.remove(last);    }
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
var newVariable_7 = java.nio.file.Paths.get(debug);            is = java.nio.file.Files.newInputStream(newVariable_7);
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
        solve();
        out.flush();
var newVariable_8 = System.currentTimeMillis();        tr((newVariable_8 - start) + "ms");
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
var newVariable_9 = reader.readLine();        tokenizer = new java.util.StringTokenizer(newVariable_9);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
var newVariable_10 = tokenizer.nextToken();    return newVariable_10;
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

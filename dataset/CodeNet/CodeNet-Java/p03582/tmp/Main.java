
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  private static void solve() {
    int[] a = na(3);
    List<String> list = new ArrayList<>();
    for (int j = 0; j < 3; j ++) {
      for (int i = 0; i < a[j]; i ++)
        list.add("" + (char)('a' + j));
System.out.println("[INST]12;None;list.add('' + (char)('a' + j));"+list.add("" + (char)('a' + j)));
    }

    while (list.size() > 1) {
System.out.println("[INST]15;None;list.size();"+list.size());
      Collections.sort(list);
System.out.println("[INST]16;None;Collections.sort(list);"+Collections.sort(list));
      int last = list.size() - 1;
System.out.println("[INST]17;None;list.size();"+list.size());
      String s = list.get(0) + list.get(last);
System.out.println("[INST]18;None;list.get(0);"+list.get(0));
System.out.println("[INST]18;None;list.get(last);"+list.get(last));
      list.set(0, s);
System.out.println("[INST]19;None;list.set(0, s);"+list.set(0, s));
      list.remove(last);
System.out.println("[INST]20;None;list.remove(last);"+list.remove(last));
    }
    System.out.println(list.get(0));
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
System.out.println("[INST]29;start;System.currentTimeMillis();"+start);
        String debug = System.getProperty("debug");
System.out.println("[INST]30;debug;System.getProperty('debug');"+debug);
        if (debug != null) {
          try {
            is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
System.out.println("[INST]33;is;java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));"+is);
System.out.println("[INST]33;None;java.nio.file.Paths.get(debug);"+java.nio.file.Paths.get(debug));
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
        solve();
        out.flush();
System.out.println("[INST]40;None;out.flush();"+out.flush());
        tr((System.currentTimeMillis() - start) + "ms");
System.out.println("[INST]41;None;System.currentTimeMillis();"+System.currentTimeMillis());
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
System.out.println("[INST]54;None;reader.readLine();"+reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
System.out.println("[INST]59;None;tokenizer.nextToken();"+tokenizer.nextToken());
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

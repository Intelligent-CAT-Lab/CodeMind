
import java.util.Arrays;

public class Main {
  private static void solve() {
    char[] s = ns();
    int n = s.length;
    int[] idx = new int[26];
    
    for (int i = 0; i < n; i ++) {
      int c = s[i] - 'a';
      idx[c] ++;
    }
    int[][] a = new int[26][];
    for (int i = 0; i < 26; i ++) {
      a[i] = new int[idx[i]];
    }

    int[] map = new int[n];
    Arrays.fill(map, -1);

    int[] ptr = new int[26];
    int now = 0;
    int oddUsed = -1;
    for (int i = 0; i < n; i ++) {
      int c = s[i] - 'a';
      
      boolean odd = idx[c] % 2 == 1;
      if (odd && oddUsed >= 0 && oddUsed != c) {
        System.out.println(-1);
        return;
      }

      int p = ptr[c];
      if (p < idx[c] / 2) {
        map[i] = now ++;
      } else if (odd && p == idx[c] / 2) {
        map[i] = n / 2;
        oddUsed = c;
        
      } else {
        int inv = idx[c] - p - 1;
        map[i] = n - a[c][inv] - 1;
      }
      a[c][p] = map[i];
      ptr[c] ++;
    }
    int[] array = new int[n];
    for (int i = 0; i < n; i ++) {
      array[map[i]] = i;
    }
    long x = bubbleCount(array, 0, n);
    System.out.println(x);
  }

  public static long bubbleCount(int[] a, int l, int r)
  {
      if(r - l <= 1)return 0;
      int m = (l+r)/2;
      long ret = bubbleCount(a, l, m) + bubbleCount(a, m, r);
      int[] temp = Arrays.copyOfRange(a, l, r);
      for(int p0 = 0, p1 = m-l, p = l;p < r;){
          if(p0 == m-l){
              a[p++] = temp[p1++];
          }else if(p1 == r-l){
              a[p++] = temp[p0++];
          }else if(temp[p0] <= temp[p1]){
              a[p++] = temp[p0++];
          }else{
              a[p++] = temp[p1++];
              ret += m-l-p0;
          }
      }
      return ret;
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



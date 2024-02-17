import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  private static class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
      reader = new BufferedReader(new InputStreamReader(in));
      tokenizer = null;
    }

    public String next() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public String nextLine() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          return reader.readLine();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      return tokenizer.nextToken("\n");
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }

    public long[] nextLongArray(int n) {
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();
      return a;
    }
  }

  private static long count(int n, long x, HashMap<Long, Long>[] cache) {
    if (n == 0) return 1L;
    if (x == 1L) return 0L;
    if (cache[n].containsKey(x)) return cache[n].get(x);
    long layers_n_1 = (1L << (n + 1)) - 3L;
    long ans = 0L;
    if (x > 2L + layers_n_1) {
      ans = 1L + count(n - 1, x - layers_n_1 - 2L, cache) + count(n - 1, layers_n_1, cache);
    } else if (x == 2L + layers_n_1) {
      ans = 1L + count(n - 1, layers_n_1, cache);
    } else {
      ans = count(n - 1, x - 1L, cache);
    }
    cache[n].put(x, ans);
    return ans;
  }
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    long x = sc.nextLong();
    HashMap<Long, Long>[] cache = new HashMap[n + 1];
    for (int i = 0; i <= n; i++) {
      cache[i] = new HashMap<Long, Long>();
    }
    System.out.println(count(n, x, cache));
  }
}
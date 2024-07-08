import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
var newVariable_0 = tokenizer.hasMoreTokens();      if (tokenizer == null || !newVariable_0) {
        try {
var newVariable_1 = reader.readLine();          tokenizer = new StringTokenizer(newVariable_1);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
var newVariable_2 = tokenizer.nextToken();      return newVariable_2;
    }

    public String nextLine() {
var newVariable_3 = tokenizer.hasMoreTokens();      if (tokenizer == null || !newVariable_3) {
        try {
var newVariable_4 = reader.readLine();          return newVariable_4;
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

var newVariable_5 = tokenizer.nextToken("\n");      return newVariable_5;
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

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    long n = sc.nextLong() - 1;
    String name = "";
    while (n >= 0) {
      long d = n % 26;
      name = (char) (97 + (int) d) + name;
      n /= 26L;
      n -= 1L;
    }
    System.out.println(name);
  }
}
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
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]17;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
        try {
          tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]19;None;reader.readLine();"+reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
System.out.println("[INST]24;None;tokenizer.nextToken();"+tokenizer.nextToken());
    }

    public String nextLine() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]28;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
        try {
          return reader.readLine();
System.out.println("[INST]30;None;reader.readLine();"+reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      return tokenizer.nextToken("\n");
System.out.println("[INST]36;None;tokenizer.nextToken('\n');"+tokenizer.nextToken("\n"));
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
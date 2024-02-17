import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author koneko096
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    CAntiDivision solver = new CAntiDivision();
    solver.solve(1, in, out);
    out.close();
  }

  static class CAntiDivision {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
      long a = in.nextLong() - 1;
      long b = in.nextLong();
      long c = in.nextLong();
      long d = in.nextLong();

      long n = b - a, l = lcm(c, d);
      out.println(n - (sum(a, b, c) + sum(a, b, d) - sum(a, b, l)));
    }

    private long sum(long a, long b, long l) {
      return b / l - a / l;
    }

    private long lcm(long a, long b) {
      return a / gcd(a, b) * b;
    }

    private long gcd(long a, long b) {
      return b == 0 ? a : gcd(b, a % b);
    }

  }


  static class InputReader {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

  }
}


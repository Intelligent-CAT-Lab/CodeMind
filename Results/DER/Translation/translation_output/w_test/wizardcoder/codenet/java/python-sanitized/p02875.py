import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class p02875 {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    OutputWriter out = new OutputWriter(outputStream);
    TaskC solver = new TaskC();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskC {

    static final int mod = 998244353;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt() / 2;
      long res = 7;
      int p2 = 8;
      long num = 1;
      long den = 2;
      for (int i = 1; i < n; ++i) {
        res *= 9L;
        if (i > 1) {
          long inc = p2;
          inc *= num;
          inc %= mod;
          inc *= pow(den, mod - 2, mod);
          inc %= mod;
          res += inc;
        }
        res %= mod;
        p2 = (p2 * 2) % mod;
        {
          int k = i;
          num *= 2 * k;
          num %= mod;
          num *= 2 * k + 1;
          num %= mod;
          if (k > 1) {
            den *= k - 1;
          }
          den %= mod;
          den *= k + 2;
          den %= mod;
        }
      }
      out.printLine(res);
    }

    public static int pow(int x, int y, int mod) {
      x %= mod;
      int res = 1;
      while (y > 0) {
        if (y % 2 == 1) {
          --y;
          res = (res * x) % mod;
        } else {
          y /= 2;
          x = (x * x) % mod;
        }
      }
      return res;
    }

  }

  static class OutputWriter {

    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
      writer = new PrintWriter(outputStream);
    }

    public OutputWriter(Writer writer) {
      this.writer = new PrintWriter(writer);
    }

    public void print(Object... objects) {
      for (int i = 0; i < objects.length; i++) {
        if (i!= 0) {
          writer.print(' ');
        }
        writer.print(objects[i]);
      }
    }

    public void printLine(Object... objects) {
      print(objects);
      writer.println();
    }

    public void close() {
      writer.close();
    }

  }

  static class InputReader {

    private InputStream stream;
    private byte[] buffer = new byte[10000];
    private int cur;
    private int count;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public static boolean isSpace(int c) {
      return c =='' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public int read() {
      if (count == -1) {
        throw new
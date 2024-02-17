import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

public class Main {

  private void solve(FastScanner in, PrintWriter out) {
    String S = "1" + in.next() + "x^0";
    int[] e = decompose(S);
    ArrayList<Integer> ans = new ArrayList<>();
    while (e.length > 2) {
      for (int i = -2000; i <= 2000; i++) {
        if (ok(e, i)) {
          int d = -i;
          ans.add(d);
          e = renew(e, d);
          break;
        }

        if (i == 2000) {
          throw new IllegalStateException();
        }
      }
    }
    ans.add(e[1]);

    Collections.sort(ans);
    for (int d : ans) {
      String c = d >= 0 ? "+" : "";
      out.print("(x" + c + d + ")");
    }
    out.println();
  }

  private int[] renew(int[] e, int d) {
    int n = 1;
    int[] next = new int[e.length - 1];
    for (int i = 1; i < e.length; i++) {
      next[i - 1] = n;
      n = e[i] - d * n;
    }
    return next;
  }

  private boolean ok(int[] e, int x) {
    int n = e.length - 1;
    long sum = 0;
    for (int i = 0; i <= n; i++) {
      sum += (long) (Math.pow(x, n - i) * e[i]);
    }
    return sum == 0;
  }


  private int[] decompose(String S) {
    int n = S.charAt(3) - '0';
    int[] ret = new int[n + 1];

    S = S.replaceAll("-", "+g").replaceAll("g", "-")
        .replaceAll("x\\+", "x^1+").replaceAll("x-", "x^1-")
        .replaceAll("\\+x", "+1x").replaceAll("-x", "-1x");

    String[] elements = S.split("\\+");
    for (int i = 0; i < elements.length; i++) {
      String[] tmp = elements[i].split("x\\^*");
      int pos = Integer.parseInt(tmp[1]);
      int c = Integer.parseInt(tmp[0]);
      ret[ret.length - 1 - pos] = c;
    }

    return ret;
  }

  public static void main(String[] args) {
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(new FastScanner(), out);
    out.close();
  }

  private static class FastScanner {

    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int bufferLength = 0;

    private boolean hasNextByte() {
      if (ptr < bufferLength) {
        return true;
      } else {
        ptr = 0;
        try {
          bufferLength = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (bufferLength <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte()) {
        return buffer[ptr++];
      } else {
        return -1;
      }
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
        ptr++;
      }
    }

    boolean hasNext() {
      skipUnprintable();
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    long nextLong() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if (b == '-') {
        minus = true;
        b = readByte();
      }
      if (b < '0' || '9' < b) {
        throw new NumberFormatException();
      }
      while (true) {
        if ('0' <= b && b <= '9') {
          n *= 10;
          n += b - '0';
        } else if (b == -1 || !isPrintableChar(b)) {
          return minus ? -n : n;
        } else {
          throw new NumberFormatException();
        }
        b = readByte();
      }
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    double[] nextDoubleArray(int n) {
      double[] array = new double[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextDouble();
      }
      return array;
    }

    double[][] nextDoubleMap(int n, int m) {
      double[][] map = new double[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextDoubleArray(m);
      }
      return map;
    }

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int n) {
      int[] array = new int[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextInt();
      }
      return array;
    }

    public long[] nextLongArray(int n) {
      long[] array = new long[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextLong();
      }
      return array;
    }

    public String[] nextStringArray(int n) {
      String[] array = new String[n];
      for (int i = 0; i < n; i++) {
        array[i] = next();
      }
      return array;
    }

    public char[][] nextCharMap(int n) {
      char[][] array = new char[n][];
      for (int i = 0; i < n; i++) {
        array[i] = next().toCharArray();
      }
      return array;
    }

    public int[][] nextIntMap(int n, int m) {
      int[][] map = new int[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextIntArray(m);
      }
      return map;
    }
  }
}
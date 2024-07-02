import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

/*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            pass System Test!
*/

public class Main {
  private static class Task {
    void solve(FastScanner in, PrintWriter out) throws Exception {
      int N = in.nextInt();
      int K = in.nextInt();
      Point a = new Point(1.0, 0.0);
      Point b = new Point(Math.cos(Math.PI * 2 / N), Math.sin(Math.PI * 2 / N));
System.out.println("[INST]35;None;Math.cos(Math.PI * 2 / N);"+Math.cos(Math.PI * 2 / N));
System.out.println("[INST]35;None;Math.sin(Math.PI * 2 / N);"+Math.sin(Math.PI * 2 / N));
      Point pa = new Point(Math.cos(Math.PI * 2 / N * K), Math.sin(Math.PI * 2 / N * K));
System.out.println("[INST]36;None;Math.cos(Math.PI * 2 / N * K);"+Math.cos(Math.PI * 2 / N * K));
System.out.println("[INST]36;None;Math.sin(Math.PI * 2 / N * K);"+Math.sin(Math.PI * 2 / N * K));
      Point pb = new Point(Math.cos(Math.PI * 2 / N * (1 - K)), Math.sin(Math.PI * 2 / N * (1 - K)));
System.out.println("[INST]37;None;Math.cos(Math.PI * 2 / N * (1 - K));"+Math.cos(Math.PI * 2 / N * (1 - K)));
System.out.println("[INST]37;None;Math.sin(Math.PI * 2 / N * (1 - K));"+Math.sin(Math.PI * 2 / N * (1 - K)));

      Point intersection = lineIntersection(a, pa, b, pb);
      Point ai = a.sub(intersection);
      Point bi = b.sub(intersection);
      double S = Math.abs(ai.det(bi)) / 2;
      double convex = Math.abs(a.det(b)) / 2 * N;
      out.print(convex - S * N);

    }

    private static double EPS = 2e-8;
    /**
     * Return the point which is intersection of line p1-p2 and q1-q2
     *
     * @param p1
     * @param p2
     * @param q1
     * @param q2
     * @return
     */
    public static Point lineIntersection(Point p1, Point p2, Point q1, Point q2) {
      double a = (q2.sub(q1)).det(q1.sub(p1));
      double b = (q2.sub(q1)).det(p2.sub(p1));
      return p1.add((p2.sub(p1)).multiply(a / b));
    }

    /**
     * Return point p is on segment a-b
     *
     * @param a
     * @param b
     * @param p
     * @return
     */
    public static boolean onSegment(Point a, Point b, Point p) {
      if (Math.abs(a.x - b.x) < EPS)
System.out.println("[INST]73;None;Math.abs(a.x - b.x);"+Math.abs(a.x - b.x));
        return Math.min(a.y, b.y) <= p.y && p.y <= Math.max(a.y, b.y);
System.out.println("[INST]74;None;Math.min(a.y, b.y);"+Math.min(a.y, b.y));
System.out.println("[INST]74;None;Math.max(a.y, b.y);"+Math.max(a.y, b.y));
      double alpha = (b.y - a.y) / (b.x - a.x);
      double beta = a.y - alpha * a.x;
      return Math.abs(p.y - (alpha * p.x + beta)) < EPS && Math.min(a.x, b.x) <= p.x && p.x <= Math.max(a.x, b.x);
System.out.println("[INST]77;None;Math.abs(p.y - (alpha * p.x + beta));"+Math.abs(p.y - (alpha * p.x + beta)));
System.out.println("[INST]77;None;Math.min(a.x, b.x);"+Math.min(a.x, b.x));
System.out.println("[INST]77;None;Math.max(a.x, b.x);"+Math.max(a.x, b.x));
    }

    class Point implements Comparable<Point> {
      double x, y;
      Point(double x, double y) {
        this.x = x;
        this.y = y;
      }

      @Override
      public int compareTo(Point o) {
        if (this.x == o.x) return Double.compare(this.y, o.y);
System.out.println("[INST]89;None;Double.compare(this.y, o.y);"+Double.compare(this.y, o.y));
        return Double.compare(this.x, o.x);
System.out.println("[INST]90;None;Double.compare(this.x, o.x);"+Double.compare(this.x, o.x));
      }

      /**
       * ??????????¨????????????????
       *
       * @param p
       * @return
       */
      public double det(Point p) {
        return x * p.y - y * p.x;
      }

      /**
       * ??????
       *
       * @param p
       * @return
       */
      public double dot(Point p) {
        return x * p.x + y * p.y;
      }

      public Point sub(Point p) {
        return new Point(x - p.x, y - p.y);
      }

      public Point add(Point p) {
        return new Point(x + p.x, y + p.y);
      }

      public Point multiply(double d) {
        return new Point(x * d, y * d);
      }

    }
  }

  /**
   * ?????????????????????????????¬????????§??????
   */
  public static void main(String[] args) throws Exception {
    OutputStream outputStream = System.out;
    FastScanner in = new FastScanner();
    PrintWriter out = new PrintWriter(outputStream);
    Task solver = new Task();
    solver.solve(in, out);
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
System.out.println("[INST]151;bufferLength;in.read(buffer);"+bufferLength);
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
      if (hasNextByte()) return buffer[ptr++];
      else return -1;
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    boolean hasNext() {
      skipUnprintable();
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
System.out.println("[INST]185;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
        b = readByte();
      }
      return sb.toString();
System.out.println("[INST]188;None;sb.toString();"+sb.toString());
    }

    long nextLong() {
      if (!hasNext()) throw new NoSuchElementException();
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
      for (int i = 0; i < n; i++) array[i] = nextInt();
      return array;
    }

    public long[] nextLongArray(int n) {
      long[] array = new long[n];
      for (int i = 0; i < n; i++) array[i] = nextLong();
      return array;
    }

    public String[] nextStringArray(int n) {
      String[] array = new String[n];
      for (int i = 0; i < n; i++) array[i] = next();
      return array;
    }

    public char[][] nextCharMap(int n) {
      char[][] array = new char[n][];
      for (int i = 0; i < n; i++) array[i] = next().toCharArray();
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
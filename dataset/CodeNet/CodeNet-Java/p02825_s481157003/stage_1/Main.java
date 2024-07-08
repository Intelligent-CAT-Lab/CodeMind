import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author ilyakor
 */
public class Main {

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

    int n;
    int[][] a;
    int[] ch;
    int[] cv;
    int need;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      // for (int n = 2; n <= 6; ++n) {
      //     for (int need = 1; need <= 4; ++need) {
      //         this.n = n;
      //         out.print(calc(need) ? 1 : 0);
      //     }
      //     out.printLine();
      // }
      // out.flush();
      //
      // n = 7;
      // calc(3);
      // for (int i = 0; i < n; ++i) {
      //     for (int j = 0; j < n; ++j) {
      //         char c = '.';
      //         if (a[i][j] != 0)
      //             c = (char) ('a' + (a[i][j] % 26));
      //         out.print(c);
      //     }
      //     out.printLine();
      // }
      //
      // n = in.nextInt();
      // boolean res = calc(3);
      // if (!res) {
      //     out.printLine(-1);
      //     return;
      // }

      n = in.nextInt();
      if (n == 2) {
        out.printLine(-1);
        return;
      }
      if (n == 3) {
        calc(1);
        for (int i = 0; i < n; ++i) {
          for (int j = 0; j < n; ++j) {
            char c = '.';
            if (a[i][j] != 0) {
              c = (char) ('a' + (a[i][j] % 26));
            }
            out.print(c);
          }
          out.printLine();
        }
        return;
      }
      if (n == 4) {
        out.printLine("abcc");
        out.printLine("abdd");
        out.printLine("eegh");
        out.printLine("ffgh");
        return;
      }
      int N = n;
      // n = 3;
      // calc(3);
      // int[][] an = a;
      n = N;

      int[][] an = new int[][]{
          {1, 2, 3, 3},
          {1, 2, 4, 4},
          {5, 5, 6, 7},
          {8, 8, 6, 7},
      };

      while (n > 8) {
        n -= 4;
      }
      boolean r = calc(3);
      if (!r) {
        throw new RuntimeException();
      }

      for (int i = 0; i < N; ++i) {
        for (int j = 0; j < N; ++j) {
          char c = '.';
          if (i < n && j < n) {
            if (a[i][j] != 0) {
              c = (char) ('a' + (a[i][j] % 26));
            }
          } else {
            int x = (i - n) % 4;
            int y = (j - n) % 4;
            if ((i - n + 32) / 4 == (j - n + 32) / 4 && an[x][y] != 0) {
              c = (char) ('a' + (an[x][y] % 26));
            }
          }
          out.print(c);
        }
        out.printLine();
      }
    }

    public boolean calc(int need) {
      a = new int[n][n];
      ch = new int[n];
      cv = new int[n];
      this.need = need;
      return brute(0, 0);
    }

    boolean brute(int x, int y) {
      if (x >= n) {
        for (int i = 0; i < n; ++i) {
          if (ch[i] != need || cv[i] != need) {
            return false;
          }
        }
        return true;
      }
      if (ch[x] > need || cv[y] > need) {
        return false;
      }
      int nx = x, ny = y + 1;
      if (ny >= n) {
        if (ch[x] != need) {
          return false;
        }
        ny = 0;
        nx = x + 1;
      }
      if (brute(nx, ny)) {
        return true;
      }
      int id = (x * n + y + 1);
      if (a[x][y] == 0 && y < n - 1 && a[x][y + 1] == 0) {
        a[x][y] = id;
        a[x][y + 1] = id;
        ++ch[x];
        ++cv[y];
        ++cv[y + 1];
        if (ch[x] <= need && cv[y] <= need && cv[y + 1] <= need && brute(nx, ny)) {
          return true;
        }
        a[x][y] = 0;
        a[x][y + 1] = 0;
        --ch[x];
        --cv[y];
        --cv[y + 1];
      }
      if (a[x][y] == 0 && x < n - 1 && a[x + 1][y] == 0) {
        a[x][y] = id;
        a[x + 1][y] = id;
        ++ch[x];
        ++cv[y];
        ++ch[x + 1];
        if (ch[x] <= need && cv[y] <= need && ch[x + 1] <= need && brute(nx, ny)) {
          return true;
        }
        a[x][y] = 0;
        a[x + 1][y] = 0;
        --ch[x];
        --cv[y];
        --ch[x + 1];
      }
      return false;
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
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public int read() {
      if (count == -1) {
        throw new InputMismatchException();
      }
      try {
        if (cur >= count) {
          cur = 0;
          count = stream.read(buffer);
          if (count <= 0) {
            return -1;
          }
        }
      } catch (IOException e) {
        throw new InputMismatchException();
      }
      return buffer[cur++];
    }

    public int readSkipSpace() {
      int c;
      do {
        c = read();
      } while (isSpace(c));
      return c;
    }

    public int nextInt() {
      int sgn = 1;
      int c = readSkipSpace();
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res = res * 10 + c - '0';
        c = read();
      } while (!isSpace(c));
      res *= sgn;
      return res;
    }

  }

  static class OutputWriter {

    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
      writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
      this.writer = new PrintWriter(writer);
    }

    public void print(Object... objects) {
      for (int i = 0; i < objects.length; i++) {
        if (i != 0) {
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
}


<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
7


```
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
      // d = new HashMap<>();
      // {
      //     int p3 = 1;
      //     for (int n = 1; n <= 5; ++n) {
      //         p3 *= 9;
      //         a = new char[2 * n];
      //         int cur = calc(0, 2 * n);
      //         out.printLine(n + " " + cur + " " + (p3 - cur) / 2);
      //     }
      // }
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
          inc *= IntegerUtils.pow((int) den, mod - 2, mod);
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

  }

  static class IntegerUtils {

    public static int pow(long x, long y, int mod) {
      x %= mod;
      long res = 1;
      while (y > 0) {
        if (y % 2 == 1) {
          --y;
          res = (res * x) % mod;
        } else {
          y /= 2;
          x = (x * x) % mod;
        }
      }
      return (int) (res % mod);
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
}


```

### Response:
```python
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray(10000)
        self.cur = 0
        self.count = 0

    def read(self):
        if self.count == -1:
            raise EOFError()
        if self.cur >= self.count:
            self.cur = 0
            self.count = self.stream.readinto(self.buffer)
            if self.count <= 0:
                return -1
        return self.buffer[self.cur]

    def read_skip_space(self):
        c = self.read()
        while c in [b' ', b'\n', b'\r', b'\t']:
            c = self.read()
        return c

    def next_int(self):
        c = self.read_skip_space()
        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.read()
        res = 0
        while c >= ord('0') and c <= ord('9'):
            res = res * 10 + c - ord('0')
            c = self.read()
        return res * sgn

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def print(self, *objects):
        for i in range(len(objects)):
            if i != 0:
                self.stream.write(b' ')
            self.stream.write(str(objects[i]).encode())

    def print_line(self, *objects):
        self.print(*objects)
        self.stream.write(b'\n')

    def close(self):
        self.stream.close()

class TaskC:
    MOD = 998244353

    def solve(self, test_number, in_reader, out_writer):
        n = in_reader.next_int() // 2
        res = 7
        p2 = 8
        num = 1
        den = 2
        for i in range(1, n):
            res = (res * 9) % self.MOD
            if i > 1:
                inc = p2
                inc = (inc * num)

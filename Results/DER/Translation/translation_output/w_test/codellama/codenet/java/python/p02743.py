<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 9

Expected output:
No


```
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

class p02743 {

  static class Solver {
    final FastScanner sc;
    final PrintWriter writer;

    Solver(final FastScanner sc, final PrintWriter writer) {
      this.sc = sc;
      this.writer = writer;
    }

    void run() {
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      long d = c - a - b;
      if (d > 0 && 4 * a * b < d * d) {
        writer.println("Yes");
      } else {
        writer.println("No");
      }
    }
  }

  public static void main(final String[] args) {
    final FastScanner sc = new FastScanner();
    try (final PrintWriter w = new PrintWriter(System.out)) {
      new Solver(sc, w).run();
      w.flush();
    }
  }

  // FastScanner
  static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    public FastScanner() {
    }

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = in.read(buffer);
        } catch (final IOException e) {
          e.printStackTrace();
        }
        if (buflen <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte())
        return buffer[ptr++];
      else
        return -1;
    }

    private boolean isPrintableChar(final int c) {
      return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr]))
        ptr++;
      return hasNextByte();
    }

    public String next() {
      if (!hasNext())
        throw new NoSuchElementException();
      final StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext())
        throw new NoSuchElementException();
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

    public int nextInt() {
      final long nl = nextLong();
      if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
        throw new NumberFormatException();
      return (int) nl;
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public int[] nextIntArray(final int n) {
      final int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }

    public long[] nextLongArray(final int n) {
      final long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();
      return a;
    }
  }
}
```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class Solver:
    def __init__(self, sc, writer):
        self.sc = sc
        self.writer = writer

    def run(self):
        a = self.sc.nextLong()
        b = self.sc.nextLong()
        c = self.sc.nextLong()
        d = c - a - b
        if d > 0 and 4 * a * b < d * d:
            self.writer.println("Yes")
        else:
            self.writer.println("No")

class FastScanner:
    def __init__(self):
        self.in = sys.stdin
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.in.readinto(self.buffer)
            except IOError:
                pass
            if self.buflen <= 0:
                return False

    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.ptr]
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise NoSuchElementException()
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return "".join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.readByte()
        if b == "-":
            minus = True
            b = self.readByte()
        if b < "0" or "9" < b:
            raise NumberFormatException()
        while True:
            if "0" <= b <= "9":
                n *= 10
                n += b - "0"
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise NumberFormatException()

    def nextInt(self):
        nl = self.nextLong()
        if nl < Integer.MIN_VALUE or nl > Integer.MAX_VALUE:
            raise NumberFormatException()
        return int(nl)

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.nextInt()
        return a

    def nextLongArray(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.nextLong()
        return a

if __name__ == "__main__":
    sc = FastScanner()
    writer = PrintWriter(sys.stdout)
    solver = Solver(sc, writer)
    solver.run()
    writer.flush()
```
Note that the `FastScanner` class in Python is similar to the `FastScanner` class in Java, but it uses the `bytearray` type instead of the `byte` type

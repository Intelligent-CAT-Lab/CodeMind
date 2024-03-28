<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 1 1

Expected output:
2


```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class p04046 {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    ABC042DIrohaandaGrid solver = new ABC042DIrohaandaGrid();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC042DIrohaandaGrid {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int h = in.nextInt();
      int w = in.nextInt();
      int a = in.nextInt();
      int b = in.nextInt();
      ModComb mc = new ModComb(200005);
      mc.makeFac();
      ModInt res = new ModInt(0);
      for (int i = 0; i < h - a; i++) {
        res = res.add(mc.combFac(b - 1 + i, i).mul(mc.combFac(w - b - 1 + h - 1 - i, h - 1 - i)));
      }
      out.println(res.toString());
    }

  }

  static class ModInt {

    private static int MOD = 1000000007;
    long x;

    ModInt(long l) {
      this.x = l % MOD;
    }

    ModInt add(ModInt mi) {
      return new ModInt(this.x + mi.x);
    }

    ModInt mul(long i) {
      return new ModInt(this.x * i);
    }

    ModInt mul(ModInt mi) {
      return new ModInt(this.x * mi.x);
    }

    ModInt pow(int p) {
      ModInt res = new ModInt(1);
      ModInt tmp = this;
      while (p > 0) {
        if ((p & 1) == 1) {
          res = res.mul(tmp);
        }
        tmp = tmp.mul(tmp);
        p /= 2;
      }
      return res;
    }

    ModInt inv() {
      return this.pow(MOD - 2);
    }

    public String toString() {
      return Integer.toString((int) this.x);
    }

  }

  static class ModComb {

    int size;
    ModInt[] fac;
    ModInt[] inv;

    ModComb(int n) {
      size = n;
      fac = new ModInt[n + 1];
      inv = new ModInt[n + 1];
    }

    void makeFac() {
      for (int i = 0; i <= size; i++) {
        if (i == 0) {
          fac[i] = new ModInt(1);
        } else {
          fac[i] = fac[i - 1].mul(i);
        }
        inv[i] = fac[i].inv();
      }


    }

    ModInt combFac(int n, int k) {
      if (n < k) {
        return new ModInt(0);
      }
      return fac[n].mul(inv[k]).mul(inv[n - k]);
    }

  }
}


```

@@ Response
```python
import sys

class ModInt:
    MOD = 1000000007

    def __init__(self, x):
        self.x = x % ModInt.MOD

    def add(self, mi):
        return ModInt(self.x + mi.x)

    def mul(self, i):
        return ModInt(self.x * i)

    def mul(self, mi):
        return ModInt(self.x * mi.x)

    def pow(self, p):
        res = ModInt(1)
        tmp = self
        while p > 0:
            if p & 1:
                res = res.mul(tmp)
            tmp = tmp.mul(tmp)
            p //= 2
        return res

    def inv(self):
        return self.pow(ModInt.MOD - 2)

    def __str__(self):
        return str(self.x)


class ModComb:
    def __init__(self, n):
        self.size = n
        self.fac = [ModInt(0)] * (n + 1)
        self.inv = [ModInt(0)] * (n + 1)

    def make_fac(self):
        for i in range(self.size + 1):
            if i == 0:
                self.fac[i] = ModInt(1)
            else:
                self.fac[i] = self.fac[i - 1].mul(i)
            self.inv[i] = self.fac[i].inv()

    def comb_fac(self, n, k):
        if n < k:
            return ModInt(0)
        return self.fac[n].mul(self.inv[k]).mul(self.inv[n - k])


def solve(test_number, in_stream, out_stream):
    h, w, a, b = map(int, in_stream.readline().split())
    mc = ModComb(200005)
    mc.make_fac()
    res = ModInt(0)
    for i in range(h - a):
        res = res.add(mc.comb_fac(b - 1 + i, i).mul(mc.comb_fac(w - b - 1 + h - 1 - i, h - 1 - i)))
    out_stream.write(str(res) + '\n')


if __name__ == '__main__':
    solve(1, sys.stdin, sys.stdout)
```

This Python code is equivalent to the Java code provided. It uses the same logic and data structures, but it uses Python's built-in `sys` module for input and output, and Python's `map` function for splitting the input line into integers.<｜end▁of▁sentence｜>

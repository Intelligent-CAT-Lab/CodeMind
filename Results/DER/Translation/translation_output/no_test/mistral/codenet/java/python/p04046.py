<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def solve(h, w, a, b):
    mc = ModComb(200005)
    mc.makeFac()
    res = ModInt(0)
    for i in range(h - a):
        res = res + mc.combFac(b - 1 + i, i) * mc.combFac(w - b - 1 + h - 1 - i, h - 1 - i)
    return res

def main():
    h, w, a, b = map(int, sys.stdin.readline().split())
    res = solve(h, w, a, b)
    print(res)

class ModInt:
    MOD = 1000000007
    def __init__(self, l):
        self.x = l % MOD

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
            if (p & 1) == 1:
                res = res * tmp
            tmp = tmp * tmp
            p /= 2
        return res

    def inv(self):
        return self.pow(MOD - 2)

    def __str__(self):
        return str(int(self.x))

class ModComb:
    def __init__(self, n):
        self.size = n
        self.fac = [ModInt(1)] * (n + 1)
        self.inv = [ModInt(1)] * (n + 1)

    def makeFac(self):
        for i in range(1, self.size + 1):
            self.fac[i] = self.fac[i - 1] * i
            self.inv[i] = self.fac[i].inv()

    def combFac(self, n, k):
        if n < k:
            return ModInt(0)
        return self.fac[n] * self.inv[k] * self.inv[n - k]

if __name__ == "__main__":
    main()
```</s>

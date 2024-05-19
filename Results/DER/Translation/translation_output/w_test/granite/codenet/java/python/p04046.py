System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
MOD = 1000000007

def make_fac(size):
    fac = [0] * (size + 1)
    inv = [0] * (size + 1)
    fac[0] = 1
    for i in range(1, size + 1):
        fac[i] = fac[i - 1] * i % MOD
    inv[size] = pow(fac[size], MOD - 2, MOD)
    for i in range(size - 1, -1, -1):
        inv[i] = inv[i + 1] * (i + 1) % MOD
    return fac, inv

def comb_fac(n, k, fac, inv):
    if n < k:
        return 0
    return fac[n] * inv[k] * inv[n - k] % MOD

def solve(h, w, a, b):
    fac, inv = make_fac(200005)
    res = 0
    for i in range(h - a):
        res += comb_fac(b - 1 + i, i, fac, inv) * comb_fac(w - b - 1 + h - 1 - i, h - 1 - i, fac, inv)
        res %= MOD
    return res

h, w, a, b = map(int, input().split())
print(solve(h, w, a, b))
```<|endoftext|>

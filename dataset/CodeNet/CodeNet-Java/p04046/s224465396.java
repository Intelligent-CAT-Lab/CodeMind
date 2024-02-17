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
public class Main {

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

